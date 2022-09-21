class Box
{
    double width, height,depth;
      Box(double width,double height,double depth)
      {
          this.width = width;
	  this.height = height;
          this.depth = depth;
      }
	void result()
	{
		System.out.println("The result is " + (width*height*depth));
	}
	public static void main(String[] args)
	{
          Box obj = new Box(10.6,11.5,5.5);

	}
}
