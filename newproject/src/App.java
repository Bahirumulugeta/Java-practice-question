package newproject.src;

public class App {
    public static void main(String... args) {
        int arr[] = { 6, 10, 1 };
        System.out.println(isMeera(arr));
    }

    public static int isMeera(int[] arr) {
        boolean hasPrime = false;
        boolean hasZero = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (hasPrime)
                    return 1;
                else
                    hasZero = true;
            } else {
                if (isPrime(arr[i]) == 1 && hasZero == true)
                    return 1;
                else if (isPrime(arr[i]) == 1 && hasZero == false)
                    hasPrime = true;
                else continue;
            }
        }
        if (hasPrime == false && hasZero == false)
            return 1;
        else
            return 0;
    }

    public static int isPrime(int num) {
        int total = 0;

        for (int j = 1; j <= num; j++) {
            if (num % j == 0)
                total += 1;
        }
        if (total == 2)
            return 1;
        else
            return 0;
    }

}
