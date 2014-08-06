package mib_desk.formats

import mib_desk.bean.Alien

class PDFFormat extends Format( "PDF" ) {
  def save(txt:String, filename:String): Boolean = {
    return true;
  }
}