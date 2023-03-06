package com.example.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Register ContexView
        TextView contextView = findViewById(R.id.contextView);
        registerForContextMenu(contextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refreesh:
                Toast.makeText(this, "Chọn tùy chọn 'Refreesh'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;
            case R.id.setting:
                Toast.makeText(this, "Chọn tùy chọn 'Setting'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

            case R.id.help:
                Toast.makeText(this, "Chọn tùy chọn 'Help'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

            case R.id.freedback:
                Toast.makeText(this, "Chọn tùy chọn 'Refreesh'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_content,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.copy:
                Toast.makeText(this, "Chọn tùy chọn'Copy'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;
            case R.id.paste:
                Toast.makeText(this, "Chọn tùy chọn 'Paste'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

            case R.id.cut:
                Toast.makeText(this, "Chọn tùy chọn 'Cut'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

            case R.id.delete:
                Toast.makeText(this, "Chọn tùy chọn 'Delete'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

        }
        return super.onContextItemSelected(item);
    }

    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this,view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.menu_popup,popupMenu.getMenu());
        //Register for menu click item
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return onPopupMenu(item);
            }
        });
        popupMenu.show();
    }

    private boolean onPopupMenu(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bold:
                Toast.makeText(this, "Chọn tùy chọn 'Bold'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;
            case R.id.italic:
                Toast.makeText(this, "Chọn tùy chọn 'Italic'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

            case R.id.underline:
                Toast.makeText(this, "Chọn tùy chọn 'UnderLine'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

            case R.id.strike:
                Toast.makeText(this, "Chọn tùy chọn 'Strike'", Toast.LENGTH_SHORT).show();
                openActivity2();
                break;

        }
        return true;
    }

    public void openActivity2() {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}