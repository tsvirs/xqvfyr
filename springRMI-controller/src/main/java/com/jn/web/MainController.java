package com.jn.web;

import com.jn.bean.*;
import com.jn.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by think on 2017/5/26.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private JnshuFeatureService jnshuFeatureService;
    @Autowired
    private JnshuIntroService jnshuIntroService;
    @Autowired
    private JnshuStuShowService jnshuStuShowService;
    @Autowired
    private JnshuCareerService jnshuCareerService;
    @Autowired
    private JnshuCareerPathService jnshuCareerPathService;

    @RequestMapping(method = RequestMethod.GET,value = "/feature")
    public @ResponseBody ModelAndView  getAllFeature(Model model){

        List<JnshuFeature> jnshuFeatures = jnshuFeatureService.selectAll();
        List<JnshuIntro> jnshuIntros = jnshuIntroService.selectAll();
        List<JnshuStuShow> jnshuStuShows = jnshuStuShowService.selectAll();

        ModelAndView modelAndView = new ModelAndView("tiles.index.definition");
        modelAndView.addObject("jnshuFeatures",jnshuFeatures);
        modelAndView.addObject("jnshuIntros",jnshuIntros);
        modelAndView.addObject("jnshuStuShows",jnshuStuShows);
        modelAndView.addObject("item1","WEB-INF/jsp/views/commonSlide");
        modelAndView.addObject("item2","WEB-INF/jsp/views/commonMainContainer");

        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/career")
    public ModelAndView getAllCareer(){
        List<JnshuCareer> careerList = jnshuCareerService.selectAll();
        List<JnshuCareerPath> careerPathList = jnshuCareerPathService.selectAll();

        ModelAndView mv = new ModelAndView("tiles.index.definition");
        mv.addObject("careerList", careerList);
        mv.addObject("careerPathList", careerPathList);
        mv.addObject("item1","WEB-INF/jsp/views/careerData");
        mv.addObject("item2","WEB-INF/jsp/views/careerData2");
        return mv;
    }


}
