package date7_11;

//nth term in fibo using recursion
public class recursionFibo {

    public static void main(String[] args) {
        System.out.println( fibo(4));
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}

