class Calculator {
    int value;

    Calculator(){
        this.value = 0;
    }
    void add(int val){
        this.value += val;
    }

    int getValue(){
        return this.value;
    }
    boolean isOdd(int num){
        return num % 2 == 1;
        /*if (num % 2 == 0){
            return false;
        } else return true;*/
    }
    int avg(int[] numlist){
        int sum=0;
        for(int i=0; numlist.length>i; i++){
           sum += numlist[i];
        }
        return sum/numlist.length;
    }
}
class UpgradeCalculator extends Calculator {
    void minus(int v) {
        this.value -= v;
    }
}

class MaxLimitCalculator extends Calculator{
    int getValue(){
        if (this.value < 100) {
            return this.value;
        } else {
            this.value = 100;
            return 100;
        }
    }
}
public class Quiz1 {
    public static void main(String[] args) {
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);
        cal.add(60);
        System.out.println(cal.getValue()); //
        System.out.println(cal.isOdd(3));
        int[] data = {1, 3, 5, 7, 9};
        Calculator cal2 = new Calculator();
        int result = cal2.avg(data);
        System.out.println(result);
        // list 사용은 아직 안배워서 안함.
    }
}
