//Create a function that sorts an array of numbers in ascending or descending order.
let result;
let result2;
function ascending(){
let arr=[9,6,4,55,6,7,777,444,3,654];
 result=arr.sort((a,b)=>a-b);
console.log("ascending "+result);
result2=arr.sort((a,b)=>b-a);
console.log("descending "+result2);
}
ascending()