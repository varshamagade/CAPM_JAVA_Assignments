package Day2;
public class SalaryApp {
    // STEP 7 Methods
    static double calculateGross(double basicSalary) {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.15;
        return basicSalary + hra + da;
    }

    static double calculateDeductions(double basicSalary) {
        double tax = basicSalary * 0.10;
        double pf = basicSalary * 0.12;
        return tax + pf;
    }

     static void printPayslip(String name, double basicSalary)  {
        double gross = calculateGross(basicSalary);
        double deductions = calculateDeductions(basicSalary);
        double net = gross - deductions;
        System.out.println("--- " + name + " ---");
        System.out.println("Gross      : Rs." + gross);
        System.out.println("Deductions : Rs." + deductions);
        System.out.println("Net Salary : Rs." + net);
    }

    public static void main(String[] args) {

        // STEP 1 -
        System.out.println("===== STEP 1: Syntax & Identifiers =====");
        String employeeName = "Riya Sharma";
        int employeeId = 2001;
        double basicSalary = 35000.0;
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println();

        // STEP 2 — Data Types
        System.out.println("===== STEP 2: Data Types =====");
        String department = "Engineering";
        int yearsOfService = 3;
        boolean isFullTime = true;
        char grade = 'B';
        System.out.println("Name       : " + employeeName);
        System.out.println("ID         : " + employeeId);
        System.out.println("Dept       : " + department);
        System.out.println("Salary     : " + basicSalary);
        System.out.println("Years      : " + yearsOfService);
        System.out.println("Full-time  : " + isFullTime);
        System.out.println("Grade      : " + grade);
        System.out.println();

        // STEP 3 — Constants
        System.out.println("===== STEP 3: Constants =====");
        final double HRA_RATE = 0.20;
        final double DA_RATE = 0.15;
        final double TAX_RATE = 0.10;
        final double PF_RATE = 0.12;
        double hra = basicSalary * HRA_RATE;
        double da = basicSalary * DA_RATE;
        double tax = basicSalary * TAX_RATE;
        double pf = basicSalary * PF_RATE;
        System.out.println("HRA (20%) : " + hra);
        System.out.println("DA  (15%) : " + da);
        System.out.println("Tax (10%) : " + tax);
        System.out.println("PF  (12%) : " + pf);
        System.out.println();

        // STEP 4 — Type Casting
        System.out.println("===== STEP 4: Type Casting =====");
        double grossSalary = basicSalary + hra + da; // exact double
        int grossWhole = (int) grossSalary; // narrowing cast
        int intBonus = 1500;
        double bonusDouble = (double) intBonus; // widening cast (explicit)
        double grossWithBonus = grossSalary + bonusDouble;
        System.out.println("Gross (exact) : Rs." + grossSalary);
        System.out.println("Gross (whole) : Rs." + grossWhole);
         System.out.println("Gross (Bonus) : Rs." + grossWithBonus);
        System.out.println();

        // STEP 5 — Strings
        System.out.println("===== STEP 5: Strings =====");
        System.out.println("===== PAYSLIP =====");
        System.out.println("Employee : " + employeeName.toUpperCase());
        System.out.println("Dept     : " + department);
        System.out.println("Name Len : " + employeeName.length());
        System.out.println("Is Engg? : " + department.contains("Eng"));
        System.out.println("Initial  : " + employeeName.charAt(0));
        System.out.println("===================");
        System.out.println();

        // STEP 6 — Arrays
        // --------------------------------------------------
        System.out.println("===== STEP 6: Arrays =====");
        double[] monthlySalaries = { 42000.0, 42000.0, 43500.0, 43500.0, 45000.0, 45000.0 };
        double total = 0;
        System.out.println("--- Salary History ---");
        for (int i = 0; i < monthlySalaries.length; i++) {
            System.out.println("Month " + (i + 1) + " : Rs." + monthlySalaries[i]);
            total += monthlySalaries[i];
        }
        double average = total / monthlySalaries.length;
        System.out.println("Average  : Rs." + average);
        System.out.println();

        // STEP 7
         printPayslip("Riya Sharma", 35000.0);

         //STEP 8
          /* 
         Employee emp = new Employee();
         System.out.println(emp.getName());
         System.out.println(emp.getBasicSalary());
        */
        
    }
}