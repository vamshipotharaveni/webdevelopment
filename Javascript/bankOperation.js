console.log("please note we have five accounts only they are")
console.log("****1")
console.log("****2")
console.log("****3")
console.log("****4")
let AccountNumber=(prompt("please enter the  5 digit account number "));
let result=1000;
let result1=0;
let result2=100;
let result3=10000;
switch(parseInt(AccountNumber)){
    case 12341:
        do{
        
        
        console.log("1.withdrawal")
        console.log("2.deposit")
        console.log("3.Balance enquiry ")
        console.log("4.Exit")
        var input=(prompt("Hello welcome to banking please select option "));


        switch(parseInt(input)){
            case 1:
                let money=parseInt(prompt("please enter the ammount "));
                result=result-money;
                 console.log("Withdraw successfully");
                console.log(result+" is your current balance ");
                break;
                case 2:
                    let amount=parseInt(prompt("please enter the ammount "));
                     result=result+amount;
                     console.log("Diposite successfully");
                    console.log(result+" is your current balance");
                    break;
                    case 3:
                        console.log("your current balence is "+result);
                        break;
                    case 4:
                        console.log("thank you for banking")
                        break;
                    default:
                        console.log("invlid action !");
        }
        } while (parseInt(input) !== 4);
        break;
        
        // second person
            case 12342:
        do{
        
        
        console.log("1.withdrawal")
        console.log("2.deposit")
        console.log("3.Balance enquiry ")
        console.log("4.Exit")
        var input=(prompt("Hello welcome to banking please select option "));


        switch(parseInt(input)){
            case 1:
                let money=parseInt(prompt("please enter the ammount "));
                result1=result1-money;
                 console.log("Withdraw successfully");
                console.log(result+" is your current balance ");
                break;
                case 2:
                    let amount=parseInt(prompt("please enter the ammount "));
                     result1=result1+amount;
                     console.log("Diposite successfully");
                    console.log(result1+" is your current balance");
                    break;
                    case 3:
                        console.log("your current balence is "+result1);
                        break;
                    case 4:
                        console.log("thank you for banking")
                        break;
                    default:
                        console.log("invlid action !");
        }
        } while (parseInt(input) !== 4);
        break;
            case 12343:
        do{
        
        
        console.log("1.withdrawal")
        console.log("2.deposit")
        console.log("3.Balance enquiry ")
        console.log("4.Exit")
        var input=(prompt("Hello welcome to banking please select option "));


        switch(parseInt(input)){
            case 1:
                let money=parseInt(prompt("please enter the ammount "));
                result2=result2-money;
                 console.log("Withdraw successfully");
                console.log(result2+" is your current balance ");
                break;
                case 2:
                    let amount=parseInt(prompt("please enter the ammount "));
                     result2=result2+amount;
                     console.log("Diposite successfully");
                    console.log(result2+" is your current balance");
                    break;
                    case 3:
                        console.log("your current balence is "+result2);
                        break;
                    case 4:
                        console.log("thank you for banking")
                        break;
                    default:
                        console.log("invlid action !");
        }
        } while (parseInt(input) !== 4);
        break;
            case 12344:
        do{
        
        
        console.log("1.withdrawal")
        console.log("2.deposit")
        console.log("3.Balance enquiry ")
        console.log("4.Exit")
        var input=(prompt("Hello welcome to banking please select option "));


        switch(parseInt(input)){
            case 1:
                let money=parseInt(prompt("please enter the ammount "));
                result3=result3-money;
                 console.log("Withdraw successfully");
                console.log(result3+" is your current balance ");
                break;
                case 2:
                    let amount=parseInt(prompt("please enter the ammount "));
                     result3=result3+amount;
                     console.log("Diposite successfully");
                    console.log(result3+" is your current balance");
                    break;
                    case 3:
                        console.log("your current balence is "+result3);
                        break;
                    case 4:
                        console.log("thank you for banking")
                        break;
                    default:
                        console.log("invlid action !");
        }
        } while (parseInt(input) !== 4);
        break;
        default:
        console.log("sorry invalid accoount number ")
}
