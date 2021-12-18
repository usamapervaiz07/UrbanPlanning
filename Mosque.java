/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mosque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.Mosque#getMosquename <em>Mosquename</em>}</li>
 *   <li>{@link urbanPlanning.Mosque#getMosquecapacity <em>Mosquecapacity</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getMosque()
 * @model
 * @generated
 */
public interface Mosque extends EObject {
	/**
	 * Returns the value of the '<em><b>Mosquename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mosquename</em>' attribute.
	 * @see #setMosquename(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getMosque_Mosquename()
	 * @model
	 * @generated
	 */
	String getMosquename();

	/**
	 * Sets the value of the '{@link urbanPlanning.Mosque#getMosquename <em>Mosquename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mosquename</em>' attribute.
	 * @see #getMosquename()
	 * @generated
	 */
	void setMosquename(String value);

	/**
	 * Returns the value of the '<em><b>Mosquecapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mosquecapacity</em>' attribute.
	 * @see #setMosquecapacity(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getMosque_Mosquecapacity()
	 * @model required="true"
	 * @generated
	 */
	int getMosquecapacity();

	/**
	 * Sets the value of the '{@link urbanPlanning.Mosque#getMosquecapacity <em>Mosquecapacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mosquecapacity</em>' attribute.
	 * @see #getMosquecapacity()
	 * @generated
	 */
	void setMosquecapacity(int value);

} // Mosque
