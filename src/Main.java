public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Day " + (i + 1) + " check = " + arr[i]);
        }
//Задача.1
        int total = 0;
        for (int i = 1; i < arr.length ; i++) {
            total = total + arr[(i-1)];
        }
        System.out.println("The amount of expenses for the month was = " + total);
//Задача.2
        int maxArr = 0;
        int minArr = 200000;
        for (int currentMax : arr) {
            if (currentMax > maxArr) {
                maxArr = currentMax;
            }
        }
        for (int currentMin : arr) {
            if (currentMin < minArr) {
                minArr = currentMin;
            }
        }
        System.out.println("The minimum amount spent per day was = " + minArr +
                ", the maximum amount spent per day was = " + maxArr);
//Задача.3
        float middleAmount = (float) total / arr.length;
        System.out.println("The average amount spent per month was = " + middleAmount);
//Задача.4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int p = 0; p < reverseFullName.length; p++) {
            System.out.print(reverseFullName[(reverseFullName.length - p) - 1]);
        }
    }
}




//        int[] massiv1 = {1, 2, 3, 4, 5, 6};
//        int[] massiv2 = {1, 2, 3, 4, 5, 7};
//        for (int i = 0; i < massiv1.length; i++) {
//            System.out.println(massiv1[i]);
//        }
//        boolean arraysAreEqual = true;
//        arraysAreEqual = massiv1.length == massiv2.length;
//        if(arraysAreEqual) {
//            for (int i = 0; i < massiv1.length; i++) {
//                if (massiv1[i] != massiv2[i]) {
//                    arraysAreEqual = false;
//                }
//
//            }
//        }
//        if (arraysAreEqual) {
//            System.out.println("Massivi odinakovie");
//        } else {
//            System.out.println("Massivi raznie");
//        }
//
//        int maxMassiv1 = 0;
//        for (int current : massiv1) {
//            if (current > maxMassiv1) {
//                maxMassiv1 = current;
//            }
//        }
//        System.out.println(maxMassiv1);
//        for (int i = 0; i < (massiv1.length - 1) && massiv1[i+1] != 0; i++) {
//            System.out.println(massiv1[i + 1] - massiv1[i]);
//        }