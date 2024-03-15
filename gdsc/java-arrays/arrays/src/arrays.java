public class arrays {
    public static void main(String [] args){
        //Arrays
        // arrays allow to store multiple values in a single variable

//        String [] cars=new String[3];
//
//        cars[0]="KIA";
//        cars[1]="Corvette";
//        cars[2]="TESLA";
//
//        for(int i=0; i<cars.length; i++){
//            System.out.println(cars[i]);
//        }


//        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //2D array
        //it is an array of arrays

        String [][] cars=new String[3][3];

        cars[0][0]="camaro";
        cars[0][1]="corvette";
        cars[0][2]="Tesla";

        cars[1][0]="camaro";
        cars[1][1]="KIA";
        cars[1][2]="WRANGLER";

        cars[2][0]="FERARI";
        cars[2][1]="PORCSHE";
        cars[2][2]="TOYOTA";

        for(int i=0; i<cars.length;i++){
            System.out.println();
            for(int j=0; j<cars[i].length;j++){
                System.out.print(cars[i][j]);
            }
        }



    }
}
