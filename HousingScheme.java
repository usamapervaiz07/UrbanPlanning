/**
 */
package urbanPlanning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Housing Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.HousingScheme#getSchemename <em>Schemename</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getSchemepopu <em>Schemepopu</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofhouses <em>Totalnofhouses</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofroads <em>Totalnofroads</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofschools <em>Totalnofschools</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofparks <em>Totalnofparks</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofmosques <em>Totalnofmosques</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofhospitals <em>Totalnofhospitals</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofgraveyards <em>Totalnofgraveyards</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofothers <em>Totalnofothers</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getTotalnofsectors <em>Totalnofsectors</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getSector <em>Sector</em>}</li>
 *   <li>{@link urbanPlanning.HousingScheme#getGovtrecom <em>Govtrecom</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme()
 * @model
 * @generated
 */
public interface HousingScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemename</em>' attribute.
	 * @see #setSchemename(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Schemename()
	 * @model
	 * @generated
	 */
	String getSchemename();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getSchemename <em>Schemename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemename</em>' attribute.
	 * @see #getSchemename()
	 * @generated
	 */
	void setSchemename(String value);

	/**
	 * Returns the value of the '<em><b>Schemepopu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemepopu</em>' attribute.
	 * @see #setSchemepopu(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Schemepopu()
	 * @model required="true"
	 * @generated
	 */
	int getSchemepopu();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getSchemepopu <em>Schemepopu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemepopu</em>' attribute.
	 * @see #getSchemepopu()
	 * @generated
	 */
	void setSchemepopu(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofhouses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofhouses</em>' attribute.
	 * @see #setTotalnofhouses(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofhouses()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofhouses();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofhouses <em>Totalnofhouses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofhouses</em>' attribute.
	 * @see #getTotalnofhouses()
	 * @generated
	 */
	void setTotalnofhouses(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofroads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofroads</em>' attribute.
	 * @see #setTotalnofroads(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofroads()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofroads();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofroads <em>Totalnofroads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofroads</em>' attribute.
	 * @see #getTotalnofroads()
	 * @generated
	 */
	void setTotalnofroads(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofschools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofschools</em>' attribute.
	 * @see #setTotalnofschools(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofschools()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofschools();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofschools <em>Totalnofschools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofschools</em>' attribute.
	 * @see #getTotalnofschools()
	 * @generated
	 */
	void setTotalnofschools(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofparks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofparks</em>' attribute.
	 * @see #setTotalnofparks(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofparks()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofparks();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofparks <em>Totalnofparks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofparks</em>' attribute.
	 * @see #getTotalnofparks()
	 * @generated
	 */
	void setTotalnofparks(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofmosques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofmosques</em>' attribute.
	 * @see #setTotalnofmosques(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofmosques()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofmosques();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofmosques <em>Totalnofmosques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofmosques</em>' attribute.
	 * @see #getTotalnofmosques()
	 * @generated
	 */
	void setTotalnofmosques(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofhospitals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofhospitals</em>' attribute.
	 * @see #setTotalnofhospitals(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofhospitals()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofhospitals();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofhospitals <em>Totalnofhospitals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofhospitals</em>' attribute.
	 * @see #getTotalnofhospitals()
	 * @generated
	 */
	void setTotalnofhospitals(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofgraveyards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofgraveyards</em>' attribute.
	 * @see #setTotalnofgraveyards(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofgraveyards()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofgraveyards();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofgraveyards <em>Totalnofgraveyards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofgraveyards</em>' attribute.
	 * @see #getTotalnofgraveyards()
	 * @generated
	 */
	void setTotalnofgraveyards(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofothers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofothers</em>' attribute.
	 * @see #setTotalnofothers(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofothers()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofothers();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofothers <em>Totalnofothers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofothers</em>' attribute.
	 * @see #getTotalnofothers()
	 * @generated
	 */
	void setTotalnofothers(int value);

	/**
	 * Returns the value of the '<em><b>Totalnofsectors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totalnofsectors</em>' attribute.
	 * @see #setTotalnofsectors(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Totalnofsectors()
	 * @model required="true"
	 * @generated
	 */
	int getTotalnofsectors();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getTotalnofsectors <em>Totalnofsectors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totalnofsectors</em>' attribute.
	 * @see #getTotalnofsectors()
	 * @generated
	 */
	void setTotalnofsectors(int value);

	/**
	 * Returns the value of the '<em><b>Sector</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Sector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Sector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sector> getSector();

	/**
	 * Returns the value of the '<em><b>Govtrecom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Govtrecom</em>' reference.
	 * @see #setGovtrecom(GovtRecom)
	 * @see urbanPlanning.UrbanPlanningPackage#getHousingScheme_Govtrecom()
	 * @model required="true"
	 * @generated
	 */
	GovtRecom getGovtrecom();

	/**
	 * Sets the value of the '{@link urbanPlanning.HousingScheme#getGovtrecom <em>Govtrecom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Govtrecom</em>' reference.
	 * @see #getGovtrecom()
	 * @generated
	 */
	void setGovtrecom(GovtRecom value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Compare();

} // HousingScheme
