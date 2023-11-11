// Person Object: Create an object representing a person with properties like name, age, and address. 
// Write a function to display the person's information.

//first way
let a={
    name:"vamshi",
    age:20,
    address:"2-109"

}
console.log(a);

//second

let b=new Object();
b.names="vamshi";
 b.age=30;
 b.address="2-109";

console.log(b);

//Write a function to display the person's information.

function variable(k,l,m){
    this.name=k;
    this.age=l;
    this.address=m;
}
let variable1=new variable("vamshi",25,"2-109")
console.log( variable1);
let variable2 =new variable("ajay",27,"3-405")
console.log(variable2);

//third

function vari(x,y,z){
    this.name=x;
    this.age=function fun(){
        console.log("vamshi age is"+age)
    }
    this.address=z;
}
let vari1=new vari("raviteja",40,"5-40");
console.log(vari1);
console.log(vari1.age);
