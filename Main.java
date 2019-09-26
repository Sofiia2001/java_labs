import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int num = 0;
        int largest = 0;
        int smallest = 0;
        int sum = 0;
        int multiplied = 1;
        float average = 0;

        num = scanner.nextInt();

        sum += num;
        multiplied *= num;
        largest = num;
        smallest = num;
        for (int i = 0; i < amount - 1; i++) {
            num = scanner.nextInt();
            sum += num;
            multiplied *= num;
            if (largest < num) {
                largest = num;
            }
            if (smallest > num){
                smallest = num;
            }

        }
        average = (float) sum / amount;
        System.out.println(largest);
        System.out.println(smallest);
        if (average == sum / amount){
            System.out.println(sum / amount);
        }
        else{
            System.out.println(average);
        }
        System.out.println(sum);
        System.out.println(multiplied);
    }
}
