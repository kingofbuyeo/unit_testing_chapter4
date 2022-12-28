package com.yongchul.unit_testing.usecase.message

import com.yongchul.unit_testing.usecase.message.command.Message


/**
 * <pre>
 * com.yongchul.unit_testing.usecase.message
 *   IRenderer
 * </pre>
 * @date : 2022/12/28 10:27 오전
 * @author : kim yong chul
 * @describe
 **/
interface IRenderer {
    fun render(message: Message): String
}