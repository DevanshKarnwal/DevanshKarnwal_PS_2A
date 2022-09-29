#include<stdio.h>
void main()
{
    int a[100][100],b[100][100],c[100][100],d[100][100],i,j,k,a1,a2,b1,b2;
    printf("Devansh Karnwal\n");
    printf("enter rows and column of set a and b ");
    scanf("%d%d%d%d",&a1,&a2,&b1,&b2);
    printf("Enter elements of matrix 1 ");
    for(i=0;i<a1;i++)
    {
        for(j=0;j<a2;j++)
            scanf("%d",&a[i][j]);
    }
    printf("Enter elements of matrix 2 ");
    for(i=0;i<b1;i++)
    {
        for(j=0;j<b2;j++)
            scanf("%d",&b[i][j]);
    }
    printf("The sum is\n");
     for(i=0;i<a2;i++)
    {
        for(j=0;j<b1;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                printf("%d ",c[i][j]);
            }
            printf("\n");
    }
    printf("\n");

    printf("The multiplication is\n");
    for(i=0;i<a2;i++)
    {
        for(j=0;j<b1;j++)
        {

            c[i][j]=0;

            for(k=0;k<a1;k++)
            {
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
            printf("%d ",c[i][j]);
        }
        printf("\n");
    }
}
