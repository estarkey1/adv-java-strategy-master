package composition;

public class Student {

    private Address address;
    private String name;
    private int age;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress, zipCode, state, phone);
        this.name = name;
        this.age = age;
    }

    public String getStreetAddress() {
        return address.getStreetAddress();
    }

    public void setStreetAddress(String streetAddress) {
        address.setStreetAddress(streetAddress);
    }

    public int getZipCode() {
        return address.getZipCode();
    }

    public void setZipCode(int zipCode) {
        address.setZipCode(zipCode);
    }

    public String getState() {
        return address.getState();
    }

    public void setState(String state) {
        address.setState(state);
    }

    public String getPhone() {
        return address.getPhone();
    }

    public void setPhone(String phone) {
        address.setPhone(phone);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
