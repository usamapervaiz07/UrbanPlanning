/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Park</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.Park#getParkname <em>Parkname</em>}</li>
 *   <li>{@link urbanPlanning.Park#getParkcapacity <em>Parkcapacity</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getPark()
 * @model
 * @generated
 */
public interface Park extends EObject {
	/**
	 * Returns the value of the '<em><b>Parkname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parkname</em>' attribute.
	 * @see #setParkname(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getPark_Parkname()
	 * @model
	 * @generated
	 */
	String getParkname();

	/**
	 * Sets the value of the '{@link urbanPlanning.Park#getParkname <em>Parkname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parkname</em>' attribute.
	 * @see #getParkname()
	 * @generated
	 */
	void setParkname(String value);

	/**
	 * Returns the value of the '<em><b>Parkcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parkcapacity</em>' attribute.
	 * @see #setParkcapacity(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getPark_Parkcapacity()
	 * @model required="true"
	 * @generated
	 */
	int getParkcapacity();

	/**
	 * Sets the value of the '{@link urbanPlanning.Park#getParkcapacity <em>Parkcapacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parkcapacity</em>' attribute.
	 * @see #getParkcapacity()
	 * @generated
	 */
	void setParkcapacity(int value);

} // Park
