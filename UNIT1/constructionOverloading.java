class BoxConstructorOverloading {
    int w;
    int h;
    int d;

    BoxConstructorOverloading() {
        // Using -1 to indicate an uninitialized box.
        w = h = d = -1;
    }

    BoxConstructorOverloading(int length) {
        w = h = d = length;
    }

    double vol() {
        return w * h * d;
    }
}

public class constructionOverloading {
    public static void main(String[] args) {
        BoxConstructorOverloading box = new BoxConstructorOverloading(5);
        System.out.println("Volume of box is : " + box.vol());

    }
}

// Output:-
// Volume of box is : 125.0