
/* Pr:-30 --> Write a program that illustrates method overriding. Class Bond is extended by ConvertibleBond. Each of there classes defines a display() method that 
              outputs the string “Bond” of “ConvertibleBond”, respectively. Declare an array to hold six Bond objects. Initialize the elements of the array with a mix 
              of Bond and ConvertibleBond objects. Execute a program loop to invoke the display method of each object. */

package clg_pr_24_to_31;

 class Bond {
        public void display() {
            System.out.println("That is Bond..");
        }
    }

    class ConvertibleBond extends Bond {
        @Override
        public void display() {
            System.out.println("That is ConvertibleBond..");
        }


        public static void main(String[] args){

        Bond[] b = new Bond[6];

//       Mixture of Both bonds..
        b[0] = new Bond();
        b[1] = new ConvertibleBond();
        b[2] = new Bond();
        b[3] = new ConvertibleBond();
        b[4] = new Bond();
        b[5] = new ConvertibleBond();

        for (Bond bonds : b) {
            bonds.display();
        }

    }
}
