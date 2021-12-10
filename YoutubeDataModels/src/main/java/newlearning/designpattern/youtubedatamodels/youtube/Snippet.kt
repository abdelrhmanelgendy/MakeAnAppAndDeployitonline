package newlearning.designpattern.makeanappanddeployitonline.youtube

data class Snippet(
    var channelId: String?,
    var channelTitle: String?,
    var description: String?,
    var liveBroadcastContent: String?,
    var publishTime: String?,
    var publishedAt: String?,
    var thumbnails: Thumbnails?,
    var title: String?
)