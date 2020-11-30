import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        play(random, sc);

    }

    static void fillingField(char[][] size) {
        for (int i = 0; i < size.length; i++) {
            size[i][i] = '-';
            for (int j = 0; j < size.length; j++){
                size[i][j] = '-';
            }
        }
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] setFieldSize(Scanner sc){

        int fieldSize;
        System.out.println("Укажите размер поля. От 3 (3x3) до 6 (6x6)");
        fieldSize = sc.nextInt();
        if (fieldSize < 3 || fieldSize > 6) {
            do {
                System.out.println("Некорректый ввод. Укажите значение между 3 и 6 для создания поля.");
                fieldSize = sc.nextInt();
            } while (fieldSize < 3 || fieldSize > 6);
        }
        return new char[fieldSize][fieldSize];
    }

    static int getCoordinate (int field, String coordName, Scanner sc){
        int coord;
        System.out.println(String.format("Укажите %s-координаты", coordName));
        coord = sc.nextInt() - 1;
        if (coord < 0 || coord >= field) {
            do {
                System.out.println(String.format("Некорректый ввод. Укажите %s-координаты между 1 и " + field, coordName));
                coord = sc.nextInt() - 1;
            } while (coord < 0 || coord >= field);

        }
        return coord;
    }

    static void doPlayerMove(char [][]field, Scanner sc) {
        int x, y;
        x = getCoordinate(field.length, "X", sc);
        y = getCoordinate(field.length, "Y", sc);
        if (field[x][y] == '-'){
            field[x][y] = 'X';
        } else
            do {
                System.out.println("Данная координата занята");
                x = getCoordinate(field.length, "X", sc);
                y = getCoordinate(field.length, "Y", sc);
            } while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static void doIOMove(char [][]field, Random random){
        int x, y;
        x = random.nextInt(field.length);
        y = random.nextInt(field.length);
        if (field[x][y] == '-'){
            field[x][y] = 'O';
        } else
            do {
                x = random.nextInt(field.length);
                y = random.nextInt(field.length);
            } while (field[x][y] != '-');
        field[x][y] = 'O';
    }

    static void play(Random random, Scanner sc){
        char[][] field = setFieldSize(sc);
        fillingField(field);
        do {
            doPlayerMove(field, sc);
            if (isDraw(field)){
                System.out.println("Ничья!");
                drawField(field);
                break;
            }
            if (isWin(field, 'X')){
                System.out.println("Победил игрок!");
                drawField(field);
                break;
            }

            doIOMove(field, random);
            if (isDraw(field)){
                System.out.println("Ничья!");
                drawField(field);
                break;
            }
            if (isWin(field, 'O')){
                System.out.println("Победил компьютер!");
                drawField(field);
                break;
            }
            drawField(field);
        } while (true);

    }

    static boolean isDraw(char[][] field){
        int count = field.length * field.length;
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++){
                if (field[i][j] != '-'){
                    count--;
                }
            }
        }
        return count == 0;
    }

    static boolean isWin(char [][] field, char sign) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == sign) {
                    count++;
                }
            }
            if (count == field.length){
                return true;
            } else count = 0;
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == sign) {
                    count++;
                }
            }
            if (count == field.length){
                return true;
            } else count = 0;
        }

        for (int i = 0; i < field.length; i++) {
            if (field[i][i] == sign) {
                count++;
            }
        }
        if (count == field.length){
            return true;
        } else count = 0;
        int k = 0;
        for (int i = field.length - 1; i >= 0; i--) {
            if (field[i][k] == sign) {
                count++;
            }
            k++;
        }
        if (count == field.length){
            return true;
        }

        return false;
    }

}