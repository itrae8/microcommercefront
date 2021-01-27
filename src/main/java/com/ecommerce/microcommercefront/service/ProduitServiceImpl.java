package com.ecommerce.microcommercefront.service;

import com.ecommerce.microcommercefront.web.model.Produit;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Component
public class ProduitServiceImpl implements ProduitService {


    private WebClient webClient = WebClient.create("http://localhost:9090");

    @Override
    public Flux<Produit> getListeProduits() {
        return webClient.get()
                .uri("/Produits")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToFlux(Produit.class);
    }
}
