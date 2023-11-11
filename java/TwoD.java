class TwoD {
    public static void main(String[] args) 
     {
      int i,j;
      int[][] v={{1,2,3}, {4,5,6}, {7,8,9} };
      for(i=0;i<v.length;i++)
       {
         for(j=0;j<v.length;j++)
	  {
            System.out.print(+v[i][j]);
           }
         System.out.println("");
       }

       }

     }