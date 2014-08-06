package mib_desk.formats

import mib_desk.bean.Alien

class PDFFormat extends Format("PDF") {
  def save(): Boolean = {
    return true;
  }
}