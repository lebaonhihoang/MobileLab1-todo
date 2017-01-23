package com.example.todo.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class TaskDescriptionActivity extends AppCompatActivity {
    public static final String EXTRA_TASK_DESCRIPTION = "task";

    private EditText mDescriptionView;
    String taskDescription = mDescriptionView.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);

        mDescriptionView = (EditText) findViewById(R.id.descriptionText);
    }

    public void doneClicked(View view) {

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_description);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }
    // 1


    if (!taskDescription.isEmpty()) {
        // 2
        Intent result = new Intent();
        result.putExtra(EXTRA_TASK_DESCRIPTION, taskDescription);
        setResult(RESULT_OK, result);
    } else {
        // 3
        setResult(RESULT_CANCELED);
    }
    // 4
    finish();






}
