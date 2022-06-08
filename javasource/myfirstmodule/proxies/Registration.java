// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Registration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject registrationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Registration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Number("Number"),
		Date("Date"),
		Attended("Attended"),
		Registration_Trainees("MyFirstModule.Registration_Trainees"),
		Registration_TrainingEvent("MyFirstModule.Registration_TrainingEvent");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Registration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Registration"));
	}

	protected Registration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject registrationMendixObject)
	{
		if (registrationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Registration", registrationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Registration");

		this.registrationMendixObject = registrationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Registration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Registration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Registration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Registration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Registration(context, mendixObject);
	}

	public static myfirstmodule.proxies.Registration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Registration.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Registration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Registration> result = new java.util.ArrayList<myfirstmodule.proxies.Registration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Registration" + xpathConstraint))
			result.add(myfirstmodule.proxies.Registration.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Number
	 */
	public final java.lang.Long getNumber()
	{
		return getNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of Number
	 */
	public final java.lang.Long getNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Number.toString());
	}

	/**
	 * Set value of Number
	 * @param number
	 */
	public final void setNumber(java.lang.Long number)
	{
		setNumber(getContext(), number);
	}

	/**
	 * Set value of Number
	 * @param context
	 * @param number
	 */
	public final void setNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long number)
	{
		getMendixObject().setValue(context, MemberNames.Number.toString(), number);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return value of Attended
	 */
	public final java.lang.Boolean getAttended()
	{
		return getAttended(getContext());
	}

	/**
	 * @param context
	 * @return value of Attended
	 */
	public final java.lang.Boolean getAttended(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Attended.toString());
	}

	/**
	 * Set value of Attended
	 * @param attended
	 */
	public final void setAttended(java.lang.Boolean attended)
	{
		setAttended(getContext(), attended);
	}

	/**
	 * Set value of Attended
	 * @param context
	 * @param attended
	 */
	public final void setAttended(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean attended)
	{
		getMendixObject().setValue(context, MemberNames.Attended.toString(), attended);
	}

	/**
	 * @return value of Registration_Trainees
	 */
	public final myfirstmodule.proxies.Trainees getRegistration_Trainees() throws com.mendix.core.CoreException
	{
		return getRegistration_Trainees(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_Trainees
	 */
	public final myfirstmodule.proxies.Trainees getRegistration_Trainees(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Trainees result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_Trainees.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Trainees.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Registration_Trainees
	 * @param registration_trainees
	 */
	public final void setRegistration_Trainees(myfirstmodule.proxies.Trainees registration_trainees)
	{
		setRegistration_Trainees(getContext(), registration_trainees);
	}

	/**
	 * Set value of Registration_Trainees
	 * @param context
	 * @param registration_trainees
	 */
	public final void setRegistration_Trainees(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Trainees registration_trainees)
	{
		if (registration_trainees == null)
			getMendixObject().setValue(context, MemberNames.Registration_Trainees.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Registration_Trainees.toString(), registration_trainees.getMendixObject().getId());
	}

	/**
	 * @return value of Registration_TrainingEvent
	 */
	public final myfirstmodule.proxies.TrainingEvent getRegistration_TrainingEvent() throws com.mendix.core.CoreException
	{
		return getRegistration_TrainingEvent(getContext());
	}

	/**
	 * @param context
	 * @return value of Registration_TrainingEvent
	 */
	public final myfirstmodule.proxies.TrainingEvent getRegistration_TrainingEvent(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.TrainingEvent result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Registration_TrainingEvent.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.TrainingEvent.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Registration_TrainingEvent
	 * @param registration_trainingevent
	 */
	public final void setRegistration_TrainingEvent(myfirstmodule.proxies.TrainingEvent registration_trainingevent)
	{
		setRegistration_TrainingEvent(getContext(), registration_trainingevent);
	}

	/**
	 * Set value of Registration_TrainingEvent
	 * @param context
	 * @param registration_trainingevent
	 */
	public final void setRegistration_TrainingEvent(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TrainingEvent registration_trainingevent)
	{
		if (registration_trainingevent == null)
			getMendixObject().setValue(context, MemberNames.Registration_TrainingEvent.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Registration_TrainingEvent.toString(), registration_trainingevent.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return registrationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Registration that = (myfirstmodule.proxies.Registration) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Registration";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
