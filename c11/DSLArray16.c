#include<stdio.h>
void main()
{
   int a[20][20],b[20][20],c[20][20],m,n,i,j;
    printf("Enter number of rows and column set");
    scanf("%d%d",&m,&n);
    printf("Enter elements of set A\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
         scanf("%d",&a[i][j]);
        }
    }
    printf("Enter elements of set B\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&b[i][j]);
        }
    }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            printf("%d\t",c[i][j]);
        }
        printf("\n");
    }
}
