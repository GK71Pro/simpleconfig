package com.gkaraffa.simpleconfig;

import java.util.List;

import org.apache.commons.configuration.XMLConfiguration;

public class SimpleXMLReader {

	private XMLConfiguration xmlConfig = null;

	public SimpleXMLReader() {
	}

	public SimpleXMLReader(XMLConfiguration xmlConfig) {
		this.xmlConfig = xmlConfig;
	}

	public String getParameter(String fieldName) {
		return xmlConfig.getString(fieldName);
	}

	public List<Object> getMultiParameter(String fieldName) {
		return xmlConfig.getList(fieldName);
	}
}
