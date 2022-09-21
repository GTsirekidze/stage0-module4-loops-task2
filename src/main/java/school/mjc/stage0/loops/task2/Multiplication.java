package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int cur=0;
        if(multiplyByAndToInclusive==0) return;
        while (cur<=Math.abs(multiplyByAndToInclusive)){
            System.out.println(cur*multiplyByAndToInclusive);
            cur++;
        }
    }
}
