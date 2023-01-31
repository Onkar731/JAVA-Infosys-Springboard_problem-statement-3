public class Salary {
    private float basicSalary;
    private float transportAllowance;
    private float houseAllowance;

    public Salary(float basicSalary, float transportAllowance, float houseAllowance) {
        this.basicSalary = basicSalary;
        this.transportAllowance = transportAllowance;
        this.houseAllowance = houseAllowance;
    }

    public float getNetSalary() {
        float grossSalary = basicSalary + transportAllowance + houseAllowance;

        if(grossSalary > 55000) {
            // returning net salary if gross salary is greater than 55000
            return grossSalary - (grossSalary * 8.2f/100.0f);
        }

        // returning gross salary as net salary if gross salary is less than 55000 
        return grossSalary;
    } 
}