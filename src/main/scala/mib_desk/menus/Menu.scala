package mib_desk.menus

/*
 * An abstract class to define the common properties of a menu
 *
 */

abstract class Menu( head: String ) {
  /*
   * printHeading function is used for styling the heading of the menu
   */
  def printHeading() = {
    println( "\n\n\t================================" );
    println( "\t" + head );
    println( "\t================================\n" );
  }

  /*
   * show function is called to show the menu and repeats itself until the menu is exited by the user
   */
  def show() = {
    var condition = true;
    while(condition){
      printHeading();
      condition = menu();
    };
  }
  
  /*
   * getvalue is called when you require a input from the user
   */
  
  def getValue(question: String): String = {
    println( "\t" +  question );
    var value = io.StdIn.readLine( "\t>> ", null );
    return value;
  }
  
  /*
   * getChoice is called an menu item is suppose to selected
   */
  
  def getChoice(): Int = {
    var optionStr = getValue("Enter your choice");
    var option = 0;

    try {
      option = optionStr.toInt;
    } catch {
      case e: NumberFormatException => {
    	println( "\n\tInvalid option!! Try again" ); 
        getChoice();
      }
    }
    
    return option;
  }

  /*
   * menu is a abstract function required to be overridden
   * It is used to define the menu content
   */
  def menu(): Boolean;
}