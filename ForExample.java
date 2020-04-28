public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=5; ++i) {
            sum += i;
            System.out.println((sum + ", " + i));
        }
        System.out.println("sum: " + sum);
        
        for(int i=1; i<10; ++i) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}



















        // int n = 2501;  //0~10000
        // int min = 0;
        // int max = 10000;
        
        // int count = 0;
        // Vector<Integer> v = new Vector<Integer>();
        
        // for(int sel = (min + max) >> 1; sel != n; sel = (min+max)>>1)
        // {
        //     if(sel > n)
        //     {
        //         max = sel;
        //     }
        //     else{
        //         min = sel;
        //     }
        //     count++;
        //     v.add(sel);
        // }

        // System.out.println("print path: ");
        // for(int i : v)
        // {
        //     System.out.println("path: " + i);
        // }
        // System.out.println("count: " + count);