// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum CSVSeparator
{
	Comma(new String[][] { new String[] { "en_US", "Comma" }, new String[] { "nl_NL", "Komma" } }),
	Semicolon(new String[][] { new String[] { "en_US", "Semicolon" }, new String[] { "nl_NL", "Puntkomma" } }),
	Tab(new String[][] { new String[] { "en_US", "Tab" }, new String[] { "nl_NL", "Tab" } });

	private java.util.Map<String,String> captions;

	private CSVSeparator(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
