package by.myProject.Oreshkin;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void printHiIfDigitCorrect(int digit){
        if(digit> 7){
            System.out.println("Привет");
        }
    }
    static void printHiIfNameEqualVyacheslav(String name){
        if(name.toLowerCase(Locale.ROOT).equals("вячеслав")){
            System.out.println("Привет "+ name);
        } else{
            System.out.println("Нет такого им");
        }
    }
    static int[] makeIntArr(String string){
       String [] arrFromString = string.split(" ");
       int [] intArr = new int[arrFromString.length];
       for (int i = 0; i <= arrFromString.length-1;i++)
           intArr[i] =Integer.parseInt(arrFromString[i]);
       return intArr;
    }
    static void printOnlyValuesEqualCondition(int[]arr){
        for (int i = 0;i <= arr.length-1;i++)
            if(arr[i]%3 == 0)
                System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scForEnterDigit = new Scanner(System.in);
        int digitFromScanner = scForEnterDigit.nextInt();
        printHiIfDigitCorrect(digitFromScanner);
        System.out.println("Enter name: ");
        Scanner scForEnterName = new Scanner(System.in);
        String nameFromScanner = scForEnterName.nextLine();
        printHiIfNameEqualVyacheslav(nameFromScanner);
        System.out.println("Enter values for array:");
        Scanner scannerForValuesInArray = new Scanner(System.in);
        String StringWithNumberFromScanner = scannerForValuesInArray.nextLine();
        int[] justIntArray = makeIntArr(StringWithNumberFromScanner);
        printOnlyValuesEqualCondition(justIntArray);
    }
}
