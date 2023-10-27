package accdao;

import java.util.List;

public interface AccountDAO {
    //CRUD
    void createAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(int accountNumber);
    Account selectAccount(int accountNumber);
    List<Account> selectAllAccounts();
}
