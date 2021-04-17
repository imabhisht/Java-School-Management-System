package app;

public class Student {
    private String firstName;
    private String lastName;
    private String regNumber;
    private int birthDate;
    private int regYear;
    private int currentGrade;

    public Student(String firstName, String lastName, String regNumber, int birthDate, int regYear, int currentGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
        this.birthDate = birthDate;
        this.regYear = regYear;
        this.currentGrade = currentGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int getRegYear() {
        return regYear;
    }

    public int getCurrentGrade() {
        return currentGrade;
    }

}

