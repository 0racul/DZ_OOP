package attach_types

import java.util.*
import Attachment

class AudioAttach(
    id: Long,
    owner_id: Long,
    date: Calendar,
    artist: String ,
    title: String,
    duration: Int,
    url: String,
    lyrics_id: Long,
    album_id: Long,
    genre_id: Long,
    no_search: Int = 1,
    is_hq: Int = 1): Attachment(id, owner_id, date) {
}