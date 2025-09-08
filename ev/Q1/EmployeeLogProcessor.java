import java.util.*;

public class EmployeeLogProcessor {
    public static void main(String[] args) {
        
        String[] employeeNames = {
            "Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eve",
            "Charlie", "Alice", "Frank", "Grace", "Bob"
        };

         
        // Task 1:
         
        List<String> employeeList = new ArrayList<>();
        for (String name : employeeNames) {
            employeeList.add(name);
        }

        System.out.println("=== Task 1: Store and Display All Entries ===");
        System.out.println("Total Entries: " + employeeList.size());
        System.out.println("Employee Log Entries: " + employeeList);

         
        // Task 2:
         
        Set<String> uniqueEmployees = new HashSet<>(employeeList);

        System.out.println("\n=== Task 2: Identify Unique Employees ===");
        System.out.println("Unique Employees: " + uniqueEmployees.size());
        System.out.println("Employee Names: " + uniqueEmployees);

         
        // Task 3: 
         
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String name : employeeList) {
            frequencyMap.put(name, frequencyMap.getOrDefault(name, 0) + 1);
        }

        System.out.println("\n=== Task 3: Count Entry Frequency ===");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
