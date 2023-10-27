package dao;

import java.sql.*;
import java.util.*;

public class DepartmentDAOImpl implements DepartmentDAO {

    Connection conn;

    DepartmentDAOImpl() { //ctor is loading the driver and connecting the the DB
        try {
            System.out.println("Loading the driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("Driver loaded..");

            //       3b) acquire the connection
            System.out.println("Acquiring the connection to the database....");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root123");
            System.out.println("Connected to the database : "+conn);
        }
        catch(SQLException e) {
            System.out.println("DB problem : "+e);
        }
    }

    @Override
    public void insertDepartment(Department department) {
        try {
            System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO MYDEPT3 VALUES (?,?,?)");
            System.out.println("PreparedStatement created...");

            preparedStatement.setInt(1, department.getDepartmentNumber());
            preparedStatement.setString(2, department.getDepartmentName());
            preparedStatement.setString(3, department.getDepartmentLocation());
            
            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsAdded  = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows added..."+rowsAdded);
        }
         catch(SQLException e) {
            System.out.println("DB problem : "+e);
        }
    }

    @Override
    public Department selectDepartment(int deptNumber) {
        
        Department department=null;

        try {
        //4. make a desired statement [ Statement/PreparedStatement/CallableStatement]
            System.out.println("Creating a statement");
            Statement statement = conn.createStatement();
            System.out.println("Statement created...");

            //5. fire the statement
            System.out.println("Executing the query...");
            ResultSet result  = statement.executeQuery("SELECT * FROM MYDEPT3 where deptno="+deptNumber);
            System.out.println("Query fired..got the result...");

          
            //6. acquire the result if any
            //7. process the result if any
            if(result.next()) {
                department = new Department(); //make a blank object
                department.setDepartmentNumber(result.getInt(1)); //fill the object
                department.setDepartmentName(result.getString(2)); //fill the next field
                department.setDepartmentLocation(result.getString(3)); //fill the last field
            } 
        }
        catch(SQLException e) {
            System.out.println("Exception : "+e);
        }  
        return department;
    }

    @Override
    public ArrayList<Department> selectDepartments() { //fetching all department records and pushing them to a local array list and returning it

        ArrayList<Department> deptList = new ArrayList<Department>(); //blank
        
        try {
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
                Department department = new Department(); //make a blank object
                department.setDepartmentNumber(result.getInt(1)); //fill the object
                department.setDepartmentName(result.getString(2)); //fill the next field
                department.setDepartmentLocation(result.getString(3)); //fill the last field
                deptList.add(department); //push this object to the list
            } 
        }
        catch(SQLException e) {
            System.out.println("Exception : "+e);
        }  
        return deptList;
    }

    @Override
    public void updateDepartment(Department department) {
        try {
            //4. make a desired statement [ Statement/PreparedStatement/CallableStatement]
            System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE MYDEPT3 SET   DNAME=?,LOC=? WHERE DEPTNO=?");
            System.out.println("PreparedStatement created...");

            //set col1
            preparedStatement.setString(1, department.getDepartmentName());
            
            //set col2
            preparedStatement.setString(2, department.getDepartmentLocation());
            
            //from
            preparedStatement.setInt(3, department.getDepartmentNumber());

            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsUpdated  = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows modified..."+rowsUpdated);
        }
        catch(SQLException e) {
            System.out.println("Exception : "+e);
        }  
    }

    @Override
    public void deleteDepartment(int deptNumber) {
         //4. make a desired statement [ Statement/PreparedStatement/CallableStatement]
        try {
         System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM MYDEPT3 WHERE DEPTNO=?");
            System.out.println("PreparedStatement created...");
            
            preparedStatement.setInt(1, deptNumber);

            //5. fire the statement
            System.out.println("Executing the query...");
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows DELETED..."+rowsDeleted);
        }
        catch(SQLException e) {
            System.out.println("Exception : "+e);
        }    
    }
    
    
}
