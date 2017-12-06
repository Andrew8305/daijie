package org.daijie.rabbit.cloud.service;

import org.daijie.api.RabbitMQCloud;
import org.daijie.core.controller.ApiController;
import org.daijie.core.factory.specific.ModelResultInitialFactory.Result;
import org.daijie.core.result.ModelResult;
import org.daijie.rabbit.cloud.mq.producer.ProducerTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQService extends ApiController implements RabbitMQCloud {

	@Autowired
	ProducerTest producerTest;

	@Override
	public ModelResult<Boolean> send(){
		producerTest.send();
		return Result.build(true);
	}
}
