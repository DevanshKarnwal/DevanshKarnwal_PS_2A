#include<stdio.h>
void main()
{
    int a[100],b[100],c[200],i,j,a1,b1,c1,k,found=0;
    printf("Devansh Karnwal\n");
    printf("enter size of set A and B");
    scanf("%d%d",&a1,&b1);
    printf("enter elements of set A");
    for(i=0;i<a1;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("enter elements of set B");
    for(i=0;i<b1;i++)
    {
        scanf("%d",&b[i]);
    }
    c1=a1*b1;
    for(i=0;i<a1;i++)
    {
        for(j=0;j<b1;j++)
        {
            printf("(%d,%d)",a[i],b[j]);
            printf("\n");
        }
    }
}

