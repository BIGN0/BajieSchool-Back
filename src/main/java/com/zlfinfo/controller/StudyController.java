package com.zlfinfo.controller;

import com.zlfinfo.commons.base.BaseController;
import com.zlfinfo.model.Study;
import com.zlfinfo.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2016/8/25.
 */
@Controller
public class StudyController extends BaseController {
    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/study/{type}", method = RequestMethod.POST)
    @ResponseBody
    public Object showStudyByType(@PathVariable Integer type, @RequestParam String username, HttpServletResponse
            httpServletResponse) {
        List<Study> studyList = studyService.selectStudyByTypeNUser(type, username);
        return null != studyList ? renderSuccess(studyList, httpServletResponse) : renderError("学习列表查询失败",
                httpServletResponse);
    }

}