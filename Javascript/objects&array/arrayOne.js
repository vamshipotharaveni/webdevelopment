//Write a function that calculates the sum of all numbers in an array.

function add(){
    let result=0;
    let arr=[3,4,5,6,7,8];
    for(key of arr){
        result=result+key;
    }
    console.log(result);
}
add();

//second way

let arr1;
function one(arr1){
    let results=0;
       for(keys of arr1){
        results=results+keys;
    }
    console.log(results);
}
one([1,2,3,4,5]);



//finding largestt number in array

function two(arr2){
    res=Math.min(...arr2);
     res2=Math.max(...arr2);
     console.log("the maximum number is "+res2);
    return res;

}
console.log("the minimum number is "+two([2,3,5,66,7,88,0,2,33,4]));

//Write a function that reverses the elements in an array without using the built-in reverse method.

let arr3=[9,6,4,55,6,7,777,444,3,654];
arr3.reverse();
console.log(arr3);






