public class Car {
    int noofWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters =0;
    int noofSeats;

    public void start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is Out of fuel");
        }else if(currentFuelInLiters <5){
            System.out.println("Car is in reserved mode,Please Refuel");
        }else{
            System.out.println("Car is Started Brohhhh...");
        }
    }
        
    public void drive(){    
        
        currentFuelInLiters--;

        System.out.println("Car is Driving");
          }

    public void addFuel(float fuel){
        currentFuelInLiters +=fuel;

    }
    public float getcurrentfuelLevel(){
        return currentFuelInLiters;
    }

    
}

