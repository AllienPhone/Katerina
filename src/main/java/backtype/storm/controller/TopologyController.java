package backtype.storm.controller;

import backtype.storm.backtype.storm.generated.ClusterSummary;
import backtype.storm.backtype.storm.generated.ExecutorSummary;
import backtype.storm.backtype.storm.generated.TopologyInfo;
import backtype.storm.backtype.storm.generated.TopologySummary;
import backtype.storm.service.StormService;
import backtype.storm.untils.EntityUntils;
import backtype.storm.untils.TopolopyInfoUntils;
import com.google.common.base.Strings;
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
 * Date: 14-7-4
 * Time: PM1:34
 */
@Controller
public class TopologyController {
    @Autowired
    private StormService stormService;

    /**
     * 获取Topology信息
     *
     * @param request
     * @param response
     * @param model
     * @return
     */
    @RequestMapping(value = "topology.action")
    public String topologyInfo(HttpServletRequest request, HttpServletResponse response, Model model) {
        String topologyid = request.getParameter("tid");
        ClusterSummary clusterSummary = stormService.getClusterSummary();
        //获取TopolyInfo
        TopologyInfo topologyInfo = this.stormService.getTopolopyInfoById(topologyid);
        if (topologyInfo != null) {
            List<ExecutorSummary> executorSummaries = topologyInfo.getExecutors();
            if (executorSummaries != null && executorSummaries.size() > 0) {
                List<TopolopyInfoUntils> topolopyInfoUntilses = Lists.newArrayList();
                for (ExecutorSummary executorSummary : executorSummaries) {
                    topolopyInfoUntilses.add(new TopolopyInfoUntils(executorSummary));
                }
                model.addAttribute("exesum", topolopyInfoUntilses);
            }
        }
        //获取TopolopySummary消息
        if (clusterSummary != null) {
            List<TopologySummary> topologySummaryList = clusterSummary.getTopologies();
            if (topologySummaryList != null && topologySummaryList.size() > 0) {
                for (TopologySummary topologySummary : topologySummaryList) {
                    if (topologySummary.getId().equals(topologyid)) {
                        model.addAttribute("to", topologySummary);
                        break;
                    }
                }
            }
        }
        //获取Conf信息
        if (!Strings.isNullOrEmpty(topologyid)) {
            Map<String, String> confs = this.stormService.getTopolopyConf(topologyid);
            if (confs != null) {
                List<EntityUntils> entityUntilses = Lists.newArrayList();
                Set<String> keys = confs.keySet();
                for (String key : keys) {
                    try {
                        EntityUntils entityUntils = new EntityUntils(key, String.valueOf(confs.get(key)));
                        entityUntilses.add(entityUntils);
                    } catch (Exception e) {
                    }
                }
                model.addAttribute("confs", entityUntilses);
            }
            return "topolopy";
        } else {
            return "redirect:index.action";
        }
    }
}
