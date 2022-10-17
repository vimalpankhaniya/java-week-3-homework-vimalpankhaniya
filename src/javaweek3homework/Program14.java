package javaweek3homework;

public class Program14 {
    public class Person {
        String firstName;
        String lastName;
        int age;

        public void main(String[] args) {
            Person p = new Person();
            p.setFirstName(""); // firstName is set to empty string
            p.setLastName(""); // lastName is set to empty string
            p.setAge(10);
            System.out.println("fullName= " + p.getFullName());
            System.out.println("teen= " + p.isTeen());
            p.setFirstName("John"); // firstName is set to John
            p.setAge(18);
            System.out.println("fullName= " + p.getFullName());
            System.out.println("teen= " + p.isTeen());
            p.setLastName("Smith"); // lastName is set to Smith
            System.out.println("fullName= " + p.getFullName());

        }

        public String getFirstName() {
            Person p = new Person();
            return p.firstName;
        }

        public String getLastName() {
            Person p = new Person();
            return p.lastName;
        }

        public int getAge() {
            Person p = new Person();
            return p.age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            if (age > 0 || age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }

        public boolean isTeen() {
            Person p = new Person();
            // p.age = 19;
            if (age > 12 && age < 20) {
                return true;
            }
            return false;

        }

        public String getFullName() {

            if (firstName.isEmpty()) {
                return lastName;
            }
            if (lastName.isEmpty()) {
                return firstName;
            }
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return " ";
            } else {
                return firstName + " " + lastName;
            }
        }

    }
}
