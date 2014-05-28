package org.example.androidtest.android;


import android.content.Intent;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainActivity extends ActionBarActivity implements Button.OnClickListener {
    private Button testLogCatButton;
    private TextView helloWorldTextView;

    private Button testMotionEventButton;
    private Button testMemoryButton;
    private Button testDemoImageButton;

    private static Logger logger = LoggerFactory.getLogger(MainActivity.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testLogCatButton = (Button)findViewById(R.id.test_logcat_button);
        testLogCatButton.setOnClickListener(this);

        helloWorldTextView = (TextView)findViewById(R.id.hello_world_text_view);

        testMotionEventButton = (Button)findViewById(R.id.test_motion_event_button);
        testMotionEventButton.setOnClickListener(this);

        testMemoryButton = (Button)findViewById(R.id.test_memory_could_be_used_button);
        testMemoryButton.setOnClickListener(this);

        testDemoImageButton = (Button)findViewById(R.id.test_demo_image_button);
        testDemoImageButton.setOnClickListener(this);

        InitTabs();

    }

    private void InitTabs() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("十大").setTabListener(new MainTabListenter()));
        actionBar.addTab(actionBar.newTab().setText("收藏").setTabListener(new MainTabListenter()));
        actionBar.addTab(actionBar.newTab().setText("消息").setTabListener(new MainTabListenter()));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        logger.debug("View id is {}", view.getId());

//        Toast toast1 = Toast.makeText(this, String.format("View id is %1$d", view.get), Toast.LENGTH_SHORT);
//        toast1.show();

        if (view == testDemoImageButton) {
            Intent intent = new Intent(this, DemoImageActivity.class);
            startActivity(intent);
        }

        if (view == testLogCatButton) {
            Logger logger = LoggerFactory.getLogger(this.getClass());
//            LoggerContext lc  = (LoggerContext)LoggerFactory.getILoggerFactory();
//            StatusPrinter.print(lc);
            logger.debug("logback test - onClick");

//            Log.d("AndroidLog", "testLogcatButton - android log");
            helloWorldTextView.setText("testLogcatButton");
        }

        if (view == testMotionEventButton) {
            Intent intent = new Intent(this, MotionEventTest.class);
            startActivity(intent);
        }

        if (view == testMemoryButton) {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / (1024 * 1024));
            Toast toast = Toast.makeText(this, String.format("%1$s MB memory could be used.", maxMemory),
                    Toast.LENGTH_LONG);
            toast.show();
        }


    }

    class MainTabListenter implements ActionBar.TabListener {
        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }
    }



}
