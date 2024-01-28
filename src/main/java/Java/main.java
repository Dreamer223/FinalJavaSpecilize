package Java;

public class main {
    public static void main(String[] args) {
        String filename = "pets.txt"; // Имя файла для хранения данных
        PetRegistry registry = new PetRegistry(filename);
        registry.displayMenu();
        registry.saveDataToFile();
    }
}
