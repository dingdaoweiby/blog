package com.sincere.web.restController;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/dummy")
    public String respondPost() throws JSONException {
        String s = "{NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=33, DEPTH=0, TAG_NAME=gda_eom_lob, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=34, DEPTH=0, TAG_NAME=gda_enoc, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=78, DEPTH=0, TAG_NAME=mapp_vts, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=84, DEPTH=0, TAG_NAME=gfs, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=85, DEPTH=0, TAG_NAME=gfs, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=87, DEPTH=0, TAG_NAME=gfs_irdw, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=89, DEPTH=0, TAG_NAME=gfs_irdw, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=90, DEPTH=0, TAG_NAME=mapp, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=26, DEPTH=0, TAG_NAME=mg_bert, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=51, DEPTH=0, TAG_NAME=gda_after_call_work, TAG_DESC=null}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=ylpd832, HOST_DESC=sandbox env, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=7, DEPTH=0, TAG_NAME=ECO_DAILY_RG_COUNT, TAG_DESC=rgs collected in a day in eco}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=ylpd832, HOST_DESC=sandbox env, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=8, DEPTH=0, TAG_NAME=LSBBT_DAILY_RG_COUNT, TAG_DESC=rgs collected in a day in lsbbt}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=52, DEPTH=0, TAG_NAME=gda_low_speed_tdm, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=53, DEPTH=0, TAG_NAME=gda_low_speed_tdm, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=61, DEPTH=0, TAG_NAME=msocesm_job_details, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=62, DEPTH=0, TAG_NAME=msocesm_substep_job_details, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=63, DEPTH=0, TAG_NAME=msocesm_substep_job_details, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=68, DEPTH=0, TAG_NAME=bert, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=81, DEPTH=0, TAG_NAME=mapp_wfe, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=testhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=124, DEPTH=0, TAG_NAME=tagnametest, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=testhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=125, DEPTH=0, TAG_NAME=tagnametest, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=newhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=130, DEPTH=0, TAG_NAME=newtagname, TAG_DESC=null}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=ctdi_gold, HOST_DESC=ctdi_gold database on hive, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=16, DEPTH=0, TAG_NAME=ctdi_rl_rma, TAG_DESC=ctdi_rl_rma table}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=ctdi_gold, HOST_DESC=ctdi_gold database on hive, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=17, DEPTH=0, TAG_NAME=ctdi_scrap_detail, TAG_DESC=ctdi_scrap_detail table}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=28, DEPTH=0, TAG_NAME=msocesm_bo_tech_rank, TAG_DESC=null}, {NAME=VTS, ENV_ID=1, ENV_NAME=Development, HOST_NAME=plth319, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=23, DEPTH=0, TAG_NAME=amqp-client-dev, TAG_DESC=null}, {NAME=VTS, ENV_ID=1, ENV_NAME=Development, HOST_NAME=mlth075, HOST_DESC=geofence-oracle dev, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=24, DEPTH=0, TAG_NAME=geofence-oracle-dev, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=42, DEPTH=0, TAG_NAME=gda_metric_data, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=43, DEPTH=0, TAG_NAME=gda_metric_data, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=45, DEPTH=0, TAG_NAME=gda_yeti, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=69, DEPTH=0, TAG_NAME=bert, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=70, DEPTH=0, TAG_NAME=bert, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=71, DEPTH=0, TAG_NAME=you_achieve_yc1, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=72, DEPTH=0, TAG_NAME=you_achieve_yc1, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=94, DEPTH=0, TAG_NAME=msocesm_bo_core_im_crew, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=95, DEPTH=0, TAG_NAME=msocesm_bo_core_im_crew, TAG_DESC=null}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=ctdi_gold, HOST_DESC=ctdi_gold database on hive, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=15, DEPTH=0, TAG_NAME=ctdi_receiving_detail, TAG_DESC=ctdi_receiving_detail table}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=host.name.dummy, HOST_DESC=dummy host, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=13, DEPTH=0, TAG_NAME=dummy_tag, TAG_DESC=dummy}, {NAME=CPE Advisor, ENV_ID=4, ENV_NAME=Staging, HOST_NAME=ctdi_gold, HOST_DESC=ctdi_gold database on hive, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=14, DEPTH=0, TAG_NAME=ctdi_att_quality, TAG_DESC=ctdi_att_quality table }, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=98, DEPTH=0, TAG_NAME=gda_enoc, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=31, DEPTH=0, TAG_NAME=dash, TAG_DESC=null}, {NAME=VTS, ENV_ID=2, ENV_NAME=Production, HOST_NAME=blph946.bhdc.att.com, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=99, DEPTH=0, TAG_NAME=vts_production, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=54, DEPTH=0, TAG_NAME=gda_quality_audits, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=55, DEPTH=0, TAG_NAME=gda_quality_audits, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=57, DEPTH=0, TAG_NAME=trigger_safety, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=64, DEPTH=0, TAG_NAME=msocesm_substep_job_details, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=65, DEPTH=0, TAG_NAME=ce_portal, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=66, DEPTH=0, TAG_NAME=ce_portal, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=67, DEPTH=0, TAG_NAME=ce_portal, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=74, DEPTH=0, TAG_NAME=mapp_ucrew, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=83, DEPTH=0, TAG_NAME=mapp_wfe, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=86, DEPTH=0, TAG_NAME=gfs, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=88, DEPTH=0, TAG_NAME=gfs_irdw, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=92, DEPTH=0, TAG_NAME=mapp, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=96, DEPTH=0, TAG_NAME=gda_yeti, TAG_DESC=null}, {NAME=VTS, ENV_ID=1, ENV_NAME=Development, HOST_NAME=plth317, HOST_DESC=amqp-client, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=22, DEPTH=0, TAG_NAME=amqp-client-dev, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=29, DEPTH=0, TAG_NAME=mg_msocesm_bo_core_im_crew, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=27, DEPTH=0, TAG_NAME=gfs_technicians, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=30, DEPTH=0, TAG_NAME=webphone, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=32, DEPTH=0, TAG_NAME=dash, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=testhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=121, DEPTH=0, TAG_NAME=tagnametest, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=testhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=120, DEPTH=0, TAG_NAME=tagnametest, TAG_DESC=test}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=50, DEPTH=0, TAG_NAME=gda_after_call_work, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=56, DEPTH=0, TAG_NAME=trigger_quality, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=58, DEPTH=0, TAG_NAME=wfe_flagging, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=59, DEPTH=0, TAG_NAME=msocesm_job_details, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=60, DEPTH=0, TAG_NAME=msocesm_job_details, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=73, DEPTH=0, TAG_NAME=you_achieve_yc1, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=75, DEPTH=0, TAG_NAME=mapp_ucrew, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=76, DEPTH=0, TAG_NAME=mapp_ucrew, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=80, DEPTH=0, TAG_NAME=mapp_vts, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=daily_zld02608, HOST_DESC=daily_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=79, DEPTH=0, TAG_NAME=mapp_vts, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=82, DEPTH=0, TAG_NAME=mapp_wfe, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=monthly_zld02608, HOST_DESC=monthly_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=91, DEPTH=0, TAG_NAME=mapp, TAG_DESC=null}, {NAME=youCoach SLA, ENV_ID=3, ENV_NAME=Pre-Production, HOST_NAME=mtd_zld02608, HOST_DESC=mtd_zld02608, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=93, DEPTH=0, TAG_NAME=msocesm_bo_core_im_crew, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=testhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=122, DEPTH=0, TAG_NAME=tagnametest, TAG_DESC=null}, {NAME=VTS, ENV_ID=5, ENV_NAME=Test, HOST_NAME=testhostname, HOST_DESC=null, DISABLE_CODE=null, DISABLE_DESC=null, TAG_ID=123, DEPTH=0, TAG_NAME=tagnametest, TAG_DESC=null}\n";
        Pattern logEntry = Pattern.compile("\\{(.*?)\\}");
        Matcher matchPattern = logEntry.matcher(s);
        List<LinkedCaseInsensitiveMap<String>> list = new ArrayList<>();
        while (matchPattern.find()) {
            LinkedCaseInsensitiveMap<String> map = new LinkedCaseInsensitiveMap<String>();
            String[] pairs = matchPattern.group(1).replace(" ", "").split(",");
            for (String each : pairs) {
                String[] eachPair = each.split("=");
                map.put(eachPair[0], eachPair[1]);
            }
            list.add(map);
        }

        HashMap projects = new HashMap();
        HashMap environments = new HashMap();
        HashMap hosts = new HashMap();
        HashMap tags = new HashMap();
        JSONObject projectJson = new JSONObject();
        JSONArray projectArray = new JSONArray();
        projectJson.put("projects", projectArray);

        JSONArray environmentArray = new JSONArray();
        JSONArray hostArray = new JSONArray();
        JSONArray tagArray = new JSONArray();

        for (Iterator<LinkedCaseInsensitiveMap<String>> each = list.iterator(); each.hasNext(); ) {
            LinkedCaseInsensitiveMap<String> map = each.next();
            System.out.println(map);
            if (!projects.containsKey(map.get("NAME"))) {
                JSONObject eachProject = new JSONObject();
                eachProject.put("name", map.get("NAME"));

                eachProject.put("environments", environmentArray);
                projectArray.put(eachProject);
                for (int i = 0; i < projectArray.length(); i++) {
                    JSONObject eachProjectJson = (JSONObject) projectArray.get(i);
                    if (eachProjectJson.get("name").equals(map.get("NAME"))) {
                        System.out.println("haha");
                        System.out.println(eachProject);

                    }
                }
                projects.put(map.get("NAME"), eachProject);
            }


            JSONObject eachProject = (JSONObject) projects.get(map.get("NAME"));
//            if (!environments.containsKey(map.get("ENV_NAME"))) {
//                JSONObject eachEnvironment = new JSONObject();
//                JSONArray hostArray = new JSONArray();
//                eachEnvironment.put("name", map.get("ENV_NAME"));
//                eachEnvironment.put("hosts", hostArray);
//                environmentArray.put(eachEnvironment);
//                environments.put(map.get("ENV_NAME"), eachEnvironment);
//            }
//            JSONObject eachEnvironment = (JSONObject) environments.get(map.get("ENV_NAME"));
//            JSONArray hostArray = (JSONArray) eachEnvironment.get("hosts");
//            if (!hosts.containsKey(map.get("HOST_NAME"))) {
//                JSONObject eachHost = new JSONObject();
//                JSONArray tagArray = new JSONArray();
//                eachHost.put("name", map.get("HOST_NAME"));
//                eachHost.put("tags", tagArray);
//                hostArray.put(eachHost);
//                hosts.put(map.get("HOST_NAME"), eachHost);
//            }
//
//            JSONObject eachHost = (JSONObject) hosts.get(map.get("HOST_NAME"));
//            JSONArray tagArray = (JSONArray) eachHost.get("tags");
//            if (!tags.containsKey(map.get("TAG_NAME"))) {
//                JSONObject eachTag = new JSONObject();
//                eachTag.put("name", map.get("TAG_NAME"));
//                eachTag.put("id", map.get("TAG_ID"));
//                tagArray.put(eachTag);
//                tags.put(map.get("TAG_NAME"), eachTag);
//            }

        }

        System.out.println(projects);
//        for (Iterator<LinkedCaseInsensitiveMap<String>> each = list.iterator(); each.hasNext(); ) {
//            LinkedCaseInsensitiveMap<String> map = each.next();
//            System.out.println("current map is " + map);
//            if (!projects.containsKey(map.get("NAME"))) {
//                JSONObject eachProjectJsonObject = new JSONObject();
//                eachProjectJsonObject.put("name", map.get("NAME"));
//                JSONArray environmentArray = new JSONArray();
//                eachProjectJsonObject.put("environments", environmentArray);
//
//                JSONObject eachENVJsonObject = new JSONObject();
//                JSONArray hostArray = new JSONArray();
//                eachENVJsonObject.put("name", map.get("ENV_NAME"));
//                eachENVJsonObject.put("hosts", hostArray);
//
//                JSONObject eachHostJsonObject = new JSONObject();
//                JSONArray tagArray = new JSONArray();
//                eachHostJsonObject.put("name", map.get("HOST_NAME"));
//                eachHostJsonObject.put("tags", tagArray);
//
//                JSONObject eachTagJsonObject = new JSONObject();
//                eachTagJsonObject.put("name", map.get("TAG_NAME"));
//                eachTagJsonObject.put("id", map.get("TAG_ID"));
//
//                environmentArray.put(eachENVJsonObject);
//                hostArray.put(eachHostJsonObject);
//                tagArray.put(eachTagJsonObject);
//                projects.put(map.get("NAME"), eachProjectJsonObject);
//                environments.put(map.get("ENV_NAME"), eachENVJsonObject);
//                hosts.put(map.get("HOST_NAME"), eachHostJsonObject);
//                projectArray.put(eachProjectJsonObject);
//            } else {
//                JSONObject eachProjectJsonObject = (JSONObject) projects.get(map.get("NAME"));
//                System.out.println("else " + eachProjectJsonObject);
//            }
//
//
//        }
        System.out.println("project array is " + projectArray);
        System.out.println("projects after loop is " + projects);
        System.out.println("environments after loop is " + environments);
        System.out.println("hosts after loop is " + hosts);
        System.out.println("tags after loop is " + tags);

        return projectJson.toString();
    }
}
