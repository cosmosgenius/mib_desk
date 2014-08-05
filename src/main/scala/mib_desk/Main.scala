package mib_desk

object Main {
  def main( args: Array[String] ): Unit = {

    while ( processCmd( menu() ) ) {};
  }

  def menu(): Int = {
    println( "\n\nWelcome to MIB Registration Desk" );
    println( "\n\tWhat would you like to do?" );
    println( "\t1. New Registration" );
    println( "\t2. View Alien Details" );
    println( "\t3. Exit" );

    var optionStr = io.StdIn.readLine( "\t>> ", null );
    
    var option = 0;

    try {
      option = optionStr.toInt;
    } catch {
      case e: NumberFormatException => println( "\n\tInvalid option!! Try again" );
    }

    return option;
  }

  def processCmd( option: Int ): Boolean = {
    option match {
      case 3 => return false;
      case option => return true;
    }
  }
}