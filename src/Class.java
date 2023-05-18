import java.util.Scanner;

public class Class {
    public static void main(String args[]) {
        boolean opened=true;
        boolean closed=false;
        boolean passedAllDoors=false;
        int countDoor=0;

        if (opened){
            System.out.println("the first door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the second  door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the third  door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the fourth door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the fifth  door is opened ");
            countDoor=countDoor+1;
        } if (opened){
            System.out.println("the sixth  door is opened ");
            countDoor=countDoor+1;
        }
        if (countDoor==6){
            passedAllDoors=true;
        }
if (passedAllDoors){
    System.out.println("you win !!!");
}

    }
}
