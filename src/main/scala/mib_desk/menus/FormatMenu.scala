package mib_desk.menus

import mib_desk.formats._
import mib_desk.bean.Alien
import mib_desk.exporters.AlienExporter

class FormatMenu( alien: Alien ) extends Menu( "Format Menu" ) {
  var optionArray: Array[String] = Array();

  /*
   * Format menu content
   */
  def menu(): Boolean = {
    println( "\n\tWhich format would you want?" );
    
    //Printing different formats into menu
    printOptions( Format.getFormats() );
    
    return handleOption( getChoice() );
  }
  
  /*
   * function to handle differet option
   * option start from 1 - number of formats available
   * last option is exit
   */

  def handleOption( option: Int ): Boolean = {
    if ( optionArray.size >= option ) {
      
      var formattxt = optionArray( option - 1 );
      
      //if exit if choice return to previous menu
      if ( formattxt.equalsIgnoreCase( "Exit" ) ) {
        return false;
      }
      
      //after getting the option, the format class is retrieved dynamically based on the config in format.txt      
      var classtxt = Format.getClassText( formattxt );
      var classObject = Class.forName( classtxt );
      var formatgeneric = classObject.newInstance();
      var format: Format = formatgeneric.asInstanceOf[Format];
      
      //the alienExporter instance is created with the state define for current alien     
      var alienExporter: AlienExporter = new AlienExporter(alien);
      alienExporter.export(format);
      
      return false;
    }
    println( "\n\tInvalid option!! Try again" );
    return true;
  }

  def printOptions( options: Iterable[String] ) = {
    var i = 0;
    options.zipWithIndex.foreach {
      case ( option, i ) => {
        optionArray = optionArray :+ option;
        println( "\t" + ( i + 1 ) + ". " + option );
      }
    };
    println( "\t" + ( options.size + 1 ) + ". Exit" );
    optionArray = optionArray :+ "Exit";
  }
}