package com.aluraconversor.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorArchivo {

    public void guardarListaTransaccionTxt(List<Transaccion> listaTransaccion){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter escritura = new FileWriter("listaTransaccion.txt");
            escritura.write(listaTransaccion.toString());
            escritura.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
