package com.org;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.business.Person;
import org.apache.commons.lang3.StringUtils;


/**
 * Hello world!
 *
 */
public class App
{


    public static void main( String[] args )
    {
        Person person= new Person("jose","vale");
        System.out.println(convertToJson(person));

        String fistnamePerson = person.getFirstName();
        System.out.println(capitalizeString(fistnamePerson));

    }

    public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
        return StringUtils.capitalize(str);
    }
}
