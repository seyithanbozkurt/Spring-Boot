package Qualifer_PrimaryAnnotation;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfFileReader implements Reader{
    @Override
    public String readFile(){
        return "PDF read";
    }
}
