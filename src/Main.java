public class Main {
    public static void main(String[] args) {
        // Создаем художников
        Artist artist1 = new Artist("Vincent van Gogh", 37, "Painter", 15);
        Artist artist2 = new Artist("Leonardo da Vinci", 67, "Painter", 25);

        // Создаем произведения искусства
        Artwork artwork1 = new Artwork("Starry Night", "Oil on Canvas", 1000000);
        Artwork artwork2 = new Artwork("Mona Lisa", "Oil on Wood", 8500000);

        // Создаем галерею
        ArtGallery gallery = new ArtGallery("The Classic Art Gallery", "Paris, France");

        // Добавляем художников и произведения в галерею
        gallery.addArtist(artist1);
        gallery.addArtist(artist2);
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);

        // Вывод информации о галерее
        System.out.println(gallery);
        gallery.displayArtists();
        gallery.displayArtworks();

        // Фильтрация дорогих произведений
        gallery.filterExpensiveArtworks(2000000);

        // Сортировка художников по опыту
        gallery.sortArtistsByExperience();

        // Полиморфизм: работа с базовым классом Person
        gallerydisplayPersonDetails(artist1);
        gallerydisplayPersonDetails(artist2);
    }

    private static void gallerydisplayPersonDetails(Artist artist1) {
    }
}
