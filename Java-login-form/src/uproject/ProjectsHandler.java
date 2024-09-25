
package uproject;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class ProjectsHandler {
   HashMap<String, HashMap> Projects = new HashMap <String, HashMap>();
   
   static private String current_project_name;
   static private HashMap current_project_info;
   
   public ProjectsHandler(){
       this.current_project_name = current_project_name;
       this.current_project_info = current_project_info;
       this.Projects = Projects;
   }
  
  class Project{
     
     static HashMap project_info;
     static HashMap project_items;
     static String project_name;
     
     public Project(String projectName){
         
          Project.project_info = new HashMap();
          Project.project_items = new HashMap();
          Project.project_name = projectName;
          ProjectsHandler.current_project_info = this.project_info;
          ProjectsHandler.current_project_name = this.project_name;
      }
      
    
     
     public HashMap GetItems(){
         
        return this.project_items;
     }
     
      class Item {
          
        int item_amount;
        float item_price;
        int item_sales;
        String item_name;
        public HashMap item_data;
          
        public Item(String item_name){    
            
            this.item_amount = 0 ;
            this.item_price = 0;
            this.item_sales = 0;
            this.item_name = item_name;
            this.item_data = new HashMap();
            this.CreateItemData(item_amount, item_sales, item_sales, item_name);
            
            Project.project_items.put(item_name, item_data);
        }
        
        public Item(String item_name, int item_amount){
        
        }
        
        
        public void displayItemData(){
            System.out.println(this.item_name.toUpperCase()+"'s INFO: ");
            System.out.println("========================================");
            for (Object obj : this.item_data.entrySet()){
                Map.Entry entry = (Map.Entry) obj;
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                
                System.out.println(key+": "+value);
            }             
        }
        
        public void discountAmount(int amount){
            this.item_amount -= amount;
            this.changeSpecificData("item_amount", String.valueOf(this.item_amount));
        }
        
        public void addAmount(int amount){
            this.item_amount += amount;
            this.changeSpecificData("item_amount", String.valueOf(this.item_amount));
        }
        
        public void setAmount(int amount){
            this.item_amount = amount;
            this.changeSpecificData("item_amount", String.valueOf(this.item_amount));
        }
        
        public void RegisterSale(){
          String Sales = this.getSpecificData("item_sales");  
          
          int number = 0;
      
          try{
              number = Integer.parseInt(Sales);
              
          }catch(NumberFormatException e){
              System.out.println("Invalid Sales key");
          }
          number++;
          this.discountAmount(1);
          
          this.changeSpecificData("item_sales", String.valueOf(number));
          Sales = this.getSpecificData("item_sales");
        }
        
        private void changeSpecificData (String data_name, String val){
            for (Object obj : this.item_data.entrySet()){
                Map.Entry entry = (Map.Entry) obj;
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                
                if (data_name == key){
                    
                    this.item_data.replace(data_name, val);
                    
                }
            }          
        }
        
        public String getSpecificData(String data_name){
            for (Object obj : this.item_data.entrySet()){
                Map.Entry entry = (Map.Entry) obj;
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                
                if (data_name == key){
                    return  String.valueOf(value);
                }
            }          
            return "";
        }
        
        
        public Object getItemData(){
            
            return this.item_data.get(this.item_name);
        }
          
        public HashMap CreateItemData(int item_amount, int item_price, int item_sales, String item_name){
              
              
              this.item_data.put("item_amount", item_amount);
              this.item_data.put("item_price", item_price);
              this.item_data.put("item_sales", item_sales);
              this.item_data.put("item_name", item_name);
              
              return this.item_data;
          }
      }
      
      public Item promptNewItem(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Insert a item name");
            String itemName = scan.nextLine();
            Item item = new Item(itemName);
            
            
            return item;
        }  
  }
   
   public Project createProject(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Project name:");
       String projectName = scan.nextLine();
      
       
       Project newProject = new Project(projectName);
       
       newProject.project_info.put("project_name", projectName);
       
       
     
       return newProject;
   }
  
   public String getCurrentProjectName(){
       return this.current_project_name;
   }
   
   public HashMap getProjects(){
      return this.Projects;
   }

}
