public class Main {

    public static final String Perimeter_Of_Cylinder = "Chu vi: ";
    public static final String Base_Area_Of_Cylinder = "Diện tích đáy: ";
    public static final String Space = "--------------------";

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 5);
        cylinder.getRadius();

        System.out.print(Perimeter_Of_Cylinder);
        getPerimeter(cylinder);

        System.out.println(Space);

        System.out.print(Base_Area_Of_Cylinder);
        getBaseArea(cylinder);
    }

    private static void getBaseArea(Cylinder cylinder) {
        System.out.print(cylinder.getBaseArea(cylinder.getRadius()));
    }

    private static void getPerimeter(Cylinder cylinder) {
        System.out.println(cylinder.getPerimeter(cylinder.getRadius()));
    }
}
