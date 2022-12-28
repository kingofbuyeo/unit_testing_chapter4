package com.yongchul.unit_testing.usecase.message

import com.yongchul.unit_testing.usecase.message.command.Message
import org.junit.jupiter.api.Assertions.assertEquals
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.test.Test


internal class MessageRendererTest{
    val sut = MessageRenderer()
    @Test
    fun 메시지_렌더러_세부구현과_결합_테스트_예제(){
        val subRenderer = sut.subRenderers()
        assertEquals(3, sut.count())
        assertEquals(HeaderRenderer::class.java, subRenderer[0]::class.java)
        assertEquals(BodyRenderer::class.java, subRenderer[1]::class.java)
        assertEquals(FooterRenderer::class.java, subRenderer[2]::class.java)
    }

    @Test
    fun 메시지_렌더러_소스코드_동등비교_테스트_예제(){
        val target = Paths.get("/Users/kim-yongchul/Documents/studyWorkspace/unit_testing_chapter4/src/main/kotlin/com/yongchul/unit_testing/usecase/message/MessageRenderer.kt")
        val source = Files.readString(target, Charsets.UTF_8)

        assertEquals("package com.yongchul.unit_testing.usecase.message\n" +
                "\n" +
                "import com.yongchul.unit_testing.usecase.message.command.Message\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * <pre>\n" +
                " * com.yongchul.unit_testing.usecase.message\n" +
                " *   MessageRenderer\n" +
                " * </pre>\n" +
                " * @date : 2022/12/28 10:28 오전\n" +
                " * @author : kim yong chul\n" +
                " * @describe\n" +
                " **/\n" +
                "class MessageRenderer(): IRenderer {\n" +
                "    private val subRenderers = listOf(HeaderRenderer(), BodyRenderer(), FooterRenderer())\n" +
                "\n" +
                "    override fun render(message: Message): String {\n" +
                "        return subRenderers.map { it.render(message) }.reduce{x1, x2 -> x1+x2}\n" +
                "    }\n" +
                "\n" +
                "    fun count(): Int{\n" +
                "        return subRenderers.size\n" +
                "    }\n" +
                "\n" +
                "    fun subRenderers(): List<IRenderer>{\n" +
                "        return subRenderers\n" +
                "    }\n" +
                "}", source)
    }

    @Test
    fun 구현_세부사항과_분리_테스트의_분리_예제(){
        //사전준비
        val message = Message("h","b","f")

        // 실행
        val result = sut.render(message)

        //검증
        assertEquals("<h1>h</h1><b>b</b><i>f</i>", result)
    }
}