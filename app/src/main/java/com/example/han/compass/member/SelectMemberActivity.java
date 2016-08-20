package com.example.han.compass.member;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.han.compass.CustomAdapter;
import com.example.han.compass.R;
import com.example.han.compass.adapter.CustomMemberAdapter;

public class SelectMemberActivity extends AppCompatActivity {
    private ListView m_ListView;
    private CustomMemberAdapter member_Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_member);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("멤버선택");

        // 커스텀 어댑터 생성
        member_Adapter = new CustomMemberAdapter();
        // Xml에서 추가한 ListView 연결
        m_ListView = (ListView) findViewById(R.id.memberListView);
        // ListView에 어댑터 연결
        m_ListView.setAdapter(member_Adapter);

        // ListView에 아이템 추가
        member_Adapter.add("Jimmy Cole");
        member_Adapter.add("Eric");
        member_Adapter.add("Danny");
        member_Adapter.add("Garrett");
        member_Adapter.add("Tillie");
        member_Adapter.add("Edward");
        member_Adapter.add("김밥");
        member_Adapter.add("치킨");

        //Log.d("TedPark","로그 내용");
    }

    // 아이템 터치 이벤트
    private AdapterView.OnItemClickListener onClickListItem = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            //Drawable dr = getResources().getDrawable(R.drawable.correct);
            Button button = (Button) findViewById(arg1.getId());
            button.setBackgroundResource(R.drawable.correct_select);
            //btn_check

            // 이벤트 발생 시 해당 아이템 위치의 텍스트를 출력
            //Toast.makeText(getApplicationContext(), m_Adapter.getItem(arg2), Toast.LENGTH_SHORT).show();
        }
    };
}
