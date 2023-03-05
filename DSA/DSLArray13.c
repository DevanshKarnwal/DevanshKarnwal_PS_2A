#include <stdio.h>
int main()
{
    int i, n, a[100], k, c;
    void *b,*add;
    printf("Enter number of elements:\n");
    scanf("%d", &n);
    printf("Enter array elements:\n");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    b= &a[0];
    printf("Enter the element to find the address:\n");
    scanf("%d", &k);
    for (i = 0; i < n; i++)
    {
        if (a[i] == k)
        {
            c = i;
            break;
        }
    }
    //a[i]=base add+(i-l)*n
    add=b+ (c)*sizeof(int);
    printf("Calculated Address=%d",add);
    printf("Actual  Address=%d",&a[c]);
}
