package mib_desk.menus

object MainMenu {
  def show(): Boolean = {
    println( "\n\nWelcome to MIB Registration Desk" );
    println( "\n\tWhat would you like to do?" );
    println( "\t1. New Registration" );
    println( "\t2. View Alien's Detail" );
    println( "\t3. Exit" );
    var optionStr = io.StdIn.readLine( "\t>> ", null );

    var option = 0;

    try {
      option = optionStr.toInt;
    } catch {
      case e: NumberFormatException => println( "\n\tInvalid option!! Try again" );
    }

    return handleOption( option );
  }

  def handleOption( option: Int ): Boolean = {
    option match {
      case 1 => {
        RegstrationMenu.show();
        return true;
      }
      case 3 => return false;
      case option => return true;
    }
  }
}