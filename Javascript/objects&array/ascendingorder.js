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


//to find a specific value index so we ae going to write code to using a function
    function three(index){
    let count=-1;
    let arr4=[2,3,4,5,6,7,88,99,33,54,65,32];

    for(keyss of arr4){
    count++
    if(keyss==index){
        console.log("the index of "+index+"  is  "+count);
    }else{
        console.log("number is does not exist in the list")
    }
}

}
three(1);