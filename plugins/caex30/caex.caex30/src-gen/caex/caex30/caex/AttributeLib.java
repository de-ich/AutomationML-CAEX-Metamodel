/**
 */
package caex.caex30.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.AttributeLib#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getAttributeLib()
 * @model extendedMetaData="name='AttributeTypeLib_._type' kind='elementOnly'"
 * @generated
 */
public interface AttributeLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.AttributeFamily}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class definition for attribute Types
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getAttributeLib_AttributeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeFamily> getAttributeType();

} // AttributeLib
