import java.util.ArrayList;

/**
 * Abstract shape class to define a polygon.
 * 
 * @author Stephen
 * @version 2018-10-03
 */
public abstract class Polygon extends Shape
{
    /**
     * A list of the lengths of the sides of the polygons.
     */
    protected ArrayList<Double> sideLengths;
    
    /**
     * Initializes the sideLengths arraylist and sets the Shape's ID.
     * 
     * @param id The created shape's name id.
     */
    public Polygon(String id)
    {
        super(id);
    }
    
    /**
     * Calcaulates the perimeter of a polygon. That is, the sum of its side lengths.
     * 
     * @return The perimeter of the polygon.
     */
    public double getPerimeter()
    {
    	double sum = 0;
        for(int index = 0; index < sideLengths.size(); ++index)
        {
        	sum += sideLengths.get(index);
        }
        return sum;
    }
}
