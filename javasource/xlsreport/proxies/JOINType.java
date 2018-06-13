// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public enum JOINType
{
	LEFT(new String[][] { new String[] { "en_US", "LEFT JOIN" }, new String[] { "nl_NL", "LEFT JOIN" } }),
	INNER(new String[][] { new String[] { "en_US", "INNER JOIN" }, new String[] { "nl_NL", "INNER JOIN" } }),
	RIGHT(new String[][] { new String[] { "en_US", "RIGHT JOIN" }, new String[] { "nl_NL", "RIGHT JOIN" } }),
	OUTER(new String[][] { new String[] { "en_US", "OUTER JOIN" }, new String[] { "nl_NL", "OUTER JOIN" } }),
	FULL(new String[][] { new String[] { "en_US", "FULL JOIN" }, new String[] { "nl_NL", "FULL JOIN" } });

	private java.util.Map<String,String> captions;

	private JOINType(String[][] captionStrings)
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
