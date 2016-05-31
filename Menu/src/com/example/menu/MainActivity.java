package com.example.menu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
	private Button btn;
	private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    
    void init(){
    	btn = (Button) findViewById(R.id.button);
    	context = MainActivity.this;
    	registerForContextMenu(btn);
    }
    
    /**
     * 选项菜单
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(1, 1, 1, "菜单1");
        menu.add(1, 2, 2, "菜单2");
        menu.add(1, 3, 3, "菜单3");
        menu.add(2, 4, 4, "菜单4");
        //menu.add(groupId, itemId, order, title)
        
        return true;
    }
    
    /**
     * 上下文菜单
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
    		ContextMenuInfo menuInfo) {
    	// TODO Auto-generated method stub
    	super.onCreateContextMenu(menu, v, menuInfo);
    	menu.add(1, 5, 5, "菜单5");
    	menu.add(1, 6, 6, "菜单6");
    	menu.add(1, 7, 7, "菜单7");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
		case R.id.action_settings:
			Toast.makeText(context, "点击setting菜单", Toast.LENGTH_SHORT).show();
			return true;
		case 1:
			Toast.makeText(context, "点击1菜单", Toast.LENGTH_SHORT).show();
			return true;
		case 2:
			Toast.makeText(context, "点击2菜单", Toast.LENGTH_SHORT).show();
			return true;
		case 3:
			Toast.makeText(context, "点击3菜单", Toast.LENGTH_SHORT).show();
			return true;
		case 4:
			Toast.makeText(context, "点击4菜单", Toast.LENGTH_SHORT).show();
			return true;
		default:
			break;
		}
        return super.onOptionsItemSelected(item);
    }
    
    @Override
    public boolean onContextItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	int id2 = item.getItemId();
    	switch (id2) {
		case 5:
			Toast.makeText(context, "点击5菜单", Toast.LENGTH_SHORT).show();
			break;
		case 6:
			Toast.makeText(context, "点击6菜单", Toast.LENGTH_SHORT).show();
			break;
		case 7:
			Toast.makeText(context, "点击7菜单", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
    	return super.onContextItemSelected(item);
    }
}
