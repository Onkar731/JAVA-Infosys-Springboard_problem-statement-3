import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintNetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting data from the user
        String inputString = sc.nextLine();

        // getting values from the string
        List<Float> values = Arrays.stream(inputString.split(",")).map(Float::parseFloat).collect(Collectors.toList());
        
        // creating object of Salary class
        Salary s = new Salary(values.get(0), values.get(1), values.get(2));

        // printing net salary
        System.out.println(s.getNetSalary());

        // closing resources
        sc.close();
    }
}
