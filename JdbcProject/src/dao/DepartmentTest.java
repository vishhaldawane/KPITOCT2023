package dao;

import java.util.ArrayList;

public class DepartmentTest {
        public static void main(String[] args) {
            
            DepartmentDAO departmentDAO = new DepartmentDAOImpl();

            Department department = departmentDAO.selectDepartment(10);
                System.out.println("DEPTNO : "+department.getDepartmentNumber());
                System.out.println("DNAME  : "+department.getDepartmentName());
                System.out.println("LOC    : "+department.getDepartmentLocation());
                System.out.println("----------------");
           /* 
            ArrayList<Department> deptList = departmentDAO.selectDepartments();

            for (Department department : deptList) {
                
                    System.out.println("DEPTNO : "+department.getDepartmentNumber());
                    System.out.println("DNAME  : "+department.getDepartmentName());
                    System.out.println("LOC    : "+department.getDepartmentLocation());
                    System.out.println("----------------");    
                   
            }*/


        }
}
