package COE318.LAB2;
/**
 * ComplexNumber models a complex number expressed
 * in rectangular form (real and imaginary parts).
 * It is an <em>immutable</em> object.
 *
 * @author Sam Bondi - 500686504
 */
public class ComplexNumber {
  //Instance variable declarations
  double real, imaginary;
  /**
   * Construct a ComplexNumber given its
   * real and imaginary parts.
   * @param re The real component
   * @param im The imaginary component
   */
  public ComplexNumber(double re, double im) {
      //Initialize the instance variables
      real = re;
      imaginary = im;
  }

  /**
   * Returns the real component.
   * @return the real
   */
  public double getReal() {
      return real;  //A stub: to be fixed
  }

  /**
   * Returns the imaginary component.
   * @return the imaginary
   */
  public double getImaginary() {
      return imaginary;  //A stub: to be fixed
  }

  /**
   * Returns a new ComplexNumber number that is
   * the negative of <em>this</em>.  Note: the
   * original ComplexNumber is <b>NOT</b>
   * modified.
   * @return -this
   */
  public ComplexNumber negate() {
      
      ComplexNumber temp1 = new ComplexNumber(real, imaginary);
      
      temp1.real = real*(-1);
      temp1.imaginary = imaginary*(-1);
      
      return temp1;
  }

  /**
   * Returns a new ComplexNumber that is the
   * sum of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber add(ComplexNumber z) {
      
      ComplexNumber temp2 = new ComplexNumber(real, imaginary);
      
      temp2.real = this.real + z.real;
      temp2.imaginary = this.imaginary + z.imaginary;
      
      return temp2;
  }

  /**
   * Returns a new ComplexNumber that is the
   * difference of <em>this</em>  and <em>z</em>.
   * Note: the  original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this + z
   */
  public ComplexNumber subtract(ComplexNumber z) {
      
      ComplexNumber temp3 = new ComplexNumber(real, imaginary);
      
      temp3.real = this.real - z.real;
      temp3.imaginary = this.imaginary - z.imaginary;
      
      return temp3;
  }

  /**
   * Returns a new ComplexNumber that is the
   * product of <em>this</em> and <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this * z
   */
  public ComplexNumber multiply(ComplexNumber z) {
      
      ComplexNumber temp4 = new ComplexNumber(real, imaginary);
      
      temp4.real = (z.real * this.real)-(this.imaginary * z.imaginary);
      temp4.imaginary = (this.real * z.imaginary)+(this.imaginary * z.real);
      
      return temp4;
  }

  /**
   * Returns a new ComplexNumber that is
   * the reciprocal of <em>this</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @return 1.0 / this
   */
  public ComplexNumber reciprocal() {
      
      ComplexNumber temp5 = new ComplexNumber(real, imaginary);
      
      temp5.real = this.real/((this.real*this.real)+(this.imaginary*this.imaginary));
      temp5.imaginary = -this.imaginary/((this.real*this.real)+(this.imaginary*this.imaginary));
      
      return temp5;
  }

  /**
   * Returns a new ComplexNumber that is
   * <em>this</em> divided by <em>z</em>.
   * Note: the original ComplexNumber is
   * <b>NOT</b> modified.
   * @param z
   * @return this / z
   */
  public ComplexNumber divide(ComplexNumber z) {
      
      ComplexNumber temp6 = new ComplexNumber(real, imaginary);
      
      temp6.real = ((this.real*z.real)+(this.imaginary*z.imaginary))/((z.real*z.real)+(z.imaginary*z.imaginary));
      temp6.imaginary = ((this.imaginary*z.real)-(this.real*z.imaginary))/((z.real*z.real)+(z.imaginary*z.imaginary));
      
      return temp6;
  }

  /**
   * Returns a String representation of
   * <em>this</em> in the format:
   * <pre>
   * real +-(optional) i imaginary
   * </pre>
   * If the imaginary part is zero, only the
   * real part is converted to a String.
   * A "+" or "-" is placed between the real
   * and imaginary parts depending on the
   * the sign of the imaginary part.
   * <p>
   * Examples:
   * <pre>
   *  ..println(new ComplexNumber(0,0); - "0.0"
   *  ..println(new ComplexNumber(1,1); - "1.0 + i1.0"
   *  ..println(new ComplexNumber(1,-1); - "1.0 - i1.0"
   * </pre>
   * @return the String representation.
   */
  @Override
  public String toString() {
      //DO NOT MODIFY THIS CODE!
      String str = "" + this.getReal();
      if (this.getImaginary() == 0.0) {
          return str;
      }
      if (this.getImaginary() > 0) {
          return str + " + i" + this.getImaginary();
      } else {
          return str + " - i" + -this.getImaginary();
      }
  }
}
