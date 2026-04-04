public class Solution1_5 {
    public int gcd(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a == 0) return b;
        if(b == 0) return a;
        int k=Math.min(a,b);

        for (int i=k;i>0;i--){
            if (a%i==0 && b%i==0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        Solution1_5 s= new Solution1_5();
        System.out.println("ket qua la"+s.gcd(2,3));
        System.out.println("ket qua la"+s.gcd(-10,5));
        System.out.println("ket qua la"+s.gcd(4,6));
        System.out.println("ket qua la"+s.gcd(0,0));
    }
}


