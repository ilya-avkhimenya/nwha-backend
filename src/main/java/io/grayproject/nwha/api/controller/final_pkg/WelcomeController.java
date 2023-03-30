package io.grayproject.nwha.api.controller.final_pkg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ilya Avkhimenya
 */
@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("build", "none");
        return "index";
    }
}
