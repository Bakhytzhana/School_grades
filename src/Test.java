public class Test {
    public static void main(String[] args) {
        int mark = 90;

        if (mark >= 0 && mark < 60) {
            System.out.println("Оценка 2");
        } else if (mark >= 60 && mark < 75) {
            System.out.println("Оценка 3");
        } else if (mark >= 75 && mark < 90) {
            System.out.println("Оценка 4");
        } else if (mark >= 90 && mark <= 100) {
            System.out.println("Оценка 5");
        } else {
            System.out.println("Ошибка");
        }
    }
}