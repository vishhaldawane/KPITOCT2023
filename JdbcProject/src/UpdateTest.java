import java.sql.*;
import java.util.Scanner;

public class UpdateTest {
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
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE MYDEPT3 SET DNAME=?, LOC=? WHERE DEPTNO=?");
            System.out.println("PreparedStatement created...");

            Scanner scanner1 = new Scanner(System.in);
            Scanner scanner2 = new Scanner(System.in);
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter THE EXISTING dept no : ");
            int newDeptNumber = scanner1.nextInt();

            System.out.println("Enter MODIFIED dept name : ");
            String newDeptName = scanner2.nextLine();

            System.out.println("Enter MODIFIED dept loc : ");
            String newDeptLoc= scanner3.nextLine();

            preparedStatement.setString(1, newDeptName);
            preparedStatement.setString(2, newDeptLoc);
            preparedStatement.setInt(3, newDeptNumber);

            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsUpdated  = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows modified..."+rowsUpdated);
            
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
