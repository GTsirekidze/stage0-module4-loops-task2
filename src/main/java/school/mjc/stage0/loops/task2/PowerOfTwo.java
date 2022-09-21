package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int cur=0;
        if(power<0){
            System.out.println("too much power");
            return;
        }
        while (cur<=power){
            System.out.println((int)Math.pow(2,cur));
            cur++;
        }
    }
}
