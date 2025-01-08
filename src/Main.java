public class Main {
    public static void main(String[] args) {
        
        Artist artist1 = new Artist("Vincent van Gogh", 37, "Painter", 15);
        Artist artist2 = new Artist("Leonardo da Vinci", 67, "Painter", 25);

        Artwork artwork1 = new Artwork("Starry Night", "Oil on Canvas", 1000000);
        Artwork artwork2 = new Artwork("Mona Lisa", "Oil on Wood", 8500000);

        ArtGallery gallery = new ArtGallery("The Classic Art Gallery", "Paris, France");

        gallery.addArtist(artist1);
        gallery.addArtist(artist2);
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);

        System.out.println(gallery);
        gallery.displayArtists();
        gallery.displayArtworks();

        gallery.filterExpensiveArtworks(2000000);

        gallery.sortArtistsByExperience();

        gallerydisplayPersonDetails(artist1);
        gallerydisplayPersonDetails(artist2);
    }

    private static void gallerydisplayPersonDetails(Artist artist1) {
    }
}
