public class Tester{
    public static void main(String[] args){

        int[] inputs = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 35, 58, 100, 534};
        int[] expected = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 151, 277, 547, 3853};

        for (int i = 0; i < inputs.length; i++){

            int actualresult = nthPrime(inputs[i]);

            if (actualresult == expected[i]){
                System.out.println("pass");
            }
            else{
                System.out.println("fail expected " + expected[i] + ", but value returned was " + actualresult);
            }
        }
    }

    public static boolean isPrime(int x){

        boolean result = true;
        
        if (x < 2){
            result = false;
        }

        for (int i = 2; i < x; i++){
            if ((x % i) == 0){
                result = false;
            }
        }
        
        return result;
    }
  
    public static int nthPrime(int n){

        int count = 0;
        int result = 1;

        for (int i = 1; count <= n; i++){
            result = i;
            if (isPrime(i) == true){
                count += 1;
            }
        }
        
        return result;
    }  
}