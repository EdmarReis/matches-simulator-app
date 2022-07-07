package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setupRefresh();
        setupFloatingActionButton();


    }

    private void setupFloatingActionButton() {
        //TODO Criar evento de clique e simulacao de partidas
    }

    private void setupRefresh() {
        //TODO Atualizar as partidas na acao de swipe
    }

    private void setupMatchesList() {
        //TODO listar as partidas, consumindo nossa API
    }
}
