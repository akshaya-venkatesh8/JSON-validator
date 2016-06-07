/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.akshayavenkatesh8;

import com.github.fge.jsonschema.exceptions.ProcessingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author akshaya
 */
public class JSONParsing {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws org.json.simple.parser.ParseException
     * @throws com.github.fge.jsonschema.exceptions.ProcessingException
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, ProcessingException {
        // TODO code application logic here
        
        Address ad = new Address();
        File jsonAddress = new File ("address.json");
        File jsonSchema = new File ("schema.json");
        if (ValidationUtils.isJsonValid(jsonSchema, jsonAddress))
        {
        FileReader jsonfile = new FileReader("address.json");
        JSONParser thisparser=new JSONParser();
        JSONObject jsonObject = (JSONObject) thisparser.parse(jsonfile);            
        JSONObject addressobj = (JSONObject) jsonObject.get("address");
     ad.name=(String)addressobj.get("name");
     ad.streetNumber=(String)addressobj.get("streetnumber");
     ad.streetName=(String)addressobj.get("streetname");
     ad.secondaryAddress=(String)addressobj.get("secondary address");
     ad.city=(String)addressobj.get("city");
     ad.stateCode=(String)addressobj.get("statecode");
     ad.zipCode=(String)addressobj.get("zipcode");
         System.out.println(ad);
        }
        else
        {
            System.out.println("The JSON document fails to validate!");
        }
        }   
     
        }
    
    
