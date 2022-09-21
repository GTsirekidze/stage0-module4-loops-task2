package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int cur=2;
        while (cur<=printTillInclusive){
            System.out.println(cur);
            cur+=2;
        }
        }
}
