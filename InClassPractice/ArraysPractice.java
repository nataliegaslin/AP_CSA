public class ArraysPractice {
    public static int nums = 0;

    public static void main (String[] args){
        int primeArray[] = new int[50];
        for(int r=0; r < 8000; r++){
            if (nums < 51){
                boolean primeBool = false;
                primeBool = isPrime(r);
                if (primeBool == true){
                    primeArray[nums] = r;
                    nums++;
                }
            }
            if (nums == 50){
                break;
            }
    
        }
        for(int t = 0; t < 50; t++){
                System.out.println(primeArray[t]);
        }
    }

    public static boolean isPrime(int n){
        if (n ==2 || n == 3){
            return true;
        }
        if (n <=1 || n%2 == 0 || n%3 == 0){
            return false;
        }
        for (int i = 5; i * i <= n; i +=6){
            if (n % i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
        }
    }
    
