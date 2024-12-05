package com.viona.mi2a_api_produk.service

import com.viona.mi2a_api_produk.model.ResponseProduk
import retrofit2.Call
import retrofit2.http.GET

interface ProdukService {
    @GET("products")//ed point
    fun getAllProduk(): Call<ResponseProduk>
}