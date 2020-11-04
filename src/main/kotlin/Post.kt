package ru.createPost

data class Post(
        private var id: Int = 0,
        val ownerId: Int = 0,
        val fromId: Int = 0,
        val createdBy: Int = 0,
        val date: Int = 0,
        val text: String = "",
        val replyOwnerId: Int = 0,
        val replyPostId: Int = 0,
        val friendsOnly: Boolean = false,
        val copyright: String = "",
        val signerId: Int = 0,
        val canPin: Boolean = true,
        val canDelete: Boolean = true,
        val canEdit: Boolean = true,
        val isPinned: Boolean = true,
        val markedAsAds: Boolean = true,
        val isFavorite: Boolean = false,
        val postponedId: Int = 0
) {

    object comments {
        val count: Int = 0
        val canPost: Boolean = true
        val groupsCanPost: Boolean = true
        val canClose: Boolean = true
        val canOpen: Boolean = true
    }

    object likes {
        val count: Int = 0
        val userLikes: Boolean = true
        val canLike: Boolean = true
        val canPublish: Boolean = true
    }

    object reposts {
        val countReposts: Int = 0
        val userReposted: Boolean = true
    }

    object WallService {
        var posts = emptyArray<Post>()
        fun add(post: Post): Post {
            posts += post.copy(id = post.id + 1)
            return posts.last()
        }

        fun update(post: Post): Boolean {
            return post.id in posts
        }
    }

}

