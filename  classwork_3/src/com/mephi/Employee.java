package com.mephi;


import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

enum Gender {Male, Female}
enum Role {Staff, Manager, Executive}

public class Employee {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private Role role;
    private int dept;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private int code;
    
    private Employee() {}

    @Override
    public String toString() {
        return "Employee{" +
                "givenName=" + givenName + ";" +
                "surName=" + surName + ";" +
                "age=" + age + ";" +
                "gender=" + gender + ";" +
                "role=" + role + ";" +
                "dept=" + dept + ";" +
                "eMail=" + eMail + ";" +
                "phone=" + phone + ";" +
                "address=" + address + ";" +
                "city=" + city + ";" +
                "state=" + state + ";" +
                "code=" + code + ";"
                + "}";
    }

    public static class Builder {
        private String givenName;
        private String surName;
        private int age;
        private Gender gender;
        private Role role;
        private int dept;
        private String eMail;
        private String phone;
        private String address;
        private String city;
        private String state;
        private int code;

        public Builder setGivenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder setSurName(String surName) {
            this.surName = surName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        public Builder setDept(int dept) {
            this.dept = dept;
            return this;
        }

        public Builder setEMail(String eMail) {
            this.eMail = eMail;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCode(int code) {
            this.code = code;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.givenName = this.givenName;
            employee.surName = this.surName;
            employee.age = this.age;
            employee.gender = this.gender;
            employee.role = this.role;
            employee.dept = this.dept;
            employee.eMail = this.eMail;
            employee.phone = this.phone;
            employee.address = this.address;
            employee.city = this.city;
            employee.state = this.state;
            employee.code = this.code;
            return employee;
        }
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public int getDept() {
        return dept;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getCode() {
        return code;
    }

    public static List<Employee> createShortList() {
        List<Employee> list = new ArrayList<>();

        list.add(new Builder()
                .setGivenName("Christofer")
                .setSurName("Smith")
                .setAge(31)
                .setGender(Gender.Male)
                .setRole(Role.Manager)
                .setDept(5600)
                .setEMail("chris_smith@gmail.com")
                .setPhone("+1706246-1067")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        list.add(new Builder()
                .setGivenName("Gary")
                .setSurName("Hovard")
                .setAge(28)
                .setGender(Gender.Male)
                .setRole(Role.Staff)
                .setDept(4300)
                .setEMail("gary_hov@gmail.com")
                .setPhone("+1706248-1067")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        list.add(new Builder()
                .setGivenName("Earl")
                .setSurName("Lopez")
                .setAge(35)
                .setGender(Gender.Male)
                .setRole(Role.Executive)
                .setDept(6100)
                .setEMail("earl_lopez@gmail.com")
                .setPhone("+1706248-1667")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        list.add(new Builder()
                .setGivenName("Vernon")
                .setSurName("Miller")
                .setAge(23)
                .setGender(Gender.Male)
                .setRole(Role.Staff)
                .setDept(3900)
                .setEMail("vern_miller@gmail.com")
                .setPhone("+1706248-1888")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        list.add(new Builder()
                .setGivenName("Leah")
                .setSurName("Bell")
                .setAge(25)
                .setGender(Gender.Female)
                .setRole(Role.Staff)
                .setDept(4000)
                .setEMail("leah_bell@gmail.com")
                .setPhone("+1706589-1067")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        list.add(new Builder()
                .setGivenName("Laurie")
                .setSurName("Carter")
                .setAge(27)
                .setGender(Gender.Female)
                .setRole(Role.Manager)
                .setDept(5550)
                .setEMail("laurie_carter@gmail.com")
                .setPhone("+1706248-2222")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        list.add(new Builder()
                .setGivenName("Marie")
                .setSurName("Reynolds")
                .setAge(31)
                .setGender(Gender.Female)
                .setRole(Role.Executive)
                .setDept(6200)
                .setEMail("marie_reynolds@gmail.com")
                .setPhone("+1706999-1067")
                .setAddress("454 Hillcrest Ave NE")
                .setCity("Atlanta")
                .setState("Georgia")
                .setCode(706)
                .build());

        return list;
    }
}
