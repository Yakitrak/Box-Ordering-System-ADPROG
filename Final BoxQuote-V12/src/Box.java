/**
 *
 * @author up781587, up769535, up743299
 */
abstract class Box {       
    private final int grade; //grade of the box
    private final double size; //size of the box (width * length * height)
    private final boolean seal; // if sealable top
   
/**
 * 
 * @param grade grade of the box
 * @param size size of the box (w*l*h)
 * @param seal sealable top
 */
    public Box(int grade, double size, boolean seal) {        
        this.grade = grade;
        this.size = size;
        this.seal = seal;
    }
    
 /**
  * Abstract method that returns the price of the box
  * @return 
  */
    abstract double getPrice();
}
