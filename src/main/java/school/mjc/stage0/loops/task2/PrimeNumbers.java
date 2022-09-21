package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int cnt=2;
        while(cnt<=printToInclusive){
            int i=2,ind=0;
            while(i<cnt){
                if(cnt%i==0){
                    ind=1;
                    break;
                }
                i++;
            }
            if(ind==0){
                System.out.println(cnt);
            }
            cnt++;
        }
    }
}
