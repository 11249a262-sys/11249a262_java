import java.io.*;

class WhileLoop
{
    public static void main(String args[]) throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;

        System.out.print("Enter the starting value: ");
        i = Integer.parseInt(br.readLine());

        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("While loop completed.");
    }
}
