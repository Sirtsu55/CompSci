/*
  THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL
   WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
   WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE
   AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR
   CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS
   OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
   NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
   CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
*/

/* A set of input-output helper functions created by IBO. Here they
   are packaged into a class for convenient use. In IB exams, these
   functions are assumed to be callable without a classname. To
   achieve this, clone this repository into your project, and add the
   line

   import static ibio.Helpers.*;

   into your program files which use these functions */

package ibio;

public class Helpers
{
  public static void output (String info) { System.out.println (info); }
  public static void output (char info) { System.out.println (info); }
  public static void output (byte info) { System.out.println (info); }
  public static void output (int info) { System.out.println (info); }
  public static void output (long info) { System.out.println (info); }
  public static void output (double info) { System.out.println (info); }
  public static void output (boolean info) { System.out.println (info); }

  public static String input (String prompt)
  {
    String inputLine = "";
    System.out.print (prompt);
    System.out.flush ();
    try
    {
      inputLine = (new java.io.BufferedReader (
                     new java.io.InputStreamReader (System.in))).readLine ();
    }
    catch (Exception e)
    {
      String err = e.toString ();
      System.out.println (err);
      inputLine = "";
    }
    return inputLine;
  }

  private static String inputAndTrim (String prompt)
  {
    return input (prompt).trim ();
  }
  
  public static char inputChar (String prompt)
  {
    char result = (char) 0;
    try
    {
      result = input (prompt).charAt (0);
    }
    catch (Exception e) { result = (char) 0; }
    return result;
  }
  
  public static byte inputByte (String prompt)
  {
    byte result = 0;
    try
    {
      result = Byte.valueOf (inputAndTrim (prompt)).byteValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  public static int inputInt (String prompt)
  {
    int result = 0;
    try
    {
      result = Integer.valueOf (inputAndTrim (prompt)).intValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  public static long inputLong (String prompt)
  {
    long result = 0;
    try
    {
      result = Long.valueOf (input(prompt).trim()).longValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  public static double inputDouble (String prompt)
  {
    double result = 0;
    try
    {
      result = Double.valueOf (inputAndTrim (prompt)).doubleValue ();
    }
    catch (Exception e) { result = 0; }
    return result;
  }
  
  public static boolean inputBoolean (String prompt)
  {
    boolean result=false;
    try
    {
      result = Boolean.valueOf (inputAndTrim (prompt)).booleanValue ();
    }
    catch (Exception e) { result = false; }
    return result;
  }

  public static String inputString (String prompt) { return input (prompt); }
  public static String input () { return input (""); }
  public static int inputInt () { return inputInt (""); }
  public static double inputDouble () { return inputDouble (""); }
}
