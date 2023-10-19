
// factorials finding using for loop

let result=1;
let a=prompt("enter the number to find the Factorial : ");

for(let i=1; a>=i;i++){
   result=result*i;
}
console.log("Factorial is "+result);



// factorail using while loop

let l=prompt("enter the number to find the Factorial : ");
let i=1;
let results=1; 
while(i<=l){
    results=results*i;
    i++;
}
console.log("The  factorial is "+results);


//do while loop is using to find the factorial

let x=prompt("enter the number to find the Factorial : ");
let y=1;
let z=1;
do{
    z=z*y;
    y++;
}while(x>=i)
console.log("The  factorial is "+z);



