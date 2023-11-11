//fibnacci number is a combination of the previous two numbers

let a=0;
let b=1;
let result,ans;
for(let i=0; i<=10; i++)
{
result=a+b;
a=b;
b=result;
console.log(result);
}

//using while loop

let x=prompt("enter the numbers you want");
let y=0;
let z=1;
let res;
let i=0;
while(i<=x){
    res=y+z;
    z=y;
    y=res;
    console.log(res);
    i++;

}

//using do while


let l=prompt("enter the numbers you want");
let m=0;
let n=1;
let reslt;
let j=0;
do{
    reslt=m+n;
    m=n;
    n=reslt;
    console.log(reslt);
    j++;
}while(j<=l)