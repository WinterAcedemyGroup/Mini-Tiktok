DROP TABLE IF EXISTS `follow`;
-- Table structure of follow
CREATE TABLE `follow`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
    `user_id`     bigint(20) NOT NULL COMMENT '用户id',
    `follower_id` bigint(20) NOT NULL COMMENT '关注的用户id',
    `is_follow`   tinyint(1) DEFAULT 0 NOT NULL COMMENT '是否关注',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_userId_followerId` (`user_id`,`follower_id`) USING BTREE,
    KEY           `idx_userId` (`user_id`) USING BTREE,
    KEY           `idx_followerId` (`follower_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=54321 DEFAULT CHARSET=utf8mb4 COMMENT='关注表';

-- INSERT INTO tiktok.follow (id, user_id, follower_id, is_follow, create_time, update_time) VALUES (54321, 14373246019309568,21810938202034176, 1 , '2023-01-25 09:58:39', '2023-01-25 09:58:39');
-- INSERT INTO tiktok.follow (id, user_id, follower_id, is_follow, create_time, update_time) VALUES (54322, 19433711036534784,21810561880690688, 1 , '2023-01-25 15:53:40', '2023-01-25 15:53:40');

-- UPDATE tiktok.follow SET is_follow = 0 WHERE user_id = 19433711036534784;