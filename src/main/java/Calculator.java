public class Calculator {

    private double firstNum;
    private double secondNum;

    public Calculator(double firstNum, double secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double add(){
        return this.firstNum + this.secondNum;
    }

    public double subtract(){
        return this.firstNum - this.secondNum;
    }

    public double multiply(){
        return this.firstNum * this.secondNum;
    }

    public double divide(){
        return this.firstNum / this.secondNum;
    }


}
