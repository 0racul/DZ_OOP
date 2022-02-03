package attach_types

import java.util.*
import Attachment

class DocAttach(
    id: Long,
    owner_id: Long,
    date: Calendar,
    title: String,
    size: Int,
    ext: String,
    url: String,
    type: Int,
    preview: String): Attachment(id, owner_id, date) {
}