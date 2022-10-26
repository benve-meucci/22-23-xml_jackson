package com.example;
import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        Classe c = new Classe("pippo");
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File("test.xml"), c);

        Classe c2 = xmlMapper.readValue(new File("test.xml"), Classe.class);
        System.out.println(c2.getNome());
    }


}
