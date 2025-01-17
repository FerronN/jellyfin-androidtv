package org.jellyfin.playback.core.queue.item

data class QueueEntryMetadata(
	val album: String? = null,
	val albumArtist: String? = null,
	val albumArtUri: String? = null,
	val artist: String? = null,
	val artUri: String? = null,
	val author: String? = null,
	val compilation: String? = null,
	val composer: String? = null,
	val date: String? = null,
	val discNumber: Long? = null,
	val displayDescription: String? = null,
	val displayIconUri: String? = null,
	val displaySubtitle: String? = null,
	val displayTitle: String? = null,
	val duration: Long? = null,
	val genre: String? = null,
	val mediaId: String? = null,
	val mediaUri: String? = null,
	val numTracks: Long? = null,
	val title: String? = null,
	val trackNumber: Long? = null,
	val writer: String? = null,
	val year: Long? = null,
) {
	companion object {
		val Empty = QueueEntryMetadata()
	}
}
