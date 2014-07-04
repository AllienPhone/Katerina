package backtype.storm.controller;

import backtype.storm.backtype.storm.generated.ClusterSummary;
import backtype.storm.backtype.storm.generated.SupervisorSummary;
import backtype.storm.backtype.storm.generated.TopologySummary;
import backtype.storm.service.StormService;
import backtype.storm.untils.EntityUntils;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Copyright (c) 2014, Sohu.com All Rights Reserved.
 * <p/>
 * User: jeffreywu  MailTo:jeffreywu@sohu-inc.com
 * Date: 14-7-3
 * Time: PM3:33
 */
@Controller
public class IndexController {
    @Autowired
    private StormService stormService;

    @RequestMapping(value = "index.action")
    public String indexAction(HttpServletRequest request, HttpServletResponse response, Model model) {
        ClusterSummary clusterSummary = stormService.getClusterSummary();
        Map<String, String> nimbusConf = stormService.getNimbusConf();
        if (clusterSummary != null) {
            List<SupervisorSummary> supervisorSummaryList = clusterSummary.getSupervisors();
            List<TopologySummary> topologySummaryList = clusterSummary.getTopologies();
            model.addAttribute("topologys", topologySummaryList);
            model.addAttribute("supervisors", supervisorSummaryList);
        }
        if (nimbusConf != null) {
            List<EntityUntils> entityUntilses = Lists.newArrayList();
            Set<String> keys = nimbusConf.keySet();
            for (String key : keys) {
                try {
                    EntityUntils entityUntils = new EntityUntils(key, String.valueOf(nimbusConf.get(key)));
                    entityUntilses.add(entityUntils);
                } catch (Exception e) {
                }
            }
            model.addAttribute("confs", entityUntilses);
        }
        return "index";
    }
}
