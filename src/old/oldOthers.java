// import java.io.Serializable;
// import java.time.LocalDate;
// import java.util.ArrayList;
// public class Others<T extends Node> implements Serializable, Node

// {
//     private int id;
//     private String Name;
//     private String Occupation;


//     public oldOthers(int id, String Name, String Occupation)
//     {
//         this.id = id;
//         this.Name = Name;
//         this.Occupation = Occupation;
       
//     }    

//     public oldOthers(int id, String Name)
//     {
//         this(id, Name, null);
        
//     }

//     public oldOthers(int id)
//     {
//         this(id, null, null);     
//     }

//     public oldOthers()
//     {
//         this(0,  null, null);
//     }
    
    


   
//     public void setId(int id) {
//         this.id = id;
//     }
//     public int getId() {
//         return id;
//     }

//     public void setName(String Name) {
//         this.Name = Name;
//     }

//     public String getName() {
//         return Name;
//     }

//     public String getOccupation() {
//         return Occupation;
//     }
    
//     @Override
//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append("\n").append(id).append(", имя: ").append(Name).append("\n").append("   должность:  ").append(Occupation).append("\n");

//         return sb.toString();
//     }

//     @Override
//     public String getLastName() {
//         throw new UnsupportedOperationException("Unimplemented method 'getLastName'");
//     }

//     @Override
//     public String getFirstName() {
//         throw new UnsupportedOperationException("Unimplemented method 'getFirstName'");
//     }

//     @Override
//     public Gender getGender() {
//         throw new UnsupportedOperationException("Unimplemented method 'getGender'");
//     }

//     @Override
//     public LocalDate getDataBirth() {
//         throw new UnsupportedOperationException("Unimplemented method 'getBirthDate'");
//     }

//     @Override
//     public LocalDate getDataDeath() {
//         throw new UnsupportedOperationException("Unimplemented method 'getDeathDate'");
//     }

//     @Override
//     public Object getFather() {
//         throw new UnsupportedOperationException("Unimplemented method 'getFather'");
//     }

//     @Override
//     public Object getMother() {
//         throw new UnsupportedOperationException("Unimplemented method 'getMother'");
//     }

//     @Override
//     public Object getChildren() {
//         throw new UnsupportedOperationException("Unimplemented method 'getChildren'");
//     }
// }

