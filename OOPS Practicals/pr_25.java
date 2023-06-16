package clg_pr_24_to_31;

/* Pr:-25 --> Define class complex with a function to add and to compare to complex number.  */

    public class Complex {
        public double real;
        public double imag;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imag = imaginary;
        }

        public Complex add(Complex second) {
            double sum_Real = this.real + second.real;
            double sum_Imag = this.imag + second.imag;
            return new Complex(sum_Real, sum_Imag);
        }

        public boolean Compare(Complex second) {
            boolean res = this.real == second.real && this.imag == second.imag;
            return res;
        }

        public static void main(String[] args) {

            Complex c_num1 = new Complex(10, 8.0);
            Complex c_num2 = new Complex(10, 8.0);

            Complex sum = c_num1.add(c_num2);
            System.out.println("Sum of complex number 1 and 2:- " + sum.real + " + " + sum.imag + "i");

            boolean Comp_res = c_num1.Compare(c_num2);

            if(Comp_res == true){
                System.out.println("Complex numbers are equal..");
            }
            else{
                System.out.println("Complex numbers are different..");
            }

        }
    }

