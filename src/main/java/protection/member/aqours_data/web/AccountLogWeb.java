package protection.member.aqours_data.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import protection.member.aqours_data.model.AccountModel;
import protection.member.aqours_data.sql.UserData;
import protection.member.aqours_data.sql.repository.UserRepository;

@Controller
public class AccountLogWeb {
    @GetMapping({"", "/"})
    public String account() {
        return "Log/AccountUser";
    }

    // Register
    @GetMapping("/register")
    public String getAccountRegister(Model model) {
        model.addAttribute("register", new AccountModel());
        model.addAttribute("success", false);

        return "Log/AccountRegister";
    }

    @Autowired
    private UserRepository repository;

    @PostMapping("/register")
    public String postAccountRegister(Model model, @Valid @ModelAttribute AccountModel accountModel, BindingResult result) {
        if (!accountModel.getPassword().equals(accountModel.getConfirmPassword())) {
            result.addError(new FieldError("register", "confirmPassword",
                    "The password and confirm password isn't match"));
        }

        UserData userData = repository.findByEmail(accountModel.getEmail());
        if (userData != null) {
            result.addError(new FieldError("register", "email", "This email already used"));
        }

        if (result.hasErrors()) {
            return "Log/AccountRegister";
        }

        try {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

            UserData data = new UserData();
            data.setFullName(accountModel.getFullName());
            data.setEmail(accountModel.getEmail());
            data.setCreateAt(new Date());
            data.setRole("member fan");
            data.setPassword(bCryptPasswordEncoder.encode(accountModel.getPassword()));

            repository.save(data);
            model.addAttribute("register", accountModel);
            model.addAttribute("success", true);
        }

        catch (Exception ex) {
            result.addError(new FieldError("register", "fullName", ex.getMessage()));
        }

        return "Log/AccountRegister";
    }

    // Login and Logout
    @GetMapping("/login")
    public String getLogin() {
        return "Log/AccountLogin";
    }

    @GetMapping("/logout")
    public String getLogout() {
        return "Log/AccountLogout";
    }
}