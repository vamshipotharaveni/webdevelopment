import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

public class VehicleSpeedDetection {

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
        CascadeClassifier carCascade = new CascadeClassifier("path/to/haarcascade_car.xml");
        VideoCapture videoCapture = new VideoCapture("path/to/your/video.mp4");
        
        Mat frame = new Mat();
        Mat grayFrame = new Mat();
        MatOfRect cars = new MatOfRect();
        
        while (videoCapture.read(frame)) {
            Imgproc.cvtColor(frame, grayFrame, Imgproc.COLOR_BGR2GRAY);
            Imgproc.equalizeHist(grayFrame, grayFrame);
            
            carCascade.detectMultiScale(grayFrame, cars);
            
            for (org.opencv.core.Rect rect : cars.toArray()) {
                Imgproc.rectangle(frame, new Point(rect.x, rect.y),
                                  new Point(rect.x + rect.width, rect.y + rect.height),
                                  new Scalar(0, 255, 0), 2);
            }
            
            // Your speed calculation and display logic here
            
            // Display the frame with detected vehicles
            Imgcodecs.imwrite("path/to/output/frame_with_cars.jpg", frame);
        }
        
        videoCapture.release();
    }
}
