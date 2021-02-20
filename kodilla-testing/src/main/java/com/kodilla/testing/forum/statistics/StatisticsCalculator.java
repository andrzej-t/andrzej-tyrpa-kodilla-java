package com.kodilla.testing.forum.statistics;

import java.util.List;

    public class StatisticsCalculator {
        int comments;
        int posts;
        int names;
        double averagePostsForUser;
        double averageCommentsForUser;
        double averageCommentsForPost;

        public StatisticsCalculator(Statistics statisticsMock) {

        }


        public double calculateAdvStatistics(Statistics statistics) {
        comments = statistics.commentsCount();
        posts = statistics.postsCount();
        names = statistics.usersNames().size();
        averagePostsForUser = (double)posts / names;
        averageCommentsForUser = (double)comments / names;
        averageCommentsForPost = (double)comments/posts;
        return statistics.postsCount();
        }

    public void showStatistics() {
        System.out.println(comments);
        System.out.println(posts);
        System.out.println(names);
        System.out.println(averagePostsForUser);
        System.out.println(averageCommentsForUser);
        System.out.println(averageCommentsForPost);
    }
}
