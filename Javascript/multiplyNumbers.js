
function persistence(num) {
    while(num>10){
      num=num.toString().split("").reduce((a,b)=>a*b,1);
      
    }
    return num;
  }
  console.log(persistence(99));         //99=>9*9=81=>8*1=8 answer is "8"//
  
//if you want to know how many iterations are going on 
function add(sum){
  let iterations=0;

  // while loop or for loop condition should be want less than we should write there greater than
  while(sum>10){
    sum=sum.toString().split("").reduce((a,b)=>a*b,1);
    iterations++;
  }
  console.log("iterations are "+iterations);
  return sum;
}
console.log(add(8777))