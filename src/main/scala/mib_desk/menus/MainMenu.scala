package mib_desk.menus

import mib_desk.formats._

class MainMenu extends Menu("Welcome to MIB Registration Desk"){
  def menu():Boolean = {
    println( "\n\tWhat would you like to do?" );
    println( "\t1. New Registration" );
    println( "\t2. View Alien's Detail" );
    println( "\t3. Exit" );
    return handleOption(  getChoice() );;
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