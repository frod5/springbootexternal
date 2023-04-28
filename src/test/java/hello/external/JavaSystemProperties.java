package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;


/**
 * JVM 옵션
 */
@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {
        System.setProperty("test","test11"); //코드에서 세팅할 수 도있음


        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}",key, properties.get(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        String test = System.getProperty("test");
        log.info("test = {}",test);

        log.info("url = {}",url);
        log.info("username = {}",username);
        log.info("password = {}",password);
    }
}
