//import java.util.*;
//
//class java_program{
//    public static void main(String[] args){
//        int[] numbers=new int[10];
//        fill_elements(numbers);
//        System.out.println("Elements before sorting: ");
//        System.out.println("//////////////////////");
//        Min_Max(numbers);
//        System.out.println("//////////////////////");
//        System.out.println("Elements after sorting: ");
//        Sort(numbers);
//        System.out.println("//////////////////////");
//        System.out.println(binarySearch(numbers, 484));
//
//
//
//    }
//
//    private static void fill_elements(int[]number){
//        Random random=new Random();
//        for(int i=0 ; i<number.length; i++){
//            number[i]=random.nextInt(500);
//        }
//    }//end of fill array
//
//    private static void Min_Max(int[] number){
//        int min= number[0];
//        int max= number[0];
//        for(int y=0; y<number.length; y++){
//            if(number[y]>max){
//                max=number[y];
//            }
//        }
//        for(int z=0; z< number.length; z++){
//            if(number[z]<min){
//                min=number[z];
//            }
//        }
//        long Time=System.currentTimeMillis();
//        for(int i=0; i<number.length; i++){
//            System.out.println(number[i]);
//        }
//        System.out.println("Max number is: "+ max);
//        System.out.println("Min number is: "+ min);
//        System.out.println("Time taken is: " +Time +" ms");
//    } // end of Min Max array
//
//    private static void Sort(int[] number){
//        boolean swapped=true;
//        while(swapped){
//            swapped=false;
//            for(int i=0 ; i<number.length-1; i++){
//                if(number[i]>number[i+1]){
//                    swapped=true;
//                    int temp=number[i];
//                    number[i]=number[i+1];
//                    number[i+1]=temp;
//                }
//            }
//        }
//        for(int y=0; y< number.length; y++){
//            System.out.println(number[y]);
//        }
//    } // end of sort array
//
//    private static int binarySearch(int[] number, int target){
//        int low=0;
//        int high=number.length-1;
//
//        while(low <= high){
//            int mid=(low + high)/2;
//
//            if(number[mid] == target){
//                return number[mid];
//            }else
//                if(number[mid] < target){
//                    low=mid+1;
//                }else
//                    if(number[mid] > target){
//                        high=mid-1;
//                    }
//        }
//        return -1;
//    } //end binarySearch
//
//
//}
import java.util.*;
class java_program{
    public static void main(String[] args){
        Random random=new Random();
        int[] elements=new int[10];
        for(int i=0; i<elements.length; i++){
            elements[i]=random.nextInt(15);
        }
        PrintArray(elements);
        MinnMax(elements);
        System.out.println("Sorted array: ");
        sort(elements);
        System.out.println("//////////////////////////////");
        System.out.println(Bi_search(elements, 0));
    }//end of main method
    private static void MinnMax(int[] number){
        int min=number[0];
        int max=number[0];

        for(int y=0; y<number.length; y++){
            if(number[y]>max) {
                max = number[y];
            }
        }

        for(int z=0; z<number.length; z++){
            if(number[z]<min){
                min=number[z];
            }
        }
        long time=System.currentTimeMillis();
        System.out.println("Max number is: "+ max);
        System.out.println("Min number is: "+ min);
        System.out.println("Total time is: " + time + " ms");
    }//end of MinMax method

    private static void PrintArray(int[]number){
        for(int i=0; i< number.length; i++){
            System.out.println(number[i]);
        }
    }// end of Print array

    private static void sort(int[] number){
        boolean swapped=true;

        while(swapped){
            swapped=false;
            for(int i=0; i<number.length-1;i++){
                if(number[i]>number[i+1]){
                    swapped=true;
                    int temp=number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;
                }
            }
        }
        for(int y=0; y<number.length; y++){
            System.out.println(number[y]);
        }
    }//end of sort method


    private static int Bi_search(int[]number,int value){
        int low=0;
        int high=number.length-1;

        while(low <= high){
            int mid=(low+high)/2;

            if(number[mid] == value){
                return number[mid];
            }else
                if(number[mid]> value){
                    high=mid-1;
                }else
                    if(number[mid]<value){
                        low=mid+1;
                    }
        }

        return -1;
    }


}