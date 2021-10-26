package com.mephi;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        List<Employee> em = Employee.createShortList();
        Accountant acc = new Accountant();
        em.stream()
                .filter(p -> p.getGender() == Gender.Female)
                .forEach(acc::paySalary);
        em.stream()
                .filter(p -> p.getRole() == Role.Staff)
                .forEach(acc::paySalary);
        em.stream()
                .filter(p -> p.getAge() > 30 && p.getRole() == Role.Executive)
                .forEach(acc::payPremium);
        em.stream()
                .filter(p -> p.getRole() == Role.Manager)
                .forEach(acc::paySalary);
        em.stream()
                .filter(p -> p.getRole() == Role.Staff)
                .forEach(acc::payPremium);
        System.out.println("Predicate Lambda");
        Predicate<Employee> isManager =
                t -> t.getRole().equals(Role.Manager);
        em.stream()
                .filter(isManager)
                .forEach(acc::paySalary);
        System.out.println("Consumer Lambda");
        Consumer<Employee> roleConsumer = t ->
                System.out.printf("Role of %s %s is %s\n", t.getGivenName(), t.getSurName(), t.getRole());
        em.forEach(roleConsumer);
        System.out.println("Supplier Lambda");
        Supplier<Employee> emSupplier =
                () -> new Employee.Builder()
                        .setGivenName("Peter")
                        .setSurName("Harris")
                        .setAge(23)
                        .setGender(Gender.Male)
                        .setRole(Role.Manager)
                        .setDept(4300)
                        .setEMail("peter_harris@gmail.com")
                        .setPhone("+1704350-2222")
                        .setAddress("454 Hillcrest Ave NE")
                        .setCity("Atlanta")
                        .setState("Georgia")
                        .setCode(706)
                        .build();
        em.add(emSupplier.get());
        System.out.println(em.get(7));
        System.out.println("BiPredicate Lambda");
        BiPredicate<Employee, Role> roleEqual =
                (t, s) -> t.getRole().equals(s);
        System.out.println(roleEqual.test(em.get(0), Role.Staff));

    }
}
