import java.util.*;
class GuessingNumber
{
    public void startgame()
    {
        Random num=new Random();
        Scanner obj=new Scanner(System.in);
        int val=num.nextInt(101);
        System.out.println("A Random Number is generated");
        System.out.println("Enter number of guesses you want to try.Guesses must be < 9");
        int res=obj.nextInt();
        while(res>9)
        {
            System.out.println("Your chances exceeds. **Please Enter number < 9 **");
            res=obj.nextInt();
        }
        System.out.println("You have"+res+"Chances");
        int fs=100,q=0;
        for(q=0;q<res;q++)
        {
            
            System.out.println("Enter the number you guessed.Chance num"+(q+1));
            int number=obj.nextInt();
            if(number==val)
            {
                System.out.println("That's Amazing ...You won the Game");
                System.out.println("Your score is "+fs);
                break;
            }
            else if(number>val)
            {
                System.out.println("Your number is greater than the original number");
            }
            else
            {
                System.out.println("Your number is less than the original number");
            }
            fs-=10;
        } 
        if(q>=res)
        {
            System.out.println("Alas!,You Lost the game");
            System.out.println("The number is "+val);
            System.out.println("Your score is: 0");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Task-2 Java Developer");
        Scanner ob=new Scanner(System.in);
        GuessingNumber gn=new GuessingNumber();
        System.out.println("Shall we start the game ? : Yes/No");
        String str=ob.nextLine();
        while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
        {
           gn.startgame();
           System.out.println("Do you want to play again ? Yes/No");
           str=ob.nextLine();
        }
        System.out.println("Game closed...Thanks for playing");
    }
}