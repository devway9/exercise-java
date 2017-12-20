package com.devway.spring.mvc.spittr.web;

import com.devway.spring.mvc.spittr.Spittle;
import com.devway.spring.mvc.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author devway
 * @date 2017-12-20
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;
    private final static String MAX_VALUE="1000";
    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    //方案1
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(@RequestParam(value="max", defaultValue=MAX_VALUE) long max,@RequestParam(value="count",defaultValue="20") int count ,Model model) {
        model.addAttribute(spittleRepository.findSpittles(max, count));
        return "spittles";
    }
    //方案2
/*   @RequestMapping(method = RequestMethod.GET)
   public String spittles(Model model) {
       List<Spittle> spittleList = spittleRepository.findSpittles(Long.MAX_VALUE, 20);
       model.addAttribute("spittleList", spittleList);
       return "spittles";
   }*/
    //方案3
 /*   @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(Model model) {
        return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
    }*/


    @RequestMapping(value="/{spittleId}",method = RequestMethod.GET)
    public String spittle(@PathVariable(value="spittleId") long spittleId, @RequestParam(value="count",defaultValue="20") int count , Model model) {
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
