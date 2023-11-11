//here 17 string methods are excuted 

let a="these lines are taken from the narrative essay of my mother";
let b="   WRITED BY APJ ABDHUL KALAM ";
console.log(a.charAt(10));
console.log(a.charAt(2));       //this is used to print a letter which is there in the particular number of index

console.log(a.indexOf("e"));
console.log(a.indexOf("n"));
console.log(a.indexOf("z"));    //if we are give a letter then it will give the index number as a out put if the letter is not matching then give -1 as a o/p


console.log(a.toUpperCase());   //it will make the line into upper case
 
console.log(b.toLowerCase());   //it will make the line into Lower case

console.log(a.concat( b));      //it will make multi sentences to concatinate 

console.log(a.length);          //it will gives the length

console.log(a.trim( b));         //this is used to remove the space around this

console.log(a.split(""));
console.log(a.split(" "));       //this is used for each letter can be devide and also used for separate til the spaces.

console.log(a.startsWith("li"));  //it will say true are false based on our input is if the sentence starts with sam input then it will say true else false

console.log(a.endsWith("mother")); //it will say true are false based on our input is if the sentence ends with sam input then it will say true else false

console.log(a.slice(10,25));  
console.log(a.slice(-5,-1));       //it will make the sentence as sub part it will also acccept negative numbers to segrigate from the sentence

console.log(a.substring(10,26));   //it will make the sentence as sub part it will not acccept negative numbers to segrigate from the \

// console.log(a.subStr(1,2)); //we can give first number input is starting number of index and next number is how many we want.

console.log(a.includes("taken"));   //if our is input precent in the sentence it give true otherwise false

console.log(a.charCodeAt(1));       //it gives ascii number as output

console.log(a.repeat(2));           //it will repeat 

console.log(a.replace(" mother","vamshi")); //it replce of the input with another input
console.log(a.replace(/a/g,"vamshi"));      //all "a"'s are replced by vamshi
