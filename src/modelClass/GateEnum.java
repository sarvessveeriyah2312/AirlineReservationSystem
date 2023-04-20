/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

/**
 *
 * @author kimai
 */
public enum GateEnum {
    A1("A1"),
    A2("A2"),
    B1("B1"),
    B2("B2");
    
    public final String label;
    
    private GateEnum(String label){
        this.label = label;
    }
}
