public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        float height = (float) 1.80;
        float weight = (float) 40.0;
        float index = service.calculate(height, weight);

        System.out.printf("%.2f", index);
        System.out.println();

        if (index > 40) {
            System.out.println("Ожирение третьей степени");
        } else if (index > 35) {
            System.out.println("Ожирение второй степени");
        } else if (index > 30) {
            System.out.println("Ожирение первой степени");
        } else if (index > 25) {
            System.out.println("Избыточная масса тела");
        } else if (index > 18.5) {
            System.out.println("Норма");
        } else if (index > 16) {
            System.out.println("Дефицит массы тела");
        } else if (index <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        }
    }
}
