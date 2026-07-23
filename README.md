Assignent day 2 

Assignment
Build a Java application that calculates an employee's salary — including allowances, deductions, and net pay. Each step adds one new feature using exactly one concept from the training slides.
Topics Used
Step	Topic	What you practice
Step 1	Java Syntax & Identifiers	Program structure, valid variable names
Step 2	Data Types	Correct types for each employee field
Step 3	Constants	Fixed rates — HRA, DA, Tax, PF
Step 4	Type Casting	Display salary as whole rupees
Step 5	Strings	Format employee name on payslip
Step 6	Arrays	Store 6 months of salary, find average
Step 7	Methods	calculateHRA(), calculateTax(), printPayslip()
Step 8	Modifiers	Private fields, public getters
Step 9	Classes & Objects	Employee class with two objects
 
  Step 1  [Java Syntax & Identifiers]  Set up the program and declare employee variables

Every Java program starts with a class and a main() method. Variable names must follow identifier rules — camelCase for variables, no spaces, cannot start with a digit.
  Task: Create class SalaryApp with main(). Declare employeeName, employeeId, and basicSalary with correct names and print them.

Expected Output:
Employee Name : Riya Sharma
Employee ID   : 2001
Basic Salary  : 35000.0


  Step 2  [Data Types]  Choose the right type for every employee detail

Different employee details need different types. Use String for name, int for ID and years of service, double for salary, boolean for full-time status, and char for the grade level.
  Task: Add department (String), yearsOfService (int), isFullTime (boolean), and grade (char). Print all seven fields.
Expected Output:
Name       : Riya Sharma
ID         : 2001
Dept       : Engineering
Salary     : 35000.0
Years      : 3
Full-time  : true
Grade      : B


  Step 3  [Constants]  Fixed salary rates that never change

Rates like HRA, DA, Tax, and PF are fixed by company policy and should never change during the program. Declare them as constants using final.
  Task: Declare four constants for the rates. Calculate each allowance/deduction from basicSalary and print them.

Expected Output:
HRA (20%) : 7000.0
DA  (15%) : 5250.0
Tax (10%) : 3500.0
PF  (12%) : 4200.0


  Step 4  [Type Casting]  Display salary as whole rupees on the payslip

Salary calculations produce decimal values. For printing on a payslip, we display the net salary as whole rupees (int). Use narrowing cast. Also widen an int bonus to double for the calculation.
  Task: Calculate gross salary (basic + HRA + DA). Cast it to int for the payslip display. Add an int bonus and widen it to double.

Expected Output:
Gross (exact) : Rs.52250.0
Gross (whole) : Rs.52250


  Step 5  [Strings]  Format the employee name on the payslip

Use String methods to format the employee name and department for a professional-looking payslip header.
  Task: Print the employee's name in uppercase as the payslip title. Check name length, whether the department contains 'Eng', and greet using concatenation.

Expected Output:
===== PAYSLIP =====
Employee : RIYA SHARMA
Dept     : Engineering
Name Len : 11
Is Engg? : true
Initial  : R
===================


 
  Step 6  [Arrays]  Store 6 months of salary and find the average

HR needs to review an employee's salary history. Store the last 6 monthly net salaries in an array, print each one, then calculate the average.
  Task: Declare a double array of 6 monthly salaries. Print each with its month number using a for loop, then calculate and print the average.
Expected Output:
--- Salary History ---
Month 1 : Rs.42000.0
Month 2 : Rs.42000.0
Month 3 : Rs.43500.0
Month 4 : Rs.43500.0
Month 5 : Rs.45000.0
Month 6 : Rs.45000.0
Average  : Rs.43500.0


  Step 7  [Methods]  calculateGross(), calculateDeductions(), printPayslip()

Instead of putting all salary logic in main(), break it into reusable methods — one per operation.
  Task: Write three methods: calculateGross() returns gross salary, calculateDeductions() returns total deductions, printPayslip() prints the full salary breakdown. Call all three from main().

Expected Output:
--- Riya Sharma ---
Gross      : Rs.47250.0
Deductions : Rs.7700.0
Net Salary : Rs.39550.0


  Step 8  [Modifiers]  Protect salary data with private fields

Employee salary is sensitive data. Fields like basicSalary should never be changed directly from outside the class. Use private to hide them and public getters to allow safe read access.
  Task: Move fields into an Employee class with private access. Add public getters for name and salary. Try accessing the private field directly and observe the error.

Expected Output:
null
0.0
0.1
(emp.basicSalary = 50000 would cause a compile error)


  Step 9  [Classes & Objects]  Build the full Employee class with two objects

Bring everything together into a complete Employee class. Create two employee objects and generate a payslip for each independently.
  Task: Create a full Employee class with all fields and a printPayslip() method. Add a static totalEmployees counter. Create two objects and call printPayslip().
Expected Output:
Name  : Riya Sharma  |  Dept: Engineering
Gross : Rs.47250.0
Deduc : Rs.7700.0
Net   : Rs.39550.0
-----------------------------
Name  : Arjun Mehta  |  Dept: Marketing
Gross : Rs.37800.0
Deduc : Rs.6160.0
Net   : Rs.31640.0
-----------------------------
