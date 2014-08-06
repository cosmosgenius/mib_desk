package mib_desk.formats

import mib_desk.bean.Alien
import com.itextpdf.text.Document
import com.itextpdf.text.pdf.PdfWriter
import java.io.FileOutputStream
import com.itextpdf.text.Paragraph

class PDFFormat extends Format( "PDF" ) {
  def save( txt: String, filename: String ): Boolean = {

    var document = new Document();
    PdfWriter.getInstance( document, new FileOutputStream( filename ) );

    document.open();
    document.add( new Paragraph( txt ) );
    document.close();
    return true;
  }
}