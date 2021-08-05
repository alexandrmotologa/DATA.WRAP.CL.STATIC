  // main class
  public class DataWrapApp {
      public static void main(String[] args) {
    	  System.out.println(DataWrapper.wrapSquare("array"));
    	  System.out.println(DataWrapper.wrapAngle("tag"));
    	  System.out.println(DataWrapper.wrapRound(0.5));
      }
  }

  // secondary class
  class DataWrapper {
	  
	  //Wrap Round
	  static String wrapRound( String a ) {
		  return "(" + a + ")";
		}
	  static String wrapRound( int a ) {
		  return "(" + a + ")";
		}
	  static String wrapRound( char a ) {
		  return "(" + a + ")";
		}
	  static String wrapRound( double a ) {
		  return "(" + a + ")";
		}
	  
	//Wrap Angle
	  static String wrapAngle( String a ) {
		  return "<" + a + ">";
		}
	  static String wrapAngle( int a ) {
		  return "<" + a + ">";
		}
	  static String wrapAngle( char a ) {
		  return "<" + a + ">";
		}
	  static String wrapAngle( double a ) {
		  return "<" + a + ">";
		}
	  
	//Wrap Square
	  	static String wrapSquare( String a ) {
	  		return "[" + a + "]";
	  	}
	  	static String wrapSquare( int a ) {
	  		return "[" + a + "]";
	  	}
	  	static String wrapSquare( char a ) {
	  		return "[" + a + "]";
	  	}
	  	static String wrapSquare( double a ) {
	  		return "[" + a + "]";
	  	}
}