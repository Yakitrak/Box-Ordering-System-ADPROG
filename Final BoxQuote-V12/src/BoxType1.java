/**
 *
 * @author up781587, up769535, up743299
 */
public class BoxType1 extends Box {
    
    private final int grade; //grade of the box
    private final double size; //size of the box (width * length * height)
    private double price; // price of the box
    private final boolean seal; // if sealable top
    
    /**Sub class constructor
     * @param g grade of the box
     * @param s size of the box (w*l*h)
     * @param sl sealable top 
     */
    public BoxType1 (int g, double s, boolean sl) {
        super(g, s, sl);
        grade = g;
        size = s;
        seal = sl;
    }
    
    /**
     * Gets price of the box type1 including specific extras
     * @return 
     */
    @Override
    double getPrice(){
       // Price depending on the grade
       switch(grade) {
           case 1:
               price = size * 0.5;
               break;   
           case 2:
               price = size * 0.6;
               break;
           case 3: 
               price = size * 0.72;
               break;   
        }
       
       //price increase if sealable top
       if (seal) {
           price = price * 1.08;
       }
       return price;
    }
    
}
