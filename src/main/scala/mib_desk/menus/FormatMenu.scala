package mib_desk.menus

class FormatMenu extends Menu( "Format Menu" ) {
  def menu(): Boolean = {
    println( "\n\tWhich format would you want?" );
    println( "\t1. Text" );
    println( "\t2. PDF" );
    return handleOption( getChoice() );
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