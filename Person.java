import java.util.Objects;
public class Person {

    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String adress;

    public boolean hasAge() {
        return age == 0;
    }
    public boolean hasAddress() {
        return adress != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return adress;
    }

    public void setAddress(String address) {
        this.adress = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                ", Возраст=" + age +
                ", Город='" + adress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age,String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder pb = new PersonBuilder();
        pb.setSurname(this.surname);
        pb.setAddress(this.adress);
        return pb;
    }

}