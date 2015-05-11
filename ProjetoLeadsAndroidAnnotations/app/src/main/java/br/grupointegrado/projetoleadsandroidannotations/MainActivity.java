package br.grupointegrado.projetoleadsandroidannotations;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.NoTitle;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @ViewById(R.id.lbTest)
    TextView tvTeste;

    @Click(R.id.lbTest)
    public void clickLb () {
        Toast.makeText(this, "Funcionando", Toast.LENGTH_LONG).show();
    }

//    https://github.com/excilys/androidannotations/wiki/Building-Project-Gradle

}
