package com.example.telaartigo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.telaartigo.R;
import com.example.telaartigo.fragment.BanhoPetFragment;
import com.example.telaartigo.fragment.CuriosidadeNarizFragment;
import com.example.telaartigo.fragment.CuriosidadeOlfatoFragment;
import com.example.telaartigo.fragment.ImportanciaFucinheiraFragment;
import com.example.telaartigo.fragment.ImportanciaPasseioFragment;
import com.example.telaartigo.fragment.PrevencaoPulgaFragment;
import com.example.telaartigo.fragment.PrimeiraVacinaFragment;
import com.example.telaartigo.fragment.QuantidadeRacaoFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnRacao, btnVacina, btnPrevencao, btnBanho, btnImportancia, btnPasseio, btnOlfato, btnNariz;
    private QuantidadeRacaoFragment quantidadeRacaoFragment;
    private PrimeiraVacinaFragment primeiraVacinaFragment;
    private PrevencaoPulgaFragment prevencaoPulgaFragment;
    private BanhoPetFragment banhoPetFragment;
    private ImportanciaFucinheiraFragment importanciaFucinheiraFragment;
    private ImportanciaPasseioFragment importanciaPasseioFragment;
    private CuriosidadeOlfatoFragment curiosidadeOlfatoFragment;
    private CuriosidadeNarizFragment curiosidadeNarizFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRacao = findViewById(R.id.btnRacao);
        btnVacina = findViewById(R.id.btnVacina);
        btnPrevencao = findViewById(R.id.btnPrevencao);
        btnBanho = findViewById(R.id.btnBanho);
        btnImportancia = findViewById(R.id.btnImportancia);
        btnPasseio = findViewById(R.id.btnPasseio);
        btnOlfato = findViewById(R.id.btnOlfato);
        btnNariz = findViewById(R.id.btnNariz);

        quantidadeRacaoFragment = new QuantidadeRacaoFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameConteudo,quantidadeRacaoFragment);
        transaction.commit();

        btnRacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,quantidadeRacaoFragment);
                transaction.commit();
            }
        });

        btnVacina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primeiraVacinaFragment = new PrimeiraVacinaFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,primeiraVacinaFragment);
                transaction.commit();
            }
        });

        btnPrevencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevencaoPulgaFragment = new PrevencaoPulgaFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,prevencaoPulgaFragment);
                transaction.commit();
            }
        });

        btnBanho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                banhoPetFragment = new BanhoPetFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,banhoPetFragment);
                transaction.commit();
            }
        });

        btnImportancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                importanciaFucinheiraFragment = new ImportanciaFucinheiraFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,importanciaFucinheiraFragment);
                transaction.commit();
            }
        });

        btnPasseio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                importanciaPasseioFragment = new ImportanciaPasseioFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,importanciaPasseioFragment);
                transaction.commit();
            }
        });

        btnOlfato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curiosidadeOlfatoFragment = new CuriosidadeOlfatoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,curiosidadeOlfatoFragment);
                transaction.commit();
            }
        });

        btnNariz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curiosidadeNarizFragment = new CuriosidadeNarizFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo,curiosidadeNarizFragment);
                transaction.commit();
            }
        });

    }
}