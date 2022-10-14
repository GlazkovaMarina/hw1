//  // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// import java.util.Scanner;
//  public class program {

//     public static void main(String[] args) {
//         int n = 0;
//         boolean flag = false;

//         Scanner iScanner = new Scanner(System.in);
//         do {
//             System.out.printf("Input integer number n: ");
//             flag = iScanner.hasNextInt(); // проверка на корректный ввод
//             if (flag == true){
//                 n = iScanner.nextInt();
//             }
//             else{
//                 System.out.println("Incorrect input! Try again!");
//                 iScanner.nextLine(); // "вхолостую" считываем всё из входного потока
//             }
//         } while (flag != true);
//         iScanner.close();
//         int sum = 0;
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//             fact *= i;
//         }
//         System.out.printf("Для n = %d: sum = %d, fact = %d\n", n, sum, fact);
//     }
// }

//  // 2. Вывести все простые числа от 1 до 1000

//  public class program {
//     public static void main(String[] args) {
//         int count = 0;
//         for (int i = 2; i <= 1000; i++) {
//             boolean flag = true;
//             for (int j = 2; j <= i - 1; j++){
//                 if (i % j == 0){
//                     flag = false;
//                     break;
//                 }
//             }
//             if (flag == true){
//                 System.out.printf("%3d ", i);
//                 count++;
//                 if (count % 30 == 0){
//                     System.out.println();
//                 }
//             }
//         }
//     }
// }

// // 3. Реализовать простой калькулятор

// import java.util.Scanner;

// public class program {
//     public static void main(String[] args) {
//         int a = 0;
//         int b = 0;
//         char op = '+';

//         boolean flag = false;

//         Scanner iScanner = new Scanner(System.in);
//         do {
//             System.out.printf("Input integer number a: ");
//             flag = iScanner.hasNextInt(); // проверка на корректный ввод
//             if (flag == true) {
//                 a = iScanner.nextInt();
//             } else {
//                 System.out.println("Incorrect input! Try again!");
//                 iScanner.nextLine(); // "вхолостую" считываем всё из входного потока
//             }
//         } while (flag != true);

//         do {
//             System.out.printf("Input integer number b: ");
//             flag = iScanner.hasNextInt(); // проверка на корректный ввод
//             if (flag == true) {
//                 b = iScanner.nextInt();
//             } else {
//                 System.out.println("Incorrect input! Try again!");
//                 iScanner.nextLine(); // "вхолостую" считываем всё из входного потока2
//             }
//         } while (flag != true);

//         System.out.println("Input operation (+ - / * %): ");
//         op = iScanner.next().charAt(0);
//         iScanner.close();

//         switch (op) {
//             case '+':
//                 System.out.printf("%d + %d = %d\n", a, b, a + b);
//                 break;
//             case '-':
//                 System.out.printf("%d - %d = %d\n", a, b, a - b);
//                 break;
//             case '%':
//                 System.out.printf("%d %% %d = %d\n", a, b, a % b);
//                 break;
//             case '/':
//                 if (b != 0)
//                     System.out.printf("%d / %d = %d\n", a, b, a / b);
//                 else
//                     System.out.println("Error! Division by zero!");
//                 break;
//             case '*':
//                 System.out.printf("%d * %d = %d\n", a, b, a * b);
//                 break;
//             default:
//                 System.out.println("Incorrect operation!");
//                 break;
//         }
//     }
// }
