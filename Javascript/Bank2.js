let AccountNumber=(prompt("please enter the  5 digit account number "));
let result=1000;
function bankingTwo(){
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
                 console.log("Withdraw successfully "+money);
                console.log(result+" is your current balance ");
                console.log("           .  ");
                break;
                case 2:
                    let amount=parseInt(prompt("please enter the ammount "));
                     result=result+amount;
                     console.log("Diposite successfully "+amount);
                    console.log(result+" is your current balance");
                    console.log("         .    ");
                    break;
                    case 3:
                        console.log("your current balence is "+result);
                    console.log("           .  ");
                        break;
                    case 4:
                        console.log("thank you for banking")
                        break;
                    default:
                        console.log("invlid action !");
        }
        } while (parseInt(input) !== 4); 
}
bankingTwo();