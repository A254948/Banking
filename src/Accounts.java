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
    private boolean isUsersAccountView = false;

    private static Scanner scan = new Scanner(System.in);
    private boolean isValidLogin = false;
    private boolean isValidCreate = false;

    //Enums
    private AccountType accountType;
    private TransactionType transactionType;

    private ArrayList<String> usernamesList = new ArrayList<>();
    private ArrayList<String> passwordsList  = new ArrayList<>();
    private ArrayList<AccountType> accountTypeList = new ArrayList<>();

    private Validator validator;
    public Accounts(){

        this.validator = new Validator(this);
    }
    //Login and Create Views
    public void LoginView() {

        System.out.println("=============");
        System.out.println("Login view");
        System.out.println("=============");
        while(isLoginView && !isMainMenu && !isCreateView && !isUsersAccountView) {
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
                isUsersAccountView= false;
                System.out.println("<--Going Back");
                break;
            }

            System.out.println("Enter your password: ");
            passwordEntered = scan.nextLine();
            if (passwordEntered.equals("0")) {
                isMainMenu = true;
                isCreateView = false;
                isLoginView = false;
                isUsersAccountView= false;
                System.out.println("<--Going Back");
                break;
            }
            isValidLogin = validateLogIntoAccount(usernameEntered, passwordEntered);
            if (isValidLogin) {
                System.out.println("Login Successful");
                System.out.println("--Logging You Into Your Account--");
                isMainMenu = false;
                isCreateView = false;
                isLoginView = false;
                isUsersAccountView = true;
                ViewUsersAccount(usernameEntered, accountType);
            }
            else{
                System.out.println("Login Failed, This Username and/or password either doesnt exist. Try again");

            }
        }

    }

    public void createView() {
        System.out.println("=============");
        System.out.println("Create Account View");
        System.out.println("=============");

        while(isCreateView && !isLoginView && !isMainMenu && !isUsersAccountView) {
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
                isUsersAccountView = false;
                System.out.println("<--Going Back");
                break;

            }
            System.out.println("Enter your password: ");
            passwordEntered = scan.nextLine();
            if (passwordEntered.equals("0")) {
                isMainMenu = true;
                isCreateView = false;
                isLoginView = false;
                isUsersAccountView = false;
                System.out.println("<--Going Back");
                break;
            }
            System.out.println("[1] -SAVINGS-");
            System.out.println("[2] -BASIC-");
            System.out.println("[3] -BUSINESS-");
            System.out.println("Please Select What Type Of Account You Would Like to Create From Available Options: ");
            accTypeSelected = scan.nextInt();
            scan.nextLine();
            //successful creation
            switch (accTypeSelected) {
                case 1:
                    System.out.println("SAVINGS ACCOUNT TYPE SELECTED");
                    accountType = AccountType.SAVINGS;
                    //call create account here
                    System.out.println("VALIDATING ACCOUNT....");
                    isValidCreate = validator.createValidator(usernameEntered, passwordEntered, accountType);
                    if(isValidCreate){
                        System.out.println("--CREATE ACCOUNT IS VALID--");
                        //since it is valid, Add the username, password and account type to their respective arraylist.
                        usernamesList.add(usernameEntered);
                        passwordsList.add(passwordEntered);
                        System.out.println("Accounts usernames arraylist: "+ usernamesList);
                        System.out.println("Accounts passwords arraylist: "+ passwordsList);
                        System.out.println("Accounts account type arraylist: "+ accountTypeList);
                        accountTypeList.add(accountType);
                        //validator.fillUsernamesArrayList();
                        //validator.fillPasswordsArrayList();
                        isMainMenu = true;
                        isCreateView = false;
                        isLoginView = false;
                        isUsersAccountView = false;
                    }
                    else{
                        System.out.println("--CREATE ACCOUNT IS INVALID--");
                        System.out.println("--Try Creating Again--");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("BASIC ACCOUNT TYPE SELECTED");
                    //accountType = AccountType.BASIC;
                    //call create account here
                    System.out.println("VALIDATING ACCOUNT....");
                    isValidCreate = validator.createValidator(usernameEntered, passwordEntered, accountType);
                    if(isValidCreate){
                        System.out.println("--CREATE ACCOUNT IS VALID--");
                        //since it is valid, Add the username, password and account type to their respective arraylist.
                        usernamesList.add(usernameEntered);
                        passwordsList.add(passwordEntered);
                        accountTypeList.add(accountType);

                        System.out.println("Accounts usernames arraylist: "+ usernamesList);
                        System.out.println("Accounts passwords arraylist: "+ passwordsList);
                        System.out.println("Accounts account type arraylist: "+ accountTypeList);

                        isMainMenu = true;
                        isCreateView = false;
                        isLoginView = false;
                        isUsersAccountView = false;
                    }
                    else{
                        System.out.println("--CREATE ACCOUNT IS INVALID--");
                        System.out.println("--Try Creating Again--");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("BUSINESS ACCOUNT TYPE SELECTED");
                    //accountType = AccountType.BUSINESS;
                    //call create account here
                    System.out.println("VALIDATING ACCOUNT....");
                    isValidCreate = validator.createValidator(usernameEntered, passwordEntered, accountType);
                    if(isValidCreate){
                        System.out.println("--CREATE ACCOUNT IS VALID--");
                        //since it is valid, Add the username, password and account type to their respective arraylist.
                        usernamesList.add(usernameEntered);
                        passwordsList.add(passwordEntered);
                        accountTypeList.add(accountType);

                        System.out.println("Accounts usernames arraylist: "+ usernamesList);
                        System.out.println("Accounts passwords arraylist: "+ passwordsList);
                        System.out.println("Accounts account type arraylist: "+ accountTypeList);

                        isMainMenu = true;
                        isCreateView = false;
                        isLoginView = false;
                        isUsersAccountView = false;
                    }
                    else{
                        System.out.println("--CREATE ACCOUNT IS INVALID--");
                        System.out.println("--Try Creating Again--");
                        break;
                    }
                    break;

                default:
                    System.out.println("That option does not exist. Select one that does. Lets try this again");
            }
        }
    }

    private Boolean validateLogIntoAccount(String usrname, String passwrd)
    {
        boolean usernameMatches = false;
        boolean passwordMatches = false;
        int ia = 0;
        if(usernamesList != null && passwordsList != null) {
            if (!usernamesList.isEmpty() && !passwordsList.isEmpty()) {
                for(int i = 0; i < usernamesList.size(); i++){
                    if(usernamesList.get(i).equals(usrname)){
                        usernameMatches = true;
                        ia = i;

                    }

                }
                for(int i =0; i < passwordsList.size(); i++){
                    if(passwordsList.get(i).equals(passwrd)){
                        passwordMatches = true;
                        ia = i;
                    }
                }
                accountType = accountTypeList.get(ia);
            }
        }
        if(usernameMatches && passwordMatches) {
            return true;

        }
        else{
            return false;
        }

    }

    private void ViewUsersAccount(String username, AccountType accountType){
        System.out.println("=============");
        System.out.println("Logged Into Bank Account View");
        System.out.println("=============");
        System.out.println("Account Username: " + username);
        System.out.println("Account Type: " + accountType);
        System.out.println("-------------");

        while(isUsersAccountView && !isCreateView && !isLoginView && !isMainMenu){



        }
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

    public Boolean getAccountViewBool(){
        return isUsersAccountView;
    }

    public void setAccountViewBool(boolean accountViewBool){
        this.isUsersAccountView = accountViewBool;
    }

    //isUsersAccountView
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

    public ArrayList<String> getUsernamesList() {
        return usernamesList;
    }
    public ArrayList<String> getPasswordsList() {
        return passwordsList;
    }
    public ArrayList<AccountType> getAccountTypeList() {
        return accountTypeList;
    }

    //accountTypeList

}
