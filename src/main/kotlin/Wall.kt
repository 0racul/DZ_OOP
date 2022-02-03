object WallService {

    var posts = emptyArray<Post>()

    var maxId = 0L

    fun addPost(post: Post): Post{

        maxId += 1

        post.id = maxId

        posts += post

        return posts.last()

    }

    fun updatePost(postUpdate: Post): Boolean{

        var updated = false

        for (post in posts){

            if (post.id == postUpdate.id) {

                posts[posts.indexOf(post)] = postUpdate

                updated = true
                break
            }
            else updated = false

        }

        return updated
    }

}