public class App {
    public static void main(String[] args) throws Exception {
        generatePrime(15);
        //false= for input 15
    }

    public static void generatePrime(int num){
        // define array to identify wheterh the number is primenumber or not
        boolean prime[] = new boolean[num +1];

        //primnumber =  2, 3, 5,7,11,13....

        //fill all array to false
        for(int i = 0; i < num; i++){
            prime[i] = false;
        }
        //Hint: Dynamic Programming algorithm -> the best solution
        //from two(which is the first prime number) decide whether it is prime number or not.
        for(int p= 2; p <= num/2; p++){
            if(prime[p]) {//if it is primenumber = change prime[that number] = true;
                for(int j=p; j*p<= num; j++)
                    prime[j*p] = false; 
            }
        }
        
        for(int i=2; i <= num; i++){
            if(prime[i]){
                System.out.println(i + " ");
            }
        }
    }
}
