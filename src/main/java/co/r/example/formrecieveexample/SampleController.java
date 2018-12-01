package co.r.example.formrecieveexample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class SampleController {

    @PostMapping("index")
    public String index(@RequestParam Map<String, Object> form) {
        return form.get("multibyte-character").toString();
    }
}
