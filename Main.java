import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(sieveOfEratosthenes(100000000));
        
    
    }
    
    
    
    
    
    
    public static ArrayList<Integer>  sieveOfEratosthenes(int N){


        ArrayList<Integer> answer = new ArrayList<>();
        int[] smallestPrimeFactor = new int[N+1];

        for (int i = 0; i < smallestPrimeFactor.length; i++) {
            smallestPrimeFactor[i] = i;
        }

        for (int i = 2; i < (int)(Math.sqrt(N+1)+1); i++) {
            if(smallestPrimeFactor[i] == i){
                for (int j = i*i; j <= N; j+=i) {
                    smallestPrimeFactor[j] = i;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if(smallestPrimeFactor[i] == i){
                answer.add(i);
            }
        }
        return answer;
    }
}
