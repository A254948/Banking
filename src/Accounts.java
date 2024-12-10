import java.util.ArrayList;
import java.util.Scanner;

public class Accounts implements IBankAccount{

    //strings
    private String usernameGiven;
    private String passwordGiven;
    //Numerical variables
    private double balance = 0.0;
    //booleans
    private boolean isMainMenu = true;
    private boolean isCreateView = false;
    private boolean isLoginView= false;
    private static Scanner scan = new Scanner(System.in);
    private boolean isValidLogin = false;
    private boolean isValidCreate = false;

    //Enums
    private AccountType accountType;
    private TransactionType transactionType;

    private ArrayList<String> usernamesList = new ArrayList<>();
    private ArrayList<String> passwordsList  = new ArrayList<>();

    private Validator validator = new Validator();
    //Login and Create Views
    public void LoginView() {

        System.out.println("=============");
        System.out.println("Login view");
        System.out.println("=============");
        while(isLoginView && !isMainMenu && !isCreateView) {
            String usernameEntered;
            String passwordEntered;
            System.out.println("""
                            If You Want To Go Back To Main Menu Enter '0'.
                            For any following prompts in this view.
                            """);

            System.out.println("Enter your username: ");
            usernameEntered = scan.nextLine();
            if (usernameEntered.equals("0")) {
                isMainMenu = true;
                isCreateView = false;
                isLoginView = false;
                System.out.println("<--Going Back");
                break;
            }

            System.out.println("Enter your password: ");
            passwordEntered = scan.nextLine();
            if (passwordEntered.equals("0")) {
                isMainMenu = true;
                isCreateView = false;
                isLoginView = false;
                System.out.println("<--Going Back");
                break;
            }

        }
        //System.out.println("<--Continuing");
        //break out of loop and continue login process when login details were correct.
    }

    public void CreateView() {
        System.out.println("=============");
        System.out.println("Create Account View");
        System.out.println("=============");

        while(isCreateView && !isLoginView && !isMainMenu) {
            String usernameEntered;
            String passwordEntered;
            int accTypeSelected;
            System.out.println("""
                            If You Want To Go Back To Main Menu Enter '0'.
                            For any following prompts in this view.
                            """);

            System.out.println("Enter your username: ");
            usernameEntered = scan.nextLine();
            if (usernameEntered.equals("0")) {
                isMainMenu = true;
                isCreateView = false;
                isLoginView = false;
                System.out.println("<--Going Back");
                break;

            }
            System.out.println("Enter your password: ");
            passwordEntered = scan.nextLine();
            if (passwordEntered.equals("0")) {
                isMainMenu = true;
                isCreateView = false;
                isLoginView = false;
                System.out.println("<--Going Back");
                break;
            }
            System.out.println("[1] -SAVINGS-");
            System.out.println("[2] -BASIC-");
            System.out.println("[3] -BUSINESS-");
            System.out.println("Please Select What Type Of Account You Would Like to Create From Available Options: ");
            accTypeSelected = scan.nextInt();

            //successful creation
            switch (accTypeSelected) {
                case 1:
                    accountType = AccountType.SAVINGS;
                    //call create account here
                    if(isValidCreate){
                        isCreateView = true;
                    }
                    break;
                case 2:
                    accountType = AccountType.BASIC;
                    //call create account here
                    CreateValidate(usernameEntered, passwordEntered, accountType);
                    break;
                case 3:
                    accountType = AccountType.BUSINESS;
                    //call create account here
                    CreateValidate(usernameEntered, passwordEntered, accountType);
                default:
                    System.out.println("That option does not exist. Select one that does. Lets try this again");
            }

        }
    }
    private void CreateValidate(String user, String pass, AccountType accTypeSelected){
        //return true;
        // call create account here after validated true

    }
    private void CreateAccount(String user, String pass, AccountType accTypeSelected)
    {
        try{

        }
        catch(Exception e){

        }
        finally{

        }
    }


    public Boolean LogIntoAccount(String usrname, String passwrd)
    {
        return true;
    }
    private void ValidateLoggingIn(){

    }
    @Override
    public void DepositMoney(String amount)
    {

    }

    @Override
    public void WithdrawMoney(String amount) {

    }

    @Override
    public void SendMoney(String usrnameToSend, String amount)
    {

    }


    //Encapsulation down here
    public Boolean getMainBool(){
        return isMainMenu;
    }

    public void setMainBool(boolean mainBool){
        this.isMainMenu = mainBool;
    }

    public Boolean getLoginViewBool(){
        return isLoginView;
    }

    public void setLoginViewBool(boolean loginViewBool){
        this.isLoginView = loginViewBool;
    }

    public Boolean getCreateViewBool(){
        return isCreateView;
    }

    public void setCreateViewBool(boolean createViewBool){
        this.isCreateView = createViewBool;
    }

    public String getUsernameGiven() {
        return usernameGiven;
    }

    public void setUsernameGiven(String usernameGiven) {
        this.usernameGiven = usernameGiven;
    }

    public String getPasswordGiven() {
        return passwordGiven;
    }
    public void setPasswordGiven(String passwordGiven) {
        this.passwordGiven = passwordGiven;
    }

}
