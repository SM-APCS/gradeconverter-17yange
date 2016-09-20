public class MyProgram extends ConsoleProgram
{
    /**
     * @param args the command line arguments
     */
    public void run()
    {
       int inputGrade = readInt("Please input the grade received: ");
       while(inputGrade <= 0 || inputGrade >=100)
       {
            inputGrade = readInt("Please input a valid grade.");
       }
       if(inputGrade >= 90)
       {
           System.out.println("You received an A!");
       }
       else if(inputGrade < 90 && inputGrade >=80)
       {
           System.out.println("You received a B.");
       }
       else if(inputGrade < 80 && inputGrade >= 70)
       {
           System.out.println("You received a C.");
       }
       else
       {
           System.out.println("You failed.");
       }
    }
}
