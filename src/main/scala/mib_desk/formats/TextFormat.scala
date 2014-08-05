package mib_desk.formats

import mib_desk.bean.Alien

class Text(alien: Alien) extends Format( "Text", alien ) {
  def save(): Boolean = {
    return true;
  }
}