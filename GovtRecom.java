/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Govt Recom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.GovtRecom#getSchemePopuControl <em>Scheme Popu Control</em>}</li>
 *   <li>{@link urbanPlanning.GovtRecom#getSectorPopuControl <em>Sector Popu Control</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getGovtRecom()
 * @model
 * @generated
 */
public interface GovtRecom extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheme Popu Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme Popu Control</em>' attribute.
	 * @see #setSchemePopuControl(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getGovtRecom_SchemePopuControl()
	 * @model required="true"
	 * @generated
	 */
	int getSchemePopuControl();

	/**
	 * Sets the value of the '{@link urbanPlanning.GovtRecom#getSchemePopuControl <em>Scheme Popu Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme Popu Control</em>' attribute.
	 * @see #getSchemePopuControl()
	 * @generated
	 */
	void setSchemePopuControl(int value);

	/**
	 * Returns the value of the '<em><b>Sector Popu Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector Popu Control</em>' attribute.
	 * @see #setSectorPopuControl(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getGovtRecom_SectorPopuControl()
	 * @model required="true"
	 * @generated
	 */
	int getSectorPopuControl();

	/**
	 * Sets the value of the '{@link urbanPlanning.GovtRecom#getSectorPopuControl <em>Sector Popu Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sector Popu Control</em>' attribute.
	 * @see #getSectorPopuControl()
	 * @generated
	 */
	void setSectorPopuControl(int value);

} // GovtRecom
