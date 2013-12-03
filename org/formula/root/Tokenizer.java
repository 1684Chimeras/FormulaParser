/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formula.root;

/**
 *
 * @author Arhowk
 */
public class Tokenizer {
    public int getClosingParenthesis(String toCut, int leftPosOfOpenParenthesis){
        String toEvaluate = toCut.substring(leftPosOfOpenParenthesis+1, toCut.length());
        int operCount = 0;
        
        for(int i = leftPosOfOpenParenthesis+1; i < toCut.length(); i++){
            if(toCut.substring(0, 1).equals(FormulaParser.cper)){
                if(operCount == 0){
                    return i;
                }else{
                    operCount--;
                }
            }else if(toCut.substring(0, 1).equals(FormulaParser.oper)){
                operCount++;
            }
        }
        return -1;
    }
    
    
    
    public static void 
    
}
