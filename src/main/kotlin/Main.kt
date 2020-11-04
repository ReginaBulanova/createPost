package ru.createPost

import ru.createPost.Post.WallService

fun main() {
    val original = Post()
    val superPost = Post()
    val netology = Post(text = "Как прекрасна Нетология!")

    WallService.add(superPost)
    print(WallService.update(superPost))
    WallService.add(netology)
    WallService.add(original)
}