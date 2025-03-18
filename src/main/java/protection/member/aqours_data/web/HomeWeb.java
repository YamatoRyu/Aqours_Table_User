package protection.member.aqours_data.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import protection.member.aqours_data.security.SecurityService;
import protection.member.aqours_data.sql.AqoursClothesData;
import protection.member.aqours_data.sql.UserData;

@Controller
@RequestMapping("/home")
public class HomeWeb {
    @GetMapping
    public String home() {
        return "Home";
    }

    @Autowired
    private SecurityService securityService;

    @GetMapping("/account")
    public String account(Model model) {
        UserData userData = securityService.getEmail();
        model.addAttribute("user", userData);

        return "AccountPrivate";
    }

    @GetMapping("/table")
    public String accountTable(Model model) {
        AqoursClothesData aqoursData = new AqoursClothesData();
        model.addAttribute("aqours", aqoursData);

        return "AqoursTable";
    }
}