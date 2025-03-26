package protection.member.aqours_data.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import protection.member.aqours_data.model.AqoursModel;
import protection.member.aqours_data.security.SecurityService;
import protection.member.aqours_data.sql.repository.AqoursClothesRepository;

@Controller
@RequestMapping("/home/table")
public class TableWeb {
    @GetMapping("/create")
    public String getCreateAqours(Model model) {
        model.addAttribute("aqoursCreate", new AqoursModel());

        return "CreateAqoursTable";
    }

    @Autowired
    private AqoursClothesRepository repository;

    @Autowired
    private SecurityService securityService;

    @PostMapping("/create")
    public String postCreateAqours(Model model) {

        return "";
    }
}