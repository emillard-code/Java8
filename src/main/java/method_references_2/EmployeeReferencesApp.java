package method_references_2;

public class EmployeeReferencesApp {

    public static void main( String[] args ) {

        // Method Reference of Constructor Method (noArgs)
        EmployeeA employeeA = Employee::new;
        employeeA.getEmployee().description();

        // Method Reference of Constructor Method (args)
        EmployeeB employeeB = Employee::new;
        employeeB.getEmployee("John Smith", 60000).description();

    }

}
