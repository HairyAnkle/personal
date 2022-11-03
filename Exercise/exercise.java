public class Exercise{
    public static void main(String[]args) {
        
        char[][] array = { 
            {'S','L','A','M'},
            {'T','I','L','E'},
            {'E','A','T','S'},
            {'P','R','O','S'},
        };  
    
        // First Word : SLAM
        System.out.println("1. WORD 1");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0) {
                    System.out.print(array[row][column]);
                }
            }
        }


        // Second Word : TILE
        System.out.println("");
        System.out.println("2. WORD 2");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1) {
                    System.out.print(array[row][column]);
                }
            }
        }

        // Third Word: EATS
        System.out.println("");
        System.out.println("3. WORD 3");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 2) {
                    System.out.print(array[row][column]);
                }
            }
        }

        // fourth Word: PROS
        System.out.println("");
        System.out.println("4. WORD 4");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3) {
                    System.out.print(array[row][column]);
                }
            }
        }

        // fifth Word: STEP
        System.out.println("");
        System.out.println("5. WORD 5");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0) {
                    System.out.print(array[row][column]);
                }
            }
        }
        // six Word: LIAR
        System.out.println("");
        System.out.println("6. WORD 6");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 1) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        // seventh Word: ALTO
        System.out.println("");
        System.out.println("7. WORD 7");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 2) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        //eighth Word: MESS
        System.out.println("");
        System.out.println("8. WORD 8");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 3) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        //nineth Word: PETS
        System.out.println("");
        System.out.println("9. WORD 9");

        for (int row = array.length - 1; row >= 0; row--) {
            System.out.println("");
            for (int column = array.length - 1; column >= 0; column--) {
                if (column == 0) {
                    System.out.print(array[row][column]);
                }
            }
        }

        // tenth Word : RAIL
        System.out.println("");
        System.out.println("10. WORD 10");

        for (int row = array.length - 1; row >= 0; row--) {
            System.out.println("");
            for (int column = array.length - 1; column >= 0; column--) {
                if (column == 1) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        // eleventh Word: LAM"
        System.out.println(" ");
        System.out.println("11. WORD 11");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0 && !(row == column)) {
                    System.out.print(array[row][column]);
                }
                else { 
                    System.out.print(" ");
                }
            }
        }

        // twelfth Word: LIT
        System.out.println("");
        System.out.println("12. WORD 12");
        for (int row = array.length - 1; row >= 0; row--) {
            System.out.println(" ");
            for (int column = array.length - 1; column >= 0; column--) {
                if ((row == 1 && column == 2) || (row == 1 && column == 1) || (row == 1 && column == 0)) {
                    System.out.print(array[row][column]);
                }
            }
        }

        // thirteenth Word: EAT
        System.out.println("");
        System.out.println("13. WORD 13");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((row == 2 && column == 0) || (row == 2 && column == 1) || (row == 2 && column == 2)) {
                    System.out.print(array[row][column]);
                }
            }
        }
        
        // fourteenth Word: PRO
        System.out.println("");
        System.out.println("14. WORD 14");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((row == 3 && column == 0) || (row == 3 && column == 1) || (row == 3 && column == 2)) {
                    System.out.print(array[row][column]);
                }
            }
        }

        //fifteenth Word: OAT
        System.out.println("");
        System.out.println("15. WORD 15");
        for (int row = array.length - 1 ; row >= 0; row--) {
            System.out.println("");
            for (int column = array.length - 1; column >= 0; column--) {
                if ((row == 3 && column == 2) || (row == 2 && column == 1) || (row == 1 && column == 0)) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        //sixteenth Word: SITS
        System.out.println("");
        System.out.println("16. WORD 16");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((row == 0 && column == 0) || (row == 1 && column == 1) || (row == 2 && column == 2) || (row == 3 && column ==3)) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        //seventeenth Word: SIT
        System.out.println("");
        System.out.println("17. WORD 17");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((row == 0 && column == 0) || (row == 1 && column == 1) || (row == 2 && column == 2)) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        // eighteenth Word:
        System.out.println("");
        System.out.println("18. WORD 18");
        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((row == 3 && column == 0) || (row == 2 && column == 1) || (row == 1 && column == 2) || (row == 0 && column == 3)) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }

        //nineteenth Word: TAO
        System.out.println("");
        System.out.println("19. WORD 19");
        for (int row = 0 ; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if ((row == 3 && column == 2) || (row == 2 && column == 1) || (row == 1 && column == 0)) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        
        }

        //twentieth Word: SEM
        System.out.println("");
        System.out.println("20. WORD 20");

        for (int row = array.length - 1; row >= 0; row--) {
            System.out.println("");
            for (int column = array.length - 1; column >= 0 ; column--) {
                if (column == 3 && (!(row == column))) {
                    System.out.print(array[row][column]);
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}
