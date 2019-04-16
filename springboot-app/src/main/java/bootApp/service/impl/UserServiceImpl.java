package bootApp.service.impl;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;

import bootApp.mapper.UserMapper;
import bootComm.entity.User;
import bootComm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;
	
	
	@Override
	public User getById(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}

}
