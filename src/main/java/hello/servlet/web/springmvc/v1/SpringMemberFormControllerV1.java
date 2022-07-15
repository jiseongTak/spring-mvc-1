package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@Component
@RequestMapping//클래스 레벨에 있으면 핸들러매핑에서 찾는다
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }

}
