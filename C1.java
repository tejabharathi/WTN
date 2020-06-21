class Box
{
    double width;
    double height;
    double depth;
    Box(double wid, double hei, double dep)
    {
        System.out.println("Constructing Box");
        width = wid;
        height = hei;
        depth = dep;
    }
    double volume()
    {
        return width * height * depth;
    }
}

class C1
{
    public static void main(String args[])
  {
        Box mybox1 = new Box(100, 200, 150);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of the box is " + vol);     
    }
}
