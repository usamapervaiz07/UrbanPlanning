/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.Hospital#getHospitalname <em>Hospitalname</em>}</li>
 *   <li>{@link urbanPlanning.Hospital#getHospitalcapacity <em>Hospitalcapacity</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getHospital()
 * @model
 * @generated
 */
public interface Hospital extends EObject {
	/**
	 * Returns the value of the '<em><b>Hospitalname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospitalname</em>' attribute.
	 * @see #setHospitalname(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getHospital_Hospitalname()
	 * @model
	 * @generated
	 */
	String getHospitalname();

	/**
	 * Sets the value of the '{@link urbanPlanning.Hospital#getHospitalname <em>Hospitalname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalname</em>' attribute.
	 * @see #getHospitalname()
	 * @generated
	 */
	void setHospitalname(String value);

	/**
	 * Returns the value of the '<em><b>Hospitalcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospitalcapacity</em>' attribute.
	 * @see #setHospitalcapacity(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHospital_Hospitalcapacity()
	 * @model required="true"
	 * @generated
	 */
	int getHospitalcapacity();

	/**
	 * Sets the value of the '{@link urbanPlanning.Hospital#getHospitalcapacity <em>Hospitalcapacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalcapacity</em>' attribute.
	 * @see #getHospitalcapacity()
	 * @generated
	 */
	void setHospitalcapacity(int value);

} // Hospital
