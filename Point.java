/* Point class for cmp112
	Andrew Ribicki
	30 January 2015
*/
public class Point {
	private double x,y;
// Print out the coordinates for a single point
	public void printPoint() {
	  System.out.println("X coordinate: " +  this.x);
	  System.out.println("Y coordinate: " +  this.y);
	}
// clear x and y values (i.e. reset point to 0
	 public void clear() {
	  x = 0.0;
 	  y = 0.0;
	}
// calculate distance between two points	
	 public double distance(Point that) {
		double xdiff = x - that.x;
		double ydiff = y - that.y;
		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
		}
// set a point to a brand new value
// this is an mutator (also called a setter)
	public void setPoint(double newX, double newY) {
	 this.x = newX;
	 this.y = newY;
//	public void setPoint(double newX) {
//	 this.x = newX; }
//	public void setPoint(double newY) {
//	 this.y = newY;}

	
	// get the value of x this is also called an accessor or getter
	public double getX() {
	 return x;
	}

	// Get the value
	public double getY() {
	 return y;
	}

	//get x
	public void setX(double newX) {
	x = newX;
	}
	public void setY(double newY) {
	y = newY;
	}

}}
