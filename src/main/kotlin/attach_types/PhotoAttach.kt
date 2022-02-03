package attach_types

import Attachment
import java.util.*

class PhotoAttach(
    id: Long,
    owner_id: Long,
    date: Calendar,
    album_id: Long,
    user_id: Long,
    text: String,
    sizes: String,
    width: Int,
    height: Int): Attachment(id, owner_id, date) {
}