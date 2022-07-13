package util;

import java.util.Scanner;

public class Validator {
    private static Validator instance;
    private Scanner scanner = new Scanner(System.in);

    public static Validator getInstance(){
        if(instance==null){
            instance = new Validator();
        }

        return instance;
    }

    public Double validateDouble(){
        if(scanner.hasNextDouble()){
            Double value = scanner.nextDouble();
            scanner.nextLine();
            return value;
        }
        scanner.nextLine();
        System.out.println("Must enter Double type!!!");
        return validateDouble();
    }

    public int validateInt(){
        if(scanner.hasNextInt()){
            int value = scanner.nextInt();
            scanner.nextLine();
            return value;
        }
        scanner.nextLine();
        System.out.println("enter int type");
        return validateInt();
    }

    public String validateString(){
        return scanner.nextLine();
    }
}
