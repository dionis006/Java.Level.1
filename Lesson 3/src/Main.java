import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        guessNumber();

    }
    static void guessNumber(){
        System.out.println("Добро пожаловать в игру угадайка!");
        guessing();
        while(true){
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();
            if (userAnswer == 1){
                guessing();
            } else if (userAnswer != 0){
                System.out.println("Введите корректный ответ.");
            } else break;
        }
    }

    static void guessing(){
        Scanner scanner = new Scanner(System.in);
        int answer = new Random().nextInt(10);
        for (int i = 0; i < 3; i++){
            System.out.println("Угадайте число от 0 до 9");
            int userAnswer = scanner.nextInt();
            if (userAnswer == answer){
                System.out.println("Поздравляю! Вы угадали число " + answer + ".");
                return;
            } else if (userAnswer < answer) {
                System.out.println("Загаданное число больше.");
            } else System.out.println("Загаданное число меньше.");
        }
        System.out.println("Вы проиграли! :-( Было загадано число " + answer + ".");

    }

}