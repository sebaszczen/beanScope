package sebaszczen.DependencyInjection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alien")
public class AlienController {
    @Autowired
    AlienRequestScope alienRequestScope;

    @GetMapping("/proxy")
    public String getAlien() {
        return alienRequestScope.show();
//        return "sdfs";
    }

    @GetMapping("/proxy2")
    public String getAlien2() {
        return alienRequestScope.show();
    }
}
