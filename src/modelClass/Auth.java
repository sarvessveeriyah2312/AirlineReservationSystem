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
public interface Auth {

    void logout();

    Boolean validatePassword(String password);

    String getPassword();

    void setPassword(String password);

    String getUsername();

    void setUsername(String username);
}
