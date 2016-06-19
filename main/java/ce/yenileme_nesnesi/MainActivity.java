package ce.yenileme_nesnesi;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {

    private SwipeRefreshLayout yenileme_nesnesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yenileme_nesnesi = (SwipeRefreshLayout)findViewById(R.id.yenileme_nesnesi); // nesnemizi tanıttık
        yenileme_nesnesi.setOnRefreshListener(this); // nesnenin bu Class içerinde çalışağını belirttik
        // uygulama başlar başlamaz aktif oldu bu şekilde
    }

    @Override
    public void onRefresh() {
        Toast.makeText(MainActivity.this, "Yenileme başarılı", Toast.LENGTH_LONG).show();
        yenileme_nesnesi.setRefreshing(false); /* nesnenin yenileme özelliği kapatıldı
         aksi halde sürekli çalışır bu kısmı işleminiz yapılsada yapılmasada kullanın çünkü işlem başarısız olsada
         hata mesajı verirsiniz ama işlem yapılana kadar olan kısımda bu kodu kullanmayın sonrası için kullanın */
    }
}