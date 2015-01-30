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
	lowerLeft.x = 0.0;
	lowerLeft.y = 0.0;
//give them some values
	upperRight.x = 1280.0;
	upperRight.y = 1024.0;

	middlePoint.x = 640.0;
	middlePoint.y = 512.0;
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
