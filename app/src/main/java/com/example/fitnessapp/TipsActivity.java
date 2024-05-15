package com.example.fitnessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TipsActivity extends AppCompatActivity {

    private String[] tips = {
            "1. Su içmeyi ihmal etmeyin.",
            "2. Sağlığınız için formunuza dikkat edin.",
            "3. Uyku gelişim için en önemli etkenlerdendir.",
            "4. Yemediğin sürece sadece kasları yıkmış olursun",
            "5. Isınma yapmadan başlanan spor sporun amacından çıkar.",
            "6. Aç karna spor yapılmamalı.",
            "7. Protein alımınızı artırın.",
            "8. Stresten uzak durun.",
            "9. Nefesiniz yerine gelmeden yeni harekete geçmeyin.",
            "10. Düzenli olarak check-up yaptırın.",
            "11. Su kaybına karşı önlem alın.",
            "12. Egzersiz öncesi ve sonrası esneme yapın.",
            "13. Hafif ağırlıklarla başlayın.",
            "14. İyi bir spor ayakkabı giyin.",
            "15. Spor ekipmanlarını doğru kullanın.",
            "16. Egzersiz sıklığınıza dikkat edin.",
            "17. Enerji seviyenizi kontrol edin.",
            "18. Güneş kremi kullanın (dış mekanda spor yaparken).",
            "19. Sakatlanma riskini azaltmak için dikkatli olun.",
            "20. Motivasyonunuzu yüksek tutun."
    };

    private int currentTipIndex = 0;
    private TextView tipTextView;
    private Button nextTipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        tipTextView = findViewById(R.id.tipTextView);
        nextTipButton = findViewById(R.id.nextTipButton);


        tipTextView.setText(tips[currentTipIndex]);


        nextTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentTipIndex = (currentTipIndex + 1) % tips.length;
                tipTextView.setText(tips[currentTipIndex]);
            }
        });
    }
}
