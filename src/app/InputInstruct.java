package app;

import java.util.Scanner;
import java.util.UUID;

public class InputInstruct {

    public String getData(String info){
        Scanner input = new Scanner(System.in);
        System.out.print(info);
        return input.next();
    }

    public Student getStudentBasic(){
        String regNumber = UUID.randomUUID().toString();
        String firstName = getData("First Name: ");
        String lastName = getData("Last Name: ");
        int birthDate = Integer.parseInt(getData("BirthDate in [DDMMYYYY]: "));
        int yearOfReg = Integer.parseInt(getData("Year of Registration: "));
        int currentGrade = Integer.parseInt(getData("Current Grade: "));
        System.out.println("Student Registration Number: "+regNumber);
        return new Student(firstName,lastName,regNumber,birthDate,yearOfReg,currentGrade);
    }

}
