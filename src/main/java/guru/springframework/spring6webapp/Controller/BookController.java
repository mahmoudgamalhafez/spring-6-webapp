package guru.springframework.spring6webapp.Controller;

import guru.springframework.spring6webapp.services.BookServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }
    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("Books" ,bookServices.findAll());
        return "books";
    }
}
