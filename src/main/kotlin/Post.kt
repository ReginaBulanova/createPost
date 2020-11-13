package ru.createPost

data class Post(
        var id: Int = 0,
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
        val postponedId: Int = 0,
) {

    object WallService {
        private var posts = emptyArray<Post>()
        fun add(post: Post): Post {
            val anotherId = if (posts.isEmpty()) {
                1
            } else {
                posts.last().id + 1
            }
            posts += post.copy(id = anotherId)
            return posts.last()
        }
        private val currentPost: Post by lazy { this.posts.last() }
        fun update(post: Post): Boolean {
            for ((index, currentPost) in posts.withIndex()) {
                if (currentPost.id == post.id) {
                    posts[index] = post.copy(ownerId = currentPost.ownerId, date = currentPost.date)
                    return true
                }
            }
                return false
        }
    }
}


data class Comments(
        val count: Int = 0,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true
)

data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = true,
        val canLike: Boolean = true,
        val canPublish: Boolean = true
)

data class Reposts(
        val countReposts: Int = 0,
        val userReposted: Boolean = true
)




