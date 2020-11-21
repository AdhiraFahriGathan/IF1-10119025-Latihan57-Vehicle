/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan57.vehicle;

/**
 *
 * @author User
 */
public class Skateboard extends Vehicle{
    
    private double myBoardLength;
    
    public Skateboard(){
        System.out.println("Skateboard");
    }
    
    public double getBoardLeght(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength = boardLength;
    }

    public void setBrand(String ally_Skate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
