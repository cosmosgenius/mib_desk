package mib_desk.formats

import mib_desk.bean.Alien

class Pdf(alien: Alien) extends Format("PDF",alien) {
  def save(): Boolean = {
    return true;
  }
}