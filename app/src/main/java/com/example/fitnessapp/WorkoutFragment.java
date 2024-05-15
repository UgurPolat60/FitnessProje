package com.example.fitnessapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutFragment extends Fragment {

    public WorkoutFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workout, container, false);
        TextView workoutText = view.findViewById(R.id.workoutText);

        String workoutPlan = "Gün 1: Göğüs ve Triceps\n" +
                "Bench Press (Düz Bench)\n" +
                "Set: 4\n" +
                "Tekrar: 8-12\n" +
                "Yapılışı: Bench'te sırt üstü yatılır, ayaklar yere sağlam basar, eller omuz genişliğinde bara yerleştirilir. Bar yavaşça göğüse indirilir ve güçlü bir şekilde yukarı itilir.\n\n" +
                "Incline Dumbbell Press\n" +
                "Set: 3\n" +
                "Tekrar: 10-12\n" +
                "Yapılışı: Eğik bench'te sırt üstü yatılır, dumbbell'lar göğüs hizasına indirilir ve yukarı doğru itilir.\n\n" +
                "Dumbbell Flyes\n" +
                "Set: 3\n" +
                "Tekrar: 12-15\n" +
                "Yapılışı: Düz bench'te sırt üstü yatılır, dumbbell'lar göğüs hizasında başlanır ve yanlara doğru açılır, sonra tekrar başlangıç pozisyonuna getirilir.\n\n" +
                "Tricep Dips\n" +
                "Set: 3\n" +
                "Tekrar: 8-12\n" +
                "Yapılışı: Paralel barlar üzerinde eller omuz genişliğinde yerleştirilir, vücut aşağı indirilir ve kollar tamamen uzatılarak tekrar yukarı kaldırılır.\n\n" +
                "Tricep Pushdowns (Kablo)\n" +
                "Set: 3\n" +
                "Tekrar: 10-12\n" +
                "Yapılışı: Kablo makinesinde ayakta durulur, kollar dirsekten bükülü, kablo aşağı doğru itilir ve kontrollü bir şekilde geri bırakılır.\n\n" +
                "Gün 2: Sırt ve Biceps\n" +
                "Pull-Ups\n" +
                "Set: 4\n" +
                "Tekrar: 6-10\n" +
                "Yapılışı: Bar'dan eller omuz genişliğinde tutulur, vücut yukarı çekilir ve çene bara değdirilir, sonra kontrollü bir şekilde indirilir.\n\n" +
                "Bent Over Rows\n" +
                "Set: 4\n" +
                "Tekrar: 8-12\n" +
                "Yapılışı: Dizler hafifçe bükülü, belden öne eğilerek barbell tutulur ve karına doğru çekilir, sonra kontrollü şekilde indirilir.\n\n" +
                "Lat Pulldowns\n" +
                "Set: 3\n" +
                "Tekrar: 10-12\n" +
                "Yapılışı: Kablo makinesinde oturulur, bar üstten tutulur, göğüse doğru çekilir ve kontrollü bir şekilde geri bırakılır.\n\n" +
                "Barbell Curls\n" +
                "Set: 3\n" +
                "Tekrar: 10-12\n" +
                "Yapılışı: Barbell omuz genişliğinde tutulur, dirsekler sabit tutulur ve barbell yukarı doğru kaldırılır, sonra yavaşça indirilir.\n\n" +
                "Hammer Curls\n" +
                "Set: 3\n" +
                "Tekrar: 12-15\n" +
                "Yapılışı: Dumbbell'lar nötr pozisyonda tutulur, dirsekler sabit ve yanlarda, dumbbell'lar yukarı doğru kaldırılır ve yavaşça indirilir.\n\n" +
                "Gün 3: Bacak ve Omuz\n" +
                "Squats\n" +
                "Set: 4\n" +
                "Tekrar: 8-12\n" +
                "Yapılışı: Ayaklar omuz genişliğinde, barbell sırt üstünde tutulur, dizler bükülerek çömelinir ve kalkılır.\n\n" +
                "Leg Press\n" +
                "Set: 3\n" +
                "Tekrar: 10-12\n" +
                "Yapılışı: Leg press makinesinde sırt düz tutulur, ayaklar platforma yerleştirilir ve bacaklar bükülerek platform itilir.\n\n" +
                "Leg Curls\n" +
                "Set: 3\n" +
                "Tekrar: 12-15\n" +
                "Yapılışı: Leg curl makinesinde yatarak, ayaklar ped altında tutulur ve topuklar kalçalara doğru çekilir, sonra kontrollü şekilde geri bırakılır.\n\n" +
                "Shoulder Press (Dumbbell veya Barbell)\n" +
                "Set: 4\n" +
                "Tekrar: 8-12\n" +
                "Yapılışı: Dumbbell'lar veya barbell omuz hizasında tutulur, yukarı doğru itilir ve kontrollü bir şekilde indirilir.\n\n" +
                "Lateral Raises\n" +
                "Set: 3\n" +
                "Tekrar: 12-15\n" +
                "Yapılışı: Dumbbell'lar yanlarda tutulur, kollar hafifçe bükülü, dumbbell'lar yanlara doğru kaldırılır ve kontrollü bir şekilde indirilir.\n\n" +
                "Front Raises\n" +
                "Set: 3\n" +
                "Tekrar: 12-15\n" +
                "Yapılışı: Dumbbell'lar ön tarafta tutulur, kollar düz bir şekilde öne doğru kaldırılır ve kontrollü bir şekilde indirilir.";

        workoutText.setText(workoutPlan);

        return view;
    }
}
