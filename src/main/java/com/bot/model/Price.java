package com.bot.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Price {

    String id;
    // текущая цена
    Long currentPrice;
    // цена, которая была в момент подписки
    Long firstPrice;
}
