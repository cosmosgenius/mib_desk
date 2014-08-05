package mib_desk
import mib_desk.menus.RegstrationMenu
import mib_desk.menus.MainMenu

object Main {
  def main( args: Array[String] ): Unit = {
    ( new MainMenu ).show();
  }
}