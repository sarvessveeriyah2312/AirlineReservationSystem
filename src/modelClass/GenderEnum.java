/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

/**
 *
 * @author Mohd Mohsin Ismail
 */
public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female");

    public final String label;

    private GenderEnum(String label) {
        this.label = label;
    }
}
