// here we are finding how many vowels are there in the given string 
let count=0;
function value(str){
    for(key in str){
        if(key==="a"||key==="e"||key==="i"||key==="o"||key==="u"){
            count++;
        }
    }
    console.log(count);
    if(count===0){
        console.log("zero vowels are there")
    }
}

value("vamshi");

// another way to write a code to find the vowels

function getCount(str) {
    var vowelsCount = 0;
    var vowels = ["a","e","i","o","u"];
    for(var i = 0;i < str.length;i++){
      for(var j=0;j<vowels.length;j++){
        if(str[i] === vowels[j]){
          vowelsCount++;
        }
      }
    }
    
    return vowelsCount;
  }
  console.log(getCount("vamshi"));

  