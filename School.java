/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.School#getSchoolname <em>Schoolname</em>}</li>
 *   <li>{@link urbanPlanning.School#getSchoolcapacity <em>Schoolcapacity</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>Schoolname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schoolname</em>' attribute.
	 * @see #setSchoolname(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getSchool_Schoolname()
	 * @model
	 * @generated
	 */
	String getSchoolname();

	/**
	 * Sets the value of the '{@link urbanPlanning.School#getSchoolname <em>Schoolname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schoolname</em>' attribute.
	 * @see #getSchoolname()
	 * @generated
	 */
	void setSchoolname(String value);

	/**
	 * Returns the value of the '<em><b>Schoolcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schoolcapacity</em>' attribute.
	 * @see #setSchoolcapacity(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSchool_Schoolcapacity()
	 * @model required="true"
	 * @generated
	 */
	int getSchoolcapacity();

	/**
	 * Sets the value of the '{@link urbanPlanning.School#getSchoolcapacity <em>Schoolcapacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schoolcapacity</em>' attribute.
	 * @see #getSchoolcapacity()
	 * @generated
	 */
	void setSchoolcapacity(int value);

} // School
