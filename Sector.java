/**
 */
package urbanPlanning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.Sector#getSectorname <em>Sectorname</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getSectorpopu <em>Sectorpopu</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofhouses <em>Nofhouses</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofroads <em>Nofroads</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofschools <em>Nofschools</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofparks <em>Nofparks</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofmosques <em>Nofmosques</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofhospitals <em>Nofhospitals</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofgraveyards <em>Nofgraveyards</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getNofothers <em>Nofothers</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getGovtrecom <em>Govtrecom</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getPark <em>Park</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getMosque <em>Mosque</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getSchool <em>School</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getHospital <em>Hospital</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getGraveyard <em>Graveyard</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getOther <em>Other</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getHouse <em>House</em>}</li>
 *   <li>{@link urbanPlanning.Sector#getRoad <em>Road</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getSector()
 * @model
 * @generated
 */
public interface Sector extends EObject {
	/**
	 * Returns the value of the '<em><b>Sectorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectorname</em>' attribute.
	 * @see #setSectorname(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Sectorname()
	 * @model
	 * @generated
	 */
	String getSectorname();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getSectorname <em>Sectorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sectorname</em>' attribute.
	 * @see #getSectorname()
	 * @generated
	 */
	void setSectorname(String value);

	/**
	 * Returns the value of the '<em><b>Sectorpopu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectorpopu</em>' attribute.
	 * @see #setSectorpopu(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Sectorpopu()
	 * @model required="true"
	 * @generated
	 */
	int getSectorpopu();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getSectorpopu <em>Sectorpopu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sectorpopu</em>' attribute.
	 * @see #getSectorpopu()
	 * @generated
	 */
	void setSectorpopu(int value);

	/**
	 * Returns the value of the '<em><b>Nofhouses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofhouses</em>' attribute.
	 * @see #setNofhouses(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofhouses()
	 * @model required="true"
	 * @generated
	 */
	int getNofhouses();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofhouses <em>Nofhouses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofhouses</em>' attribute.
	 * @see #getNofhouses()
	 * @generated
	 */
	void setNofhouses(int value);

	/**
	 * Returns the value of the '<em><b>Nofroads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofroads</em>' attribute.
	 * @see #setNofroads(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofroads()
	 * @model required="true"
	 * @generated
	 */
	int getNofroads();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofroads <em>Nofroads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofroads</em>' attribute.
	 * @see #getNofroads()
	 * @generated
	 */
	void setNofroads(int value);

	/**
	 * Returns the value of the '<em><b>Nofschools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofschools</em>' attribute.
	 * @see #setNofschools(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofschools()
	 * @model required="true"
	 * @generated
	 */
	int getNofschools();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofschools <em>Nofschools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofschools</em>' attribute.
	 * @see #getNofschools()
	 * @generated
	 */
	void setNofschools(int value);

	/**
	 * Returns the value of the '<em><b>Nofparks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofparks</em>' attribute.
	 * @see #setNofparks(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofparks()
	 * @model required="true"
	 * @generated
	 */
	int getNofparks();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofparks <em>Nofparks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofparks</em>' attribute.
	 * @see #getNofparks()
	 * @generated
	 */
	void setNofparks(int value);

	/**
	 * Returns the value of the '<em><b>Nofmosques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofmosques</em>' attribute.
	 * @see #setNofmosques(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofmosques()
	 * @model required="true"
	 * @generated
	 */
	int getNofmosques();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofmosques <em>Nofmosques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofmosques</em>' attribute.
	 * @see #getNofmosques()
	 * @generated
	 */
	void setNofmosques(int value);

	/**
	 * Returns the value of the '<em><b>Nofhospitals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofhospitals</em>' attribute.
	 * @see #setNofhospitals(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofhospitals()
	 * @model required="true"
	 * @generated
	 */
	int getNofhospitals();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofhospitals <em>Nofhospitals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofhospitals</em>' attribute.
	 * @see #getNofhospitals()
	 * @generated
	 */
	void setNofhospitals(int value);

	/**
	 * Returns the value of the '<em><b>Nofgraveyards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofgraveyards</em>' attribute.
	 * @see #setNofgraveyards(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofgraveyards()
	 * @model required="true"
	 * @generated
	 */
	int getNofgraveyards();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofgraveyards <em>Nofgraveyards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofgraveyards</em>' attribute.
	 * @see #getNofgraveyards()
	 * @generated
	 */
	void setNofgraveyards(int value);

	/**
	 * Returns the value of the '<em><b>Nofothers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nofothers</em>' attribute.
	 * @see #setNofothers(int)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Nofothers()
	 * @model required="true"
	 * @generated
	 */
	int getNofothers();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getNofothers <em>Nofothers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nofothers</em>' attribute.
	 * @see #getNofothers()
	 * @generated
	 */
	void setNofothers(int value);

	/**
	 * Returns the value of the '<em><b>Govtrecom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Govtrecom</em>' reference.
	 * @see #setGovtrecom(GovtRecom)
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Govtrecom()
	 * @model required="true"
	 * @generated
	 */
	GovtRecom getGovtrecom();

	/**
	 * Sets the value of the '{@link urbanPlanning.Sector#getGovtrecom <em>Govtrecom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Govtrecom</em>' reference.
	 * @see #getGovtrecom()
	 * @generated
	 */
	void setGovtrecom(GovtRecom value);

	/**
	 * Returns the value of the '<em><b>Park</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Park}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Park</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Park()
	 * @model containment="true"
	 * @generated
	 */
	EList<Park> getPark();

	/**
	 * Returns the value of the '<em><b>Mosque</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Mosque}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mosque</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Mosque()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mosque> getMosque();

	/**
	 * Returns the value of the '<em><b>School</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.School}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_School()
	 * @model containment="true"
	 * @generated
	 */
	EList<School> getSchool();

	/**
	 * Returns the value of the '<em><b>Hospital</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Hospital}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Hospital()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hospital> getHospital();

	/**
	 * Returns the value of the '<em><b>Graveyard</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Graveyard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graveyard</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Graveyard()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graveyard> getGraveyard();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Other}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Other()
	 * @model containment="true"
	 * @generated
	 */
	EList<Other> getOther();

	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.House}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_House()
	 * @model containment="true"
	 * @generated
	 */
	EList<House> getHouse();

	/**
	 * Returns the value of the '<em><b>Road</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getSector_Road()
	 * @model containment="true"
	 * @generated
	 */
	EList<Road> getRoad();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean Comapre();

} // Sector
