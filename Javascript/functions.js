//rest parameters

function one(a,b,...arr){
    results=a*b;
    for(int of arr){
        results*=int;
    }
    console.log("total multiplication ==>"+results);
}
one(2,3,5,6,7);

// const parameters

function two(x=1,y=7){
    results=x*y;
    return results;
}
console.log(two(4,4));


//objects in js
function one(a,b,...arr){
    console.log("fst argument is =>"+arguments [1]);
    console.log("length of the string is ==>"+arguments.length);

    results=a*b;
    for(int of arr){
        results*=int;
    }
    console.log("total multiplication ==>"+results);
}
one(2,3,5,6,7,9);

//factorial

let c=8,i=1;
result=c*i;
for(i=1; i<c; i++){

result*=i;
}
console.log("factorial of "+c+ " is  "+result);

//checking that polindrome or not

let names="malayalam";
results=names.split("").reverse().join("");
console.log("this is reverse of the in put ==> "+names);
    if(results===names){
        console.log("yes it is a polindrome "+names);
    }
    else{
        console.log("sorry it is not polindrome "+results);

    }

// for each loop

let j=10000;
 let l=[4000,5903,85309,8930,89793];
 l.forEach((s,index) => {

    l[index]=s+j;    
 });
 console.log(l);

 //sets in js

 let set1=new Set();
 set1.add(20)
     .add(2)
     .add(40)
     .add(30)
     .add(20)
     .delete(20)
 console.log(set1);

 let part="vamshi yadav";
    let set2=new Set(part)
    
    console.log(set2);
    console.log(typeof set2)
    
// prime number

let k=1;
if(k/)


 

