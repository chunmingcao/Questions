/*
1/17/2016 with expedia

Given a list of data in the form [Employee_Name, Manager_Name, Employee_Role;Employee_Name, Manager_Name, Employee_Role;…]. Print out the hierarchical relationship map.

Input

[Shruthi, Joan, SDE; Usha, Joan, SDET; Joan, Elias, TPM; Yani, Joan, SDE; Elias, Elizabeth, TM;Vivian, Elias, Senior SDE; Elizabeth, Elizabeth, Senr. Manager]

Output

->Elizabeth
    -> Elias
        -> Joan
            -> Yani
            -> Shruthi
            -> Usha
        -> Vivian
*/
        
class Employee{
    String name,
    String managerName;
    String role,
    
    List<Employee> employees;
}
// Joan <Employee (Shruthi, SDE, list<employees>)>
// Shruthi <Employee (Shruthi, SDE, list<employees>)>


Employee getEmployeeHierachy(List<Employee> employeeList){

    Map<String, Employee> employeeMap = new HashMap<>();
    for(int i = 0; i < employeeList.length; i++){   
        employeeMap.put(employeeList[i].name, employeeList[i]);
        // first entry : Shruthi, [Shruthi, Joan, SDE, employees]
        if(employeeList[i].name == employeeList[i].managerName){
            rootEmployee = employeeList[i];
        }
        
    }
    for(int i = 0; i < employeeList.length; i++){   
        Employee manager = employeeMap.get(employeeList[i].managerName);
        manager.addEmployee(employeeList[i]);
    }
    
    return rootEmployee;
    
}

printEmployeeHierachy();

void printEmployeeHierachy(Employee rootEmployee, int indent){
    String indentStr = ""; 
    for(int k = 0; k < indent; k++){
        indentStr += "\t";
    }
    System.out(indentStr + "->" + rootEmployee);
    for(int i = 0; i < rootEmployee.employees.length; i ++){
        printEmployeeHierachy(rootEmployee.employees[i], indent + 1);
    }
}