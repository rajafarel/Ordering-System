
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAJA
 */
 abstract class error extends JOptionPane{
    
    public abstract void error();
    
    
}

class wrong extends error{

    @Override
    public void error() {
        showMessageDialog(null,"Please increase the item quantity");
    }
    
    
    
}