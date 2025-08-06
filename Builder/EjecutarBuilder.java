public class EjecutarBuilder {
    public static void main(String[] args) {
        
        Converter objConvASCII = new ASCIIConverter();
        Converter objConvPS = new PostScriptConverter();
        Converter objConvPDF = new PDFConverter();

        Reader ObjLector1 = new Reader(objConvASCII);
        ObjLector1.parseInput("LINEA");
        ObjLector1.parseInput("PARRAFO");

        Reader ObjLector2 = new Reader(objConvPDF);
        ObjLector2.parseInput("LINEA");
        ObjLector2.parseInput("PARRAFO");

        Reader ObjLector3 = new Reader(objConvPS);
        ObjLector3.parseInput("LINEA");
        ObjLector3.parseInput("PARRAFO");
    }   
}