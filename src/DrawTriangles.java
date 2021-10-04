public class DrawTriangles {
   public static void main (String[] args) {
       int currentDigit=1;
       char nextToPrint='1';

// 1st triangle drawing
        for (int i=1; i <= 5; i++ ) {
            for (int j=1; j<= i; j++)
            System.out.print(j);
            System.out.println("");
        }

       System.out.println("");
// 2nd triangle drawing
       for (int i=1; i <= 5; i++ ) {
           for (int j=1; j<= i; j++) {
               System.out.print(i);
           }
           System.out.println("");
       }

       System.out.println("");
// 3rd triangle drawing
       for (int i=1; i < 5; i++ ) {
           for (int j=1; j<= i; j++)
               System.out.print(currentDigit++ + " ");
           System.out.println("");
       }

       System.out.println("");
// 4th triangle drawing
       for (int i=1; i <= 5; i++ ) {
           for (int j=1; j<= i; j++) {
               System.out.print(nextToPrint);
               if (nextToPrint == '1')   // flip the sequence of 0 and 1
                   nextToPrint='0';
               else
                   nextToPrint='1';
           }
           System.out.println();
           if (((i+1)%2) == 0)       // alter the sequeunce based on even and odd
               nextToPrint='0';
           else
               nextToPrint='1';
       }
    }

}
