#include<stdio.h>
void main()
{
    int a[100],i,j,k,n;
    printf("Enter number of terms\n");
    scanf("%d",&n);
    printf("Enter terms\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("{ ");
    for(i=0;i<n;i++)
    {
        for(k=1;k<2;k++)
            printf("(%d),",a[i]);
        for(j=0;j<n;j++)
        {
            printf("(%d %d),",a[i],a[j]);
        }

    }
    printf("(");
    for(k=0;k<n;k++)
    {
        printf("%d,",a[k]);
    }
    printf(")");
    printf("{}");
    printf(" }");
}

