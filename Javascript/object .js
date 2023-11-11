// Object creation and calling along with . and square bracket updation and alter 

let obj1={
    name:"vamshi",
    marks:100,
    id :9999999999,
    remarks:"no",
}
console.log(obj1);
console.log(obj1["name"]);   //first way of calling 
console.log(obj1.marks);     //second way of calling 
 obj1.overalPercentage=74   // adding a element 

 console.log(obj1)
 obj1.marks=87              // updating a element 
 console.log(obj1)

 obj1["name"]="suhansh"        //adding element in second type
 console.log(obj1)
 console.log(obj1["remarks"]="not")
 console.log(obj1)

 
// Seconda way of object creation using new key word along with the object() constractor
console.log("---------------------------------second way-------------------------")
let obj2=new Object()
obj2.name="umesh";
console.log(obj2);
obj2.id=4244;
console.log(obj2);

obj2.phn=999999999;
obj2.status="good";
obj2.roll="567";
console.log(obj2);

/* Third way of object creation using new key word along with the object() constractor here
 we are going to create a user defined method and those should contains parameter and add the elemnts using this key word
as shown below */ 
console.log("---------------third-------------------")

function hello(r,p,t,s){
this.names=r;
this.value=p;
this.roll=t;
this.percentage=s;
}
let hello1=new hello("vamshi",342,234);
console.log(hello1);
let hello2=new hello("rajkumar",567,909);        //from this it is possible to create a object for so many times
console.log(hello2);
let hello3=new hello("ajay",678,99);
console.log(hello3);
hello2.names="raviteja";
console.log(hello2);

// fourth way to create object with sub-function
console.log("-----------------four------------------------------");
function z(l,m,n,p){
    this.names=l;
    this.roll=m;
    this.id=n;
    this.marks=p;
    this.surname=function(){
        console.log("potharaveni "+this.names)
    }
}
let z1=new z("vamshi",123,4244,60)
let z2=new z("arush",124,6744,70)
console.log(z1)
z1.surname()
z2.surname()
for(key in z1){
    console.log(key+":"+z1[key]);
   
}
console.log(Object.keys(z1));
console.log(Object.values(z1));     //here there are three values to calling those all values and keys ,both as well.
console.log(Object.entries(z1));

