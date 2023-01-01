package date7_11;

public class countNumberofDigits {
    public static void main(String[] args) {
        int num=0;
      System.out.println(number( num));

    }
    static int number(int num){
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            num=num/10;
            count++;

        }return count;
    }
}
