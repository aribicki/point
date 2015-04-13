/* Driver for Point class
	Andrew Ribicki	
	30 January 2015
*/
public class PointDriver {

	public static void main(String[] args ) {
	Point lowerLeft = new Point();
	Point upperRight = new Point();
	Point middlePoint = new Point();
// create three points
	lowerLeft.setX(0.0);
	lowerLeft.setY(0.0);
//give them some values
	upperRight.setX(1280.0);
	upperRight.setY(1024.0);

	middlePoint.setX(640.0);
	middlePoint.setY(512.0);
// print one of the points
	upperRight.printPoint();
	middlePoint.printPoint();
	System.out.println("The distance between your point is " + upperRight.distance(middlePoint));
// clear it
	upperRight.clear();
//print it again
	upperRight.printPoint();
	}
}
