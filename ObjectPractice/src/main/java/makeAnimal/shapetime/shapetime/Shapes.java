package makeAnimal.shapetime.shapetime;

public class Shapes {
    public Float length;
    public Float width;

    public Shapes(Float length, Float width ){
this.length=length;
this.width=width;

    }
    public void calculateArea(){

        System.out.println(length*width);
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double x){
        this.length = length;
    }
    @Override
    public String toString() {
        return "Shapes{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
