package feicui.butterknife;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    @BindView(R.id.text_id)
    TextView textId;
    @BindView(R.id.button_id)
    Button buttonId;
    @BindView(R.id.text1_id)
    TextView text1Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.text_id, R.id.button_id, R.id.text1_id})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text_id:
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
                startActivity(intent);
                break;
            case R.id.button_id:
                Intent intent1=new Intent(this,MainActivity.class);
                startActivityForResult(intent1,1);
                break;
            case R.id.text1_id:
                break;
        }
    }
}
