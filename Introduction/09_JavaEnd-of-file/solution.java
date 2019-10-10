import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 1;

        while(input.hasNext()) {
            String userInput = input.nextLine();
            System.out.println(counter + " " + userInput);
            counter++;
        }
    }
}
