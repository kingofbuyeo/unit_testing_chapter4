package com.yongchul.unit_testing.usecase.message

import com.yongchul.unit_testing.usecase.message.command.Message


/**
 * <pre>
 * com.yongchul.unit_testing.usecase.message
 *   FooterRenderer
 * </pre>
 * @date : 2022/12/28 10:31 오전
 * @author : kim yong chul
 * @describe
 **/
class FooterRenderer: IRenderer {
    override fun render(message: Message): String {
        return "<i>${message.footer}</i>"
    }
}