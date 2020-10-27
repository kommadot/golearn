package com.golearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.golearn.domain.UserDto;
import com.golearn.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public int save(UserDto dto) {
		return userMapper.save(dto);
	}

	@Override
	public int updateUser(UserDto dto) {
		return userMapper.updateUser(dto);
	}

	@Override
	public int disableUser(int no) {
		return userMapper.disableUser(no);
	}

	@Override
	public UserDto findByUsername(int no) {
		return userMapper.findByUsername(no);
	}

	@Override
	public int checkByUsername(String username) {
		return userMapper.checkByUsername(username);
	}

	@Override
	public int chekcByEmail(String email) {
		return userMapper.chekcByEmail(email);
	}

	@Override
	public int checkByNickname(String nickname) {
		return userMapper.checkByNickname(nickname);
	}

	@Override
	public int updatePassword(String password, int no) {
		return userMapper.updatePassword(passwordEncoder.encode(password), no);
	}

	@Override
	public int subscribe(int from, int to) {
		return userMapper.subscribe(from, to);
	}

	@Override
	public int subscribeCancle(int from, int to) {
		return userMapper.subscribeCancle(from, to);
	}

}
