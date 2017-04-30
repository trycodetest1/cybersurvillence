package com.hackathon.cyber.app.common;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;

/**
 * @author Yusuke Yamamoto - yusuke at mac.com
 * @since Twitter4J 2.1.7
 */
public class GetHomeTimeline {
	/**
	 * Usage: java twitter4j.examples.timeline.GetHomeTimeline
	 *
	 * @param args
	 *            String[]
	 */
	public static void main(String[] args) {
		/* try { */
		// gets Twitter instance with default credentials
		// Twitter twitter = new TwitterFactory().getInstance();
		/*
		 * twitter = new TwitterFactory().getInstance(); AccessToken at =
		 * twitter.getOAuthAccessToken("akshayjadhavbe@gmail.com", "@kshay@24");
		 * twitter = new TwitterFactory().getInstance(at); User user =
		 * twitter.verifyCredentials(); List<Status> statuses =
		 * twitter.getHomeTimeline(); System.out.println("Showing @" +
		 * user.getScreenName() + "'s home timeline."); for (Status status :
		 * statuses) { System.out.println("@" + status.getUser().getScreenName()
		 * + " - " + status.getText()); }
		 */
		/*
		 * } catch (TwitterException te) { te.printStackTrace();
		 * System.out.println("Failed to get timeline: " + te.getMessage());
		 * System.exit(-1); }
		 */

		Twitter twitter = new TwitterFactory().getInstance();
		// Twitter Consumer key & Consumer Secret
		twitter.setOAuthConsumer("Szq80ZOnYLRupItpn7IXKiLhw", "4OepR2I1hSkeewlYAkbZrebm4eyP7kyJMjGKuAP3tHhhRxJoIe");
		// Twitter Access token & Access token Secret
		twitter.setOAuthAccessToken(new AccessToken("858537108578893824-2S1zQGFAKHiFSEARHus6CBrGUFWmobN",
				"siyd9YSNpZlbe7X4HjPcBGCELfsBQuLSpVq0PAdHb5fud"));
		try {
			User user = twitter.verifyCredentials();
			List<Status> statuses = twitter.getUserTimeline();
			for (Status status : statuses) {
				System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to get timeline: " + e.getMessage());
		}
	}
}