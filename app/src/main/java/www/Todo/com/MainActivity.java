package www.Todo.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /*
        * Declared EditText Objects  and called as todoTitleEdittext,todoDateEditText,todoDescriptionEditText;
        * Declared Button Object and called as saveTodoButton;
     */
    EditText todoTitleEditText, todoDateEditText, todoDescriptionEditText;
    Button saveTodoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate layout using setContentView Method
        setContentView(R.layout.activity_main);
        //Calling initObjects and initCallBack method
        initObjects();
        initCallBack();

    }

    /*
    In this method  editText objects and button object are initialized
     */
    public void initObjects() {
        /*
         using findViewById references to the todoTitleEdittext,todoDateEditText,todoDescriptionEditText,saveTodoButton to  from layout
         */
        todoTitleEditText = (EditText) findViewById(R.id.editText_todo_title);
        todoDateEditText = (EditText) findViewById(R.id.editText_todo_date);
        todoDescriptionEditText = (EditText) findViewById(R.id.editText_todo_description);
        saveTodoButton = (Button) findViewById(R.id.button_save_todo);
    }

    /*
    In this method event callbacks are registered
     */
    public void initCallBack() {
        saveTodoButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
