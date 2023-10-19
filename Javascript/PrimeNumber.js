//lets find the given number is  prime number or not//

//here we are used function called anonomus function it is second type of function//

x=(function(a){
    if(a==2 || a==3){
        return " It is a prime number"
    }
    if(a<2){
        return " it is not a prime"
    }
    if(a%2==0){
        return " It is not prime"
    }
    if(a%2==1 || a%3==1){
        return " it is a prime number"
    }
    else{
        return " it is  prime number"
    }
})
console.log(x(21));

// another one using whiel loop



var n=prompt("enter a number :");
var i=1;
var k=0;
while(i<=n){
    if(n%i===0){
        k+=1;
    }
    i++;
}
if(k===2){
    console.log("this is prime");
}else{
    console.log("this is not prime");
}

// using for loop

let a=prompt("enter a number:")
let b=1;
let c=0;
for(b=1;b<=a;b++){
    if(a%b===0){
        c+=1;
    }

}
if(c==2){
    console.log("prime");
}
else{
    console.log("not prime");
}


//using do while loop

do{
    let x=prompt('Enter the positive number: ');
    let y=1;
    let z=0;
    if (x === "end") {
        console.log("Thank you. Goodbye!");
        break; // Exit the loop if the user entered "end"
      }
    do{
        if(x%y===0){
            z+=1;
        }
        y++;
    }while(y<=x)
    if(z===2){
        console.log("prime")
    }
    else{
        console.log("not prime")
    }
    }
    while(x=true);