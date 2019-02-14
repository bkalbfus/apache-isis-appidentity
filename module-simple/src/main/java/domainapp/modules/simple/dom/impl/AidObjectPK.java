package domainapp.modules.simple.dom.impl;

import java.io.Serializable;

//import org.apache.commons.lang3.StringUtils;

//    @javax.inject.Inject

//    @javax.jdo.annotations.NotPersistent
//    @lombok.Getter(AccessLevel.NONE) @lombok.Setter(AccessLevel.NONE)
//    CourtPrecincts courtPrecincts;
public class AidObjectPK implements Serializable {

    public String name;

    public AidObjectPK() {
    }

    public AidObjectPK(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other != null && (other instanceof AidObjectPK)) {
            AidObjectPK otherPK = (AidObjectPK) other;
            return otherPK.name.equals(this.name);
        }
        return false;
    }
    
}
