package com.bot.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserSub {

    String id;
    Long chatId;
    String goodId;
    String goodName;
    String priceId;
    // текущая цена
    Long currentPrice;
    // цена, которая была в момент подписки
    Long firstPrice;
}
