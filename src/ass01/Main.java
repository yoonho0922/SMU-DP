package ass01;

import ass01.docConverter.DocxDocCnverter;
import ass01.docConverter.OdtDocConverter;
import ass01.docConverter.PdfDocConverter;

public class Main {
    public static void main(String[] args) {
        WordProcessor wp = new WordProcessor("new doc");
        wp.setSpellChecker(new EngSpellChecker());
        wp.addDocConverter(new DocxDocCnverter());
        wp.addDocConverter(new PdfDocConverter());
        wp.addDocConverter(new OdtDocConverter());
        wp.checkSpelling();
        wp.convertDocTo("odt");
        wp.convertDocTo("pdf");
        wp.convertDocTo("docx");
        wp.convertDocTo("wps");
    }
}
