package game.entities;

import java.util.List;

public class ObjectOfField {
	private ObjectType objectType;
	private List<Possibility> possibilities;

	public ObjectType getObjectType() {
		return objectType;
	}

	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}

	public List<Possibility> getPossibilities() {
		return possibilities;
	}

	public void setPossibilities(List<Possibility> possibilities) {
		this.possibilities = possibilities;
	}
}
