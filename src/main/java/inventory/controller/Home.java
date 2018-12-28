package inventory.controller;

import inventory.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/")
    public String testView(Model model){
        model.addAttribute("datosTest", this.productsService.showAll());

        return "/index.html";
    }
}
