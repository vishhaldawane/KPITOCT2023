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

/*
public interface FlightDAO {
    //5 methods declared
} 
public class FlightDAOImpl implements FlightDAO {
    //5 methods with JPA or JDBC
}
-----
public interface FlightRepository extends CrudRepository {

}
*/

interface A {
    void fun();
    void foo();
    void far();
}
interface B extends A {

}
class C implements B {

}