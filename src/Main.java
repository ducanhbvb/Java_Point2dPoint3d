public class Main {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(2.5f,5.0f);
        System.out.println(point2D);

        Point2D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(3);
        System.out.println(point3D);
        point3D=new Point3D(1.5f,2,3);
        System.out.println(point3D);
    }
}
