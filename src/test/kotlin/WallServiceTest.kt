import org.junit.Test

import java.util.Calendar
import kotlin.test.assertFalse
import kotlin.test.assertTrue


val post = Post(
    id = 0,
    owner_id = 0,
    from_id = 0,
    created_by = 0,
    date =  Calendar.getInstance(),
    text = "sfdgdf",
    reply_owner_id = 0,
    reply_post_id = 0,
    friends_only = false,
    likes = 0,
    reposts = 0,
    views = 0,
    post_type ="sdf",
    signer_id = 0,
    can_pin = true,
    can_delete = true,
    can_edit = true,
    is_pinned = 1,
    marked_as_ads = true,
    is_favorite = true,
    postponed_id = 0
)


class WallServiceTest {

    @Test
    fun checkAddPost() {

            val postToCheck = WallService.addPost(post)
            assertTrue { postToCheck.id != 0L }

    }


    @Test
    fun checkUpdateSuccessful(){

        WallService.posts = emptyArray<Post>()

        val postToCheck = WallService.addPost(post)

        val updated = WallService.updatePost(postToCheck)

        assertTrue { updated }

    }

    @Test
    fun checkUpdateFailed(){

        WallService.posts = emptyArray<Post>()

        val postToCheck = WallService.addPost(post)

        val infoForUpdate = postToCheck.copy(id = 100500)

        val updated = WallService.updatePost(infoForUpdate)

        assertTrue { updated }

    }


}