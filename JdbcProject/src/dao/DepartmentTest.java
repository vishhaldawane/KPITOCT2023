package dao;

import java.util.ArrayList;

public class DepartmentTest {
        public static void main(String[] args) {
            
            DepartmentDAO departmentDAO = new DepartmentDAOImpl();

            departmentDAO.deleteDepartment(50);
            
                
            /*  //insert or update
            Department department = new Department();
            department.setDepartmentNumber(50);
            department.setDepartmentName("RIH");
            department.setDepartmentLocation("TrendsChroma");
            departmentDAO.updateDepartment(department);
            */

            /*  //retrieve a single department
            Department department = departmentDAO.selectDepartment(10);
                System.out.println("DEPTNO : "+department.getDepartmentNumber());
                System.out.println("DNAME  : "+department.getDepartmentName());
                System.out.println("LOC    : "+department.getDepartmentLocation());
                System.out.println("----------------");
            */    

           /* // retrieve all departments 
            ArrayList<Department> deptList = departmentDAO.selectDepartments();

            for (Department department : deptList) {
                
                    System.out.println("DEPTNO : "+department.getDepartmentNumber());
                    System.out.println("DNAME  : "+department.getDepartmentName());
                    System.out.println("LOC    : "+department.getDepartmentLocation());
                    System.out.println("----------------");    
                   
            }*/


        }
}
