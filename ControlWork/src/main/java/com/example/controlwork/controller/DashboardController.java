package com.example.controlwork.controller;

import com.example.controlwork.model.Quest;
import com.example.controlwork.model.ShopOrder;
import com.example.controlwork.model.ShopProduct;
import com.example.controlwork.repository.QuestRepository;
import com.example.controlwork.repository.ShopOrderRepository;
import com.example.controlwork.repository.ShopProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DashboardController {
    @Autowired
    private QuestRepository questRepository;
    @Autowired
    private ShopOrderRepository shopOrderRepository;
    @Autowired
    private ShopProductRepository shopProductRepository;

    @GetMapping("/dashboard")
    public Map<String, Object> getDashboard(@RequestParam Integer userId) {
        Map<String, Object> result = new HashMap<>();
        System.out.println("userId = " + userId);
        // Квесты пользователя
        List<Quest> quests = questRepository.findByPersonIdContains(userId.toString());
        System.out.println("quests.size = " + quests.size());
        result.put("quests", quests);
        // Продукты пользователя
        List<ShopOrder> orders = shopOrderRepository.findByUserId(userId);
        System.out.println("orders.size = " + orders.size());
        List<Long> productIds = orders.stream().map(ShopOrder::getProductId).collect(Collectors.toList());
        List<ShopProduct> products = productIds.isEmpty() ? Collections.emptyList() : shopProductRepository.findAllById(productIds);
        result.put("products", products);
        return result;
    }
}