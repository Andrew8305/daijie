package org.daijie.activiti.cloud.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

@SuppressWarnings("serial")
public class ProjectManagerTaskListener implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		Boolean checkStatus = (Boolean) delegateTask.getVariable("checkStatus");
		if(checkStatus){
			System.out.println("项目经理"+delegateTask.getAssignee()+"审批通过，跳转到部门经理审批！");
		}else{
			System.out.println("项目经理"+delegateTask.getAssignee()+"审批拒绝，流程结束！");
		}
	}
}
