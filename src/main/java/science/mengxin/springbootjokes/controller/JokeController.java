package science.mengxin.springbootjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import science.mengxin.springbootjokes.services.JokeService;

/**
 * <p>Date:    22/04/18
 *
 * @author mengxin
 * @version 1.0
 */
@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
