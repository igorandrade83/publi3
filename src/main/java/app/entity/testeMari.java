package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TESTEMARI
 * @generated
 */
@Entity
@Table(name = "\"TESTEMARI\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.testeMari")
public class testeMari implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "real", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.math.BigDecimal real;

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double numero;

  /**
   * Construtor
   * @generated
   */
  public testeMari(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public testeMari setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém real
   * return real
   * @generated
   */
  
  public java.math.BigDecimal getReal(){
    return this.real;
  }

  /**
   * Define real
   * @param real real
   * @generated
   */
  public testeMari setReal(java.math.BigDecimal real){
    this.real = real;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.Double getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public testeMari setNumero(java.lang.Double numero){
    this.numero = numero;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    testeMari object = (testeMari)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
