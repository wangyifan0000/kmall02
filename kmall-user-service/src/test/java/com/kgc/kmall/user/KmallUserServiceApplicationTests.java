package com.kgc.kmall.user;

import com.kgc.kmall.bean.Member;
import com.kgc.kmall.user.mapper.MemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class KmallUserServiceApplicationTests {
@Resource
	MemberMapper memberMapper;
	@Test
	void contextLoads() {
		List<Member> members = memberMapper.selectByExample(null);
		System.out.println(members.size());
	}

}
