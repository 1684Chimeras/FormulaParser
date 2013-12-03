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
    
    final static String add = "+";
    final static String sub = "-";
    final static String mul = "*";
    final static String div = "/";
    final static String exp = "^";
    final static String mod = "%";
    
    final static String oper = "(";
    final static String cper = ")";
    
    final static int op_add = 1;
    final static int op_sub = 1;
    final static int op_mul = 2;
    final static int op_div = 2;
    final static int op_exp = 3;
    final static int op_mod = 2;
    
    
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
