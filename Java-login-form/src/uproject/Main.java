/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uproject;
import java.util.HashMap;
/**
 *
 * @author Caio
 */
public class Main {
    
    public static void main(String[] args) {
      ProjectsHandler PH = new ProjectsHandler();
      ProjectsHandler.Project newProject = PH.createProject();
      ProjectsHandler.Project.Item newItem = newProject.promptNewItem();
      
      
      newItem.setAmount(100);
      newItem.addAmount(100);
      newItem.displayItemData();
    }
    
    
}
 