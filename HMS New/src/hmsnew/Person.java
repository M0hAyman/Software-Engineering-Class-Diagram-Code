package hmsnew;

import java.util.InputMismatchException;
public abstract class Person {

    private String name;
    private char gender;
    private String address;
    private short telephone;
    private String email;
    private short age;
    private boolean married;
    private int nationalID;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.name = name;
        } catch (InputMismatchException e) {
            System.out.println("A name Must contain only Characters");
        }

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'F' || gender != 'M') {
            System.out.println("A gender can ce represented only with 'F'=>for female and 'M'=> for male ");
            System.out.println("Please Input only one charcter");
        } else {
            this.gender = gender;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public short getTelephone() {
        return telephone;
    }

    public void setTelephone(short telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        try {
            this.age = age;
        } catch (InputMismatchException e) {
            System.out.println("Age are only represented by Numbers");
        }
    }

    public boolean getMarried() {
		return this.married;
	}

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getNationalID() {

        return nationalID;
    }

    public void setNationalID(int nationalID) {
        try {
            this.nationalID = nationalID;
        } catch (InputMismatchException e) {
            System.out.println("National ID contains only Numbers!");
        }
    }

    public void Show_All_Info() {
        System.out.println("Name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("married: " + married);
        System.out.println("telephone: " + telephone);
        System.out.println("address: " + address);
        System.out.println("email: " + email);

    }

	

}