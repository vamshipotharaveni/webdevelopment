//Create an object representing a library catalog with books and their details (title, author, ISBN, etc.). 
//Write a function to search for a book by its title.
let library={
    books:[ {
         title:"vamshi biograpy",
         author:"rasmus lorddorf",
         isn: 2443559898474
      } ,   
     {   
         title:"sampath biograpy",
         author:"james gosling",
         isn: 3443559898474
     },
     {   
         title:"sampath biograpy",
         author:"james gosling",
         isn: 3443559898474
     }
 ]
 
 }

function mains(one){

return one;
}
console.log(mains(library.books.title));

// another way is suibale for this

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
    console.log(hello1.names);
    console.log(hello2.names);
    console.log(hello3.names);
