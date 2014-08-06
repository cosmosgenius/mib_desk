package mib_desk.formats

import mib_desk.bean.Alien
import scala.io.Source


//Abstract class for defining format
//Will have one function save which accepts the text to be stored and the filename
//return success or failure

abstract class Format( var formatType: String ) {
  def save(txt:String, filename:String): Boolean;
}


//Companion format object(singleton)
object Format {
  var formats: Map[String, String] = Map();
  def populateFormats() = {
    //Open Format.txt
    val format_txt = Source.fromInputStream( getClass.getClassLoader().getResourceAsStream( "formats.txt" ) ).mkString;
    
    //Parsing the file and creating a Map with <extension> as key and classname as value
    parseTxt( format_txt );
  }

  //Return all the keys
  def getFormats(): Iterable[String] = {
    return formats.keys;
  }

  //Return the classname for the key value
  def getClassText( key: String ): String = {
    return formats( key );
  }
  
  //Parsing format.txt
  def parseTxt( format_txt: String ) {
    var formats_tuples = format_txt.split( "\n" );

    for ( formats_tuple <- formats_tuples ) {
      var tuple_arry = formats_tuple.split( "=" );
      tuple_arry
      formats += ( tuple_arry( 0 ) -> tuple_arry( 1 ).trim() );
    }

  }
}