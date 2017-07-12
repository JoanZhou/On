package on.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dongfang on 2017/7/12.
 */
@Controller
@RequestMapping(value = "/User/*")
public class UserController {

    @RequestMapping(value = "/MyGoals", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getMyGoals() {
        return "";
    }

    @RequestMapping(value = "/MyReadingGoal", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getMyReadingGoal() {
        return "";
    }

    @RequestMapping(value = "/MarkReading", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setMarkReading() {
        return "";
    }

    @RequestMapping(value = "/MySleepingGoal", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getMySleepingGoal() {
        return "";
    }

    @RequestMapping(value = "/MarkSleeping", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setMarkSleeping() {
        return "";
    }

}
