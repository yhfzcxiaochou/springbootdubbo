package bootWeb.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import bootComm.entity.User;
import bootComm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController  {
    private static Logger logger = Logger.getLogger(UserController.class);
    
    @Reference
    private UserService userService;
 
    /*
     *  http://localhost:8080/user/getUserById?id=1
     */
 
    @RequestMapping("/getUserById")
    public Object getUserById(@RequestParam("id")Integer id) {
        User user = userService.getById(id);
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
            int i=1/0;
        }
        return user;
    }
}
