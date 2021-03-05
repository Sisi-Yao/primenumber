public class App {
    public static void main(String[] args) throws Exception {
        generatePrime(10);
        //false= for input 10
    }

    public static void generatePrime(int num){
        // define array to identify wheterh the number is primenumber or not
        boolean prime[] = new boolean[num +1];

        //primnumber =  2, 3, 5,7,

        //fill all array to  true, 2,3,4,5,6,7,8,9,10,
        for(int i = 2; i < num; i++){
            prime[i] = true;
        }
        //from two(which is the first prime number) decide whether it is prime number or not.
        for(int p= 2; p <= num/2; p++){
            if(prime[p]) {//2*2=4, f, 2*3=6,f,2*4=8,f,2*5=10,f, 3*3=9,f, so, 4,6,8,9,10 be marked false
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
