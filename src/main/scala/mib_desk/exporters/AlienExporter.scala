package mib_desk.exporters

import mib_desk.formats.Format
import mib_desk.bean.Alien

/*
 * The is the exporter class which is the between the data and the formats
 * 
 * AlienExporter defines the format in which the alien data is send to the format object
 * 
 * export function accepts one parameter of type <Format> to which the data to be saved is send
 */

class AlienExporter( alien: Alien ) {
  def export( format: Format ) = {
    var str: StringBuilder = new StringBuilder;

    str.append( "CodeName : ", alien.codeName );
    str.append( "Blood Color : ", alien.bloodColor );
    str.append( "No of Antennas : ", alien.noOfAntennas );
    str.append( "No of Hands : ", alien.noOfHands );
    str.append( "No of Legs : ", alien.noOfLegs );
    str.append( "Home Planet : ", alien.planet );
    
    format.save(str.mkString, "alien." + format.formatType );
  }
}