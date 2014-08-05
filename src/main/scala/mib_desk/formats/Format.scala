package mib_desk.formats

import mib_desk.bean.Alien

abstract class Format( var formatType: String, var alien: Alien ) {
  def save(): Boolean;
}