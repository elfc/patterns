package com.nebula.patterns.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author chunyuliu
 */
public class DecoratorTest {

    @Test
    public void textViewTest() {
        // 原始文本对象
        VisualComponent textView = new TextView();
        // 给文本增加滚动条
        VisualComponent scrollTextView = new ScrollDecorator(textView);
        // 给有滚动条的文本增加边框
        VisualComponent borderScrollTextView = new BorderDecorator(scrollTextView);

        borderScrollTextView.draw();
    }
}
