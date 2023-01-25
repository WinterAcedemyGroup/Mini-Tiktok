DROP TABLE IF EXISTS `favorite`;
-- Table structure of favorite
CREATE TABLE `favorite`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
    `user_id`     bigint(20) NOT NULL COMMENT '用户id',
    `video_id`    bigint(20) NOT NULL COMMENT '视频id',
    `is_favorite` tinyint(1) DEFAULT 0 NOT NULL COMMENT '是否点赞',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL COMMENT '创建时间',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_userId_videoId` (`user_id`,`video_id`) USING BTREE,
    KEY           `idx_userId` (`user_id`) USING BTREE,
    KEY           `idx_videoId` (`video_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=12345 DEFAULT CHARSET=utf8mb4 COMMENT='点赞表';

-- INSERT INTO tiktok.favorite (id, user_id, video_id, is_favorite, create_time, update_time) VALUES (12345, 14283784123846656,21810685746876416, 1 , '2023-01-25 09:58:39', '2023-01-25 09:58:39');
-- INSERT INTO tiktok.favorite (id, user_id, video_id, is_favorite, create_time, update_time) VALUES (12346, 14373128436191232,21810865955147776, 1 , '2023-01-25 15:53:40', '2023-01-25 15:53:40');


