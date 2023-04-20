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
public class UserFactory {

    public User getUser(String userType) {
        if (userType == null) {
            return null;
        }
        if (userType.equalsIgnoreCase("PASSENGER")) {
            return new Passenger();
        } else if (userType.equalsIgnoreCase("PILOT")) {
            return new Pilot();
        }
        return null;
    }
}
