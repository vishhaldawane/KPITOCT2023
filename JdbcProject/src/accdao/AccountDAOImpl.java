package accdao;

import java.sql.Connection;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

    //Connection conn;
    //EntityManager em;

    AccountDAOImpl() {
        //load the driver and make the global connection;
       // EntityManagerFactory factory  = Persistence.createEntityManagerFactory("MyJPA");

        //this.em = factory.createEntityManager();
    }


    @Override
    public void createAccount(Account account) {
        //EntityTransaction trans = em.getTransaction();
    // trans.begin();
         //   em.persist(account);
      //  trans.commit();
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
