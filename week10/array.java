
public class array {
    
    
    public static void main(String[]args) throws Exception{


        
        // char[] myName = {'C', 'R', 'I', 'S', 'T', 'I', 'A', 'N'};


        // for (int i = 0; i < myName.length; i++) {
        //     System.out.print(myName[i]);
        // }
        
        // for (int i = 7; i >= 0; i--) {
        //     System.out.print(myName[i]);
        // }

        // for (int i = 0; i < myName.length; i++) {
           
        //     if (myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U') {
        //      System.out.print(myName[i]);
        //     } 

    //     for (int i = 0; i < myName.length; i++) {
           
    //         if (!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U')) {
    //          System.out.print(myName[i]);
    //         } 
    // }
    // }

    // char[][] letters = {
    //     {'A', 'B', 'C'},
    //     {'D', 'E', 'F'},
    //     {'G', 'H', 'I'},
    // };

    // System.out.println(letters[1][1]); //E
    // System.out.println(letters[2][0]); //G
    // System.out.println(letters[0][1]); //B


        // for (int day = 0; day < 1; day ++){
        //  for (int hours = 0 ; hours < 24; hours++){
            
        //     for (int minutes = 0; minutes < 60; minutes++){

        //         for (int second = 0; second < 60; second++) {

        //             for (int nanosecond = 0; nanosecond < 99; nanosecond++){

        //                 System.out.println(day + ":" + hours + ":" + minutes + ":" + second + "." +nanosecond);
        //             }
        //         }

                
        //     }
        //  }

        // }

    // char[][] letters = {
    //     {'A', 'B', 'C'},
    //     {'D', 'E', 'F'},
    //     {'G', 'H', 'I'},
    // };

    // for (int row = 2; row >= 0; row--){

    //     System.out.println(" ");
    //     System.out.print("row " + row + ": ");


    //     for (int column = 2; column >= 0; column--){

    //         System.out.print(letters[row][column] + " ");
    //     }
    // }

        char[][] letters = {
        {'A', 'B', 'C'},
        {'D', 'E', 'F'},
        {'G', 'H', 'I'},
    };

    for (int i = 0; i < letters.length; i++){


        for (int k = 0; k < letters.length; k++){

            int l = i + k;
                if (l%2 == 0){
                    System.out.print(letters[i][k] + " ");

                }
                else {
                    System.out.print(" " + " ");
                }

            
        }
        System.out.println();
    }

    

    }
}
