package com.mafyusuf.thirukkural;

        import androidx.annotation.RequiresApi;
        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Build;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.TextView;
        import android.widget.Toolbar;
        import org.w3c.dom.Text;
        import java.util.ArrayList;

public class thirukkuralActivity extends AppCompatActivity {

    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_thirukkural );

        tv =findViewById(  R.id.title );
        tv1 =findViewById( R.id.kural );
        tv2 =findViewById( R.id.kural2 );
        tv3 =findViewById( R.id.kural3 );
        tv4 =findViewById( R.id.kural4 );
        tv5 =findViewById( R.id.kural5 );
        tv6 =findViewById( R.id.kural6 );
        tv7 =findViewById( R.id.kural7 );
        tv8 =findViewById( R.id.kural8 );
        tv9 =findViewById( R.id.kural9 );
        tv10=findViewById( R.id.kural10);

        Bundle bundle = getIntent().getExtras();
       thirukkurals t = (thirukkurals) bundle.getSerializable( "thirukkural" );

        tv.setText( t.getAdhigaram() );
        tv1.setText( t.getKurals1() );
        tv2.setText( t.getKural2() );
        tv3.setText( t.getKural3() );
        tv4.setText( t.getKural4());
        tv5.setText( t.getKural5() );
        tv6.setText( t.getKural6() );
        tv7.setText(t.getKural7());
        tv8.setText( t.getKural8());
        tv9.setText( t.getKural9());
        tv10.setText( t.getKural10() );
    }
}
