package newlearning.designpattern.makeanappanddeployitonline.youtube

data class YoutubeRequest(
    var etag: String?,
    var items: List<Item>?,
    var kind: String?,
    var nextPageToken: String?,
    var pageInfo: PageInfo?,
    var regionCode: String?
)