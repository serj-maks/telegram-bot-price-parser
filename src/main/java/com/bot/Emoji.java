package com.bot;

import com.vdurmont.emoji.EmojiParser;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Emoji {
    SUCCESS_SUB(EmojiParser.parseToUnicode(":mailbox:")),
    // UNSUCCESS_SUB=
    SUCCESS_UNSUB(EmojiParser.parseToUnicode(":negative_squared_cross_mark:"));
    // UNSUCCESS_UNSUB=

    private String emojiName;

    @Override
    public String toString() {
        return emojiName;
    }
}
