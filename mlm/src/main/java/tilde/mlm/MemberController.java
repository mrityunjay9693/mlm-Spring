package tilde.mlm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class MemberController {
    @GetMapping("/member")
    public String member() {
        return "member\\member";
    }
    
    @GetMapping("member/create")
    public String create() {
        //return new String(); //returning a view
        return "member//create";
    }

    @PostMapping("/member/store")
    public String store(@RequestBody String entity) {
        //TODO: process POST request
        
        //return entity;
        return "member\\member";
    }
}
