package mib_desk.formats

import mib_desk.bean.Alien
import java.io.PrintWriter
import java.io.File

class TextFormat extends Format( "Text" ) {
  def save( txt: String, filename: String ): Boolean = {
    val writer = new PrintWriter( new File( filename ) );
    writer.write( txt );
    writer.close();
    return true;
  }
}