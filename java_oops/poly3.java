public class poly3 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.CalculateArea();

        Circle c = new Circle();
        c.CalculateArea(6);

        Rectangle r = new Rectangle();
        r.CalculateArea(5,6);

        Triangle t =  new Triangle();
        t.CalculateArea(7,8);
        
    }
}
class Shape{
    float area;
    int rect;
    int tri;
    void CalculateArea(){
        System.out.println("Calculating Areas for Circle,Triangle,Rectangle: ");
    }
}
class Rectangle extends Shape{
    void CalculateArea(int l,int w){
        this.rect = l*w;
        System.out.println("Rectangle: "+(this.rect));
    }
}

class Triangle extends Shape{
    void CalculateArea(int l,int b){
        this.tri = 1/2*l*b;
        System.out.println("Triangle: "+(this.tri));

    }
}

class Circle extends Shape{
    float pi = 3.14f;
     void CalculateArea(int a){
        this.area = pi*a*a;
        System.out.println("Circle area: "+(this.area));
    }
}
