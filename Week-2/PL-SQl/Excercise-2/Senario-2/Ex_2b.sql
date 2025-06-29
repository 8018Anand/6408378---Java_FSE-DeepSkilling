CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
   Department IN VARCHAR2,
   Bonus      IN NUMBER
)
IS
BEGIN
   UPDATE Employees e
   SET Salary = Salary + (Salary * (Bonus / 100))
   WHERE UPPER(e.Department) = UPPER(Department);

   DBMS_OUTPUT.PUT_LINE(
      SQL%ROWCOUNT || ' Employee(s) updated in department ' || UPPER(Department) || '.'
   );
END;
/
