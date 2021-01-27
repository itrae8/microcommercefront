package com.ecommerce.microcommercefront.web.controller;

import com.ecommerce.microcommercefront.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class ListeProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/")
    public String getListeProduit(final Model model) {

        /*String viewName = "listeProduits";

        Map<String, Object> model = new HashMap<String,Object>();

        List listeProduits = new ArrayList<Produit>();

        /*listeProduits.add(new Produit(0,"Produit1",50));
        listeProduits.add(new Produit(1,"Produit2",100));
        listeProduits.add(new Produit(2,"Produit3",150));
        listeProduits.add(new Produit(3,"Produit4",200));

        model.put("listeProduits",listeProduits);

        produitService.getListeProduits().subscribe(produit -> System.out.println(produit));
        produitService.getListeProduits().subscribe(produit -> listeProduits.add(produit))*/

        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
                new ReactiveDataDriverContextVariable(produitService.getListeProduits(), 1);

        model.addAttribute("produits", reactiveDataDrivenMode);

        return "index";
    }

}
