public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Boolean[] prime = new Boolean[n+1];

        int i = 2;
        while (i <= n) {
            prime[i] = true;
            i++;
        }

        i = 2;
        while (i*i <= n) {
            if (prime[i]) {
                int j = i*i;

                while (j <= n) {
                    prime[j] = false;
                    j += i;
                }
            }
            i++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        int primeC = 0;
        i = 2;

        while (i <= n) {
            if (prime[i]) {
                System.out.println(i);
                primeC++;
            }
            i++;
        }

        int percent = (int)((primeC / (double)n) * 100);
        System.out.println("There are " + primeC + " primes between 2 and " + n + " (" + percent + "% are primes)");
    }
    
}