import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;

        System.out.println("Enter size of the array: ");
        size = input.nextInt();

        if (size > 0) {
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();

                if (arr[i] >= 1 && arr[i] <= size) {
                    continue;
                } else {
                    System.out.println("invalid input, you must enter values more than or equal one and" +
                            " less than " +
                            "or equal the size of the array");
                    break;
                }
            }

            for (int y = 0; y < arr.length; y++) {
                if (arr[y] >= 0) {
                    if (arr[y + 1] >= 0) {
                        if (arr[y] <= size) {
                            if (arr[y + 1] <= size) {

                                System.out.println("beautiful");
                            }
                        }
                    }
                }else {
                    System.out.println("not beautiful");
                }


//
//            System.out.println("Do you want to access the element of the array?? ");
//            System.out.println("if yes enter 1 , if no enter 0!");
//            int x=input.nextInt();
//
//            if(x == 1){
//                for(int y=0; y<arr.length; y++){
//                    System.out.println(arr[y]);
//                }
//            }
//
//            if(x == 0){
//                System.out.println("Thank you");
//            }
//        }


            }
        }
    }
}