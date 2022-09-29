#include<stdio.h>
void main()
{
    int a[100][100],b[100][100],i,j,a1;
    printf("Devansh Karnwal\n");
    printf("enter size of set a ");
    scanf("%d",&a1);
    printf("Enter elements of array 1\n ");
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
