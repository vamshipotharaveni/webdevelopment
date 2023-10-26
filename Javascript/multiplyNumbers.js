
function persistence(num) {
    while(num>10){
      num=num.toString().split("").reduce((a,b)=>a*b,1);
      
    }
    return num;
  }
  console.log(persistence(99));         //99=>9*9=81=>8*1=8 answer is "8"