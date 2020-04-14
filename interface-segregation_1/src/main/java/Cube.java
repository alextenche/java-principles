public class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

    public double area(){
        return 1.0;
    }

    public double volume(){
        return 1.0;
    }

    public double calculate(){
        return this.area() + this.volume();
    }
}
