package com.kodilla.testing.forum.statistics;

    public class StatisticsCalculator{
        int comments;
        int posts;
        int names;
        double averagePostsForUser;
        double averageCommentsForUser;
        double averageCommentsForPost;

        public StatisticsCalculator(int comments, int posts, int names, double averagePostsForUser, double averageCommentsForUser, double averageCommentsForPost) {
            this.comments = comments;
            this.posts = posts;
            this.names = names;
            this.averagePostsForUser = averagePostsForUser;
            this.averageCommentsForUser = averageCommentsForUser;
            this.averageCommentsForPost = averageCommentsForPost;
        }

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

        public int getComments() {
            return comments;
        }

        public int getPosts() {
            return posts;
        }

        public int getNames() {
            return names;
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

        public void showStatistics() {
        System.out.println(comments);
        System.out.println(posts);
        System.out.println(names);
        System.out.println(averagePostsForUser);
        System.out.println(averageCommentsForUser);
        System.out.println(averageCommentsForPost);
    }

    }
