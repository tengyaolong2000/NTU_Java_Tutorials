import java.util.Scanner;

public class tutorial1 {

    public static void bubble(int a[],int n){
        int i, j, t;
        for(i=n-2;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

    }



    public static void main(String[] args) {
        int[] a = new int[100];
        int n, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n Enter number of Integer elements to be sorted: ");
        n = scan.nextInt();

        for( i=0;i<=n-1;i++)
        {
            System.out.printf("\n\n Enter integer value for element no.%d : ",i+1);
            a[i] = scan.nextInt();

        }

        bubble(a,n);

        System.out.println("\n\n Finally sorted array is: ");
        for( i=0;i<=n-1;i++)
            System.out.printf("%d ",a[i]);
    }

}
