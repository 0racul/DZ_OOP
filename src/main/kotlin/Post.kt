import java.util.*

data class Post(

    var id: Long,
    val owner_id: Long,
    val from_id: Long,
    val created_by: Long,
    val date: Calendar,
    val text: String,
    val reply_owner_id: Long,
    val reply_post_id: Long,
    val friends_only: Boolean,
    var likes: Int,
    var reposts: Int,
    var views: Int,
    val post_type: String,
    val signer_id: Long,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Int,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val postponed_id: Long

)

{


}