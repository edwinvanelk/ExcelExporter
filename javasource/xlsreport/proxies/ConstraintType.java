// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum ConstraintType
{
	Contains(new String[][] { new String[] { "en_US", "Contains" }, new String[] { "nl_NL", "Bevat" } }),
	StartWith(new String[][] { new String[] { "en_US", "Start with" }, new String[] { "nl_NL", "Start met" } }),
	Greater(new String[][] { new String[] { "en_US", "Greater" }, new String[] { "nl_NL", "Groter dan" } }),
	GreaterEqual(new String[][] { new String[] { "en_US", "Greater and equal" }, new String[] { "nl_NL", "Groter en gelijk aan" } }),
	Equal(new String[][] { new String[] { "en_US", "Equal" }, new String[] { "nl_NL", "Gelijk aan" } }),
	NotEqual(new String[][] { new String[] { "en_US", "NotEqual" }, new String[] { "nl_NL", "Niet gelijk aan" } }),
	SmallerEqual(new String[][] { new String[] { "en_US", "Smaller and equal" }, new String[] { "nl_NL", "Kleiner en gelijk aan" } }),
	Smaller(new String[][] { new String[] { "en_US", "Smaller" }, new String[] { "nl_NL", "Kleiner dan" } }),
	_empty(new String[][] { new String[] { "en_US", "Empty" }, new String[] { "nl_NL", "Leeg" } }),
	NotEmpty(new String[][] { new String[] { "en_US", "Not empty" }, new String[] { "nl_NL", "Niet leeg" } });

	private java.util.Map<String,String> captions;

	private ConstraintType(String[][] captionStrings)
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
