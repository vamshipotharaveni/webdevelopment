console.log("hello world")
var a=10;
var b="vamshi yadav";
var id= 800892380;  
var c=true;
console.log( b)
console.log(typeof b) 
console.log(typeof a) 
console.log(typeof c) 
console.log(typeof id) 

var  VamSA={
    "roll":787,
    "name":"hello World",
   
}
console.log(VamSA.roll) 

// function
function New(a,b){
    return a+b;
}
console.log(New(10,20));

// like  a if else

var z=10;
var r=10;

console.log(z>r ? "yes z is greater": z<r ? "r is greater":"both are equal")

// here if and if not
if(z>9 && r>9 ){
    console.log("these values is greate than 9")
}
if(z>9 || r>9 ){
    console.log("these values is greate than 9 second")
}
if(!(z>9 && r>9 )){
    console.log("these values both are less than 9 here")
}
if(!(z>9 || r>9 )){
    console.log("these values both are less than 9 there")
}


// hjbvuhb
var x=26;
var y=26;
console.log( x<y ? "print y is greater":"print x is less");

// console.log()

console.log(x+y);
console.log(x-y);
console.log(x%y);
console.log(x/y);
console.log(x*y);

// if-else

if(x>y){
   console.log("hello-if-else");
}
else if(x<y){
   console.log("bye if-else");
}
else{
    console.log("both are equal");
}

var r=x-4;
console.log(r);

// charAt

var S=" hello welcome ";
console.log(S.charAt(4)); // always string count starts from o--n
console.log(S.length);
console.log(S.trim().length);  //here both trim and displaying the count of the string and trim the string

// loops
//for-loop

for(x=26; x<=30; x++)
{
    console.log(x);
}

// while-loop
while(x<=40){
console.log("here while-starts  " +x);
x++;
}
//do while

do{
    console.log("do while starts here "+y);
    y++;
}while(y<=35)


/*output to input

const readline = require('readline');

let vamshi= readline.createInterface({
  input: process.stdin,
  output: process.stdout
});*/

// switch

let m="A";
switch(m) {
    case "A":
        console.log("moday is today")
        break;
    case "B":
        console.log("tuesday is today")
        break;
    case "C":
        console.log("wednesday is today")
        break;
    case "D":
        console.log("thursday is today")
        break;
    case "E":
        console.log("friday is today")
        break;
    case "F":
        console.log("saturday is today")
        break;
    case "G":
        console.log("sunday is today")
        break;
    default:
        console.log("it is undefined")
}

// array

let arr=["Vamshi","Sampath","Renuka","Surender","Sushma"];
console.log(arr[1]);
console.log(arr);
arr[5]="mallaiah"
console.log(arr);
console.log(arr.length);
delete arr[0];
console.log(arr.length);
 let arr2=[1,2,3,4,5,6,78,9,0];
 console.log(arr2.toString());
 console.log(arr2);

//  reverse of the string

const satr1="vamshi";
const reverseStr1=satr1.split("").reverse().join("");
console.log(reverseStr1);


//without const variable
let reverseVar="potharaveni vamshi yadav";
reverseVar=reverseVar.split("").reverse().join("");
console.log("==> "+reverseVar);

let str4=["hello" ,"this"," is", "me"];

str4.sort();
str4.reverse();
console.log(str4);

//finding largest from array

let arrs=[1,2,3,4,5,6,7,30,40,50,23,32,12,30];
let largest = arrs[0];

for(let i=0; i<arrs.length; i++){
if(largest<arrs[i]){
    largest=arrs[i];
}
}
console.log(largest);
//finding small number from array

// let ArraySmall=[2,45,67,8,7,5,6,7,4,5,7,87,333,5,785,9,5];
// let i=0;
// while(ArraySmall[i]>i){
// if(i>ArraySmall[i]){
//     console.log("jdhfj"+ArraySmall[i])
// }
// }
// console.log("jdhfj"+ArraySmall[i])


//largestnumber Among the numbers

let sup=[2,33,4,5,7,55,7,7,8,4,444]
let largestNumber = Math.min(...sup);

console.log("The largest number is: " + largestNumber);
    
//two diamentional array
const rows = 3;
const columns = 4;
const twoDArray = [];

// Initialize the 2D-like array with values
for (let i = 0; i < rows; i++) {
  twoDArray[i] = []; // Create an empty array for each row
  for (let j = 0; j < columns; j++) {
    twoDArray[i][j] = i * columns + j; // Assign values to each element
  }
}

// pop()and push()
// let arr=["Vamshi","Sampath","Renuka","Surender","Sushma"];
arr.push("umt","hna");
console.log(arr);
arr.pop();
console.log(arr);
arr.unshift("Potharaveni's")
console.log(arr);
arr.shift();
console.log(arr);
console.log(arr.indexOf("umt"));
console.log(arr.slice(2,5));


//function 

function NewOne(d,s){
    let Reslt=d+s;
    console.log(Reslt);
}
NewOne(12,25);
NewOne("vikram","singh Rathod");

//function
function vir(c,C){
     let D=c+C;
     return D;
}
console.log(vir(9,8));

//functoins types

function newf(r,k){
    reslts=r+k;
    return reslts;
}
newf(2,3)
console.log(reslts);

//2nd function

let again=(function(x,y){
       let red=x+y;
        return red;
}
 )

 console.log(again(4,4));

 //3rd type

 ( function newf(u,l){
    let mreslts=u+l;
    console.log(mreslts);
 }
 )(2,2);

        
 //forth one arrow 
 
 let subo=(l,m,n,o)=>{
    let buso=l+m+n+o;
    return buso;
 }
 console.log( subo(1,2,3,4));
 
 //square using arrow
// let Z=2;
 let square=(Z)=>Z*Z;    
 console.log(square(5));
 
//function assigned

function another(a=1,b=2,...arr){
    let reversd=a*b;
for(let i=1; i>arr.length; i++){
    reversd=reversd*arr;
}
console.log(reversd);
}


another(4,4,5);
// console.log(reversd);

// rest parameter












