package Lesson1;

public class Lesson1Ex1 {
    /*1) Написать метод вычисляющий выражение a * (b + (c / d))
     и возвращающий результат с плавающей точкой,
     где a, b, c, d – целочисленные входные параметры этого метода;
     */

    public static void main(String[] args) {
      Ex1();
      Ex2(5,4);
      Ex22(5,2);
      Ex3(0);
      Ex4("Вася") ;
    }

    public static void Ex1() {
        int a = 5;
        int b = 4;
        int c = 5;
        float d = 3;
        float result = a*(b+c/d);
        System.out.println(result);
    }
        /*2) Написать метод, принимающий на вход два целых числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */
    // вариант с boolean/ Не знаю, как добавить второе условие
  public static boolean Ex2(int a, int b) {
       int result = a+b;
       boolean c =  result <20;
      System.out.println(result);
       return c;
    }

//вариант с условием:
    public static int Ex22(int a,int b){
        int result= a+b;
        if (result < 10) {
            System.out.println(false);
        } else if (result>=20) {
            System.out.println(false);
        }else {
            System.out.println(true);
        }
        return result;
   }
   /*3) Написать метод, которому в качестве параметра передается целое число,
   метод должен проверить положительное ли число передали, или отрицательное.
    Замечание: ноль считаем положительным числом.
   Результат работы метода вывести в консоль*/
    public static int Ex3(int A) {
        if (A>=0) {
            System.out.println("This is a positive number");
        } else {
            System.out.println("This is a negative number");
        }
        return A;
    }
    /*4) Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
    Вывести приветствие в консоль.
     */
    public static void Ex4(String Name) {
        System.out.println("Привет, " + Name +"!");

    }
}



