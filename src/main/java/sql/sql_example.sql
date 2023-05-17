/**
  EMPLOYEES
      EMPLOYEE_ID
      ...
      MANAGER_ID
*/

SELECT EMPLOYEE_ID FROM EMPLOYEES WHERE MANAGER_ID NOT NULL AND EMPLOYEE_ID NOT IN (SELECT MANAGER_ID FROM EMPLOYEES);