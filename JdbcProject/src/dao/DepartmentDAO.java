package dao;

import java.util.*;

public interface DepartmentDAO {
    //CRUD
    void insertDepartment(Department department);
    Department selectDepartment(int deptNumber);
    ArrayList<Department> selectDepartments();
    void updateDepartment(Department department);
    void deleteDepartment(int deptNumber); 
}
