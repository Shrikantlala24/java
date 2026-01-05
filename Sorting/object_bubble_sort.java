public class object_bubble_sort {
    public static void main(String[] args) {

        // * person class ke 3 object
        person p1 = new person("nihar", 45);
        person p2 = new person("shreyas", 52);
        person p3 = new person("ankit", 19);

        person[] arr = {p1, p2, p3};
        int size = arr.length;


        // ------------------------------------------
        boolean swapped;

        for (int i = 0; i < size -1; i++) {
            swapped = false;

            for(int j = 0; j < size -1-i; j++) {
                if (arr[j].age > arr[j+1].age) {

                    // ! person type ka temp varible
                    person temp = arr[j];


                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                    swapped = true;
                }
            }
            
            if(!swapped) break;
        }
        
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i].name + " ");
        }
    }
}


class person {
    String name;
    int age;

    person(String n, int a) {
        this.name = n;
        this.age = a;
    }
}