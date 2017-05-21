/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mensamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mensamodel#getHeader <em>Header</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mensamodel#getSiderbar <em>Siderbar</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mensamodel#getFooter <em>Footer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mensamodel#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMensamodel()
 * @model
 * @generated
 */
public interface Mensamodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' containment reference.
   * @see #setHeader(Header)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMensamodel_Header()
   * @model containment="true"
   * @generated
   */
  Header getHeader();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mensamodel#getHeader <em>Header</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' containment reference.
   * @see #getHeader()
   * @generated
   */
  void setHeader(Header value);

  /**
   * Returns the value of the '<em><b>Siderbar</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Siderbar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Siderbar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Siderbar</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMensamodel_Siderbar()
   * @model containment="true"
   * @generated
   */
  EList<Siderbar> getSiderbar();

  /**
   * Returns the value of the '<em><b>Footer</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Footer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Footer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Footer</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMensamodel_Footer()
   * @model containment="true"
   * @generated
   */
  EList<Footer> getFooter();

  /**
   * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Menu}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menus</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMensamodel_Menus()
   * @model containment="true"
   * @generated
   */
  EList<Menu> getMenus();

} // Mensamodel
