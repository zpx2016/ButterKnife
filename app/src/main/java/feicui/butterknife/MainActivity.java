package feicui.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_text)
    TextView textText;
    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        unbinder = ButterKnife.bind(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        Toast.makeText(MainActivity.this, "解绑成功", Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.text_text)
    public void onClick() {
        textText.setText("hhhhhhhhhhhhhhhhhhhhhhhhh");
    }
}
