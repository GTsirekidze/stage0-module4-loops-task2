package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int cnt=0;
        while(cnt<=printToInclusive){
            int ans=1,i=1;
            while(i<=cnt){
                ans*=i;
                i++;
            }
            System.out.println(ans);
            cnt++;
        }
    }
}
