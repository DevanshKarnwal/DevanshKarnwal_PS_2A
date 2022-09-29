#include<stdio.h>
void main()
{
    int i,j,k,z,a=0,n;
    printf("enter number of terms");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        printf("*");
    }
    printf("\n");
    for(j=1;j<=n-2;j++)
    {
        for(k=n-2;k>=j;k--)
        {
            printf(" ");
        }
        a=0;
        for(z=1;z<=n-j&&a<1;z++)
        {
            printf("*");
            a++;
        }
        printf("\n");

    }
    for(i=1;i<=n;i++)
    {
        printf("*");
    }

}
