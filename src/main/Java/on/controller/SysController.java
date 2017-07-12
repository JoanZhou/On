package on.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dongfang on 2017/7/12.
 */
@Controller
public class SysController {

    @RequestMapping(value = "/GetActivity", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getActivity() {
        return "";
    }

    @RequestMapping(value = "/SetRunningGoal", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setRunningGoal() {
        return "";
    }

    @RequestMapping(value = "/SetSleepingGoal", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setSleepingGoal() {
        return "";
    }

    @RequestMapping(value = "/SetReadingGoal", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String setReadingGoal() {
        return "";
    }

    @RequestMapping(value = "/UpdateGoals", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String updateGoals() {
        return "";
    }
}
