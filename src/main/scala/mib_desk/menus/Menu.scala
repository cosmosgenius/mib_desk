package mib_desk.menus

abstract class Menu( head: String ) {
  
  def printHeading() = {
    println( "\n\n\t================================" );
    println( "\t" + head );
    println( "\t================================\n" );
  }

  def show() = {
    var condition = true;
    while(condition){
      printHeading();
      condition = menu();
    };
  }
  
  def getValue(question: String): String = {
    println( "\t" +  question );
    var value = io.StdIn.readLine( "\t>> ", null );
    return value;
  }

  def menu(): Boolean;
}