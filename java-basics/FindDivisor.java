public class FindDivisor {

    public long numberOfDivisors(int n) {

        long counter = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                counter++;
            }
        }
        System.out.print(counter);
        return counter;
    }
}