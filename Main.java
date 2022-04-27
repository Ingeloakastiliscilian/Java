
public class Main {

    public static void main(String[] args) {
        Person[] personList = {
                new Person(
                        "Ivanov Ivan Ivanovich",
                        " engineer",
                        "iii@mail.java",
                        "+79959949392",
                        60000.,
                        43),
                new Person(
                        "Petrov Petr Petrovich",
                        "driver",
                        "diver9000@some.java",
                        "+3568573421",
                        85000.,
                        56
                ),
                new Person(
                        "Sidorov Sidor Sidorovich",
                        "manager",
                        "sidor9@foo.boo",
                        "no info",
                        85000.,
                        37
                ),
                new Person(
                        "Alexandrov Alexandr Alexandrovich",
                        "director",
                        "dir@company.null",
                        "+5164852495",
                        260000.,
                        46
                ),
                new Person(
                        "Anonim Amonimov Ananimovich",
                        "security",
                        "example@anoni.mus",
                        "no data",
                        120000.,
                        33
                )
        };

        for (Person p :
                personList) {
            if (p.getAge() > 40){
                p.print();
            }
        }
    }
}
