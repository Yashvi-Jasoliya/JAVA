package clg_pr_24_to_31;

//30

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
