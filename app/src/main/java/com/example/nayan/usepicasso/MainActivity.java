package com.example.nayan.usepicasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageView1;
    Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.img);
        imageView1 = (ImageView) findViewById(R.id.img1);
        Picasso.with(this)
                .load("http://www.radhooni.com/content/backend/uploads/menu/thumbnail/chingri_balachao.jpg")
                .into(imageView);
        prePareDisplay();
    }

    public void prePareDisplay() {
        model.setImage("http://www.radhooni.com/content/backend/uploads/menu/thumbnail/chingri_balachao.jpg");
        Picasso.with(this)
                .load(model.getImage())
                .rotate(280)
                .into(imageView1);

    }
}
