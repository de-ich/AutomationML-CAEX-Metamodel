/**
 */
package caex.caex30.caex;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for attribute type definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.AttributeFamily#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getAttributeFamily()
 * @model extendedMetaData="name='AttributeFamilyType' kind='elementOnly'"
 * @generated
 */
public interface AttributeFamily extends Attribute {

	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.AttributeFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getAttributeFamily_AttributeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeFamily> getAttributeType();
} // AttributeFamily
