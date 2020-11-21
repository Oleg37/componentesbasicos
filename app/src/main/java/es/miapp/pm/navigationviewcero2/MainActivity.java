package es.miapp.pm.navigationviewcero2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayoutMain); // Instanciamos el drawer

        // Ponemos en modo escucha nuestro icono y el drawer lo iniciamos por la izquierda
        findViewById(R.id.iVMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.navigationView); // Instancia de NavigationView

        // Obtenemos nuestro NavController
        NavController navController = Navigation.findNavController(this, R.id.fragment);

        // Clase para conectar dichos elementos (BottomView o NavigationView con nuestro NavController)
        NavigationUI.setupWithNavController(navigationView, navController);
    }
}