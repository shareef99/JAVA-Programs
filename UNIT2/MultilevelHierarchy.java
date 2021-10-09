package UNIT2;

class Box {
    private double width;
    private double height;
    private double depth;

    // Constructor clone of an object
    Box(Box b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    // Constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Construction used when no dimensions specified
    Box() {
        width = height = depth = -1;
    }

    // Constructor used when only one dimension specified
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    // Constructor clone of an object
    BoxWeight(BoxWeight b) {
        super(b);
        weight = b.weight;
    }

    // Constructor used when all dimensions specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // Construction used when no dimensions specified
    BoxWeight() {
        super();
        weight = -1;
    }

    // Constructor used when only one dimension specified
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;

    // Constructor clone of an object
    Shipment(Shipment s) {
        super(s);
        cost = s.cost;
    }

    // Constructor used when all dimensions specified
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // Construction used when no dimensions specified
    Shipment() {
        super();
        cost = -1;
    }

    // Constructor used when only one dimension specified
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class MultilevelHierarchy {

    public static void main(String[] args) {
        Shipment shipment = new Shipment(10, 20, 15, 10, 3.14);

        System.out.println("Volume of shipment " + shipment.volume());
        System.out.println("Weight of shipment " + shipment.weight);
        System.out.println("Cost of shipment " + shipment.cost);
    }

}

// Output :-
// Volume of shipment 3000.0
// Weight of shipment 10.0
// Cost of shipment 3.14