import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
  String name, serialNumber;
  int value;

  public Inventory(String name, String serialNumber, int value) {
    this.name = name;
    this.serialNumber = serialNumber;
    this.value = value;
  }
} 

class Main {
  public static void main(String[] args) {
    String name, serialNumber;
    int value, input;
    Scanner s = new Scanner(System.in);
    ArrayList<Inventory> storage = new ArrayList<Inventory>();
    
    do {
      System.out.println("Press 1 to add an item");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      input = s.nextInt();

      switch (input) {

        case 1:
          s.nextLine(); //need 
          System.out.println("Enter the name: ");
            name = s.nextLine();
          System.out.println("Enter the serial number: ");
            serialNumber = s.nextLine();
          System.out.println("Enter the value in dollars (whole number): ");
            value = s.nextInt();
          storage.add(new Inventory(name, serialNumber, value));
          break;
          
        case 2:
          System.out.println("Enter the serial number of the item to delete: ");
            s.nextLine(); //need 
            String serialNumberDelete = s.nextLine();

          for(int i=0;i<storage.size();i++) {    
            if(storage.get(i).serialNumber.equals(serialNumberDelete)) {
              storage.remove(i);
            }
          }
          break;

        case 3:
          System.out.println("Enter the serial number of the item to change: ");
            s.nextLine(); //need 
            String serialNumberChange = s.nextLine();

          for(int i=0;i<storage.size();i++) {
            if(storage.get(i).serialNumber.equals(serialNumberChange)) {
              System.out.println("Enter the new name: ");
                String newName = s.nextLine();
                storage.get(i).name = newName;
              System.out.println("Enter the new value in dollars (whole number): ");
                int newValue = s.nextInt();
                storage.get(i).value = newValue;
            }
          }
          break;

        case 4:
          for(int i=0;i<storage.size();i++) {
            System.out.println(storage.get(i).name + "," + storage.get(i).serialNumber + "," + storage.get(i).value + "\n");
          }
          break;                     
      }
    } 
    while(input!=(5));
      s.close();
  } 
}






