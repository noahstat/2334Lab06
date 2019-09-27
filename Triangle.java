/**
 * Generic Triangle base class.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
@SuppressWarnings("unused")
public abstract class Triangle extends Polygon
{
	//has the first side length
	private double s1;
	
	//has the second side length
	private double s2;
	
	//has the third side length
	private double s3;
	
    /**
     * The triangle constructor. Add the sides to the sideLengths arraylist.
     * 
     * @param id The created shape's name id.
     * @param s1 The first side length of the triangle.
     * @param s2 The first side length of the triangle.
     * @param s3 The first side length of the triangle.
     */
    public Triangle(String id, double s1, double s2, double s3)
    {
    	super(id);
    	this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
        sideLengths.add(s1);
        sideLengths.add(s2);
        sideLengths.add(s3);
        
    }
}
