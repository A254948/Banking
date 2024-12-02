
interface IBankAccount {

    void CreateAccount(String usrname, String passwrd );
    void LogIntoAccount(String usrname, String passwrd);
    void DeleteAccount(String usrname, String passwrd);
    void DepositMoney(String amount);
    void SendMoney(String usrnameToSend, String amount);


}
