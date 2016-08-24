package com.built.io.automationframework;

import java.io.IOException;

import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackMessageHandle;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.SlackUser;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;
//import com.ullink.slack.simpleslackapi.replies.SlackChannelReply;
import com.ullink.slack.simpleslackapi.replies.SlackChannelReply;

public class SendingReportsToSalck {

	public static SlackSession session;


	public static void massege(String channelName) throws IOException {
		session = SlackSessionFactory
				.createWebSocketSlackSession("xoxp-9100806865-16812293429-56060045509-e24710672c");
		session.connect();
		sendMessageToAChannel(session,channelName,"Below is the link to automation report generated for UI:"+ '\n' + '\n' + "UI: http://uiautomation.builtapp.io/assets/"+Reports.report_name +'\n'+'\n' + "------" +'\n' +"Message Sent through CI");
	}

	public static void sendMessageToAChannel(SlackSession session, String chanalName,String message) {

		SlackChannel channel = session.findChannelByName(chanalName);
		session.sendMessage(channel, message);
	}

	public static void sendDirectMessageToAUser(SlackSession session, String userName,String message) {
		SlackUser user = session.findUserByUserName(userName);
		session.sendMessageToUser(user, message , null);
	}

	public void sendDirectMessageToMultipleUsers(SlackSession session, String user1, String user2, String message) {
		SlackUser FirstUSer = session.findUserByUserName(user1);
		SlackUser secondUser = session.findUserByUserName(user2);
		SlackMessageHandle<SlackChannelReply> reply = session
				.openMultipartyDirectMessageChannel(FirstUSer, secondUser);
		SlackChannel channel = reply.getReply().getSlackChannel();
		session.sendMessage(channel, message, null);
	}

}