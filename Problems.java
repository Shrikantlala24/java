public class Problems {
    public static void main(String[] args) {
        // are of circle :-
        int r = 5;
        System.out.println("the area of circle is: " + (3.14 * r * r));

        // circumference of circle :-
        System.out.println("the circumference of circle is: " + (2 * 3.14 * r));

        // area of rectangle :-
        int l = 10;
        int b = 5;

        System.out.println("the area of rectangle is: " + (l * b));

        // perimeter of rectangle :-
        System.out.println("the perimeter of rectangle is: " + (2 * (l + b)) );

        // volume of sphere :-
        int radius = 7;
        int vol = 4/3 * 22/7 * radius * radius * radius;
        System.out.println("the volume of sphere is: " + vol);
    }
}
