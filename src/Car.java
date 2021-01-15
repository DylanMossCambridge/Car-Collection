public class Car{

   private String manufacturer;
   private int age;

   Car(String manufacturer, int age){
       this.manufacturer = manufacturer;
       this.age = age;
   }

   @Override
    public String toString(){
       return String.format("Manufacturer: %s, Age: %d\n",manufacturer,age);
   }

   public String getManufacturer(){
       return manufacturer;
   }

   public int getAge(){
       return age;
   }

}