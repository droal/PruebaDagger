package com.example.pruebadaggerlogin.root;


/**Logica de la clase Apliccation*/

import android.app.Application;

import com.example.pruebadaggerlogin.login.LoginModule;

/**Acá se declaran los modulos que requiere la aplicación*/
public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
