/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sidebar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sidebar#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sidebar#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sidebar#getRadio <em>Radio</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sidebar#getCheckbox <em>Checkbox</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sidebar#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Sidebar#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar()
 * @model
 * @generated
 */
public interface Sidebar extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Sidebar#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Sidebar#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Radio</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Radio}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radio</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radio</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar_Radio()
   * @model containment="true"
   * @generated
   */
  EList<Radio> getRadio();

  /**
   * Returns the value of the '<em><b>Checkbox</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Checkbox}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Checkbox</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Checkbox</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar_Checkbox()
   * @model containment="true"
   * @generated
   */
  EList<Checkbox> getCheckbox();

  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar_Selector()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelector();

  /**
   * Returns the value of the '<em><b>Button</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Button}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Button</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Button</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSidebar_Button()
   * @model containment="true"
   * @generated
   */
  EList<Button> getButton();

} // Sidebar
