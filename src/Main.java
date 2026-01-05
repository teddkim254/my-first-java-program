
public class Main {
      public static void main(String[] args)  {


        //type sout + TAB/ENTER
        System.out.print("I like pizza\n");
       //use \n or .println for new next lines
        System.out.println("I am Tedd Kim");
        System.out.println("This is my output!");

       //Types of VARIABLES
        /*
        Variables* are containers storing data values in memory for use in a program
        Two types of variables: i) Primitive
                                ii)
         */

            //Primitive variables
            /*

            */
                int age = 30;
                int year = 2026;
                int quantity = 5;

                double price = 75.99;
                double gpa = 3.5;

                char grade = 'A'; //use single quotes for characters
                char symbol = '!';
                char currency = '$';

                boolean isStudent = true;
                boolean forSale = false;


        if(isStudent) {
          System.out.println("Welcome student year " + year + ", you'll graduate at " + age + symbol);
          System.out.println("Your Grade point average(gpa) is " + gpa);
          System.out.println("Letter grade: " + grade);
        }
        else {
          System.out.println("You can't use the portal");
        }

        if(forSale) {
          System.out.println("You can purchase");
        }
        else {
          System.out.println("Limited stock: " + quantity + " units left!");
          System.out.println("Each @" + currency + price);

        }

  }
}