package com.gkaraffa.simpleconfig;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

public class SimpleXMLReaderFactory {
	public static SimpleXMLReader createSimpleXMLReader(String fileName) throws ConfigurationException {
		XMLConfiguration xmlConfig = new XMLConfiguration(fileName);
		SimpleXMLReader reader = new SimpleXMLReader(xmlConfig);
		
		return reader;
	}

}
