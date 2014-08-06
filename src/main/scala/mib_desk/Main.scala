package mib_desk
import mib_desk.menus.RegstrationMenu
import mib_desk.menus.MainMenu
import mib_desk.formats.Format
import mib_desk.menus.FormatMenu
import mib_desk.bean.Alien

object Main {
  def main( args: Array[String] ): Unit = {
    Format.populateFormats();
    /*( new MainMenu ).show();*/
    (new FormatMenu(new Alien("","","","","",""))).show();
  }
}