import java.util.ArrayList;
import java.util.Scanner;

public class Accounts implements IBankAccount{

    private String usernameGiven;
    private String passwordGiven;

    private boolean isMainMenu = true;
    private boolean isCreateView = false;
    private boolean isLoginView= false;
    private static Scanner scan = new Scanner(System.in);

    private ArrayList<String> usernamesList = new ArrayList<>();
    private ArrayList<String> passwordsList  = new ArrayList<>();

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
    }

    public void CreateView() {
        System.out.println("=============");
        System.out.println("Create Account View");
        System.out.println("=============");

        while(isCreateView && !isLoginView && !isMainMenu) {
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
    }
    public void CreateAccount(String user, String pass)
    {

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
