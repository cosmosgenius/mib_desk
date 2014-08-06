package mib_desk
import mib_desk.menus.RegstrationMenu
import mib_desk.menus.MainMenu
import mib_desk.formats.Format
import mib_desk.menus.FormatMenu
import mib_desk.bean.Alien

object Main {
  def main( args: Array[String] ): Unit = {
    
    /* Get the available format for the format.txt file present in resource folder
       The format of format.txt is : -
       <extension>=<fullclass name>
       
       eg:
       Txt=mib_desk.formats.TextFormat    
       txt is the extension and later part is the full class name
    */
    Format.populateFormats();
    
    //Show the Main Menu
    ( new MainMenu ).show();
  }
}