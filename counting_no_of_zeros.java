public class counting_no_of_zeros {
    public static void main(String[] args) {
        int n=10210;
        System.out.println(count(n));

    }
    public static int count(int n){
       return helper(n,0);


    }
    public static int helper(int n,int c){
        if(n==0){
            return c;

        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);

    }


}

