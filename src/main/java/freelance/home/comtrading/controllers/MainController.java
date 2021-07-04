package freelance.home.comtrading.controllers;

import freelance.home.comtrading.domain.item.Item;
import freelance.home.comtrading.service.ItemService;
import freelance.home.comtrading.service.ItemService2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {

    private final ItemService2 itemService2;

    @GetMapping("/panel2")
    public String getStartPage(){
        return "panel2";
    }

    @RequestMapping(value = "/getAllData", method = {RequestMethod.GET})
    public List<Item> getAllData(){
        return itemService2.findAll();
    }

}
