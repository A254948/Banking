public interface IValidator {

    boolean loginValidator(String username, String password);
    boolean createValidator(String username, String password, AccountType acType);
}
