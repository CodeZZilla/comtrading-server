package freelance.home.comtrading.service;

import freelance.home.comtrading.domain.item.Item;
import freelance.home.comtrading.repository.ItemRepository;
import freelance.home.comtrading.repository.ItemRepository2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemService2 {
    private final ItemRepository2 itemRepository2;

    public List<Item> findAll(){
        return itemRepository2.findAll();
    }

}
