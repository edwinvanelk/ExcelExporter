// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package excelimporter.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.webui.FeedbackHelper;

/**
 * 
 */
public class RefreshClass extends CustomJavaAction<Boolean>
{
	private String objectType;

	public RefreshClass(IContext context, String objectType)
	{
		super(context);
		this.objectType = objectType;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		FeedbackHelper.addRefreshClass(getContext(), this.objectType);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "RefreshClass";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
