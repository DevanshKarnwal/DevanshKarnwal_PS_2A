#include<stdio.h>
void main()
{
    int i,j,k,n,z,a=0;
    printf("enter number of terms");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            printf(" ");
        }
        for(k=1;k<=i;k++)
        {
            printf("%d",i-k+1);
        }

            for(z=1;z<=i-1;z++)
            {
                printf("%d",i+z-a);
            }
        a++;
        printf("\n");
    }
}
