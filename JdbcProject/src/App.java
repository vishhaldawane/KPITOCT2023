import java.sql.*;

public class App {
    public static void main(String[] args)  {
        try {
            // 1. know your database - MySQL
            // 2. know your driver - com.mysql.jdbc.Driver

            //3. connect to the database
            //         3a) load the driver
            System.out.println("Loading the driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("Driver loaded..");

            //       3b) acquire the connection
            System.out.println("Acquiring the connection to the database....");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root123");
            System.out.println("Connected to the database : "+conn);

            //4. make a desired statement [ Statement/PreparedStatement/CallableStatement]
            System.out.println("Creating a statement");
            Statement statement = conn.createStatement();
            System.out.println("Statement created...");

            //5. fire the statement
            System.out.println("Executing the query...");
            ResultSet result  = statement.executeQuery("SELECT * FROM MYDEPT3");
            System.out.println("Query fired..got the result...");

            //6. acquire the result if any
            //7. process the result if any
            while(result.next()) {
                System.out.println("DEPTNO : "+result.getInt(1));
                System.out.println("DNAME  : "+result.getString(2));
                System.out.println("LOC    : "+result.getString(3));
                System.out.println("----------------");    
            }    
            //8. close the result if any
            result.close();
            //9. close the statement
            statement.close();
            //10. close the connection
            conn.close();
        }
        catch(SQLException e) {
            System.out.println("Some problem with SQL : "+e);
        }
        finally {
            System.out.println("Finally block bound to run ragardless of exceptions...");
        }

    }   
}
