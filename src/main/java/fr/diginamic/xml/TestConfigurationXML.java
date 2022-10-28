package fr.diginamic.xml;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) {
		Configurations configs = new Configurations();
		try {
			XMLConfiguration config = configs.xml("config.xml");
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

}
