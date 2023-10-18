import java.sql.*;
import java.util.Scanner;

public class InsertTest {
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
            System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO MYDEPT3 VALUES (?,?,?)");
            System.out.println("PreparedStatement created...");

            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter new dept no : ");
            int newDeptNumber = scanner1.nextInt();

            System.out.println("Enter new dept name : ");
            String newDeptName = scanner2.nextLine();

            System.out.println("Enter new dept loc : ");
            String newDeptLoc= scanner3.nextLine();

            preparedStatement.setInt(1, newDeptNumber);
            preparedStatement.setString(2, newDeptName);
            preparedStatement.setString(3, newDeptLoc);
            
            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsAdded  = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows added..."+rowsAdded);
            
            //6. close the statement
            preparedStatement.close();
            //7. close the connection
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
