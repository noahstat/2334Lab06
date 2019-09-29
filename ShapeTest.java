import java.util.ArrayList;
import java.util.Collections;

/**
 * Lab 6
 * 
 * Test class for Lab 6
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public class ShapeTest
{
    /**
     * Tests for the square class.
     */
	public void SquareTest() throws AssertException
	{
		//test the get shape type
	    Square sqare = new Square("square1", 5.0);
	    String expected = "Square";
	    Assert.assertEquals(expected, sqare.getShapeType());
		
	}
	
	/**
     * Tests for the rectangle class.
     */
	public void RectangleTest() throws AssertException
	{
		Rectangle rect = new Rectangle("rectangle1", 5.0, 8.0);
		
		//test the get shape
	    String expected = "Rectangle";
	    Assert.assertEquals(expected, rect.getShapeType());
	    
	    //test the area
	    double expecteds = 5.0 * 8.0;
	    Assert.assertEquals(expecteds, rect.getArea());
	}
	
	/**
     * Tests for the equilateral triangle class.
     */
	public void EquilateralTriangleTest() throws AssertException
	{
	    EquilateralTriangle tri = new EquilateralTriangle("eqtri1", 3);
	    
	    //test get shape
	    String expected = "EquilateralTriangle";
	    Assert.assertEquals(expected, tri.getShapeType());
	    
	    //test area
	    double expect = 4.5;
	    Assert.assertEquals(expect, tri.getArea());
	    
	}
	
	/**
	 * THIS TEST IS GIVEN FOR YOU. IT WILL WORK ONCE YOU HAVE DECLARE THE ABSTRACT SHAPE METHODS.
	 * 
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	public void CircleTest() throws AssertException
	{
		Shape circ = new Circle("Circle1", 3.0);
		Assert.assertEquals(Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals(2*Math.PI*3.0, circ.getPerimeter(),0.0001);
		Assert.assertEquals("Circle",circ.getShapeType());
		Assert.assertEquals("Circle1", circ.getId());
		
		Shape circs = new Circle("Circle2", 4.5);
		Assert.assertEquals(Math.PI*4.5*4.5, circs.getArea(),0.0001);
		Assert.assertEquals(2*Math.PI*4.5, circs.getPerimeter(),0.0001);
		Assert.assertEquals("Circle",circs.getShapeType());
		Assert.assertEquals("Circle2", circs.getId());
	}
	
	/**
     * Tests for the Shape Comparator class.
     */
	public void CompareTest() throws AssertException
	{
		//test equals with two different shapes
	    Square test1 = new Square("the one", 2.0);
	    Rectangle test2 = new Rectangle("the only", 2.0, 2.0);
	    ShapeComparator comp = new ShapeComparator();
	    
	    int expected = 0;
	    Assert.assertEquals(expected, comp.compare(test1, test2));
	    
	    //test the actual equals
	    Assert.assertEquals(expected, comp.equals(test1, test2));
	    
	    //test the less than
	    EquilateralTriangle test3 = new EquilateralTriangle("the truth", 1.0);
	    
	    expected = 1;
	    Assert.assertEquals(expected, comp.compare(test3, test2));
	    
	    //test the greater than
	    expected = -1;
	    Assert.assertEquals(expected, comp.compare(test1, test3));
	    
	    //test the equal area but different perimeters
	    test3 = new EquilateralTriangle("the light", 8.59655945459);
	    test2 = new Rectangle("the way", 1.0, 32.0);
	    
	    expected = -1;
	    Assert.assertEquals(expected, comp.compare(test2, test3));
	    
	    //the other one
	    expected = 1;
	    Assert.assertEquals(expected, comp.compare(test3, test2));
	    
	}
	
	/**
	 * Tests for Shape's toString().
	 */
	public void ShapeToStringTest() throws AssertException
	{
		Square test1 = new Square("the one", 2.0);
		
		//= System.out.format("%s\t ID = %d\t area = %.3f\t perimeter = %.3f", 
		//this.getShapeType(), this.getId(), this.getArea(), this.getArea());
		String expected = "Square	ID = the one	area = 4.000	perimeter = 8.000";
		
		Assert.assertEquals(expected, test1.toString());
	}
	
	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
    public void NaturalCompareTest() throws AssertException
    {
	    //the natural order is sorted by the perimeter it seems
ArrayList<Shape> list = new ArrayList<Shape>();
		
		Shape s1 = new Square("A", 4.0);
		Shape s2 = new Rectangle("B", 4.0, 1.0);
		Shape s3 = new Rectangle("A", 8.0, 2.0);
		Shape s4 = new Circle("C",3.0);
		Shape s5 = new EquilateralTriangle("D",5.0);
		
		list.add(s1);
		list.add(s2);
		list.add(s4);
		list.add(s3);
		list.add(s5);
		
		Collections.sort(list);
		int sum = 0;
		
		for(int i = 1; i < 4; ++i)
		{
			if(list.get(i - 1).getPerimeter() <= list.get(i).getPerimeter())
			{
				++sum;
			}
		}
    	
		Assert.assertEquals(5, sum);
    	
    }
}
