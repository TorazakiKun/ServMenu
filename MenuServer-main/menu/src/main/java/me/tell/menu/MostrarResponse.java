//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.18 a las 12:44:21 AM CDT 
//


package me.tell.menu;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="menu" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tipoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "menu"
})
@XmlRootElement(name = "MostrarResponse")
public class MostrarResponse {

    @XmlElement(required = true)
    protected List<MostrarResponse.Menu> menu;

    /**
     * Gets the value of the menu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the menu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMenu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MostrarResponse.Menu }
     * 
     * 
     */
    public List<MostrarResponse.Menu> getMenu() {
        if (menu == null) {
            menu = new ArrayList<MostrarResponse.Menu>();
        }
        return this.menu;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tipoProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "nombreProducto",
        "tipoProducto",
        "precio"
    })
    public static class Menu {

        protected int id;
        @XmlElement(required = true)
        protected String nombreProducto;
        @XmlElement(required = true)
        protected String tipoProducto;
        protected float precio;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreProducto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreProducto() {
            return nombreProducto;
        }

        /**
         * Define el valor de la propiedad nombreProducto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreProducto(String value) {
            this.nombreProducto = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoProducto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoProducto() {
            return tipoProducto;
        }

        /**
         * Define el valor de la propiedad tipoProducto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoProducto(String value) {
            this.tipoProducto = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public float getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(float value) {
            this.precio = value;
        }

    }

}
