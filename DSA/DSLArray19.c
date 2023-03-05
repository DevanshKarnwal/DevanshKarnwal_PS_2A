#include<stdio.h>
void main()
{
    int a[20][20],b[20][20],i,j,a1;
    printf("enter size of set a ");
    scanf("%d",&a1);
    printf("Enter elements of set 1\n ");
    for(i=0;i<a1;i++)
    {
        for(j=0;j<a1;j++)
            scanf("%d",&a[i][j]);
    }
    for(i=0;i<a1;i++)
    {
        for(j=0;j<a1;j++)
        {
            b[i][j]=a[j][i];
            printf("%d ",b[i][j]);
        }
        printf("\n");
    }

}
