package com.example.plugins

import com.example.models.Customer
import com.example.models.Response
import com.example.models.reqres.ReqRes
import io.ktor.application.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import java.util.*

fun Application.configureRouting() {
    val client = HttpClient(CIO){
        install(JsonFeature){
            serializer = GsonSerializer(){
                setPrettyPrinting()
                disableHtmlEscaping()
            }
        }
    }


    routing {

        get("/") {
            val reqres: ReqRes  = client.request("https://reqres.in/api/users?page=2"){
                method = HttpMethod.Get
            }
            call.respond(reqres)



        }

        get("/user"){
            call.respond(Response(
                true,
                Customer("Angga", "Ardinata", UUID.randomUUID().toString()),
                "Berhasil"
            ))
        }
    }
}
