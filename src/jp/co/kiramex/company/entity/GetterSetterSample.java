package jp.co.kiramex.company.entity;

public class GetterSetterSample {

    
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("大島");
        
        String empName = employee.getEmployeeName();
        System.out.println(empName);
        }
}
