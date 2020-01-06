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
}
