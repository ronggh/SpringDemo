package basic;

public class Emp {
    private String empName;
    private String gender;

    // 所属部门
    Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println("Name:" + empName + ">>>>>" + "gender:" + gender + ">>>>>" + "deptName:" + dept.getDeptName());
    }
}
