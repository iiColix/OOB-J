
package com.mycompany.oodjlab28week2;

//                         -------------TEST---------------
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter first number: ");
//        int number1 = sc.nextInt();
//        System.out.println("Please enter second number");
//        int number2 = sc.nextInt();
//        
//        int sum = number1 + number2;
//        System.out.println("Please kys: " + sum + "times");
//    }
//}
//


//             -------------------TEACHER GUIDED----------------
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("Please enter a number using ur feet: ");
//        double feet = sc.nextDouble();
//        double meter = feet * 0.305;
//        System.out.println(feet+" feet is equivalent to "+meter+" meters");
//    }
//}


//                            -------------Number1----------------
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.println("pls put fahrenheit value: ");
//        double fahrenheit = sc.nextDouble();
//        double celcius = (fahrenheit - 32)*5/9;
//        System.out.println("Stop being americano and here u go celcius degrees: "+celcius+"°");
//    }
//}
//


//                              ----------Number2-------------- <Given by a student> <Checked>
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        final double PI = Math.PI;
//        System.out.print("Enter the radius of the cylinder: ");
//        double radius = scan.nextDouble();
//        System.out.print("Enter the length of the cylinder: ");
//        double length = scan.nextDouble();
// 
//        double area = radius * radius * PI;
//        double volume = area * length;
// 
//        System.out.printf("Area: %.2f%n", area);
//        System.out.printf("Volume: %.2f%n", volume);
//    }
//}



//                           ------------Number3------------   <Given by teacher>
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter a numbero");
//        int number = scan.nextInt();
//        
//        int sum = 0;
//        while(number>0){
//            int remainder1 = number%10; //3
//            number = number / 10;//94
//            sum += remainder1;
//        }
//        System.out.println("The total digit is "+sum);
//    }
//}
//


// ////////////////////////////NEW WEEK\\\\\\\\\\\\\\\\\\\\\\\\\\\\\  \\


//                         -------------Number 4--------------- <Given by teacher>
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a letter");
//        //method 1
//        System.out.println("you entered: " + scanner.next().toLowerCase().charAt(0));
//        //method 2
//        String word = scanner.next();
//        System.out.println("Result: "+word.toLowerCase().charAt(0));
//    }
//
//}

//                       ---------------Number 5---------------- <student and checked>
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number between 0 - 128");
//        int ascci = s.nextInt();
//        if(ascci >= 0 && ascci <= 128){
//        char letters =(char)ascci;
//        System.out.print("Letters of the number: "+ letters);
//        }
//        else{
//            System.out.print("Invalid input");
//        }
//    }
//}
//                       ---------------Number 5---------------- <Teacher subtitute>

//import java.util.Scanner;
//public class OODJLAB28Week2 {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int ascci = -1;
//        while (ascci <0 || ascci > 128){
//            System.out.print("Enter number between 0 - 128");
//            ascci = s.nextInt();
//        }
//        
//        char letters = (char)ascci;
//        System.out.print("Letters of the number: " + letters);
//    }
//}

//                       ----------------Number 6----------------- <DO YOUR SELF U BITCH>



















//                       ----------------Number 7----------------- <DO YOUR SELF U BITCH>








//                        ---------------Number 8------------------ <Teacher>
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//    public static void main(String[] args) {
//        Random rn = new Random();
//        double number_ls[] = new double[3];//0.0 , 0.0 , 0.0
//        double sum = 0;
//        for(int i=0; i<number_ls.length; i++){
//            number_ls[i] = rn.nextDouble(2,5);
//        }
//        
//        for(double eachNumber: number_ls){
//            sum += eachNumber;
//        }
//        System.out.println("The total is "+sum);
//    }
//}


//                       ----------------Number 9----------------- <Teacher>
//
//import java.util.Scanner;
//public class OODJLAB28Week2 {
//    public static void main(String[] args) {
//        double tuition = 10000.0;
//        double increaseRate = 0.05;
//        for (int year=1; year<=10;year++){
//            tuition += tuition * increaseRate; //method 1 increase tuition by 5% each year
//            tuition *= 1.05;//method 2
//        }
//        System.out.printf("The tuition in 10 years will be: RM%.2f%n", tuition);
//    }
//}


//                       ----------------Number 10----------------- <?>
