/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graveyard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.Graveyard#getGraveyardname <em>Graveyardname</em>}</li>
 *   <li>{@link urbanPlanning.Graveyard#getGraveyardcapacity <em>Graveyardcapacity</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getGraveyard()
 * @model
 * @generated
 */
public interface Graveyard extends EObject {
	/**
	 * Returns the value of the '<em><b>Graveyardname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graveyardname</em>' attribute.
	 * @see #setGraveyardname(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getGraveyard_Graveyardname()
	 * @model
	 * @generated
	 */
	String getGraveyardname();

	/**
	 * Sets the value of the '{@link urbanPlanning.Graveyard#getGraveyardname <em>Graveyardname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graveyardname</em>' attribute.
	 * @see #getGraveyardname()
	 * @generated
	 */
	void setGraveyardname(String value);

	/**
	 * Returns the value of the '<em><b>Graveyardcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graveyardcapacity</em>' attribute.
	 * @see #setGraveyardcapacity(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getGraveyard_Graveyardcapacity()
	 * @model required="true"
	 * @generated
	 */
	int getGraveyardcapacity();

	/**
	 * Sets the value of the '{@link urbanPlanning.Graveyard#getGraveyardcapacity <em>Graveyardcapacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graveyardcapacity</em>' attribute.
	 * @see #getGraveyardcapacity()
	 * @generated
	 */
	void setGraveyardcapacity(int value);

} // Graveyard
