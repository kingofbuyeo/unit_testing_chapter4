package com.yongchul.unit_testing

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.runApplication


/**
 * <pre>
 * com.yongchul.unit_testing
 *   Application
 * </pre>
 * @date : 2022/12/28 12:28 오후
 * @author : kim yong chul
 * @describe
 **/
@SpringBootConfiguration
class Application {

}
fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
