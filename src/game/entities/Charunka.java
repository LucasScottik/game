package game.entities;

/**
 * Place of {@code Field} should have {@code Coordinates} and may keep
 * {@code ObjectOfField} on it. If there is no {@code ObjectOfField} on it than
 * {@link Charunka#getObjectOfField()} is <code>null</code>.
 * 
 * @author User
 */
public class Charunka {
	private Coordinates coordinates;
	private ObjectOfField objectOfField;

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public ObjectOfField getObjectOfField() {
		return objectOfField;
	}

	public void setObjectOfField(ObjectOfField objectOfField) {
		this.objectOfField = objectOfField;
	}
}
