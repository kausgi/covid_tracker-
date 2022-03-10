package com.example.cv_tracker.Controllers;
//
import com.example.cv_tracker.models.LocationStats;
import com.example.cv_tracker.service.CoronaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaDataService coronaDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatest_total_cases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiff_from_prev_day()).sum();
        model.addAttribute("locationstats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalNewCases",totalNewCases);
        return "home";
    }
}
