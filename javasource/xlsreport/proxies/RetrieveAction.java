// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum RetrieveAction
{
	Attribute(new String[][] { new String[] { "en_US", "Attribute" }, new String[] { "nl_NL", "Attribuut" } }),
	Reference(new String[][] { new String[] { "en_US", "Reference" }, new String[] { "nl_NL", "Referentie" } });

	private java.util.Map<String,String> captions;

	private RetrieveAction(String[][] captionStrings)
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
