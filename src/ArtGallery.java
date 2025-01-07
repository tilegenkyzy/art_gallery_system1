import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArtGallery {
    private String name;
    private String location;
    private List<Artist> artists;
    private List<Artwork> artworks;

    public ArtGallery(String name, String location) {
        this.name = name;
        this.location = location;
        this.artists = new ArrayList<>();
        this.artworks = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void displayArtists() {
        System.out.println("Artists associated with " + name + ":");
        for (Artist artist : artists) {
            System.out.println(artist);
        }
    }

    public void displayArtworks() {
        System.out.println("Artworks in " + name + ":");
        for (Artwork artwork : artworks) {
            System.out.println(artwork);
        }
    }

    public void filterExpensiveArtworks(double minPrice) {
        System.out.println("Artworks priced above " + minPrice + ":");
        List<Artwork> filteredArtworks = artworks.stream()
                .filter(artwork -> artwork.getPrice() > minPrice)
                .collect(Collectors.toList());
        filteredArtworks.forEach(System.out::println);
    }

    public void sortArtistsByExperience() {
        System.out.println("Artists sorted by experience:");
        artists.stream()
                .sorted(Comparator.comparingInt(Artist::getExperienceYears).reversed())
                .forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "ArtGallery{name='" + name + '\'' + ", location='" + location + '\'' + ", artworksCount=" + artworks.size() + ", artistsCount=" + artists.size() + '}';
    }
}