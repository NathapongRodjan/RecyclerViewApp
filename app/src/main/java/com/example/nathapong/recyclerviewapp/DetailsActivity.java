package com.example.nathapong.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView NameId, DescriptionId, RatingId;

    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        NameId = (TextView)findViewById(R.id.NameId);
        DescriptionId = (TextView)findViewById(R.id.DescriptionId);
        RatingId = (TextView)findViewById(R.id.RatingId);

        if (extras != null){
            NameId.setText(extras.getString("name"));
            DescriptionId.setText(extras.getString("description"));
            RatingId.setText(extras.getString("rating"));
        }
    }
}
