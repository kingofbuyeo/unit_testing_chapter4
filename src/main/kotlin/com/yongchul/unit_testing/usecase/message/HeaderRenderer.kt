package com.yongchul.unit_testing.usecase.message

import com.yongchul.unit_testing.usecase.message.command.Message


/**
 * <pre>
 * com.yongchul.unit_testing.usecase.message
 *   HeaderRenderer
 * </pre>
 * @date : 2022/12/28 10:30 오전
 * @author : kim yong chul
 * @describe
 **/
class HeaderRenderer: IRenderer {
    override fun render(message: Message): String {
        return "<h1>${message.header}</h1>"
    }
}