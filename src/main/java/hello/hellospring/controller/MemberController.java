package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 스프링 빈 @서비스 @레포지토리 전부 컴포넌트 스캔 방법.
public class MemberController {

    private final MemberService memberService;

    //의존관계 주입.
    @Autowired // 스프링 컨테이너에서 memberservice를 자동으로 연결해줌. 클래스마다 안만들어도됨.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
