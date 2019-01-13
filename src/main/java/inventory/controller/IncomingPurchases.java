package inventory.controller;

import inventory.service.PurchasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncomingPurchases {

    @Autowired
    private PurchasesService purchasesService;

    @GetMapping("/comprasEntrantes")
    public String showIncomingPurchases (Model model) {

        model.addAttribute("purchases", purchasesService.showAll());
        return "/incomingPurchases.html";
    }
}
