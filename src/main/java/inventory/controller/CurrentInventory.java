package inventory.controller;

import inventory.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CurrentInventory {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/inventarioActual")
    public String showCurrentInventory (Model model) {

        model.addAttribute("inventory", productsService.showAll());
        return "/currentInventory.html";
    }

}
