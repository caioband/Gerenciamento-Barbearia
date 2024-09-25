/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uproject;

/**
 *
 * @author Caio
 */
public class User {
    
    static String username = "";
    
    public String getUsername(){
        return username;
    } 
    
    public User(String userN){
     username = userN;
    }
    
    public void setUsername(String newUsername){
        username = newUsername;
    }
}
