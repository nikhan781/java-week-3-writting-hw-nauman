public class Programme_14_Person {

    String firstname, lastname;
    int age;

    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }

    }

    public String getFullName() {
        if (firstname.isEmpty() && lastname.isEmpty()) {
            return " ";
        } else if (firstname.isEmpty()) {
            return getLastname();
        } else if (lastname.isEmpty()) {
            return getFirstname();
        } else {
            return getFirstname() + " " + getLastname();
        }
    }


}
