package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1 {

    /**
     * 예) java -jar app.jar dataA dataB
     * 필요한 데이터를 마지막 위치에 스페이스로 구분해서 전달하면 된다. 이 경우 dataA , dataB 2개의 문자가 args 에 전달된다.
     *
     */

    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}", arg);
        }
    }
}
