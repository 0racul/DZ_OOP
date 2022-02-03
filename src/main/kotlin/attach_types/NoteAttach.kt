package attach_types

import Attachment
import java.util.*

class NoteAttach(
    id: Long,
    owner_id: Long,
    date: Calendar,
    title: String,
    text: String,
    comments: Int,
    read_comments: Int,
    view_url: String,
    privacy_view: String,
    privacy_comment: String,
    can_comment: Boolean,
    text_wiki: String): Attachment(id, owner_id, date) {

}