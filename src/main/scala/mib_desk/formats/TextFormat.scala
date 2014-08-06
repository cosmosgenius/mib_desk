package mib_desk.formats

import mib_desk.bean.Alien

class TextFormat extends Format( "Text" ) {
  def save(): Boolean = {
    return true;
  }
}