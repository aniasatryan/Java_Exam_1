package PlaneService;

import Plane.Plane;

import java.util.Scanner;

public class PlaneService {


    //create plane
    public Plane create(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the model: ");
        String model = scanner.next();
        System.out.println("Enter the name of the Country: ");
        String country = scanner.next();
        System.out.println("Enter the year of publishing: ");
        int year = scanner.nextInt();
        System.out.println("Enter the hours in air: ");
        int hours = scanner.nextInt();
        System.out.println("Is military ?: ");
        Boolean isMil = scanner.nextBoolean();
        System.out.println("Enter the weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter the wingspan: ");
        int wingspan = scanner.nextInt();
        System.out.println("Enter the topSpeed: ");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter the number of seats: ");
        int seats = scanner.nextInt();
        System.out.println("Enter the cost: ");
        double cost = scanner.nextDouble();

        Plane p = new
    }
    // Task 1. (score 5)
    // Create function:
    // Parameter one Plane
    // Result: print all information of the plane

    public void printAll(Plane p1) {
        System.out.println("Model: " + p1.getModel());
        System.out.println("Country: " + p1.getCountry());
        System.out.println("Year: " + p1.getYear());
        System.out.println("Hours: " + p1.getHours());
        System.out.println("Is Military: " + (p1.isMilitary() ? "Yes" : "No"));
        System.out.println("Weight: " + p1.getWeight() + " KG");
        System.out.println("Wingspan: " + p1.getWingspan());
        System.out.println("Top Speed: " + p1.getTopSpeed() + " km/h");
        System.out.println("Seats: " + p1.getSeats());
        System.out.println("Cost: " + p1.getCost() + "$");

    }

    // Task 2. (score 5)
    // Create function:
    // Parameter one Plane
    // Result: print cost and topSpeed if the plane is military otherwise print model and country
    public void checkMilitary(Plane p1) {
        if (p1.isMilitary()) {
            System.out.println("Cost: " + p1.getCost() + "$");
            System.out.println("Top Speed: " + p1.getTopSpeed() + " km/h");
        } else {
            System.out.println("Model: " + p1.getModel());
            System.out.println("Country: " + p1.getCountry());
        }
    }

    // Task 3. (score 7)
    // Create function:
    // Parameter two Planes
    // Result: return the plane which one is newer (if they have the same age return first one).

    public int newerPlane(Plane p1, Plane p2) {
        int newer;
        if (p1.getYear() >= p2.getYear()) {
            newer = p1.getYear();
        } else {
            newer = p2.getYear();
        }
        return newer;
    }

    // Task 4. (score 7)
    // Create function:
    // Parameter two Planes
    // Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).

    public String biggerWingspan(Plane p1, Plane p2) {
        String big;
        if (p1.getWingspan() <= p2.getWingspan()) {
            big = p2.getModel();
        } else {
            big = p1.getModel();
        }
        return big;
    }

    // Task 5. (score 7)
    // Create function:
    // Parameter three Planes
    // Result: print country of the plane with smallest seats count (if they have the same - print first).

    public void smallestSeats(Plane p1, Plane p2, Plane p3) {
        int min;
        if (p1.getSeats() == p2.getSeats() && p2.getSeats() == p3.getSeats()) {
            System.out.println(p1.getCountry());
        }
        if (p1.getSeats() < p2.getSeats() && p1.getSeats() < p3.getSeats()) {
            System.out.println(p1.getCountry());
        }
        if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats()) {
            System.out.println(p2.getCountry());
        }
        if (p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats()) {
            System.out.println(p3.getCountry());
        }
    }
    // Task 6. (score 7)
    // Create function:
    // Parameter array of Planes
    // Result: print all not military planes.

    public void militaryPlanes(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (!(planes[i].isMilitary()))
                printAll(planes[i]);
        }
    }

    // Task 7. (score 10)
    // Create function:
    // Parameter array of Planes
    // Result: print all military planes which were in air more than 100 hours.

    public void moreThan100(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && planes[i].getHours() > 100) {
                printAll(planes[i]);
            }
        }
    }

        // Task 8. (score 10)
        // Create function:
        // Parameter array of Planes
        // Result: return the plane with minimal weight (if there are some of them return last one).
    public Plane minWeight(Plane[] planes){
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if(planes[i].getWeight() < min.getWeight()){
                min = planes[i];
            }

        }
        printAll(min);
        return  min;
    }

        // Task 9. (score 10)
        // Create function:
        // Parameter array of Planes
        // Result: return the plane with minimal cost from all military planes (if there are some of them return first one).
        public Plane minCost(Plane[] planes){
            Plane min = planes[0];
            for (int i = 1; i < planes.length; i++) {
                if(planes[i].isMilitary() && planes[i].getCost() < min.getCost()){
                    min = planes[i];
                }
                break;

            }
            printAll(min);
            return  min;
        }
        // Task 10. (score 12)
        // Create function:
        // Parameter array of Planes
        // Result: print planes in ascending form order by year
        public void sortPlanesInAscendingForm(Plane[] planes) {
            int l = planes.length;
            int temp = 0;
            for (int i = 0; i < l; i++) {
                for (int j = 1; j < l - i; j++) {
                    if ( planes[j - 1].getYear() > planes[j].getYear()) {
                        temp = planes[j - 1].getYear();
                        planes[j - 1].getYear() = planes[j].getYear();
                        planes[j].getYear() = temp;
                    }
                }
            }
            for (int i = 0; i < planes.length; i++) {
                printAll(planes[i]);
            }
        }

}
