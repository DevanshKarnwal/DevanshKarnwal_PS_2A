public class VariableArgument {
    static void show(int ...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(10,20,30);
        show(new int[]{3,5,7,8,5,9,4,1,200});
    }
}
