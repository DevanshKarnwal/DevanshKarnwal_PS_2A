#include<stdio.h>
#include<math.h>
void main()
{
    int a[100],i,j,size,m;
    printf("DEVANSH KARNWAL\n");
    printf("Enter size of set A\n");
    scanf("%d",&m);
    printf("Enter elements of set A\n");
    for(i=0;i<m;i++)
    {
        scanf("%d",&a[i]);
    }
    size=pow(2,m);
    for(i=0;i<size;i++)
    {
        printf("(");
        for(j=0;j<m;j++)
        {
            if(i&1<<j)
            {
                printf("%d ",a[j]);
            }
        }
        printf(")");
        printf("\n");
    }
}

