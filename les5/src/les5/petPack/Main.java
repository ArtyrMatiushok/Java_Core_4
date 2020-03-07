package les5.petPack;

public class Main {

	public static void main(String[] args) {
		Pet[] arrPets = new Pet[6];
		arrPets[0] = new Cat();
		arrPets[1] = new Cow();
		arrPets[2] = new Dog();
		arrPets[3] = new Cat();
		arrPets[4] = new Cow();
		arrPets[5] = new Dog();
		for (Pet p : arrPets)
			p.voice();
	}

}
