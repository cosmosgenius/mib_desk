package mib_desk.menus

class MainMenu extends Menu("Welcome to MIB Registration Desk"){
  def menu():Boolean = {
    println( "\n\tWhat would you like to do?" );
    println( "\t1. New Registration" );
    println( "\t2. View Alien's Detail" );
    println( "\t3. Exit" );
    var optionStr = getValue("Enter your choice");
    var option = 0;

    try {
      option = optionStr.toInt;
    } catch {
      case e: NumberFormatException => println( "\n\tInvalid option!! Try again" );
    }
    
    
    
    return handleOption( option );;
  }
  
  def handleOption( option: Int ): Boolean = {
    option match {
      case 1 => {
        (new RegstrationMenu).show();
        return true;
      }
      case 3 => return false;
      case option => return true;
    }
  }
}