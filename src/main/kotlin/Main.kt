package ru.createPost

import ru.createPost.Post
import ru.createPost.Post.WallService.add
import ru.createPost.Post.WallService.update

fun main() {
    val original = Post()
    val superPost = Post()
    val netlogo = Post(text = "Как прекрасна Нетология!")

    add(superPost)
    add(netlogo)
    add(original)
    update(original)
}