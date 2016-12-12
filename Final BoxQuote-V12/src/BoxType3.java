/**
 *
 * @author up781587, up769535, up743299
 */
public class BoxType3 extends Box {
    
    private final int grade; //grade of the box
    private final double size; //size of the box (width * length * height)
    private double price; // price of the box
    private final boolean seal; // if sealable top
    
    /**Sub class constructor
     * @param g grade of the box
     * @param s size of the box (w*l*h)
     * @param sl sealable top 
     */
    public BoxType3 (int g, double s, boolean sl) {
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
       double tPrice;
       //gets price depending on grade
       switch(grade) {
           case 2:
               price = size * 0.6;
               break;
               
           case 3:
               price = size * 0.72;
               break;
           case 4: 
               price = size * 0.9;
               break; 
           case 5:
               price = size * 1.4;
        }
       tPrice = price * 1.16; //price increase for 2 colours
       
       //price increase for sealable top
       if (seal) {
           tPrice = tPrice + price * 0.08;
       }
       return tPrice;    
    }
    
}
