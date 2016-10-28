/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author up781587
 */
    
public class Box {
       
    private int gradeOfCard;
    private int color;
    private boolean reinBottom;
    private boolean reinCorner;
    private double costPerM; // change if needed
    
    public Box(int grade, int color, boolean bottom, boolean corner, double cost) {
        this.gradeOfCard = grade;
        this.color = color;
        this.reinBottom = bottom;
        this.reinCorner = corner;
        this.costPerM = cost;
    }
    
    
}
