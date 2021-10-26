package com.mephi;

public class Accountant {
    public void paySalary(Employee employee) {
        System.out.printf("Выплата зарплаты %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), employee.getSalary());
    }
    public void payPremium(Employee employee) {
        if (employee.getRole() == Role.STAFF) {
            System.out.printf("Выплата премии %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), (int)(employee.getSalary()*0.1));
        }
        if (employee.getRole() == Role.MANAGER) {
            System.out.printf("Выплата премии %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), (int)(employee.getSalary()*0.2));
        }
        if (employee.getRole() == Role.EXECUTIVE) {
            System.out.printf("Выплата премии %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), (int)(employee.getSalary()*0.3));
        }
    }
}
