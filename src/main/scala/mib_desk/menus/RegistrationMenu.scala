package mib_desk.menus

import mib_desk.bean.Alien
import mib_desk.exporters.AlienExporter
import mib_desk.managers.AlienManager

class RegstrationMenu extends Menu( "Registration Form" ) {
  def menu(): Boolean = {
    var name = getValue( "Code Name provided to you?" );
    var planet = getValue( "Which Planet?" );
    var blood = getValue( "Color of Blood?" );
    var antennas = getValue( "Number of Antennas?" );
    var hands = getValue( "Number of Hands?" );
    var legs = getValue( "Number of Legs?" );

    var alien = new Alien( name,
      blood,
      antennas,
      hands,
      legs,
      planet );

    AlienManager.addAlien( alien );

    var shouldExport = getValue( "Do you want to export the data? (y/Y)" );

    if ( shouldExport.equalsIgnoreCase( "y" ) ) {
      (new FormatMenu(alien)).show()
    }

    return false;
  }
}