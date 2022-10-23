
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Convert complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="Convert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="motant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Convert", propOrder = {
    "motant"
})
public class Convert {

    protected double motant;

    /**
     * Obtient la valeur de la propri�t� motant.
     * 
     */
    public double getMotant() {
        return motant;
    }

    /**
     * D�finit la valeur de la propri�t� motant.
     * 
     */
    public void setMotant(double value) {
        this.motant = value;
    }

}
