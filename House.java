/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.House#getHousenbr <em>Housenbr</em>}</li>
 *   <li>{@link urbanPlanning.House#getStreetnbr <em>Streetnbr</em>}</li>
 *   <li>{@link urbanPlanning.House#getNofpeople <em>Nofpeople</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Housenbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housenbr</em>' attribute.
	 * @see #setHousenbr(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHouse_Housenbr()
	 * @model required="true"
	 * @generated
	 */
	int getHousenbr();

	/**
	 * Sets the value of the '{@link urbanPlanning.House#getHousenbr <em>Housenbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Housenbr</em>' attribute.
	 * @see #getHousenbr()
	 * @generated
	 */
	void setHousenbr(int value);

	/**
	 * Returns the value of the '<em><b>Streetnbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streetnbr</em>' attribute.
	 * @see #setStreetnbr(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHouse_Streetnbr()
	 * @model required="true"
	 * @generated
	 */
	int getStreetnbr();

	/**
	 * Sets the value of the '{@link urbanPlanning.House#getStreetnbr <em>Streetnbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streetnbr</em>' attribute.
	 * @see #getStreetnbr()
	 * @generated
	 */
	void setStreetnbr(int value);

	/**
	 * Returns the value of the '<em><b>Nofpeople</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofpeople</em>' attribute.
	 * @see #setNofpeople(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getHouse_Nofpeople()
	 * @model default="5" required="true"
	 * @generated
	 */
	int getNofpeople();

	/**
	 * Sets the value of the '{@link urbanPlanning.House#getNofpeople <em>Nofpeople</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofpeople</em>' attribute.
	 * @see #getNofpeople()
	 * @generated
	 */
	void setNofpeople(int value);

} // House
