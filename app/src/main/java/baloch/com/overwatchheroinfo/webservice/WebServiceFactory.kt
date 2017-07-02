package baloch.com.overwatchheroinfo.webservice

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by baloch on 7/2/2017.
 */

class WebServiceFactory {

    companion object {
        val BASE_URL = "https://overwatch-api.net/api/v1"
        lateinit var webservice: WebService
    }

    fun getWebservice(): WebService {
        if (webservice == null) {
            val retrofitBuilder = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
            webservice = retrofitBuilder.create(WebService::class.java)
        }
        return webservice

    }



}