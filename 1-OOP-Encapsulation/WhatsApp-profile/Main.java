import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a profile with all parameters
            Profile user1 = new Profile("Alice", "+1", "1234567890", "https://example.com/photo.jpg");

            // Creating a profile using the default photo and about
            Profile user2 = new Profile("Bob", "+44", "9876543210");

            // Display user info
            System.out.println("User 1:");
            System.out.println("Name: " + user1.getName());
            System.out.println("Phone: " + user1.getPhone());
            System.out.println("Photo URL: " + user1.getProfilePhotoUrl());
            System.out.println("About: " + user1.getAbout());
            System.out.println("Last Seen: " + user1.getLastSeen());

            // Update about info and last seen
            user1.setAbout("Busy at work.");
            user1.updateLastSeen(LocalDateTime.now());

            System.out.println("\nUser 1 updated:");
            System.out.println("About: " + user1.getAbout());
            System.out.println("Last Seen: " + user1.getLastSeen());

        } catch (URISyntaxException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
 
