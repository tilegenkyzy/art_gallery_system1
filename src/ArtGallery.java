import java.util.ArrayList;
import java.util.List;

public class ArtGallery {
    private String name;
    private String location;
    private List<Artwork> artworks;
    private List<Artist> artists;

    public ArtGallery(String name, String location) {
        this.name = name;
        this.location = location;
        this.artworks = new ArrayList<>();
        this.artists = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    // Methods
    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void displayArtworks() {
        System.out.println("Artworks in " + name + ":");
        for (Artwork artwork : artworks) {
            System.out.println(artwork);
        }
    }

    public void displayArtists() {
        System.out.println("Artists associated with " + name + ":");
        for (Artist artist : artists) {
            System.out.println(artist);
        }
    }

    @Override
    public String toString() {
        return "ArtGallery{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", artworksCount=" + artworks.size() +
                ", artistsCount=" + artists.size() +
                '}';
    }
}
