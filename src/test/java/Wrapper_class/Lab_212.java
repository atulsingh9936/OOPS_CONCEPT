package Wrapper_class;

public class Lab_212 {
}

class PersonATB{
    Integer rollNo;
    String name;
    Long PhoneNumber;

    public PersonATB(Integer rollNo, String name, Long phoneNumber) {
        this.rollNo = rollNo;
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
