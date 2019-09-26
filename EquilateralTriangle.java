/**
 * Lab 6
 * 
 * Class representing an equilateral Triangle.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public class EquilateralTriangle extends Triangle
{
    /**
     * Length of the sides of the equilateral triangle.
     */
    private double sideLength;
    
	/**
	 * Constructor for the equilateral triangle.
	 * 
	 * @param sidelength The length of the triangle sides.
	 */
	public EquilateralTriangle(String id, double sideLength)
	{
		super(id, sideLength, sideLength, sideLength);
	}
	
	/**
	 * Gets the area of the triangle.
	 * 
	 * @return The area of the triangle (b*h/2 = sidelength*sidelength*root(3)/4)
	 */
	public double getArea()
	{
		return ((0.5 * sideLength) * sideLength);
	}
	
	/**
	 * Gets the shape type of the triangle.
	 * 
	 * @return The string "EquilateralTriangle"
	 */
	@Override
	public String getShapeType()
	{
		return "EquilateralTriangle";
	}
}
