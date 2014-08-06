package mib_desk.formats

import mib_desk.bean.Alien
import scala.io.Source

abstract class Format( var formatType: String ) {
  def save(): Boolean;
}

object Format {
  var formats: Map[String, String] = Map();
  def populateFormats() = {
    val format_txt = Source.fromInputStream( getClass.getClassLoader().getResourceAsStream( "formats.txt" ) ).mkString;
    parseTxt( format_txt );
  }

  def getFormats(): Iterable[String] = {
    return formats.keys;
  }

  def getClassText( key: String ): String = {
    return formats( key );
  }
  def parseTxt( format_txt: String ) {
    var formats_tuples = format_txt.split( "\n" );

    for ( formats_tuple <- formats_tuples ) {
      var tuple_arry = formats_tuple.split( "=" );
      tuple_arry
      formats += ( tuple_arry( 0 ) -> tuple_arry( 1 ).trim() );
    }

  }
}