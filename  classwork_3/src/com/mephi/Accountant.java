package com.mephi;

public class Accountant {
    public void paySalary(Employee employee) {
        System.out.printf("Выплата зарплаты %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), employee.getDept());
    }
    public void payPremium(Employee employee) {
        if (employee.getRole() == Role.Staff) {
            System.out.printf("Выплата зарплаты %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), (int)(employee.getDept()*0.1));
        }
        if (employee.getRole() == Role.Manager) {
            System.out.printf("Выплата зарплаты %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), (int)(employee.getDept()*0.2));
        }
        if (employee.getRole() == Role.Executive) {
            System.out.printf("Выплата зарплаты %s %s в размере %d\n", employee.getGivenName(), employee.getSurName(), (int)(employee.getDept()*0.3));
        }
    }
}
