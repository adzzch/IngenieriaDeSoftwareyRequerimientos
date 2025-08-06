public class Reader {
    private Converter converter;
    //Metodo
    public Reader(Converter converter){
        this.converter = converter;
    }
    //Metodo
    public void parseInput(String element){

        switch(element){
            case "LINEA":
                converter.makeLine();
                break;
            case "PARRAFO":
                converter.makeParagraph();
                break;
            case "TABLA":
                converter.makeTable();
                break;
            default:
                System.out.println("Opción no valida");
            }
            }  
}