//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.04 at 02:22:39 PM EST 
//


package com.github.edeandrea.xjcplugin.generated.overriddenoutputroot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Modifications to the build process which is activated based on environmental
 *         parameters or command line arguments.
 * 
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="activation" type="{http://maven.apache.org/POM/4.0.0}Activation" minOccurs="0"/&gt;
 *         &lt;element name="build" type="{http://maven.apache.org/POM/4.0.0}BuildBase" minOccurs="0"/&gt;
 *         &lt;element name="modules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="distributionManagement" type="{http://maven.apache.org/POM/4.0.0}DistributionManagement" minOccurs="0"/&gt;
 *         &lt;element name="properties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dependencyManagement" type="{http://maven.apache.org/POM/4.0.0}DependencyManagement" minOccurs="0"/&gt;
 *         &lt;element name="dependencies" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="repositories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pluginRepositories" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reports" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="reporting" type="{http://maven.apache.org/POM/4.0.0}Reporting" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {

})
public class Profile
    implements Serializable
{

    @XmlElement(defaultValue = "default")
    protected String id;
    protected Activation activation;
    protected BuildBase build;
    protected Profile.Modules modules;
    protected DistributionManagement distributionManagement;
    protected Profile.Properties properties;
    protected DependencyManagement dependencyManagement;
    protected Profile.Dependencies dependencies;
    protected Profile.Repositories repositories;
    protected Profile.PluginRepositories pluginRepositories;
    protected Profile.Reports reports;
    protected Reporting reporting;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link Activation }
     *     
     */
    public Activation getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activation }
     *     
     */
    public void setActivation(Activation value) {
        this.activation = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link BuildBase }
     *     
     */
    public BuildBase getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildBase }
     *     
     */
    public void setBuild(BuildBase value) {
        this.build = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Modules }
     *     
     */
    public Profile.Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Modules }
     *     
     */
    public void setModules(Profile.Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the distributionManagement property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionManagement }
     *     
     */
    public DistributionManagement getDistributionManagement() {
        return distributionManagement;
    }

    /**
     * Sets the value of the distributionManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionManagement }
     *     
     */
    public void setDistributionManagement(DistributionManagement value) {
        this.distributionManagement = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Properties }
     *     
     */
    public Profile.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Properties }
     *     
     */
    public void setProperties(Profile.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the dependencyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link DependencyManagement }
     *     
     */
    public DependencyManagement getDependencyManagement() {
        return dependencyManagement;
    }

    /**
     * Sets the value of the dependencyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependencyManagement }
     *     
     */
    public void setDependencyManagement(DependencyManagement value) {
        this.dependencyManagement = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Dependencies }
     *     
     */
    public Profile.Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Dependencies }
     *     
     */
    public void setDependencies(Profile.Dependencies value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the repositories property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Repositories }
     *     
     */
    public Profile.Repositories getRepositories() {
        return repositories;
    }

    /**
     * Sets the value of the repositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Repositories }
     *     
     */
    public void setRepositories(Profile.Repositories value) {
        this.repositories = value;
    }

    /**
     * Gets the value of the pluginRepositories property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.PluginRepositories }
     *     
     */
    public Profile.PluginRepositories getPluginRepositories() {
        return pluginRepositories;
    }

    /**
     * Sets the value of the pluginRepositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.PluginRepositories }
     *     
     */
    public void setPluginRepositories(Profile.PluginRepositories value) {
        this.pluginRepositories = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Reports }
     *     
     */
    public Profile.Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Reports }
     *     
     */
    public void setReports(Profile.Reports value) {
        this.reports = value;
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting }
     *     
     */
    public Reporting getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting }
     *     
     */
    public void setReporting(Reporting value) {
        this.reporting = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dependencies"
    })
    public static class Dependencies
        implements Serializable
    {

        @XmlElement(name = "dependency")
        protected List<Dependency> dependencies;

        /**
         * Gets the value of the dependencies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependencies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDependencies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dependency }
         * 
         * 
         */
        public List<Dependency> getDependencies() {
            if (dependencies == null) {
                dependencies = new ArrayList<Dependency>();
            }
            return this.dependencies;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modules"
    })
    public static class Modules
        implements Serializable
    {

        @XmlElement(name = "module")
        protected List<String> modules;

        /**
         * Gets the value of the modules property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modules property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModules().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getModules() {
            if (modules == null) {
                modules = new ArrayList<String>();
            }
            return this.modules;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pluginRepositories"
    })
    public static class PluginRepositories
        implements Serializable
    {

        @XmlElement(name = "pluginRepository")
        protected List<Repository> pluginRepositories;

        /**
         * Gets the value of the pluginRepositories property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluginRepositories property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPluginRepositories().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Repository }
         * 
         * 
         */
        public List<Repository> getPluginRepositories() {
            if (pluginRepositories == null) {
                pluginRepositories = new ArrayList<Repository>();
            }
            return this.pluginRepositories;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "anies"
    })
    public static class Properties
        implements Serializable
    {

        @XmlAnyElement
        protected List<Element> anies;

        /**
         * Gets the value of the anies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAnies() {
            if (anies == null) {
                anies = new ArrayList<Element>();
            }
            return this.anies;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "anies"
    })
    public static class Reports
        implements Serializable
    {

        @XmlAnyElement
        protected List<Element> anies;

        /**
         * Gets the value of the anies property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the anies property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnies().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAnies() {
            if (anies == null) {
                anies = new ArrayList<Element>();
            }
            return this.anies;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "repositories"
    })
    public static class Repositories
        implements Serializable
    {

        @XmlElement(name = "repository")
        protected List<Repository> repositories;

        /**
         * Gets the value of the repositories property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repositories property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepositories().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Repository }
         * 
         * 
         */
        public List<Repository> getRepositories() {
            if (repositories == null) {
                repositories = new ArrayList<Repository>();
            }
            return this.repositories;
        }

    }

}