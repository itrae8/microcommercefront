package com.ecommerce.microcommercefront.web.controller;

import com.ecommerce.microcommercefront.web.model.Produit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ListeProduitController {

    @GetMapping("/Produits")
    public ModelAndView getListeProduit(){

        String viewName = "listeProduits";

        Map<String, Object> model = new HashMap<String,Object>();

        List listeProduits = new ArrayList<Produit>();

        listeProduits.add(new Produit(0,"Produit1",50));
        listeProduits.add(new Produit(1,"Produit2",100));
        listeProduits.add(new Produit(2,"Produit3",150));
        listeProduits.add(new Produit(3,"Produit4",200));

        model.put("listeProduits",listeProduits);

        return new ModelAndView(viewName,model);
    }

}
