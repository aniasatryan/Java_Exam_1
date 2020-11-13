package Main;

import Plane.Plane;
import PlaneService.PlaneService;

import java.util.Scanner;


//use all the methods from PlaneService using Scanner object.
public class Main {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane p1 = service.create();
        service.printAll(p1);
        Plane p2 = service.create();
        service.printAll(p2);
        Plane p3 = service.create();
        service.printAll(p3);
        Plane[] planes = {p1,p2,p3};
    }
}
