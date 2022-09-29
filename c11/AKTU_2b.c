#include<stdio.h>
void main()
{
    int a[100][100],b[100][100],c[100][100],i,j,k,a1,b1;
    printf("Devansh Karnwal\n");
    printf("enter size of set a and b ");
    scanf("%d%d",&a1,&b1);
    printf("Enter elements of array 1 ");
    for(i=0;i<a1;i++)
    {
        for(j=0;j<a1;j++)
            scanf("%d",&a[i][j]);
    }
    printf("Enter elements of array 2 ");
    for(i=0;i<b1;i++)
    {
        for(j=0;j<b1;j++)
            scanf("%d",&b[i][j]);
    }
    printf("The multiplication is\n");
    for(i=0;i<a1;i++)
    {
        for(j=0;j<b1;j++)
        {

            c[i][j]=0;

            for(k=0;k<b1;k++)
            {
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
}
