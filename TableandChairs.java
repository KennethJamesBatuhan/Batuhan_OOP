import java.util.*;

public class TableandChairs{
   public static void main(String[] args){

        int i, j;
        
        for (i = 0; i < 6; i++) { // vertical
            for (j = 0; j <= 21; j++) { // horizontal
                if (/*chairs*//*left side x */j == 0 || i == 0  && /*right side x */i ==1 ||j == 21 
                  ||/*lingkod*/ i == 3 && j < 5 || i == 3 && j > 16 
                  ||/*inside tiil left */i == 4 && j == 4 || i == 5 && j == 4 
                  ||/*inside tiil right */i == 4 && j == 17 || i == 5 && j == 17 
                  ||/*head sa lamesa */ i == 2 && j > 5 && j < 16 
                  ||/*tiil sa lamesa */ i > 2 && j == 6 || i > 2 && j == 15)  {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
         }
         System.out.println();
      }
   }
}