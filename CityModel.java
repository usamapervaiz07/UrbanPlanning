/**
 */
package urbanPlanning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link urbanPlanning.CityModel#getCityname <em>Cityname</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getHousingscheme <em>Housingscheme</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getGovtrecom <em>Govtrecom</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getSector <em>Sector</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getSchool <em>School</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getPark <em>Park</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getMosque <em>Mosque</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getOther <em>Other</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getGraveyard <em>Graveyard</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getHospital <em>Hospital</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getHouse <em>House</em>}</li>
 *   <li>{@link urbanPlanning.CityModel#getRoad <em>Road</em>}</li>
 * </ul>
 *
 * @see urbanPlanning.UrbanPlanningPackage#getCityModel()
 * @model
 * @generated
 */
public interface CityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Cityname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cityname</em>' attribute.
	 * @see #setCityname(String)
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Cityname()
	 * @model
	 * @generated
	 */
	String getCityname();

	/**
	 * Sets the value of the '{@link urbanPlanning.CityModel#getCityname <em>Cityname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cityname</em>' attribute.
	 * @see #getCityname()
	 * @generated
	 */
	void setCityname(String value);

	/**
	 * Returns the value of the '<em><b>Housingscheme</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.HousingScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Housingscheme</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Housingscheme()
	 * @model containment="true"
	 * @generated
	 */
	EList<HousingScheme> getHousingscheme();

	/**
	 * Returns the value of the '<em><b>Govtrecom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Govtrecom</em>' containment reference.
	 * @see #setGovtrecom(GovtRecom)
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Govtrecom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GovtRecom getGovtrecom();

	/**
	 * Sets the value of the '{@link urbanPlanning.CityModel#getGovtrecom <em>Govtrecom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Govtrecom</em>' containment reference.
	 * @see #getGovtrecom()
	 * @generated
	 */
	void setGovtrecom(GovtRecom value);

	/**
	 * Returns the value of the '<em><b>Sector</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Sector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sector</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Sector()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sector> getSector();

	/**
	 * Returns the value of the '<em><b>School</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.School}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_School()
	 * @model containment="true"
	 * @generated
	 */
	EList<School> getSchool();

	/**
	 * Returns the value of the '<em><b>Park</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Park}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Park</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Park()
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
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Mosque()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mosque> getMosque();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Other}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Other()
	 * @model containment="true"
	 * @generated
	 */
	EList<Other> getOther();

	/**
	 * Returns the value of the '<em><b>Graveyard</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Graveyard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graveyard</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Graveyard()
	 * @model containment="true"
	 * @generated
	 */
	EList<Graveyard> getGraveyard();

	/**
	 * Returns the value of the '<em><b>Hospital</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.Hospital}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Hospital()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hospital> getHospital();

	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference list.
	 * The list contents are of type {@link urbanPlanning.House}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference list.
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_House()
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
	 * @see urbanPlanning.UrbanPlanningPackage#getCityModel_Road()
	 * @model containment="true"
	 * @generated
	 */
	EList<Road> getRoad();

} // CityModel
