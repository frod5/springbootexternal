package hello.external;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import java.util.List;
import java.util.Set;

@Slf4j
public class CommandLineV2 {

    //--url=devdb --username=dev_user --password=dev_pw mode=on
    public static void main(String[] args) {
        for (String arg : args) {
            log.info("arg {}",arg);
        }



        //커맨드라인 옵션 인수는 자바표준이 아닌 스프링이 지원하는 것.
        //스프링이 제공하는 ApplicationArguments --인수는 키,밸류로 만들어준다.
        ApplicationArguments appArgs = new DefaultApplicationArguments(args);
        log.info("SourceArgs={}", List.of(appArgs.getSourceArgs()));
        log.info("NonOptionArgs={}", appArgs.getNonOptionArgs());  //mode는 --가 아니라서 NonOptionArgs
        log.info("OptionNames={}", appArgs.getOptionNames());

        Set<String> optionNames = appArgs.getOptionNames();
        for (String optionName : optionNames) {
            log.info("option arg {}={}",optionName,appArgs.getOptionValues(optionName));
        }

        List<String> url = appArgs.getOptionValues("url");
        List<String> username = appArgs.getOptionValues("username");
        List<String> password = appArgs.getOptionValues("password");
        List<String> mode = appArgs.getOptionValues("mode");

        log.info("url = {}",url);
        log.info("username = {}",username);
        log.info("password = {}",password);
        log.info("mode = {}",mode);
    }
}
