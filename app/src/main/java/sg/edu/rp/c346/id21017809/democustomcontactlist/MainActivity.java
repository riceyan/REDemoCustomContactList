package sg.edu.rp.c346.id21017809.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        iv = findViewById(R.id.imageView);

        String imageUrl = "https://cdn.icon-icons.com/icons2/689/PNG/512/android_robot_mobile_mood_emoji_happy_joke_tounge_icon-icons.com_61434.png";
        Picasso.with(this).load(imageUrl).into(iv);

        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 65442334, 'F');
        Contact item2 = new Contact("Ken", 65, 97442437, 'M');
        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.row, alContactList);

        lvContact.setAdapter(caContact);
    }
}