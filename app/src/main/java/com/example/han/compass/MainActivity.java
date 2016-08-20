package com.example.han.compass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.han.compass.member.SelectMemberActivity;

public class MainActivity extends AppCompatActivity {
    private ListView m_ListView;
    private CustomAdapter m_Adapter;
    //private ArrayAdapter<String> m_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("약속 리스트");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(), SelectMemberActivity.class));

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                //Intent
            }
        });

        // Android에서 제공하는 string 문자열 하나를 출력 가능한 layout으로 어댑터 생성
//        m_Adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
//        // Xml에서 추가한 ListView 연결
//        m_ListView = (ListView) findViewById(R.id.mainListView);
//        // ListView에 어댑터 연결
//        m_ListView.setAdapter(m_Adapter);
//        // ListView 아이템 터치 시 이벤트 추가
//        m_ListView.setOnItemClickListener(onClickListItem);

        // 커스텀 어댑터 생성
        m_Adapter = new CustomAdapter();
        // Xml에서 추가한 ListView 연결
        m_ListView = (ListView) findViewById(R.id.mainListView);
        // ListView에 어댑터 연결
        m_ListView.setAdapter(m_Adapter);

        // ListView에 아이템 추가
        m_Adapter.add("2016.08.22");
        m_Adapter.add("2016.08.22");
        m_Adapter.add("2016.08.22");
        m_Adapter.add("2016.08.22");
        m_Adapter.add("2016.08.22");
        m_Adapter.add("2016.08.22");
        m_Adapter.add("2016.08.22");
    }

    // 아이템 터치 이벤트
    private AdapterView.OnItemClickListener onClickListItem = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            // 이벤트 발생 시 해당 아이템 위치의 텍스트를 출력
            //Toast.makeText(getApplicationContext(), m_Adapter.getItem(arg2), Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
