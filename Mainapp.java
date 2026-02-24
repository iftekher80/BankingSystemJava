import java.util.Scanner;

public class Mainapp {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        String[] accountname = new String[50];
        double[] accountnumber = new double[50];
        int choice;
        int accountcount = 0;


        while(true){

            System.out.println("----------Welcome to Asia Euro Bank----------");
            System.out.println("Enter 1 to create an account");
            System.out.println("Enter 2 to login in your account");
            System.out.println("Enter 3 to Exit");

            choice = in.nextInt();

           switch (choice) {
            case 1:  in.nextLine();
                     System.out.println("Enter your name:");
                     String name = in.nextLine();
                     System.out.println("Enter initial deposit:");
                     double deposit = in.nextDouble();

                     accountname[accountcount]=name;
                     accountnumber[accountcount]=deposit;
                     accountcount++;

                     System.out.println("Account created successfully!");
                     



                
                break;

            case 2 : in.nextLine();
            
            boolean found = false;

            System.out.println("Enter your login name:");
            String loginname = in.nextLine();

            for(int i =0;i<accountcount;i++){
                if(accountname[i].equals(loginname)){
                    System.out.println("Welcome back "+loginname+"");
                    System.out.println("Your balance is "+accountnumber[i]+"");
                    found = true;
                }
            }

            if(!found){
                System.out.println("Account not found");
            }
            break;
        case 3 : System.out.println("Thank you for using Asing Euro bank");
                in.close();
                return;   
            default:System.out.println("Invalid choice");
                break;
           }

            

        }



        
    }
    
}
