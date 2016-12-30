package assignment.android.acadgild.contextxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.txtViewClick);
        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("Context Menu");

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.Action1: {
            Toast.makeText(this, "Action 1 invoked", Toast.LENGTH_SHORT).show();
            break;
        }
        case R.id.Action2: {

            Toast.makeText(this, "Action 2 invoked", Toast.LENGTH_SHORT).show();
            break;
        }
        case R.id.Action3: {

            Toast.makeText(this, "Action 3 invoked", Toast.LENGTH_SHORT).show();
            break;
        }
        default:
            break;
    }
        return super.onContextItemSelected(item);
    }



}
