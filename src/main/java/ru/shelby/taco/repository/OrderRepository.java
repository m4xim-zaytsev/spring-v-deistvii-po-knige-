package ru.shelby.taco.repository;

import ru.shelby.taco.entity.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);

}
