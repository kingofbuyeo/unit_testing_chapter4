package com.yongchul.unit_testing.usecase.message

import com.yongchul.unit_testing.usecase.message.command.Message
import org.springframework.stereotype.Service


/**
 * <pre>
 * com.yongchul.unit_testing.usecase.message
 *   MessageRenderer
 * </pre>
 * @date : 2022/12/28 10:28 오전
 * @author : kim yong chul
 * @describe
 **/
@Service
class MessageRenderer(): IRenderer {
    private val subRenderers = listOf(HeaderRenderer(), BodyRenderer(), FooterRenderer())

    override fun render(message: Message): String {
        return subRenderers.map { it.render(message) }.reduce{x1, x2 -> x1+x2}
    }

    fun count(): Int{
        return subRenderers.size
    }

    fun subRenderers(): List<IRenderer>{
        return subRenderers
    }
}