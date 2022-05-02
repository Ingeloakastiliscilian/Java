import jdk.jfr.Unsigned;

public class Person {

    private final String fullName;
    private final String post;
    private final String email;
    private final String phoneNumber;
    private final Double wages;
    private final Integer age;

    public Person(String fullName, String post, String email, String phoneNumber, Double wages, Integer age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wages = wages;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return fullName + ":"
                +"\n\t" + "age: " + age
                +"\n\t" + "post: " + post
                +"\n\t" + "wages: " + wages
                +"\n\t" + "phoneNumber: " + phoneNumber
                +"\n\t" + "email: " + email;
    }
}
