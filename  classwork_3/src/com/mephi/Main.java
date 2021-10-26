package com.mephi;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<Employee> em = Employee.createShortList();
        System.out.println(em);
        Accountant acc = new Accountant();
        System.out.println("--Выплата премии женщинам сотрудникам--");
        em.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .forEach(acc::payPremium);
        System.out.println("--Выплата зарплаты сотрудникам определенного департамента--");
        em.stream()
                .filter(p -> p.getDept().equals("Sales"))
                .forEach(acc::paySalary);
        System.out.println("--Выплата премии сотрудникам старше 30, работающим в определенном департаменте--");
        em.stream()
                .filter(p -> p.getAge() > 30 && p.getDept().equals("IT"))
                .forEach(acc::payPremium);
        System.out.println("--Выплата зарплаты менеджерам--");
        em.stream()
                .filter(p -> p.getRole().equals(Role.MANAGER))
                .forEach(acc::paySalary);
        System.out.println("--Выплата премии стаффу--");
        em.stream()
                .filter(p -> p.getRole().equals(Role.STAFF))
                .forEach(acc::payPremium);
        System.out.println("--Predicate Lambda--");
        Predicate<Employee> isManager =
                t -> t.getRole().equals(Role.MANAGER);
        em.stream()
                .filter(isManager)
                .forEach(acc::paySalary);
        System.out.println("--Consumer Lambda--");
        Consumer<Employee> roleConsumer = t ->
                System.out.printf("Role of %s %s is %s\n", t.getGivenName(), t.getSurName(), t.getRole());
        em.forEach(roleConsumer);
        System.out.println("--Supplier Lambda--");
        Supplier<Employee> emSupplier =
                () -> new Employee.Builder()
                        .setGivenName("Peter")
                        .setSurName("Harris")
                        .setAge(23)
                        .setGender(Gender.MALE)
                        .setRole(Role.MANAGER)
                        .setSalary(4300)
                        .setDept("IT")
                        .setEMail("peter_harris@gmail.com")
                        .setPhone("+1704350-2222")
                        .setAddress("454 Hillcrest Ave NE")
                        .setCity("Atlanta")
                        .setState("Georgia")
                        .setCode(706)
                        .build();
        em.add(emSupplier.get());
        System.out.println(em.get(7));
        System.out.println("--BiPredicate Lambda--");
        BiPredicate<Employee, Role> roleEqualStaff =
                (t, s) -> t.getRole().equals(s);
        System.out.println(roleEqualStaff.test(em.get(0), Role.STAFF));

    }
}
