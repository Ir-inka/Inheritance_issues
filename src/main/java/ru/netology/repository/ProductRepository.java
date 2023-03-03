package ru.netology.repository;

import ru.netology.service.Product;

public class ProductRepository {
    private Product[] items = new Product[0];

    public void save(Product item) {                            // добавляем
        Product[] tmp = new Product[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public Product[] findAll() {                                // выводим
        return items;
    }

    public void deleteById(int id) {                              // удаляем по Id
        Product[] tmp = new Product[items.length - 1];
        int copyToIndex = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = tmp;
    }

}

