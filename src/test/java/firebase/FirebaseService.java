package firebase;

import java.io.InputStream;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class FirebaseService {

    private static Firestore db;

    public static Firestore getDB() {
        if (db == null) {
            try {
                InputStream serviceAccount =
                    FirebaseService.class.getResourceAsStream("firebase-key.json");

                FirebaseOptions options = FirebaseOptions.builder()
                        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                        .build();

                if (FirebaseApp.getApps().isEmpty()) {
                    FirebaseApp.initializeApp(options);
                }

                db = FirestoreClient.getFirestore();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return db;
    }
}