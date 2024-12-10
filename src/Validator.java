public class Validator implements Ivalidator {


    @Override
    public boolean loginValidator(String username, String password) {
        return false;
    }

    @Override
    public boolean createValidator(String username, String password, AccountType acType) {


        return false;
    }


}
