package org.daijie.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(description="消息对列")
@FeignClient(value="${feign.mq-cloud}")
public interface RabbitMQCloud {
	
	@ApiOperation(notes = "rabbit消息对列测试", value = "rabbit消息对列测试")
	@RequestMapping(value = "/rabbit/send", method = RequestMethod.POST)
	public Object send();
}
