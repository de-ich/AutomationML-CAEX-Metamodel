/**
 */
package caex.caex215.caex.impl;

import caex.anytype.AnytypePackage;

import caex.caex215.caex.AdditionalInformation;
import caex.caex215.caex.Attribute;
import caex.caex215.caex.AttributeNameMapping;
import caex.caex215.caex.AttributeValueRequirement;
import caex.caex215.caex.CAEXBasicObject;
import caex.caex215.caex.CAEXFactory;
import caex.caex215.caex.CAEXFile;
import caex.caex215.caex.CAEXObject;
import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.ChangeMode;
import caex.caex215.caex.Copyright;
import caex.caex215.caex.Description;
import caex.caex215.caex.DocumentRoot;
import caex.caex215.caex.ExternalInterface;
import caex.caex215.caex.ExternalReference;
import caex.caex215.caex.InstanceHierarchy;
import caex.caex215.caex.InterfaceClass;
import caex.caex215.caex.InterfaceClassLib;
import caex.caex215.caex.InterfaceFamily;
import caex.caex215.caex.InterfaceNameMapping;
import caex.caex215.caex.InternalElement;
import caex.caex215.caex.InternalLink;
import caex.caex215.caex.Mapping;
import caex.caex215.caex.NominalScaled;
import caex.caex215.caex.OrdinalScaled;
import caex.caex215.caex.RefSemantic;
import caex.caex215.caex.Revision;
import caex.caex215.caex.RoleClass;
import caex.caex215.caex.RoleClassLib;
import caex.caex215.caex.RoleFamily;
import caex.caex215.caex.RoleRequirements;
import caex.caex215.caex.SupportedRoleClass;
import caex.caex215.caex.SystemUnitClass;
import caex.caex215.caex.SystemUnitClassLib;
import caex.caex215.caex.SystemUnitFamily;
import caex.caex215.caex.UnknownType;
import caex.caex215.caex.Version;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CAEXPackageImpl extends EPackageImpl implements CAEXPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNameMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexBasicObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyrightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceNameMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominalScaledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSemanticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedRoleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType changeModeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see caex.caex215.caex.CAEXPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CAEXPackageImpl() {
		super(eNS_URI, CAEXFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CAEXPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CAEXPackage init() {
		if (isInited) return (CAEXPackage)EPackage.Registry.INSTANCE.getEPackage(CAEXPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCAEXPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CAEXPackageImpl theCAEXPackage = registeredCAEXPackage instanceof CAEXPackageImpl ? (CAEXPackageImpl)registeredCAEXPackage : new CAEXPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AnytypePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCAEXPackage.createPackageContents();

		// Initialize created meta-data
		theCAEXPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCAEXPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CAEXPackage.eNS_URI, theCAEXPackage);
		return theCAEXPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeNameMapping() {
		return attributeNameMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeNameMapping_RoleAttributeName() {
		return (EAttribute)attributeNameMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeNameMapping_SystemUnitAttributeName() {
		return (EAttribute)attributeNameMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeNameMapping_RoleAttribute() {
		return (EReference)attributeNameMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeNameMapping_SystemUnitAttribute() {
		return (EReference)attributeNameMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_RefSemantic() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Constraint() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Attribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_AttributeDataType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Unit() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_DefaultValue() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeValueRequirement() {
		return attributeValueRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeValueRequirement_OrdinalScaledType() {
		return (EReference)attributeValueRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeValueRequirement_NominalScaledType() {
		return (EReference)attributeValueRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeValueRequirement_UnknownType() {
		return (EReference)attributeValueRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeValueRequirement_Name() {
		return (EAttribute)attributeValueRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCAEXBasicObject() {
		return caexBasicObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXBasicObject_Description() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXBasicObject_Version() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXBasicObject_Revision() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXBasicObject_Copyright() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXBasicObject_AdditionalInformation() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCAEXBasicObject_ChangeMode() {
		return (EAttribute)caexBasicObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCAEXFile() {
		return caexFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXFile_ExternalReference() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXFile_InstanceHierarchy() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXFile_InterfaceClassLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXFile_RoleClassLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAEXFile_SystemUnitClassLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCAEXFile_FileName() {
		return (EAttribute)caexFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCAEXFile_SchemaVersion() {
		return (EAttribute)caexFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCAEXObject() {
		return caexObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCAEXObject_ID() {
		return (EAttribute)caexObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCAEXObject_Name() {
		return (EAttribute)caexObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCopyright() {
		return copyrightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyright_Value() {
		return (EAttribute)copyrightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyright_ChangeMode() {
		return (EAttribute)copyrightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescription_Value() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescription_ChangeMode() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CAEXFile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalInterface() {
		return externalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalReference() {
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_Alias() {
		return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_Path() {
		return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceHierarchy() {
		return instanceHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceHierarchy_InternalElement() {
		return (EReference)instanceHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceClassLib() {
		return interfaceClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceClassLib_InterfaceClass() {
		return (EReference)interfaceClassLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceClass() {
		return interfaceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceClass_Attribute() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceClass_RefBaseClassPath() {
		return (EAttribute)interfaceClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceClass_BaseClass() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceClass_InterfaceClass() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceFamily() {
		return interfaceFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceNameMapping() {
		return interfaceNameMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceNameMapping_RoleInterfaceName() {
		return (EAttribute)interfaceNameMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceNameMapping_SystemUnitInterfaceName() {
		return (EAttribute)interfaceNameMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceNameMapping_RoleInterface() {
		return (EReference)interfaceNameMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceNameMapping_SystemUnitInterface() {
		return (EReference)interfaceNameMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalElement() {
		return internalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalElement_RoleRequirements() {
		return (EReference)internalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalElement_MappingObject() {
		return (EReference)internalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalElement_RefBaseSystemUnitPath() {
		return (EAttribute)internalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalElement_BaseSystemUnit() {
		return (EReference)internalElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalLink() {
		return internalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalLink_RefPartnerSideA() {
		return (EAttribute)internalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalLink_RefPartnerSideB() {
		return (EAttribute)internalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalLink_PartnerSideA() {
		return (EReference)internalLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalLink_PartnerSideB() {
		return (EReference)internalLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_AttributeNameMapping() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_InterfaceNameMapping() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNominalScaled() {
		return nominalScaledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNominalScaled_RequiredValue() {
		return (EAttribute)nominalScaledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrdinalScaled() {
		return ordinalScaledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrdinalScaled_RequiredMaxValue() {
		return (EAttribute)ordinalScaledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrdinalScaled_RequiredValue() {
		return (EAttribute)ordinalScaledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrdinalScaled_RequiredMinValue() {
		return (EAttribute)ordinalScaledEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefSemantic() {
		return refSemanticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefSemantic_CorrespondingAttributePath() {
		return (EAttribute)refSemanticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_RevisionDate() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_OldVersion() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_NewVersion() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_AuthorName() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Comment() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleClassLib() {
		return roleClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleClassLib_RoleClass() {
		return (EReference)roleClassLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleClass() {
		return roleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleClass_Attribute() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleClass_ExternalInterface() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleClass_RefBaseClassPath() {
		return (EAttribute)roleClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleClass_BaseClass() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleClass_RoleClass() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleFamily() {
		return roleFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleRequirements() {
		return roleRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleRequirements_Attribute() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleRequirements_ExternalInterface() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleRequirements_RefBaseRoleClassPath() {
		return (EAttribute)roleRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoleRequirements_RoleClass() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportedRoleClass() {
		return supportedRoleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedRoleClass_MappingObject() {
		return (EReference)supportedRoleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportedRoleClass_RefRoleClassPath() {
		return (EAttribute)supportedRoleClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedRoleClass_RoleClass() {
		return (EReference)supportedRoleClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemUnitClassLib() {
		return systemUnitClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClassLib_SystemUnitClass() {
		return (EReference)systemUnitClassLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemUnitClass() {
		return systemUnitClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_Attribute() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_ExternalInterface() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_InternalElement() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_SupportedRoleClass() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_InternalLink() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemUnitClass_RefBaseClassPath() {
		return (EAttribute)systemUnitClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_BaseClass() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemUnitClass_SystemUnitClass() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemUnitFamily() {
		return systemUnitFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownType() {
		return unknownTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnknownType_Requirements() {
		return (EAttribute)unknownTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Value() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_ChangeMode() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalInformation() {
		return additionalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getChangeMode() {
		return changeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAttributeDataType() {
		return attributeDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChangeModeObject() {
		return changeModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CAEXFactory getCAEXFactory() {
		return (CAEXFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeNameMappingEClass = createEClass(ATTRIBUTE_NAME_MAPPING);
		createEAttribute(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME);
		createEAttribute(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME);
		createEReference(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE);
		createEReference(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__REF_SEMANTIC);
		createEReference(attributeEClass, ATTRIBUTE__CONSTRAINT);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_DATA_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__UNIT);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);

		attributeValueRequirementEClass = createEClass(ATTRIBUTE_VALUE_REQUIREMENT);
		createEReference(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE);
		createEReference(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE);
		createEReference(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE);
		createEAttribute(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__NAME);

		caexBasicObjectEClass = createEClass(CAEX_BASIC_OBJECT);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__DESCRIPTION);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__VERSION);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__REVISION);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__COPYRIGHT);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION);
		createEAttribute(caexBasicObjectEClass, CAEX_BASIC_OBJECT__CHANGE_MODE);

		caexFileEClass = createEClass(CAEX_FILE);
		createEReference(caexFileEClass, CAEX_FILE__EXTERNAL_REFERENCE);
		createEReference(caexFileEClass, CAEX_FILE__INSTANCE_HIERARCHY);
		createEReference(caexFileEClass, CAEX_FILE__INTERFACE_CLASS_LIB);
		createEReference(caexFileEClass, CAEX_FILE__ROLE_CLASS_LIB);
		createEReference(caexFileEClass, CAEX_FILE__SYSTEM_UNIT_CLASS_LIB);
		createEAttribute(caexFileEClass, CAEX_FILE__FILE_NAME);
		createEAttribute(caexFileEClass, CAEX_FILE__SCHEMA_VERSION);

		caexObjectEClass = createEClass(CAEX_OBJECT);
		createEAttribute(caexObjectEClass, CAEX_OBJECT__ID);
		createEAttribute(caexObjectEClass, CAEX_OBJECT__NAME);

		copyrightEClass = createEClass(COPYRIGHT);
		createEAttribute(copyrightEClass, COPYRIGHT__VALUE);
		createEAttribute(copyrightEClass, COPYRIGHT__CHANGE_MODE);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__VALUE);
		createEAttribute(descriptionEClass, DESCRIPTION__CHANGE_MODE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CAEX_FILE);

		externalInterfaceEClass = createEClass(EXTERNAL_INTERFACE);

		externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__ALIAS);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__PATH);

		instanceHierarchyEClass = createEClass(INSTANCE_HIERARCHY);
		createEReference(instanceHierarchyEClass, INSTANCE_HIERARCHY__INTERNAL_ELEMENT);

		interfaceClassLibEClass = createEClass(INTERFACE_CLASS_LIB);
		createEReference(interfaceClassLibEClass, INTERFACE_CLASS_LIB__INTERFACE_CLASS);

		interfaceClassEClass = createEClass(INTERFACE_CLASS);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__ATTRIBUTE);
		createEAttribute(interfaceClassEClass, INTERFACE_CLASS__REF_BASE_CLASS_PATH);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__BASE_CLASS);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__INTERFACE_CLASS);

		interfaceFamilyEClass = createEClass(INTERFACE_FAMILY);

		interfaceNameMappingEClass = createEClass(INTERFACE_NAME_MAPPING);
		createEAttribute(interfaceNameMappingEClass, INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME);
		createEAttribute(interfaceNameMappingEClass, INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME);
		createEReference(interfaceNameMappingEClass, INTERFACE_NAME_MAPPING__ROLE_INTERFACE);
		createEReference(interfaceNameMappingEClass, INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE);

		internalElementEClass = createEClass(INTERNAL_ELEMENT);
		createEReference(internalElementEClass, INTERNAL_ELEMENT__ROLE_REQUIREMENTS);
		createEReference(internalElementEClass, INTERNAL_ELEMENT__MAPPING_OBJECT);
		createEAttribute(internalElementEClass, INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH);
		createEReference(internalElementEClass, INTERNAL_ELEMENT__BASE_SYSTEM_UNIT);

		internalLinkEClass = createEClass(INTERNAL_LINK);
		createEAttribute(internalLinkEClass, INTERNAL_LINK__REF_PARTNER_SIDE_A);
		createEAttribute(internalLinkEClass, INTERNAL_LINK__REF_PARTNER_SIDE_B);
		createEReference(internalLinkEClass, INTERNAL_LINK__PARTNER_SIDE_A);
		createEReference(internalLinkEClass, INTERNAL_LINK__PARTNER_SIDE_B);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__ATTRIBUTE_NAME_MAPPING);
		createEReference(mappingEClass, MAPPING__INTERFACE_NAME_MAPPING);

		nominalScaledEClass = createEClass(NOMINAL_SCALED);
		createEAttribute(nominalScaledEClass, NOMINAL_SCALED__REQUIRED_VALUE);

		ordinalScaledEClass = createEClass(ORDINAL_SCALED);
		createEAttribute(ordinalScaledEClass, ORDINAL_SCALED__REQUIRED_MAX_VALUE);
		createEAttribute(ordinalScaledEClass, ORDINAL_SCALED__REQUIRED_VALUE);
		createEAttribute(ordinalScaledEClass, ORDINAL_SCALED__REQUIRED_MIN_VALUE);

		refSemanticEClass = createEClass(REF_SEMANTIC);
		createEAttribute(refSemanticEClass, REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH);

		revisionEClass = createEClass(REVISION);
		createEAttribute(revisionEClass, REVISION__REVISION_DATE);
		createEAttribute(revisionEClass, REVISION__OLD_VERSION);
		createEAttribute(revisionEClass, REVISION__NEW_VERSION);
		createEAttribute(revisionEClass, REVISION__AUTHOR_NAME);
		createEAttribute(revisionEClass, REVISION__COMMENT);

		roleClassLibEClass = createEClass(ROLE_CLASS_LIB);
		createEReference(roleClassLibEClass, ROLE_CLASS_LIB__ROLE_CLASS);

		roleClassEClass = createEClass(ROLE_CLASS);
		createEReference(roleClassEClass, ROLE_CLASS__ATTRIBUTE);
		createEReference(roleClassEClass, ROLE_CLASS__EXTERNAL_INTERFACE);
		createEAttribute(roleClassEClass, ROLE_CLASS__REF_BASE_CLASS_PATH);
		createEReference(roleClassEClass, ROLE_CLASS__BASE_CLASS);
		createEReference(roleClassEClass, ROLE_CLASS__ROLE_CLASS);

		roleFamilyEClass = createEClass(ROLE_FAMILY);

		roleRequirementsEClass = createEClass(ROLE_REQUIREMENTS);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__ATTRIBUTE);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__EXTERNAL_INTERFACE);
		createEAttribute(roleRequirementsEClass, ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__ROLE_CLASS);

		supportedRoleClassEClass = createEClass(SUPPORTED_ROLE_CLASS);
		createEReference(supportedRoleClassEClass, SUPPORTED_ROLE_CLASS__MAPPING_OBJECT);
		createEAttribute(supportedRoleClassEClass, SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH);
		createEReference(supportedRoleClassEClass, SUPPORTED_ROLE_CLASS__ROLE_CLASS);

		systemUnitClassLibEClass = createEClass(SYSTEM_UNIT_CLASS_LIB);
		createEReference(systemUnitClassLibEClass, SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS);

		systemUnitClassEClass = createEClass(SYSTEM_UNIT_CLASS);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__ATTRIBUTE);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__INTERNAL_LINK);
		createEAttribute(systemUnitClassEClass, SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__BASE_CLASS);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS);

		systemUnitFamilyEClass = createEClass(SYSTEM_UNIT_FAMILY);

		unknownTypeEClass = createEClass(UNKNOWN_TYPE);
		createEAttribute(unknownTypeEClass, UNKNOWN_TYPE__REQUIREMENTS);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VALUE);
		createEAttribute(versionEClass, VERSION__CHANGE_MODE);

		additionalInformationEClass = createEClass(ADDITIONAL_INFORMATION);

		// Create enums
		changeModeEEnum = createEEnum(CHANGE_MODE);

		// Create data types
		attributeDataTypeEDataType = createEDataType(ATTRIBUTE_DATA_TYPE);
		changeModeObjectEDataType = createEDataType(CHANGE_MODE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		AnytypePackage theAnytypePackage = (AnytypePackage)EPackage.Registry.INSTANCE.getEPackage(AnytypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeNameMappingEClass.getESuperTypes().add(this.getCAEXBasicObject());
		attributeEClass.getESuperTypes().add(this.getCAEXObject());
		attributeValueRequirementEClass.getESuperTypes().add(this.getCAEXBasicObject());
		caexFileEClass.getESuperTypes().add(this.getCAEXBasicObject());
		caexObjectEClass.getESuperTypes().add(this.getCAEXBasicObject());
		externalInterfaceEClass.getESuperTypes().add(this.getInterfaceClass());
		externalReferenceEClass.getESuperTypes().add(this.getCAEXBasicObject());
		instanceHierarchyEClass.getESuperTypes().add(this.getCAEXObject());
		interfaceClassLibEClass.getESuperTypes().add(this.getCAEXObject());
		interfaceClassEClass.getESuperTypes().add(this.getCAEXObject());
		interfaceFamilyEClass.getESuperTypes().add(this.getInterfaceClass());
		interfaceNameMappingEClass.getESuperTypes().add(this.getCAEXBasicObject());
		internalElementEClass.getESuperTypes().add(this.getSystemUnitClass());
		internalLinkEClass.getESuperTypes().add(this.getCAEXObject());
		mappingEClass.getESuperTypes().add(this.getCAEXBasicObject());
		refSemanticEClass.getESuperTypes().add(this.getCAEXBasicObject());
		revisionEClass.getESuperTypes().add(this.getCAEXBasicObject());
		roleClassLibEClass.getESuperTypes().add(this.getCAEXObject());
		roleClassEClass.getESuperTypes().add(this.getCAEXObject());
		roleFamilyEClass.getESuperTypes().add(this.getRoleClass());
		roleRequirementsEClass.getESuperTypes().add(this.getCAEXBasicObject());
		supportedRoleClassEClass.getESuperTypes().add(this.getCAEXBasicObject());
		systemUnitClassLibEClass.getESuperTypes().add(this.getCAEXObject());
		systemUnitClassEClass.getESuperTypes().add(this.getCAEXObject());
		systemUnitFamilyEClass.getESuperTypes().add(this.getSystemUnitClass());
		additionalInformationEClass.getESuperTypes().add(theAnytypePackage.getGenericElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeNameMappingEClass, AttributeNameMapping.class, "AttributeNameMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeNameMapping_RoleAttributeName(), theXMLTypePackage.getString(), "roleAttributeName", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeNameMapping_SystemUnitAttributeName(), theXMLTypePackage.getString(), "systemUnitAttributeName", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeNameMapping_RoleAttribute(), this.getAttribute(), null, "roleAttribute", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeNameMapping_SystemUnitAttribute(), this.getAttribute(), null, "systemUnitAttribute", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_RefSemantic(), this.getRefSemantic(), null, "refSemantic", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Constraint(), this.getAttributeValueRequirement(), null, "constraint", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributeDataType(), this.getAttributeDataType(), "attributeDataType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Unit(), theXMLTypePackage.getString(), "unit", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueRequirementEClass, AttributeValueRequirement.class, "AttributeValueRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueRequirement_OrdinalScaledType(), this.getOrdinalScaled(), null, "ordinalScaledType", null, 0, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueRequirement_NominalScaledType(), this.getNominalScaled(), null, "nominalScaledType", null, 0, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueRequirement_UnknownType(), this.getUnknownType(), null, "unknownType", null, 0, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValueRequirement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexBasicObjectEClass, CAEXBasicObject.class, "CAEXBasicObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCAEXBasicObject_Description(), this.getDescription(), null, "description", null, 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Version(), this.getVersion(), null, "version", null, 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Revision(), this.getRevision(), null, "revision", null, 0, -1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Copyright(), this.getCopyright(), null, "copyright", null, 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_AdditionalInformation(), this.getAdditionalInformation(), null, "additionalInformation", null, 0, -1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXBasicObject_ChangeMode(), this.getChangeMode(), "changeMode", "state", 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexFileEClass, CAEXFile.class, "CAEXFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCAEXFile_ExternalReference(), this.getExternalReference(), null, "externalReference", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_InstanceHierarchy(), this.getInstanceHierarchy(), null, "instanceHierarchy", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_InterfaceClassLib(), this.getInterfaceClassLib(), null, "interfaceClassLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_RoleClassLib(), this.getRoleClassLib(), null, "roleClassLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_SystemUnitClassLib(), this.getSystemUnitClassLib(), null, "systemUnitClassLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXFile_FileName(), theXMLTypePackage.getString(), "fileName", null, 1, 1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXFile_SchemaVersion(), theXMLTypePackage.getString(), "schemaVersion", "2.15", 1, 1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexObjectEClass, CAEXObject.class, "CAEXObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAEXObject_ID(), theXMLTypePackage.getString(), "iD", null, 0, 1, CAEXObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXObject_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CAEXObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyrightEClass, Copyright.class, "Copyright", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyright_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Copyright.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyright_ChangeMode(), this.getChangeMode(), "changeMode", "state", 0, 1, Copyright.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_ChangeMode(), this.getChangeMode(), "changeMode", "state", 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CAEXFile(), this.getCAEXFile(), null, "cAEXFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(externalInterfaceEClass, ExternalInterface.class, "ExternalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalReference_Alias(), theXMLTypePackage.getString(), "alias", null, 1, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalReference_Path(), theXMLTypePackage.getString(), "path", null, 1, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceHierarchyEClass, InstanceHierarchy.class, "InstanceHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceHierarchy_InternalElement(), this.getInternalElement(), null, "internalElement", null, 0, -1, InstanceHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceClassLibEClass, InterfaceClassLib.class, "InterfaceClassLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceClassLib_InterfaceClass(), this.getInterfaceClass(), null, "interfaceClass", null, 0, -1, InterfaceClassLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceClassEClass, InterfaceClass.class, "InterfaceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceClass_RefBaseClassPath(), theXMLTypePackage.getString(), "refBaseClassPath", null, 0, 1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceClass_BaseClass(), this.getInterfaceClass(), null, "baseClass", null, 0, 1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceClass_InterfaceClass(), this.getInterfaceClass(), null, "interfaceClass", null, 0, -1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceFamilyEClass, InterfaceFamily.class, "InterfaceFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceNameMappingEClass, InterfaceNameMapping.class, "InterfaceNameMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceNameMapping_RoleInterfaceName(), theXMLTypePackage.getString(), "roleInterfaceName", null, 1, 1, InterfaceNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceNameMapping_SystemUnitInterfaceName(), theXMLTypePackage.getString(), "systemUnitInterfaceName", null, 1, 1, InterfaceNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceNameMapping_RoleInterface(), this.getExternalInterface(), null, "roleInterface", null, 1, 1, InterfaceNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceNameMapping_SystemUnitInterface(), this.getExternalInterface(), null, "systemUnitInterface", null, 1, 1, InterfaceNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalElementEClass, InternalElement.class, "InternalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalElement_RoleRequirements(), this.getRoleRequirements(), null, "roleRequirements", null, 0, 1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalElement_MappingObject(), this.getMapping(), null, "mappingObject", null, 0, 1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalElement_RefBaseSystemUnitPath(), theXMLTypePackage.getString(), "refBaseSystemUnitPath", null, 0, 1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalElement_BaseSystemUnit(), this.getSystemUnitClass(), null, "baseSystemUnit", null, 0, 1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalLinkEClass, InternalLink.class, "InternalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalLink_RefPartnerSideA(), theXMLTypePackage.getString(), "refPartnerSideA", null, 0, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalLink_RefPartnerSideB(), theXMLTypePackage.getString(), "refPartnerSideB", null, 0, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalLink_PartnerSideA(), this.getInterfaceClass(), null, "partnerSideA", null, 0, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalLink_PartnerSideB(), this.getInterfaceClass(), null, "partnerSideB", null, 0, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_AttributeNameMapping(), this.getAttributeNameMapping(), null, "attributeNameMapping", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_InterfaceNameMapping(), this.getInterfaceNameMapping(), null, "interfaceNameMapping", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nominalScaledEClass, NominalScaled.class, "NominalScaled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNominalScaled_RequiredValue(), theXMLTypePackage.getString(), "requiredValue", null, 0, -1, NominalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ordinalScaledEClass, OrdinalScaled.class, "OrdinalScaled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrdinalScaled_RequiredMaxValue(), theXMLTypePackage.getString(), "requiredMaxValue", null, 0, 1, OrdinalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrdinalScaled_RequiredValue(), theXMLTypePackage.getString(), "requiredValue", null, 0, 1, OrdinalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrdinalScaled_RequiredMinValue(), theXMLTypePackage.getString(), "requiredMinValue", null, 0, 1, OrdinalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refSemanticEClass, RefSemantic.class, "RefSemantic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefSemantic_CorrespondingAttributePath(), theXMLTypePackage.getString(), "correspondingAttributePath", null, 1, 1, RefSemantic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevision_RevisionDate(), theXMLTypePackage.getDateTime(), "revisionDate", null, 1, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_OldVersion(), theXMLTypePackage.getString(), "oldVersion", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_NewVersion(), theXMLTypePackage.getString(), "newVersion", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_AuthorName(), theXMLTypePackage.getString(), "authorName", null, 1, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleClassLibEClass, RoleClassLib.class, "RoleClassLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleClassLib_RoleClass(), this.getRoleClass(), null, "roleClass", null, 0, -1, RoleClassLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleClassEClass, RoleClass.class, "RoleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleClass_ExternalInterface(), this.getExternalInterface(), null, "externalInterface", null, 0, -1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleClass_RefBaseClassPath(), theXMLTypePackage.getString(), "refBaseClassPath", null, 0, 1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleClass_BaseClass(), this.getRoleClass(), null, "baseClass", null, 0, 1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleClass_RoleClass(), this.getRoleClass(), null, "roleClass", null, 0, -1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleFamilyEClass, RoleFamily.class, "RoleFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequirementsEClass, RoleRequirements.class, "RoleRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleRequirements_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleRequirements_ExternalInterface(), this.getInterfaceClass(), null, "externalInterface", null, 0, -1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleRequirements_RefBaseRoleClassPath(), theXMLTypePackage.getString(), "refBaseRoleClassPath", null, 0, 1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleRequirements_RoleClass(), this.getRoleClass(), null, "roleClass", null, 0, 1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedRoleClassEClass, SupportedRoleClass.class, "SupportedRoleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedRoleClass_MappingObject(), this.getMapping(), null, "mappingObject", null, 0, 1, SupportedRoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportedRoleClass_RefRoleClassPath(), theXMLTypePackage.getString(), "refRoleClassPath", null, 1, 1, SupportedRoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupportedRoleClass_RoleClass(), this.getRoleClass(), null, "roleClass", null, 1, 1, SupportedRoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitClassLibEClass, SystemUnitClassLib.class, "SystemUnitClassLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemUnitClassLib_SystemUnitClass(), this.getSystemUnitClass(), null, "systemUnitClass", null, 0, -1, SystemUnitClassLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitClassEClass, SystemUnitClass.class, "SystemUnitClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemUnitClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_ExternalInterface(), this.getInterfaceClass(), null, "externalInterface", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_InternalElement(), this.getInternalElement(), null, "internalElement", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_SupportedRoleClass(), this.getSupportedRoleClass(), null, "supportedRoleClass", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_InternalLink(), this.getInternalLink(), null, "internalLink", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemUnitClass_RefBaseClassPath(), theXMLTypePackage.getString(), "refBaseClassPath", null, 0, 1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_BaseClass(), this.getSystemUnitClass(), null, "baseClass", null, 0, 1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_SystemUnitClass(), this.getSystemUnitClass(), null, "systemUnitClass", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitFamilyEClass, SystemUnitFamily.class, "SystemUnitFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownTypeEClass, UnknownType.class, "UnknownType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownType_Requirements(), theXMLTypePackage.getString(), "requirements", null, 0, 1, UnknownType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_ChangeMode(), this.getChangeMode(), "changeMode", "state", 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalInformationEClass, AdditionalInformation.class, "AdditionalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(changeModeEEnum, ChangeMode.class, "ChangeMode");
		addEEnumLiteral(changeModeEEnum, ChangeMode.STATE);
		addEEnumLiteral(changeModeEEnum, ChangeMode.CREATE);
		addEEnumLiteral(changeModeEEnum, ChangeMode.DELETE);
		addEEnumLiteral(changeModeEEnum, ChangeMode.CHANGE);

		// Initialize data types
		initEDataType(attributeDataTypeEDataType, String.class, "AttributeDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(changeModeObjectEDataType, Enumerator.class, "ChangeModeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (attributeNameMappingEClass,
		   source,
		   new String[] {
			   "name", "AttributeNameMapping",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttributeNameMapping_RoleAttributeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RoleAttributeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttributeNameMapping_SystemUnitAttributeName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SystemUnitAttributeName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "name", "AttributeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttribute_RefSemantic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RefSemantic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribute_Constraint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Constraint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribute_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribute_AttributeDataType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AttributeDataType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribute_Unit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Unit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribute_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttribute_DefaultValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DefaultValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (attributeValueRequirementEClass,
		   source,
		   new String[] {
			   "name", "AttributeValueRequirementType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAttributeValueRequirement_OrdinalScaledType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OrdinalScaledType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttributeValueRequirement_NominalScaledType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NominalScaledType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttributeValueRequirement_UnknownType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnknownType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAttributeValueRequirement_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (caexBasicObjectEClass,
		   source,
		   new String[] {
			   "name", "CAEXBasicObject",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCAEXBasicObject_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXBasicObject_Version(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Version",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXBasicObject_Revision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Revision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXBasicObject_Copyright(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Copyright",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXBasicObject_AdditionalInformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalInformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXBasicObject_ChangeMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ChangeMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (caexFileEClass,
		   source,
		   new String[] {
			   "name", "CAEXFile",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCAEXFile_ExternalReference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExternalReference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXFile_InstanceHierarchy(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InstanceHierarchy",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXFile_InterfaceClassLib(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InterfaceClassLib",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXFile_RoleClassLib(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RoleClassLib",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXFile_SystemUnitClassLib(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SystemUnitClassLib",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXFile_FileName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "FileName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXFile_SchemaVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SchemaVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (caexObjectEClass,
		   source,
		   new String[] {
			   "name", "CAEXObject",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCAEXObject_ID(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCAEXObject_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (copyrightEClass,
		   source,
		   new String[] {
			   "name", "Copyright",
			   "kind", "simple"
		   });
		addAnnotation
		  (getCopyright_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getCopyright_ChangeMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ChangeMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (descriptionEClass,
		   source,
		   new String[] {
			   "name", "Description",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDescription_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getDescription_ChangeMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ChangeMode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_CAEXFile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CAEXFile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (externalInterfaceEClass,
		   source,
		   new String[] {
			   "name", "ExternalInterface",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (externalReferenceEClass,
		   source,
		   new String[] {
			   "name", "ExternalReference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExternalReference_Alias(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Alias",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExternalReference_Path(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Path",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (instanceHierarchyEClass,
		   source,
		   new String[] {
			   "name", "InstanceHierarchy",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInstanceHierarchy_InternalElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternalElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (interfaceClassLibEClass,
		   source,
		   new String[] {
			   "name", "InterfaceClassLib",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInterfaceClassLib_InterfaceClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InterfaceClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (interfaceClassEClass,
		   source,
		   new String[] {
			   "name", "InterfaceClassType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInterfaceClass_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInterfaceClass_RefBaseClassPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefBaseClassPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInterfaceClass_InterfaceClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InterfaceClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (interfaceFamilyEClass,
		   source,
		   new String[] {
			   "name", "InterfaceFamilyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (interfaceNameMappingEClass,
		   source,
		   new String[] {
			   "name", "InterfaceNameMapping",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInterfaceNameMapping_RoleInterfaceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RoleInterfaceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInterfaceNameMapping_SystemUnitInterfaceName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "SystemUnitInterfaceName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (internalElementEClass,
		   source,
		   new String[] {
			   "name", "InternalElementType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInternalElement_RoleRequirements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RoleRequirements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInternalElement_MappingObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MappingObject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInternalElement_RefBaseSystemUnitPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefBaseSystemUnitPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (internalLinkEClass,
		   source,
		   new String[] {
			   "name", "InternalLink",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInternalLink_RefPartnerSideA(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefPartnerSideA",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInternalLink_RefPartnerSideB(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefPartnerSideB",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (mappingEClass,
		   source,
		   new String[] {
			   "name", "MappingType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMapping_AttributeNameMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AttributeNameMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMapping_InterfaceNameMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InterfaceNameMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nominalScaledEClass,
		   source,
		   new String[] {
			   "name", "NominalScaledType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNominalScaled_RequiredValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequiredValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (ordinalScaledEClass,
		   source,
		   new String[] {
			   "name", "OrdinalScaledType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOrdinalScaled_RequiredMaxValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequiredMaxValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrdinalScaled_RequiredValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequiredValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOrdinalScaled_RequiredMinValue(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RequiredMinValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (refSemanticEClass,
		   source,
		   new String[] {
			   "name", "RefSemantic",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRefSemantic_CorrespondingAttributePath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "CorrespondingAttributePath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (revisionEClass,
		   source,
		   new String[] {
			   "name", "Revision",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRevision_RevisionDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RevisionDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRevision_OldVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OldVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRevision_NewVersion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NewVersion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRevision_AuthorName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AuthorName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRevision_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Comment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (roleClassLibEClass,
		   source,
		   new String[] {
			   "name", "RoleClassLib",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRoleClassLib_RoleClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RoleClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (roleClassEClass,
		   source,
		   new String[] {
			   "name", "RoleClassType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRoleClass_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRoleClass_ExternalInterface(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExternalInterface",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRoleClass_RefBaseClassPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefBaseClassPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRoleClass_RoleClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RoleClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (roleFamilyEClass,
		   source,
		   new String[] {
			   "name", "RoleFamilyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (roleRequirementsEClass,
		   source,
		   new String[] {
			   "name", "RoleRequirements",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRoleRequirements_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRoleRequirements_ExternalInterface(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExternalInterface",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getRoleRequirements_RefBaseRoleClassPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefBaseRoleClassPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (supportedRoleClassEClass,
		   source,
		   new String[] {
			   "name", "SupportedRoleClass",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSupportedRoleClass_MappingObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MappingObject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSupportedRoleClass_RefRoleClassPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefRoleClassPath",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (systemUnitClassLibEClass,
		   source,
		   new String[] {
			   "name", "SystemUnitClassLib",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSystemUnitClassLib_SystemUnitClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SystemUnitClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (systemUnitClassEClass,
		   source,
		   new String[] {
			   "name", "SystemUnitClassType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSystemUnitClass_Attribute(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Attribute",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemUnitClass_ExternalInterface(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExternalInterface",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemUnitClass_InternalElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternalElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemUnitClass_SupportedRoleClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SupportedRoleClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemUnitClass_InternalLink(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InternalLink",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemUnitClass_RefBaseClassPath(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "RefBaseClassPath"
		   });
		addAnnotation
		  (getSystemUnitClass_SystemUnitClass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SystemUnitClass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (systemUnitFamilyEClass,
		   source,
		   new String[] {
			   "name", "SystemUnitFamilyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (unknownTypeEClass,
		   source,
		   new String[] {
			   "name", "UnknownType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUnknownType_Requirements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Requirements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (versionEClass,
		   source,
		   new String[] {
			   "name", "Version",
			   "kind", "simple"
		   });
		addAnnotation
		  (getVersion_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getVersion_ChangeMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ChangeMode",
			   "namespace", "##targetNamespace"
		   });
	}

} //CAEXPackageImpl
