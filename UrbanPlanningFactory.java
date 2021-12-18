/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see urbanPlanning.UrbanPlanningPackage
 * @generated
 */
public interface UrbanPlanningFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UrbanPlanningFactory eINSTANCE = urbanPlanning.impl.UrbanPlanningFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>City Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City Model</em>'.
	 * @generated
	 */
	CityModel createCityModel();

	/**
	 * Returns a new object of class '<em>Housing Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Housing Scheme</em>'.
	 * @generated
	 */
	HousingScheme createHousingScheme();

	/**
	 * Returns a new object of class '<em>Govt Recom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Govt Recom</em>'.
	 * @generated
	 */
	GovtRecom createGovtRecom();

	/**
	 * Returns a new object of class '<em>Sector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sector</em>'.
	 * @generated
	 */
	Sector createSector();

	/**
	 * Returns a new object of class '<em>Park</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Park</em>'.
	 * @generated
	 */
	Park createPark();

	/**
	 * Returns a new object of class '<em>Mosque</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mosque</em>'.
	 * @generated
	 */
	Mosque createMosque();

	/**
	 * Returns a new object of class '<em>School</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>School</em>'.
	 * @generated
	 */
	School createSchool();

	/**
	 * Returns a new object of class '<em>Hospital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital</em>'.
	 * @generated
	 */
	Hospital createHospital();

	/**
	 * Returns a new object of class '<em>Graveyard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graveyard</em>'.
	 * @generated
	 */
	Graveyard createGraveyard();

	/**
	 * Returns a new object of class '<em>Other</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other</em>'.
	 * @generated
	 */
	Other createOther();

	/**
	 * Returns a new object of class '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House</em>'.
	 * @generated
	 */
	House createHouse();

	/**
	 * Returns a new object of class '<em>Street Road</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Street Road</em>'.
	 * @generated
	 */
	StreetRoad createStreetRoad();

	/**
	 * Returns a new object of class '<em>Main Road</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Road</em>'.
	 * @generated
	 */
	MainRoad createMainRoad();

	/**
	 * Returns a new object of class '<em>Service Road</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Road</em>'.
	 * @generated
	 */
	ServiceRoad createServiceRoad();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UrbanPlanningPackage getUrbanPlanningPackage();

} //UrbanPlanningFactory
