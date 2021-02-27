package com.kodilla.testing.forum.statistics;

    public class StatisticsCalculator{
        int comments;
        int posts;
        int names;
        double averagePostsForUser;
        double averageCommentsForUser;
        double averageCommentsForPost;

        public StatisticsCalculator(Statistics statisticsMock) {
        }

        public void calculateAdvStatistics(Statistics statistics) {

        comments = statistics.commentsCount();
        posts = statistics.postsCount();
        names = statistics.usersNames().size();

        if (posts !=0) {averageCommentsForPost = (double)comments/posts;}
            if (names!=0) {
                averagePostsForUser = (double)posts / names;
                averageCommentsForUser = (double)comments / names;
            }
        }

        public double getAveragePostsForUser() {
            return averagePostsForUser;
        }

        public double getAverageCommentsForUser() {
            return averageCommentsForUser;
        }

        public double getAverageCommentsForPost() {
            return averageCommentsForPost;
        }

    }
