import java.util.*;
public class sort 
{
	public static void main(String[] args)
	{
		int a[]= {1,5,4,3,2};
		//Arrays.sort(a);
		int temp;
        for (int i = 0; i < a.length; i++) 

        {

            for (int j = i + 1; j < a.length; j++) 

            {

                if (a[i] < a[j]) 

                {

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
