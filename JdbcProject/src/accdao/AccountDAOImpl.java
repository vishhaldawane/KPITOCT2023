package accdao;

import java.sql.Connection;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

    Connection conn;
    
    AccountDAOImpl() {
        //load the driver and make the global connection;
    }


    @Override
    public void createAccount(Account account) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
    }

    @Override
    public void updateAccount(Account account) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAccount'");
    }

    @Override
    public void deleteAccount(int accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAccount'");
    }

    @Override
    public Account selectAccount(int accountNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectAccount'");
    }

    @Override
    public List<Account> selectAllAccounts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectAllAccounts'");
    }
    
}
