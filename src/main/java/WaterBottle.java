public class WaterBottle {
    private double volume;

    public WaterBottle(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume= this.volume-10;
    }

    public void empty(){
        this.volume=0;
    }

    public void fill(){
        this.volume=100;
    }
}
