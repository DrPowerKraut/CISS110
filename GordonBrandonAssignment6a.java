import javax.swing.JOptionPane;

// Brandon Gordon
// Programming Challenge 1 on p. 490 (Chapter 7).
public class GordonBrandonAssignment6a {
   
   public static void main(String[] args) {
      
      double rainfall[] = new double[12];
      
      // Filling the array with user data
      for(int x=0;x<rainfall.length;x++) {
         rainfall[x] = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter rainfall for " + MonthName(x)));
      }
      
      // Outputs
      JOptionPane.showMessageDialog(null,"The month with the most rain is: " + MonthName(Most(rainfall)) + "\n"
                                       + "The month with the least rain is: " + MonthName(Least(rainfall)) + "\n"
                                       + "Average rainfall is '" + Average(Total(rainfall)) + "'\n"
                                       + "Total rainfall is: '" + Total(rainfall) + "'\n");
      
      // Print(rainfall);
   }
   
   // Totals rainfall values
   public static double Total(double[] input) {
      double total = 0;
      
      for(int x=0;x<input.length;x++) {
         total = total + input[x];
      }
      return total;
   }
   
   // Averages rainfall for 12 months using Total()
   public static double Average(double total) {
      double average;
      average = total / 12;
      
      return average;
   }
   
   // Finds the largest value in rainfall
   public static int Most(double[] input) {
      double largest = input[0];
      int month = 0;
      
      for(int x=0;x<input.length;x++) {
         if(input[x]>largest) {
            largest = input[x];
            month = x;
         }
      }
      return month;
   }
   
   // Finds smallest value in rainfall
   public static int Least(double[] input) {
      double smallest = input[0];
      int month = 0;
      
      for(int x=0;x<input.length;x++) {
         if(input[x]<smallest) {
            smallest = input[x];
            month = x+1;
         }
      }
      return month;
   }
   
   /** Can be used to print array for testing
     *
     *   public static void Print(double[] input ) {
     *      for(int x=0;x<input.length;x++)
     *         System.out.println(MonthName(x) + ": " + input[x]);
     *   }
     */
   
   /**
    *   Gives the name of the month from
    *   the month number.
    */
   public static String MonthName(int month) {
      String name;
      switch (month) {
         case 0:  name = "January";
         break;
         case 1:  name = "February";
         break;
         case 2:  name = "March";
         break;
         case 3:  name = "April";
         break;
         case 4:  name = "May";
         break;
         case 5:  name = "June";
         break;
         case 6:  name = "July";
         break;
         case 7:  name = "August";
         break;
         case 8:  name = "September";
         break;
         case 9:  name = "October";
         break;
         case 10: name = "November";
         break;
         case 11: name = "December";
         break;
         default: name = "Invalid month";
         break;
      }
      return name;
   }
}
