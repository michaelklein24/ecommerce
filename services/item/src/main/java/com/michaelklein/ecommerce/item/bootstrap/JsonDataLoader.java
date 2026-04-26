package com.michaelklein.ecommerce.item.bootstrap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.michaelklein.ecommerce.item.model.ItemModel;
import com.michaelklein.ecommerce.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
@RequiredArgsConstructor
public class JsonDataLoader implements CommandLineRunner {
    private final ItemRepository itemRepository;
    private final ObjectMapper objectMapper;

    @Override
    public void run(String... args) throws Exception {

        itemRepository.deleteAll();

        ClassPathResource resource = new ClassPathResource("data/items.json");

        try (InputStream inputStream = resource.getInputStream()) {

            List<ItemModel> items = objectMapper.readValue(
                    inputStream,
                    new TypeReference<>() {}
            );

            itemRepository.saveAll(items);
        }
    }
}
