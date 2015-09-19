/*
 * VowlObjectProperty.java
 *
 */

package de.uni_stuttgart.vis.vowl.owl2vowl.model.properties;

import de.uni_stuttgart.vis.vowl.owl2vowl.constants.PropertyType;
import de.uni_stuttgart.vis.vowl.owl2vowl.parser.vowl.VowlElementVisitor;
import org.semanticweb.owlapi.model.IRI;

/**
 *
 */
public class VowlObjectProperty extends AbstractProperty {
	public VowlObjectProperty(IRI iri) {
		super(iri, PropertyType.OBJECT);
	}

	@Override
	public void accept(VowlElementVisitor visitor) {
		visitor.visit(this);
	}
}
