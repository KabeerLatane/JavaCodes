package date7_11;

public class duplicateMethod1Bruteforce {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(containsDuplicate(arr));

    }
    public static boolean containsDuplicate(int[] num){
        for (int i = 0; i < num.length; i++) {
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }

        }return false;
    }
}
