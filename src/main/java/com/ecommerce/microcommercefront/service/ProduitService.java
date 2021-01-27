package com.ecommerce.microcommercefront.service;

import com.ecommerce.microcommercefront.web.model.Produit;
import reactor.core.publisher.Flux;

public interface ProduitService {

    Flux<Produit> getListeProduits();
}
