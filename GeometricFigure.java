package AbstractTask;

public abstract class GeometricFigure {


    abstract void area();

    abstract void perimetr();


    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle();
        GeometricFigure trapezium = new Trapezium();
        GeometricFigure rectangle = new Rectangle();

        triangle.area();
        triangle.perimetr();
        trapezium.area();
        trapezium.perimetr();
        rectangle.area();
        rectangle.perimetr();
    }
}
