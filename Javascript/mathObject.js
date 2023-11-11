// math object is a already difined function or object and when we need it thdn we should call it directly
//math object which we are used mostly

console.log(Math.SQRT2);    //here it is square root of 2 value
console.log(Math.PI);       //it is a constant
console.log(Math.E);
console.log(Math.sqrt(16));     //it is used to find a root of value

console.log(Math.sign(67));     /*it is used to display 1 for positive and -1 fro negative number   and 0 for zero and  if give another string it dispay "Not"*/
console.log(Math.sign(-67));                     

console.log(Math.abs(-67));     //it is used to write absolute number means just a number without any sign 

console.log(Math.pow(6,7));     //it gives 6^7 value


let arr=[22,63,55,68,7,88,9,20,33,5,6,5,7,88,23];
console.log(Math.min(...arr));                                   //we should "..." these when we are going use list of array 
console.log(Math.max(2,5,6,77,8,99,0,2,33,5,777,8,));             //other wise write number in that

console.log(Math.round(6.5));                   //it represents when the decimal number is given then it should be give a left side of decimal when it less than "6.0/1/2/3/4" otherwise it will gives you a net number "7" 

console.log(Math.floor(6.999));             //it gives only a left number in the given input nmber

console.log(Math.ceil(2.1));                //if we use decimal num it gives next value only as a output

console.log(Math.trunc(2.1));               // it gives left side value only  

console.log(Math.random());                 //it give any rndm number between 0-0.99999; if we multiply any number it gives in bet ween multplied numbers only
console.log(Math.floor(Math.random()*20));          //here also we we use trunc it is also working

console.log(Math.exp(2));                          //it will gives you the E^2 values  E value is "2.718281828459045"

console.log(Math.log(2));       //if we give number without base it finds by taking base "e"
console.log(Math.log2(45));    // it possible to give log base value from 1-10

console.log(Math.sin(0));       // we can use all sin cos tan cot sec cosec  values here

console.log(Math.ceil(2.1));  