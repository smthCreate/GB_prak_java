package sem_1;

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Input first number: ");
        int f1 = lib.inputing_int();
        System.out.println("Input operation: ");
        String operation = lib.inputing_string();
        System.out.println("Input second number: ");
        int f2 = lib.inputing_int();
        double res = calk(f1,operation,f2);
        System.out.println(res);
    }
    static double calk(int f1, String strin, int f2){
        double result;
        switch (strin){
            case "+":
                result = f1 + f2;
                break;
            case "-":
                result = f1 - f2;
                break;
            case "*":
                result = f1 * f2;
                break;
            case "/":
                result = f1 / f2;
                break;
            default:
                System.out.println("Операция не распознана повторите ввод операции");
                result = calk(f1, lib.inputing_string(), f2);
        }
        return result;
    }
}
