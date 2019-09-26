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
	public void SquareTest()
	{
	    // TODO: implement this.
	}
	
	/**
     * Tests for the rectangle class.
     */
	public void RectangleTest()
	{
	    // TODO: implement this.
	}
	
	/**
     * Tests for the equilateral triangle class.
     */
	public void EquilateralTriangleTest()
	{
	    // TODO: implement this.
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
	    // TODO: implement this.
	}
	
	/**
	 * Tests for Shape's toString().
	 */
	public void ShapeToStringTest() throws AssertException
	{
	    // TODO: implement this.
	}
	
	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
    public void NaturalCompareTest() throws AssertException
    {
	    // TODO: implement this.
    }
}
