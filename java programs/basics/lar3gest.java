import java.util.*;
public class sort 
{
	public static void main(String[] args)
	{
		int a[]= {1,5,4,3,2};
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
            
            int max = a[2];
			System.out.print(max);
	}
}

