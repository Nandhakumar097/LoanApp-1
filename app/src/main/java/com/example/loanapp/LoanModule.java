package com.example.loanapp;


import com.example.loanapp.repository.MyRepositoryImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class LoanModule {

    @Provides
    @Singleton
    MyAPI provideApiService() {
        return new Retrofit.Builder()
                .baseUrl("http://52.66.41.156:3000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(MyAPI.class);
    }
    @Provides
    @Singleton
    MyRepository provideMyRepository(MyAPI myAPI){
        return new MyRepositoryImpl(myAPI);
    }

}
