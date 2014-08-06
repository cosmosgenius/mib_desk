package mib_desk.menus

import mib_desk.formats._
import mib_desk.bean.Alien
import mib_desk.exporters.AlienExporter

class FormatMenu( alien: Alien ) extends Menu( "Format Menu" ) {
  var optionArray: Array[String] = Array();

  def menu(): Boolean = {
    println( "\n\tWhich format would you want?" );
    printOptions( Format.getFormats() );
    return handleOption( getChoice() );
  }

  def handleOption( option: Int ): Boolean = {
    if ( optionArray.size >= option ) {
      var formattxt = optionArray( option - 1 );
      if ( formattxt.equalsIgnoreCase( "Exit" ) ) {
        return false;
      }
      var classtxt = Format.getClassText( formattxt );
      var classObject = Class.forName( classtxt );
      var formatgeneric = classObject.newInstance();
      var format: Format = formatgeneric.asInstanceOf[Format];
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