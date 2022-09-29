public class MaxVariableArgument {
    static int max(int ...A)
    {
        if(A.length==0)
            return Integer.MIN_VALUE;
        else {
            int m=A[0];
            for(int i=1;i<A.length;i++)
            {
                if(A[i]>m)
                    m=A[i];
            }
            return m;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(1,2,3,4,53,2,56,6));

    }
}
