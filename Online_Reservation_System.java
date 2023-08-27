
import java.util.*;
public class Online_Reservation_System {
    String username,pass,from, to,date,Name,Age;
    int seat;
    int No= (int) (Math.random() * 10000000);
    //    Registration method
    public void Registration() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************** Registration *************");
        System.out.print("First Name : ");
        String first = sc.nextLine();
        System.out.print("Last Name : ");
        String last = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.nextLine();
        System.out.print("Gender : ");
        String gender = sc.nextLine();
        System.out.print("UserName : ");
        this.username = sc.nextLine();
        System.out.print("Password : ");
        this.pass = sc.nextLine();
        System.out.println("*****************************************");
    }
//    login Method
    public void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("************** LOGIN *************");
        boolean islogin = false;
        while (!islogin) {
            System.out.print("UserName : ");
            String Username = sc.nextLine();
            System.out.print("Password : ");
            String Pass = sc.nextLine();
            System.out.println("******************************");
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
    }
//   booking method
    public void Book_Ticket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("******* Book Ticket *******");
        System.out.print("From : ");
        this.from = sc.nextLine();
        System.out.print("To : ");
        this.to = sc.nextLine();
        System.out.print("Date : ");
        this.date = sc.next();
        System.out.print("Passenger full Name : ");
        this.Name = sc.next();
        System.out.print("Passenger Age :- ");
        this.Age = sc.next();
        System.out.println("Class type");
        System.out.println("Press 1 for 1 AC Class (1A)");
        System.out.println("Press 2 for 2 AC Class (2A)");
        System.out.println("Press 3 for 3 AC Class (3A)");
        System.out.println("Press 4 for Sleeper Class (SL)");
        System.out.println("Press 5 for General Class (2S))");
        System.out.println("----------------------------");
        System.out.println("Enter your choice of class: ");
        seat = sc.nextInt();
        System.out.println("----------------------------");
        switch (seat) {
            case 1: {

                System.out.println("1 AC (1A)");
                break;
            }
            case 2: {
                System.out.println("2 AC (2A)");
                break;
            }
            case 3: {
                System.out.println("3 AC (3A)");
                break;
            }
            case 4: {
                System.out.println("Sleeper (SL)");
                break;
            }
            case 5: {
                System.out.println("General Class (2S)");
                break;
            }
        }
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("**** You ticket has successful book. ****");
        System.out.println("************ Happy Journey **************");
        System.out.println("*****************************************");
        System.out.println();
    }

//      Booking details method
    public void My_Bookings() {
        System.out.println("********** My Bookings **********");
        System.out.println();
        System.out.println("--- My Booking Details ---");
//        this.No = (int) (Math.random() * 10000000);
        System.out.println("PNR NO :- " + No);
        System.out.println("FORM :-  " + from);
        System.out.println("To :- " + to);
        System.out.println("DATE :- " + date);
        System.out.println("NAME :- " + Name);
        System.out.println("AGE :- " + Age);
        System.out.print("CLASS :- ");
        switch (seat) {
            case 1: {

                System.out.println("1 AC (1A)");
                break;
            }
            case 2: {
                System.out.println("2 AC (2A)");
                break;
            }
            case 3: {
                System.out.println("3 AC (3A)");
                break;
            }
            case 4: {
                System.out.println("Sleeper (SL)");
                break;
            }
            case 5: {
                System.out.println("General Class (2S)");
                break;
            }
        }


        System.out.println("---------------------------------");
    }
//       Ticket cancal method
    public void Cancel_Ticket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("******** Cancel_Ticket ********");
        System.out.println();
            System.out.println("-----------------------");
            System.out.print("Enter the PNR No : ");
            int pnr = sc.nextInt();
            System.out.println("-----------------------");
            if (pnr==No){
                System.out.println();
                System.out.println("Your PNR is Verified");
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Sure to cancel a ticket?");
                System.out.println("To Cancel write 'Y'");
                System.out.println("To Not Cancel write 'N'");
                System.out.println("-------------------------------");
                System.out.println("Enter your choice Y/N");
                String cart = sc.next();
                switch (cart) {
                    case "Y": {
                        System.out.println("-------------------------------");
                        System.out.println("Your ticket canceled successful");
                        break;
                    }
                    case "N": {
                        System.out.println("-------------------------------");
                        System.out.println("Not canceled");
                        break;
                    }
                }
            } else {
                System.out.println("Incorrect PNR No");
            }
            System.out.println("--------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // os is object of class
        Online_Reservation_System os = new Online_Reservation_System();

        System.out.println("******** INDIAN RAILWAY ********");
        System.out.println();
        boolean loop=false;
        while (!loop) {
            System.out.println("----------------------");
            System.out.println("Press 1 for Registration");
            System.out.println("Press 2 for Login");
            System.out.println("Press 3 for Exit");
            System.out.println("-----------------------");
            System.out.println();
            System.out.println("-----------------------");
            System.out.println("   Enter your choice   ");
            int number = s.nextInt();
            System.out.println("-----------------------");
            if (number==1) {
                    os.Registration();
                }
                else if (number==2){
                    os.Login();

                }
                else if (number==3) {
                break;
            }
           else {
                System.out.println("Invalid choice");
            }
        }
        int con=0;
        int nums;
        boolean tloop=false;
        while (!tloop){
        System.out.println("----- Ticket Option -----");
        System.out.println("Press 1 for Book Ticket");
        System.out.println("Press 2 for My Bookings");
        System.out.println("Press 3 for Cancel Ticket");
        System.out.println("Press 4 for Exit");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("---------------------");
        System.out.println("  Enter your choice  ");
        nums=s.nextInt();
        System.out.println("---------------------");
       if(nums==1){
                   os.Book_Ticket();
            }
       else if (nums==2) {
            os.My_Bookings();

            }
       else if (nums==3) {
                os.Cancel_Ticket();
            }
       else if (nums==4) {
                break;
            }
       else {
           System.out.println("Invalid choice");
        }
        }
        System.out.println("*************************");
        System.out.println("** Thank You For Using **");
        System.out.println("*************************");
    }
}