package com.me;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class Read {

    static final String GENDER = "Gender";
    static final String FIRSTNAME = "FirstName";
    static final String LASTNAME = "LastName";
    static final String RACE = "Race";
    static final String MINUTEPERMILE = "MinutePerMile";
    static final String TIME = "Time";
}
