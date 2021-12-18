/**
 */
package urbanPlanning;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see urbanPlanning.UrbanPlanningFactory
 * @model kind="package"
 * @generated
 */
public interface UrbanPlanningPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "urbanPlanning";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/urbanPlanning";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "urbanPlanning";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UrbanPlanningPackage eINSTANCE = urbanPlanning.impl.UrbanPlanningPackageImpl.init();

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.CityModelImpl <em>City Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.CityModelImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getCityModel()
	 * @generated
	 */
	int CITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Cityname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__CITYNAME = 0;

	/**
	 * The feature id for the '<em><b>Housingscheme</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__HOUSINGSCHEME = 1;

	/**
	 * The feature id for the '<em><b>Govtrecom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__GOVTRECOM = 2;

	/**
	 * The feature id for the '<em><b>Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__SECTOR = 3;

	/**
	 * The feature id for the '<em><b>School</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__SCHOOL = 4;

	/**
	 * The feature id for the '<em><b>Park</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__PARK = 5;

	/**
	 * The feature id for the '<em><b>Mosque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__MOSQUE = 6;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__OTHER = 7;

	/**
	 * The feature id for the '<em><b>Graveyard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__GRAVEYARD = 8;

	/**
	 * The feature id for the '<em><b>Hospital</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__HOSPITAL = 9;

	/**
	 * The feature id for the '<em><b>House</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__HOUSE = 10;

	/**
	 * The feature id for the '<em><b>Road</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL__ROAD = 11;

	/**
	 * The number of structural features of the '<em>City Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>City Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.HousingSchemeImpl <em>Housing Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.HousingSchemeImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getHousingScheme()
	 * @generated
	 */
	int HOUSING_SCHEME = 1;

	/**
	 * The feature id for the '<em><b>Schemename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__SCHEMENAME = 0;

	/**
	 * The feature id for the '<em><b>Schemepopu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__SCHEMEPOPU = 1;

	/**
	 * The feature id for the '<em><b>Totalnofhouses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFHOUSES = 2;

	/**
	 * The feature id for the '<em><b>Totalnofroads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFROADS = 3;

	/**
	 * The feature id for the '<em><b>Totalnofschools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFSCHOOLS = 4;

	/**
	 * The feature id for the '<em><b>Totalnofparks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFPARKS = 5;

	/**
	 * The feature id for the '<em><b>Totalnofmosques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFMOSQUES = 6;

	/**
	 * The feature id for the '<em><b>Totalnofhospitals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFHOSPITALS = 7;

	/**
	 * The feature id for the '<em><b>Totalnofgraveyards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFGRAVEYARDS = 8;

	/**
	 * The feature id for the '<em><b>Totalnofothers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFOTHERS = 9;

	/**
	 * The feature id for the '<em><b>Totalnofsectors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__TOTALNOFSECTORS = 10;

	/**
	 * The feature id for the '<em><b>Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__SECTOR = 11;

	/**
	 * The feature id for the '<em><b>Govtrecom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME__GOVTRECOM = 12;

	/**
	 * The number of structural features of the '<em>Housing Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME___COMPARE = 0;

	/**
	 * The number of operations of the '<em>Housing Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSING_SCHEME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.GovtRecomImpl <em>Govt Recom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.GovtRecomImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getGovtRecom()
	 * @generated
	 */
	int GOVT_RECOM = 2;

	/**
	 * The feature id for the '<em><b>Scheme Popu Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_RECOM__SCHEME_POPU_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Sector Popu Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_RECOM__SECTOR_POPU_CONTROL = 1;

	/**
	 * The number of structural features of the '<em>Govt Recom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_RECOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Govt Recom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_RECOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.SectorImpl <em>Sector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.SectorImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getSector()
	 * @generated
	 */
	int SECTOR = 3;

	/**
	 * The feature id for the '<em><b>Sectorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__SECTORNAME = 0;

	/**
	 * The feature id for the '<em><b>Sectorpopu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__SECTORPOPU = 1;

	/**
	 * The feature id for the '<em><b>Nofhouses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFHOUSES = 2;

	/**
	 * The feature id for the '<em><b>Nofroads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFROADS = 3;

	/**
	 * The feature id for the '<em><b>Nofschools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFSCHOOLS = 4;

	/**
	 * The feature id for the '<em><b>Nofparks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFPARKS = 5;

	/**
	 * The feature id for the '<em><b>Nofmosques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFMOSQUES = 6;

	/**
	 * The feature id for the '<em><b>Nofhospitals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFHOSPITALS = 7;

	/**
	 * The feature id for the '<em><b>Nofgraveyards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFGRAVEYARDS = 8;

	/**
	 * The feature id for the '<em><b>Nofothers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__NOFOTHERS = 9;

	/**
	 * The feature id for the '<em><b>Govtrecom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__GOVTRECOM = 10;

	/**
	 * The feature id for the '<em><b>Park</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__PARK = 11;

	/**
	 * The feature id for the '<em><b>Mosque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__MOSQUE = 12;

	/**
	 * The feature id for the '<em><b>School</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__SCHOOL = 13;

	/**
	 * The feature id for the '<em><b>Hospital</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__HOSPITAL = 14;

	/**
	 * The feature id for the '<em><b>Graveyard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__GRAVEYARD = 15;

	/**
	 * The feature id for the '<em><b>Other</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__OTHER = 16;

	/**
	 * The feature id for the '<em><b>House</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__HOUSE = 17;

	/**
	 * The feature id for the '<em><b>Road</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR__ROAD = 18;

	/**
	 * The number of structural features of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_FEATURE_COUNT = 19;

	/**
	 * The operation id for the '<em>Comapre</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR___COMAPRE = 0;

	/**
	 * The number of operations of the '<em>Sector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.ParkImpl <em>Park</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.ParkImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getPark()
	 * @generated
	 */
	int PARK = 4;

	/**
	 * The feature id for the '<em><b>Parkname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK__PARKNAME = 0;

	/**
	 * The feature id for the '<em><b>Parkcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK__PARKCAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Park</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Park</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.MosqueImpl <em>Mosque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.MosqueImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getMosque()
	 * @generated
	 */
	int MOSQUE = 5;

	/**
	 * The feature id for the '<em><b>Mosquename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSQUE__MOSQUENAME = 0;

	/**
	 * The feature id for the '<em><b>Mosquecapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSQUE__MOSQUECAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Mosque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSQUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mosque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOSQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.SchoolImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 6;

	/**
	 * The feature id for the '<em><b>Schoolname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__SCHOOLNAME = 0;

	/**
	 * The feature id for the '<em><b>Schoolcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__SCHOOLCAPACITY = 1;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.HospitalImpl <em>Hospital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.HospitalImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getHospital()
	 * @generated
	 */
	int HOSPITAL = 7;

	/**
	 * The feature id for the '<em><b>Hospitalname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__HOSPITALNAME = 0;

	/**
	 * The feature id for the '<em><b>Hospitalcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL__HOSPITALCAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hospital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.GraveyardImpl <em>Graveyard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.GraveyardImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getGraveyard()
	 * @generated
	 */
	int GRAVEYARD = 8;

	/**
	 * The feature id for the '<em><b>Graveyardname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAVEYARD__GRAVEYARDNAME = 0;

	/**
	 * The feature id for the '<em><b>Graveyardcapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAVEYARD__GRAVEYARDCAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Graveyard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAVEYARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graveyard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAVEYARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.OtherImpl <em>Other</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.OtherImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getOther()
	 * @generated
	 */
	int OTHER = 9;

	/**
	 * The feature id for the '<em><b>Othername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__OTHERNAME = 0;

	/**
	 * The feature id for the '<em><b>Othercapacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER__OTHERCAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Other</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.HouseImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 10;

	/**
	 * The feature id for the '<em><b>Housenbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__HOUSENBR = 0;

	/**
	 * The feature id for the '<em><b>Streetnbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__STREETNBR = 1;

	/**
	 * The feature id for the '<em><b>Nofpeople</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NOFPEOPLE = 2;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.RoadImpl <em>Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.RoadImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getRoad()
	 * @generated
	 */
	int ROAD = 11;

	/**
	 * The number of structural features of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.StreetRoadImpl <em>Street Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.StreetRoadImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getStreetRoad()
	 * @generated
	 */
	int STREET_ROAD = 12;

	/**
	 * The number of structural features of the '<em>Street Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ROAD_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Street Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_ROAD_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.MainRoadImpl <em>Main Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.MainRoadImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getMainRoad()
	 * @generated
	 */
	int MAIN_ROAD = 13;

	/**
	 * The number of structural features of the '<em>Main Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROAD_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROAD_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link urbanPlanning.impl.ServiceRoadImpl <em>Service Road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see urbanPlanning.impl.ServiceRoadImpl
	 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getServiceRoad()
	 * @generated
	 */
	int SERVICE_ROAD = 14;

	/**
	 * The number of structural features of the '<em>Service Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ROAD_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_ROAD_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link urbanPlanning.CityModel <em>City Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City Model</em>'.
	 * @see urbanPlanning.CityModel
	 * @generated
	 */
	EClass getCityModel();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.CityModel#getCityname <em>Cityname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cityname</em>'.
	 * @see urbanPlanning.CityModel#getCityname()
	 * @see #getCityModel()
	 * @generated
	 */
	EAttribute getCityModel_Cityname();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getHousingscheme <em>Housingscheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Housingscheme</em>'.
	 * @see urbanPlanning.CityModel#getHousingscheme()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Housingscheme();

	/**
	 * Returns the meta object for the containment reference '{@link urbanPlanning.CityModel#getGovtrecom <em>Govtrecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Govtrecom</em>'.
	 * @see urbanPlanning.CityModel#getGovtrecom()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Govtrecom();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getSector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sector</em>'.
	 * @see urbanPlanning.CityModel#getSector()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Sector();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>School</em>'.
	 * @see urbanPlanning.CityModel#getSchool()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_School();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getPark <em>Park</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Park</em>'.
	 * @see urbanPlanning.CityModel#getPark()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Park();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getMosque <em>Mosque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mosque</em>'.
	 * @see urbanPlanning.CityModel#getMosque()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Mosque();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other</em>'.
	 * @see urbanPlanning.CityModel#getOther()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Other();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getGraveyard <em>Graveyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graveyard</em>'.
	 * @see urbanPlanning.CityModel#getGraveyard()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Graveyard();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getHospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hospital</em>'.
	 * @see urbanPlanning.CityModel#getHospital()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Hospital();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>House</em>'.
	 * @see urbanPlanning.CityModel#getHouse()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_House();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.CityModel#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Road</em>'.
	 * @see urbanPlanning.CityModel#getRoad()
	 * @see #getCityModel()
	 * @generated
	 */
	EReference getCityModel_Road();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.HousingScheme <em>Housing Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Housing Scheme</em>'.
	 * @see urbanPlanning.HousingScheme
	 * @generated
	 */
	EClass getHousingScheme();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getSchemename <em>Schemename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schemename</em>'.
	 * @see urbanPlanning.HousingScheme#getSchemename()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Schemename();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getSchemepopu <em>Schemepopu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schemepopu</em>'.
	 * @see urbanPlanning.HousingScheme#getSchemepopu()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Schemepopu();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofhouses <em>Totalnofhouses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofhouses</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofhouses()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofhouses();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofroads <em>Totalnofroads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofroads</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofroads()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofroads();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofschools <em>Totalnofschools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofschools</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofschools()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofschools();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofparks <em>Totalnofparks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofparks</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofparks()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofparks();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofmosques <em>Totalnofmosques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofmosques</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofmosques()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofmosques();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofhospitals <em>Totalnofhospitals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofhospitals</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofhospitals()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofhospitals();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofgraveyards <em>Totalnofgraveyards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofgraveyards</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofgraveyards()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofgraveyards();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofothers <em>Totalnofothers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofothers</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofothers()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofothers();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.HousingScheme#getTotalnofsectors <em>Totalnofsectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totalnofsectors</em>'.
	 * @see urbanPlanning.HousingScheme#getTotalnofsectors()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EAttribute getHousingScheme_Totalnofsectors();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.HousingScheme#getSector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sector</em>'.
	 * @see urbanPlanning.HousingScheme#getSector()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EReference getHousingScheme_Sector();

	/**
	 * Returns the meta object for the reference '{@link urbanPlanning.HousingScheme#getGovtrecom <em>Govtrecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Govtrecom</em>'.
	 * @see urbanPlanning.HousingScheme#getGovtrecom()
	 * @see #getHousingScheme()
	 * @generated
	 */
	EReference getHousingScheme_Govtrecom();

	/**
	 * Returns the meta object for the '{@link urbanPlanning.HousingScheme#Compare() <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see urbanPlanning.HousingScheme#Compare()
	 * @generated
	 */
	EOperation getHousingScheme__Compare();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.GovtRecom <em>Govt Recom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Govt Recom</em>'.
	 * @see urbanPlanning.GovtRecom
	 * @generated
	 */
	EClass getGovtRecom();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.GovtRecom#getSchemePopuControl <em>Scheme Popu Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme Popu Control</em>'.
	 * @see urbanPlanning.GovtRecom#getSchemePopuControl()
	 * @see #getGovtRecom()
	 * @generated
	 */
	EAttribute getGovtRecom_SchemePopuControl();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.GovtRecom#getSectorPopuControl <em>Sector Popu Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sector Popu Control</em>'.
	 * @see urbanPlanning.GovtRecom#getSectorPopuControl()
	 * @see #getGovtRecom()
	 * @generated
	 */
	EAttribute getGovtRecom_SectorPopuControl();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Sector <em>Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sector</em>'.
	 * @see urbanPlanning.Sector
	 * @generated
	 */
	EClass getSector();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getSectorname <em>Sectorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectorname</em>'.
	 * @see urbanPlanning.Sector#getSectorname()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Sectorname();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getSectorpopu <em>Sectorpopu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectorpopu</em>'.
	 * @see urbanPlanning.Sector#getSectorpopu()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Sectorpopu();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofhouses <em>Nofhouses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofhouses</em>'.
	 * @see urbanPlanning.Sector#getNofhouses()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofhouses();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofroads <em>Nofroads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofroads</em>'.
	 * @see urbanPlanning.Sector#getNofroads()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofroads();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofschools <em>Nofschools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofschools</em>'.
	 * @see urbanPlanning.Sector#getNofschools()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofschools();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofparks <em>Nofparks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofparks</em>'.
	 * @see urbanPlanning.Sector#getNofparks()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofparks();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofmosques <em>Nofmosques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofmosques</em>'.
	 * @see urbanPlanning.Sector#getNofmosques()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofmosques();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofhospitals <em>Nofhospitals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofhospitals</em>'.
	 * @see urbanPlanning.Sector#getNofhospitals()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofhospitals();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofgraveyards <em>Nofgraveyards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofgraveyards</em>'.
	 * @see urbanPlanning.Sector#getNofgraveyards()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofgraveyards();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Sector#getNofothers <em>Nofothers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofothers</em>'.
	 * @see urbanPlanning.Sector#getNofothers()
	 * @see #getSector()
	 * @generated
	 */
	EAttribute getSector_Nofothers();

	/**
	 * Returns the meta object for the reference '{@link urbanPlanning.Sector#getGovtrecom <em>Govtrecom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Govtrecom</em>'.
	 * @see urbanPlanning.Sector#getGovtrecom()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Govtrecom();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getPark <em>Park</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Park</em>'.
	 * @see urbanPlanning.Sector#getPark()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Park();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getMosque <em>Mosque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mosque</em>'.
	 * @see urbanPlanning.Sector#getMosque()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Mosque();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>School</em>'.
	 * @see urbanPlanning.Sector#getSchool()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_School();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getHospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hospital</em>'.
	 * @see urbanPlanning.Sector#getHospital()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Hospital();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getGraveyard <em>Graveyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Graveyard</em>'.
	 * @see urbanPlanning.Sector#getGraveyard()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Graveyard();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other</em>'.
	 * @see urbanPlanning.Sector#getOther()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Other();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>House</em>'.
	 * @see urbanPlanning.Sector#getHouse()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_House();

	/**
	 * Returns the meta object for the containment reference list '{@link urbanPlanning.Sector#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Road</em>'.
	 * @see urbanPlanning.Sector#getRoad()
	 * @see #getSector()
	 * @generated
	 */
	EReference getSector_Road();

	/**
	 * Returns the meta object for the '{@link urbanPlanning.Sector#Comapre() <em>Comapre</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Comapre</em>' operation.
	 * @see urbanPlanning.Sector#Comapre()
	 * @generated
	 */
	EOperation getSector__Comapre();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Park <em>Park</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Park</em>'.
	 * @see urbanPlanning.Park
	 * @generated
	 */
	EClass getPark();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Park#getParkname <em>Parkname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parkname</em>'.
	 * @see urbanPlanning.Park#getParkname()
	 * @see #getPark()
	 * @generated
	 */
	EAttribute getPark_Parkname();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Park#getParkcapacity <em>Parkcapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parkcapacity</em>'.
	 * @see urbanPlanning.Park#getParkcapacity()
	 * @see #getPark()
	 * @generated
	 */
	EAttribute getPark_Parkcapacity();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Mosque <em>Mosque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mosque</em>'.
	 * @see urbanPlanning.Mosque
	 * @generated
	 */
	EClass getMosque();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Mosque#getMosquename <em>Mosquename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mosquename</em>'.
	 * @see urbanPlanning.Mosque#getMosquename()
	 * @see #getMosque()
	 * @generated
	 */
	EAttribute getMosque_Mosquename();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Mosque#getMosquecapacity <em>Mosquecapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mosquecapacity</em>'.
	 * @see urbanPlanning.Mosque#getMosquecapacity()
	 * @see #getMosque()
	 * @generated
	 */
	EAttribute getMosque_Mosquecapacity();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see urbanPlanning.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.School#getSchoolname <em>Schoolname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schoolname</em>'.
	 * @see urbanPlanning.School#getSchoolname()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Schoolname();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.School#getSchoolcapacity <em>Schoolcapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schoolcapacity</em>'.
	 * @see urbanPlanning.School#getSchoolcapacity()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Schoolcapacity();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Hospital <em>Hospital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital</em>'.
	 * @see urbanPlanning.Hospital
	 * @generated
	 */
	EClass getHospital();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Hospital#getHospitalname <em>Hospitalname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospitalname</em>'.
	 * @see urbanPlanning.Hospital#getHospitalname()
	 * @see #getHospital()
	 * @generated
	 */
	EAttribute getHospital_Hospitalname();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Hospital#getHospitalcapacity <em>Hospitalcapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospitalcapacity</em>'.
	 * @see urbanPlanning.Hospital#getHospitalcapacity()
	 * @see #getHospital()
	 * @generated
	 */
	EAttribute getHospital_Hospitalcapacity();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Graveyard <em>Graveyard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graveyard</em>'.
	 * @see urbanPlanning.Graveyard
	 * @generated
	 */
	EClass getGraveyard();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Graveyard#getGraveyardname <em>Graveyardname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graveyardname</em>'.
	 * @see urbanPlanning.Graveyard#getGraveyardname()
	 * @see #getGraveyard()
	 * @generated
	 */
	EAttribute getGraveyard_Graveyardname();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Graveyard#getGraveyardcapacity <em>Graveyardcapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graveyardcapacity</em>'.
	 * @see urbanPlanning.Graveyard#getGraveyardcapacity()
	 * @see #getGraveyard()
	 * @generated
	 */
	EAttribute getGraveyard_Graveyardcapacity();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Other <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other</em>'.
	 * @see urbanPlanning.Other
	 * @generated
	 */
	EClass getOther();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Other#getOthername <em>Othername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Othername</em>'.
	 * @see urbanPlanning.Other#getOthername()
	 * @see #getOther()
	 * @generated
	 */
	EAttribute getOther_Othername();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.Other#getOthercapacity <em>Othercapacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Othercapacity</em>'.
	 * @see urbanPlanning.Other#getOthercapacity()
	 * @see #getOther()
	 * @generated
	 */
	EAttribute getOther_Othercapacity();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see urbanPlanning.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.House#getHousenbr <em>Housenbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Housenbr</em>'.
	 * @see urbanPlanning.House#getHousenbr()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Housenbr();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.House#getStreetnbr <em>Streetnbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Streetnbr</em>'.
	 * @see urbanPlanning.House#getStreetnbr()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Streetnbr();

	/**
	 * Returns the meta object for the attribute '{@link urbanPlanning.House#getNofpeople <em>Nofpeople</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nofpeople</em>'.
	 * @see urbanPlanning.House#getNofpeople()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Nofpeople();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Road</em>'.
	 * @see urbanPlanning.Road
	 * @generated
	 */
	EClass getRoad();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.StreetRoad <em>Street Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Street Road</em>'.
	 * @see urbanPlanning.StreetRoad
	 * @generated
	 */
	EClass getStreetRoad();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.MainRoad <em>Main Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Road</em>'.
	 * @see urbanPlanning.MainRoad
	 * @generated
	 */
	EClass getMainRoad();

	/**
	 * Returns the meta object for class '{@link urbanPlanning.ServiceRoad <em>Service Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Road</em>'.
	 * @see urbanPlanning.ServiceRoad
	 * @generated
	 */
	EClass getServiceRoad();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UrbanPlanningFactory getUrbanPlanningFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.CityModelImpl <em>City Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.CityModelImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getCityModel()
		 * @generated
		 */
		EClass CITY_MODEL = eINSTANCE.getCityModel();

		/**
		 * The meta object literal for the '<em><b>Cityname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY_MODEL__CITYNAME = eINSTANCE.getCityModel_Cityname();

		/**
		 * The meta object literal for the '<em><b>Housingscheme</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__HOUSINGSCHEME = eINSTANCE.getCityModel_Housingscheme();

		/**
		 * The meta object literal for the '<em><b>Govtrecom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__GOVTRECOM = eINSTANCE.getCityModel_Govtrecom();

		/**
		 * The meta object literal for the '<em><b>Sector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__SECTOR = eINSTANCE.getCityModel_Sector();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__SCHOOL = eINSTANCE.getCityModel_School();

		/**
		 * The meta object literal for the '<em><b>Park</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__PARK = eINSTANCE.getCityModel_Park();

		/**
		 * The meta object literal for the '<em><b>Mosque</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__MOSQUE = eINSTANCE.getCityModel_Mosque();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__OTHER = eINSTANCE.getCityModel_Other();

		/**
		 * The meta object literal for the '<em><b>Graveyard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__GRAVEYARD = eINSTANCE.getCityModel_Graveyard();

		/**
		 * The meta object literal for the '<em><b>Hospital</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__HOSPITAL = eINSTANCE.getCityModel_Hospital();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__HOUSE = eINSTANCE.getCityModel_House();

		/**
		 * The meta object literal for the '<em><b>Road</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY_MODEL__ROAD = eINSTANCE.getCityModel_Road();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.HousingSchemeImpl <em>Housing Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.HousingSchemeImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getHousingScheme()
		 * @generated
		 */
		EClass HOUSING_SCHEME = eINSTANCE.getHousingScheme();

		/**
		 * The meta object literal for the '<em><b>Schemename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__SCHEMENAME = eINSTANCE.getHousingScheme_Schemename();

		/**
		 * The meta object literal for the '<em><b>Schemepopu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__SCHEMEPOPU = eINSTANCE.getHousingScheme_Schemepopu();

		/**
		 * The meta object literal for the '<em><b>Totalnofhouses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFHOUSES = eINSTANCE.getHousingScheme_Totalnofhouses();

		/**
		 * The meta object literal for the '<em><b>Totalnofroads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFROADS = eINSTANCE.getHousingScheme_Totalnofroads();

		/**
		 * The meta object literal for the '<em><b>Totalnofschools</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFSCHOOLS = eINSTANCE.getHousingScheme_Totalnofschools();

		/**
		 * The meta object literal for the '<em><b>Totalnofparks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFPARKS = eINSTANCE.getHousingScheme_Totalnofparks();

		/**
		 * The meta object literal for the '<em><b>Totalnofmosques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFMOSQUES = eINSTANCE.getHousingScheme_Totalnofmosques();

		/**
		 * The meta object literal for the '<em><b>Totalnofhospitals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFHOSPITALS = eINSTANCE.getHousingScheme_Totalnofhospitals();

		/**
		 * The meta object literal for the '<em><b>Totalnofgraveyards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFGRAVEYARDS = eINSTANCE.getHousingScheme_Totalnofgraveyards();

		/**
		 * The meta object literal for the '<em><b>Totalnofothers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFOTHERS = eINSTANCE.getHousingScheme_Totalnofothers();

		/**
		 * The meta object literal for the '<em><b>Totalnofsectors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSING_SCHEME__TOTALNOFSECTORS = eINSTANCE.getHousingScheme_Totalnofsectors();

		/**
		 * The meta object literal for the '<em><b>Sector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSING_SCHEME__SECTOR = eINSTANCE.getHousingScheme_Sector();

		/**
		 * The meta object literal for the '<em><b>Govtrecom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSING_SCHEME__GOVTRECOM = eINSTANCE.getHousingScheme_Govtrecom();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUSING_SCHEME___COMPARE = eINSTANCE.getHousingScheme__Compare();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.GovtRecomImpl <em>Govt Recom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.GovtRecomImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getGovtRecom()
		 * @generated
		 */
		EClass GOVT_RECOM = eINSTANCE.getGovtRecom();

		/**
		 * The meta object literal for the '<em><b>Scheme Popu Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOVT_RECOM__SCHEME_POPU_CONTROL = eINSTANCE.getGovtRecom_SchemePopuControl();

		/**
		 * The meta object literal for the '<em><b>Sector Popu Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOVT_RECOM__SECTOR_POPU_CONTROL = eINSTANCE.getGovtRecom_SectorPopuControl();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.SectorImpl <em>Sector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.SectorImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getSector()
		 * @generated
		 */
		EClass SECTOR = eINSTANCE.getSector();

		/**
		 * The meta object literal for the '<em><b>Sectorname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__SECTORNAME = eINSTANCE.getSector_Sectorname();

		/**
		 * The meta object literal for the '<em><b>Sectorpopu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__SECTORPOPU = eINSTANCE.getSector_Sectorpopu();

		/**
		 * The meta object literal for the '<em><b>Nofhouses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFHOUSES = eINSTANCE.getSector_Nofhouses();

		/**
		 * The meta object literal for the '<em><b>Nofroads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFROADS = eINSTANCE.getSector_Nofroads();

		/**
		 * The meta object literal for the '<em><b>Nofschools</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFSCHOOLS = eINSTANCE.getSector_Nofschools();

		/**
		 * The meta object literal for the '<em><b>Nofparks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFPARKS = eINSTANCE.getSector_Nofparks();

		/**
		 * The meta object literal for the '<em><b>Nofmosques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFMOSQUES = eINSTANCE.getSector_Nofmosques();

		/**
		 * The meta object literal for the '<em><b>Nofhospitals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFHOSPITALS = eINSTANCE.getSector_Nofhospitals();

		/**
		 * The meta object literal for the '<em><b>Nofgraveyards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFGRAVEYARDS = eINSTANCE.getSector_Nofgraveyards();

		/**
		 * The meta object literal for the '<em><b>Nofothers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTOR__NOFOTHERS = eINSTANCE.getSector_Nofothers();

		/**
		 * The meta object literal for the '<em><b>Govtrecom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__GOVTRECOM = eINSTANCE.getSector_Govtrecom();

		/**
		 * The meta object literal for the '<em><b>Park</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__PARK = eINSTANCE.getSector_Park();

		/**
		 * The meta object literal for the '<em><b>Mosque</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__MOSQUE = eINSTANCE.getSector_Mosque();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__SCHOOL = eINSTANCE.getSector_School();

		/**
		 * The meta object literal for the '<em><b>Hospital</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__HOSPITAL = eINSTANCE.getSector_Hospital();

		/**
		 * The meta object literal for the '<em><b>Graveyard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__GRAVEYARD = eINSTANCE.getSector_Graveyard();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__OTHER = eINSTANCE.getSector_Other();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__HOUSE = eINSTANCE.getSector_House();

		/**
		 * The meta object literal for the '<em><b>Road</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTOR__ROAD = eINSTANCE.getSector_Road();

		/**
		 * The meta object literal for the '<em><b>Comapre</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTOR___COMAPRE = eINSTANCE.getSector__Comapre();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.ParkImpl <em>Park</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.ParkImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getPark()
		 * @generated
		 */
		EClass PARK = eINSTANCE.getPark();

		/**
		 * The meta object literal for the '<em><b>Parkname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARK__PARKNAME = eINSTANCE.getPark_Parkname();

		/**
		 * The meta object literal for the '<em><b>Parkcapacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARK__PARKCAPACITY = eINSTANCE.getPark_Parkcapacity();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.MosqueImpl <em>Mosque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.MosqueImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getMosque()
		 * @generated
		 */
		EClass MOSQUE = eINSTANCE.getMosque();

		/**
		 * The meta object literal for the '<em><b>Mosquename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOSQUE__MOSQUENAME = eINSTANCE.getMosque_Mosquename();

		/**
		 * The meta object literal for the '<em><b>Mosquecapacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOSQUE__MOSQUECAPACITY = eINSTANCE.getMosque_Mosquecapacity();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.SchoolImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Schoolname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__SCHOOLNAME = eINSTANCE.getSchool_Schoolname();

		/**
		 * The meta object literal for the '<em><b>Schoolcapacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__SCHOOLCAPACITY = eINSTANCE.getSchool_Schoolcapacity();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.HospitalImpl <em>Hospital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.HospitalImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getHospital()
		 * @generated
		 */
		EClass HOSPITAL = eINSTANCE.getHospital();

		/**
		 * The meta object literal for the '<em><b>Hospitalname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL__HOSPITALNAME = eINSTANCE.getHospital_Hospitalname();

		/**
		 * The meta object literal for the '<em><b>Hospitalcapacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL__HOSPITALCAPACITY = eINSTANCE.getHospital_Hospitalcapacity();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.GraveyardImpl <em>Graveyard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.GraveyardImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getGraveyard()
		 * @generated
		 */
		EClass GRAVEYARD = eINSTANCE.getGraveyard();

		/**
		 * The meta object literal for the '<em><b>Graveyardname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAVEYARD__GRAVEYARDNAME = eINSTANCE.getGraveyard_Graveyardname();

		/**
		 * The meta object literal for the '<em><b>Graveyardcapacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAVEYARD__GRAVEYARDCAPACITY = eINSTANCE.getGraveyard_Graveyardcapacity();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.OtherImpl <em>Other</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.OtherImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getOther()
		 * @generated
		 */
		EClass OTHER = eINSTANCE.getOther();

		/**
		 * The meta object literal for the '<em><b>Othername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER__OTHERNAME = eINSTANCE.getOther_Othername();

		/**
		 * The meta object literal for the '<em><b>Othercapacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER__OTHERCAPACITY = eINSTANCE.getOther_Othercapacity();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.HouseImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Housenbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__HOUSENBR = eINSTANCE.getHouse_Housenbr();

		/**
		 * The meta object literal for the '<em><b>Streetnbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__STREETNBR = eINSTANCE.getHouse_Streetnbr();

		/**
		 * The meta object literal for the '<em><b>Nofpeople</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__NOFPEOPLE = eINSTANCE.getHouse_Nofpeople();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.RoadImpl <em>Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.RoadImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getRoad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getRoad();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.StreetRoadImpl <em>Street Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.StreetRoadImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getStreetRoad()
		 * @generated
		 */
		EClass STREET_ROAD = eINSTANCE.getStreetRoad();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.MainRoadImpl <em>Main Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.MainRoadImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getMainRoad()
		 * @generated
		 */
		EClass MAIN_ROAD = eINSTANCE.getMainRoad();

		/**
		 * The meta object literal for the '{@link urbanPlanning.impl.ServiceRoadImpl <em>Service Road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see urbanPlanning.impl.ServiceRoadImpl
		 * @see urbanPlanning.impl.UrbanPlanningPackageImpl#getServiceRoad()
		 * @generated
		 */
		EClass SERVICE_ROAD = eINSTANCE.getServiceRoad();

	}

} //UrbanPlanningPackage
