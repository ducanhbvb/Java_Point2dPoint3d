public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0f;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }
    @Override
    public String toString(){
        return "A Point3D with X="
                + getX()
                + ", A Point3D with Y="
                + getY()
                + ", A Point3D with z="
                + getZ()
                + ", which is a subclass of"
                + super.toString();
    }
}
