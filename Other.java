/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.Other#getOthername <em>Othername</em>}</li>
 *   <li>{@link urbanPlanning.Other#getOthercapacity <em>Othercapacity</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getOther()
 * @model
 * @generated
 */
public interface Other extends EObject {
	/**
	 * Returns the value of the '<em><b>Othername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othername</em>' attribute.
	 * @see #setOthername(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getOther_Othername()
	 * @model
	 * @generated
	 */
	String getOthername();

	/**
	 * Sets the value of the '{@link urbanPlanning.Other#getOthername <em>Othername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Othername</em>' attribute.
	 * @see #getOthername()
	 * @generated
	 */
	void setOthername(String value);

	/**
	 * Returns the value of the '<em><b>Othercapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othercapacity</em>' attribute.
	 * @see #setOthercapacity(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getOther_Othercapacity()
	 * @model required="true"
	 * @generated
	 */
	int getOthercapacity();

	/**
	 * Sets the value of the '{@link urbanPlanning.Other#getOthercapacity <em>Othercapacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Othercapacity</em>' attribute.
	 * @see #getOthercapacity()
	 * @generated
	 */
	void setOthercapacity(int value);

} // Other
