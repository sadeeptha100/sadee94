package com.example.mad1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_ID, editText_Notes;
    Button button_add, button_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_ID = findViewById(R.id.edittext_id);
        editText_Notes = findViewById(R.id.edittext_note);
        button_add = findViewById(R.id.add_note);
        button_view = findViewById(R.id.view_note);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringID = editText_ID.getText().toString();
                String stringNotes = editText_Notes.getText().toString();

                if (stringID.length() <= 0 || stringNotes.length() <= 0) {
                    Toast.makeText(MainActivity.this, "Enter All Data", Toast.LENGTH_SHORT).show();

                } else {
                    DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this);
                    StudentModel studentmodel = new StudentModel(stringID, stringNotes);
                    databaseHelper.addNotes(studentModel);
                    Toast.makeText(MainActivity.this, "Add student note Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());

                    Toast.makeText(MainActivity.this, "Add student note Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });


        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewSudentActivity.class);
                startActivity(intent);
            }
        });


    }
}