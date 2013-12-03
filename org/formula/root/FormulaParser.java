/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formula.root;

import java.util.Scanner;

/**
 *
 * @author Arhowk
 */
public class FormulaParser {

    /**
     * @param args the command line arguments
     */
    
    final String plus = "+";
    final String minus = "-";
    final String times = "*";
    final String div = "/";
    final String expo = "^";
    final String mod = "%";
    final String oper = "(";
    final String cper = ")";
    
    static String omniFormula;
    static int xVal;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Input a formula where independant variable is x and dependant variable is y");
        System.out.print("     ");
        
        omniFormula = s.next();
        
        System.out.println("Set x=");
        
        xVal = s.nextInt();
        
        System.out.println("formula="+omniFormula+"value="+xVal);
    }
}
