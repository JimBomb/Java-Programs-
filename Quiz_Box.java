import java.util.*;
public class Quiz_Box
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of participants");
        int n=in.nextInt();
        char arr[][]=new char [n][5];
        int i,j;
        System.out.println("Enter the answers of the participants");
        for (i=0;i<n;i++)
        {
            for (j=0;j<5;j++)
            {
                arr[i][j]=in.next().charAt(0);
            }
        }
        System.out.println("Enter the answer key");
        char ans[]=new char [5];
        int  marks[]=new int [5];int c=0;
        for(j=0;j<5;j++)
        {
            ans[j]=in.next().charAt(0);
        }
        for (i=0;i<n;i++)
        {
            for (j=0;j<5;j++)
            { 
                if (ans[j]==arr[i][j]);
                marks[i]=c++;
            }
        } 
        int max,k;
        max=k=0;
        for (i=0;i<5;i++)
        { 
            max=marks[i];
            for (j=i+1;j<5;j++)
            {
                if (marks[j]>max)
                {
                    max=marks[j];
                    k=j;
                }
            }
        }
        System.out.println("The marks obtained by the participants are");
        for (i=0;i<n;i++)
        {
            System.out.println("Participant "+(i+1)+":" +marks[i]);
        }
        System.out.println("Maximum marks: "+max+" by Participant"+(k+1));
    }
}

