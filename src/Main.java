import java.util.Scanner;




public class Main {
    private static boolean isMainMenu = true;
    private static boolean isCreateView = false;
    private static boolean isLoginView= false;

    public static void main(String[] args) {
        //Variables
        Scanner scanner = new Scanner(System.in);
        int mainOptionSelected;
        boolean isRunning = true;

        while (isRunning) {

            if(isMainMenu && !isCreateView && !isLoginView) {
                System.out.println("-Welcome To Simple Banking App-:");
                //Entry message prints
                System.out.println("=============");
                System.out.println("Main Menu");
                System.out.println("=============");
                System.out.println("""
                        Note *Create account first if you haven't before logging in.
                        Also Create an account when you have restarted the program.
                        There is no persistent data or database, data is all stored in local data structures in this program*""");

                System.out.println("[1] -Log In-");
                System.out.println("[2] -Create Account-");
                System.out.println("[3] -Quit Program-");
                //prompt user input
                System.out.print("Please select available Main Menu option: ");

                mainOptionSelected = scanner.nextInt();
                scanner.nextLine();

                switch (mainOptionSelected) {
                    //lOGIN OPTION
                    case 1:
                        System.out.println("Option 1 Selected");
                        LoginView();
                        isMainMenu = false;
                        isCreateView = false;
                        isLoginView= true;
                        
                        break;
                    //CREATE ACCOUNT OPTION
                    case 2:
                        System.out.println("Option 2 Selected");
                        CreateView();
                        isMainMenu = false;
                        isCreateView = true;
                        isLoginView= false;
                        break;

                    //QUIT OPTION
                    case 3:
                        System.out.println("Option 3 Selected: Quitting");
                        //quit program
                        System.exit(0);
                        break;
                    default:
                        System.out.println("That option does not exist here. try again");
                }
            }



            //if LOGIN IS SELECTED

            //IF CREATE ACCOUNT IS SELECTED

        }
    }


    private static void LoginView() {
        System.out.println("LoginView");
//        while(isLoginView){
//
//        }
    }

    private static void CreateView() {
        System.out.println("CreateView");
    }

}
