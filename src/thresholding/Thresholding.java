
package thresholding;
import org.opencv.core.Core;
//import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
public class Thresholding 
{
public static void main( String[] args )
{
try{
System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
Mat source = Highgui.imread("digital_image_processing.jpg",
Highgui.CV_LOAD_IMAGE_COLOR);
Mat destination = new
Mat(source.rows(),source.cols(),source.type());
destination = source;
Imgproc.threshold(source,destination,127,255,Imgproc.THRESH_TOZERO);
Highgui.imwrite("ThreshZero.jpg", destination);
}catch (Exception e) {
System.out.println("error: " + e.getMessage());
}
}
}