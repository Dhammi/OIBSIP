
import java.util.*;

public class ATM_Interface {
    String username, pass, Name ,first,name;
    Scanner sc = new Scanner(System.in);
    double Balance = 25000;
    double Withdraw, Deposit, Transfer,phnum,mobno,phno;
    int Pin;

    public void Registration() {
        System.out.println("****** Registration ******");
        System.out.print("Name : ");
        this.first = sc.nextLine();
        System.out.println("Enter your Mobile Number : ");
        this.phnum=sc.nextDouble();
        System.out.print("UserName : ");
        this.username = sc.next();
        System.out.print("Password : ");
        this.pass = sc.next();
        System.out.println("**************************");
    }

    public void Login() {

        System.out.println("********** LOGIN *********");
        boolean islogin = false;
        while (!islogin) {
            System.out.print("UserName : ");
            String Username = sc.next();
            System.out.print("Password : ");
            String Pass = sc.next();
            if (Username.equals(username)) {
//                pass is Password
                if (Pass.equals(pass)) {
                    System.out.println();
                    System.out.println("**********************");
                    System.out.println("** Login successful **");
                    System.out.println("**********************");
                    break;
                } else {
                    System.out.println("Incorrect Password");
                }
            } else {
                System.out.println("Incorrect Username");
            }
        }
        System.out.println("**************************");
    }
     public void Generate_PIN() {
         boolean ISpin = false;
         while (!ISpin) {
             System.out.println("****** Generate_PIN ******");
             System.out.println("--------------------------");
             System.out.println("Enter your Name:");
             this.name = sc.next();
             System.out.println("Enter Your Mobile Number ");
             this.mobno = sc.nextDouble();
             if (first.equals(name)){
                 if (mobno==phnum){
                     System.out.println("Create your 4 Digit ATM PIN");
                     this.Pin=sc.nextInt();
                     System.out.println("*************************");
                     System.out.println("**PIN Successful Create**");
                     System.out.println("**************************");
                     break;
                 }
                 else {
                     System.out.println("Incorrect mobile number.");
                 }
             }
             else {
                 System.out.println("Incorrect Name");
             }
         }
         System.out.println("--------------------------");
         System.out.println("**************************");

     }
    public void Withdraw() {

        System.out.println("******** Withdraw ********");
        System.out.println("----------------------------");
        System.out.println("Enter The Amount To Withdraw");
        Withdraw = sc.nextDouble();
        System.out.println("Enter your PIN");
        int Pin_no = sc.nextInt();
        if (Pin_no == Pin) {
            if (Balance < Withdraw) {
                System.out.println("Insufficient Balance");
            }
            else {
                System.out.println("Withdraw Successful");
                Balance = Balance - Withdraw;
                System.out.println("Balance: " + Balance);

            }
        }
        else {
            System.out.println("Incorrect PIN");
             }
        System.out.println("----------------------------");
        System.out.println("**************************");
    }
    public void Deposit() {
        System.out.println("********* Deposit ********");
        System.out.println("--------------------------");
        System.out.println("Enter the Amount To Deposit");
        Deposit = sc.nextDouble();
        System.out.println("Enter your PIN");
        int Pin_no = sc.nextInt();
        if (Pin_no == Pin) {
            System.out.println("Deposit Successful");
        Balance = Balance + Deposit;
        System.out.println("Balance: " + Balance);
        }
        else {
            System.out.println("Incorrect PIN");
        }
        System.out.println("--------------------------");
        System.out.println("**************************");
    }

    public void Transfer() {

        System.out.println("******** Transfer ********");
        System.out.println("-------------------------------------");
        System.out.println("Enter the name of person to Transfer ");
        Name = sc.next();
        System.out.println("Enter the Phone Number to Transfer");
        phno = sc.nextDouble();
        System.out.println("Enter the Amount to Transfer");
        Transfer = sc.nextDouble();
        System.out.println("Enter your PIN");
        int Pin_no = sc.nextInt();
        if (Pin_no == Pin) {
            if (Balance < Transfer) {
                System.out.println("Insufficient Balance");
            }
            else {
                System.out.println("Transfer Successful");
                Balance = Balance - Transfer;
                System.out.println("Balance: " + Balance);
            }
        }
        else {
            System.out.println("Incorrect PIN");
        }
        System.out.println("-------------------------------------");
        System.out.println("**************************");
    }

    public void Transactions_History() {
        System.out.println("----------------------------------");
        System.out.println("****** Transactions_History ******");
        System.out.println("Withdraw : " + Withdraw);
        System.out.println("Deposit : " + Deposit);
        System.out.println("Transfer : " + Transfer);
        System.out.println("Your Balance: " + Balance);
        System.out.println("----------------------------------");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM_Interface atm = new ATM_Interface();
        System.out.println("************************");
        System.out.println("******* SBI Bank *******");
        System.out.println("************************");
        boolean loop = false;
        while (!loop) {
            System.out.println("----------------------");
            System.out.println("    1. Registration   ");
            System.out.println("    2. Login          ");
            System.out.println("    3. Exit           ");
            System.out.println("-----------------------");
            System.out.println("-----------------------");
            System.out.println("Enter your choice");
            int number = sc.nextInt();
            System.out.println("-----------------------");
            if(number==1){
                    atm.Registration();
            } else if (number==2) {
                    atm.Login();
            } else if (number==3) {
                    break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        System.out.println("***************************");
        System.out.println("****** ATM SERVICES ****** ");
        System.out.println("***************************");

        boolean isloop = false;
        while (!isloop) {
            System.out.println("--------------------------");
            System.out.println("1. Generate_PIN");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Transactions_History");
            System.out.println("6. Exit");
            System.out.println("--------------------------");
            System.out.println("----------------");
            System.out.println("Enter the choice");
            int n = sc.nextInt();
            System.out.println("----------------");
            System.out.println();
            if (n == 1) {
                atm.Generate_PIN();
            } else if (n == 2) {
                atm.Withdraw();
            } else if (n == 3) {
                atm.Deposit();
            } else if (n == 4) {
                atm.Transfer();
            } else if (n == 5) {
                atm.Transactions_History();
            } else if (n == 6) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        System.out.println("******* Thank You For Using  *******");
    }
}