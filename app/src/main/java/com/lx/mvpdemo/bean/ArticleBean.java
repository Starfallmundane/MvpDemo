package com.lx.mvpdemo.bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

public class ArticleBean implements MultiItemEntity {

    public int articType;

    @Override
    public int getItemType() {
        return articType;
    }


    /**
     * id : 10
     * newsId : 10
     * title : 想要好的砂石设备,就到河南<font color='red'>红星</font>
     * image : ["http://172.16.10.80//image/20191108/1573195246202084709.jpeg","http://172.16.10.80//image/20191108/1573195328861009650.png","http://172.16.10.80//image/20191108/1573195282854037962.png"]
     * imageList : ["http://172.16.10.80//image/20191108/1573195246202084709.jpeg","http://172.16.10.80//image/20191108/1573195328861009650.png","http://172.16.10.80//image/20191108/1573195282854037962.png"]
     * coverImages : http://172.16.10.80/image/20191108/1573195246202084709.jpeg
     * status : 1
     * type : 1
     * url : html/news/2019-11-08/f5077866aae74fc5a36c4bbc3b7a74ee.html
     * releaseTime : 2019-11-08 14:44:17
     * createTime : 2019-11-08 14:44:18
     * updateTime : 2019-11-08 14:45:55
     * delFlag : 0
     * browsingCount : 1
     * collectFlag : 1  收藏标识 1.收藏 0.未收藏
     * commentCount : 1
     */

    private int id;
    private int adminId;
    private String adminName;
    private String adminHeadPic;
    private String mediaName;
    private String newsId;
    private String title;
    private String image;
    private String coverImages;
    private String description;
    private String content;
    private String video;
    private String videoLength;
    private int status;
    private int type;
    private String url;
    private String releaseTime;
    private String createTime;
    private String updateTime;
    private String shareUrl;
    private int delFlag;
    private int browsingCount;
    private int collectFlag;
    private int commentCount;
    private List<String> imageList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminHeadPic() {
        return adminHeadPic;
    }

    public void setAdminHeadPic(String adminHeadPic) {
        this.adminHeadPic = adminHeadPic;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCoverImages() {
        return coverImages;
    }

    public void setCoverImages(String coverImages) {
        this.coverImages = coverImages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(String videoLength) {
        this.videoLength = videoLength;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public int getBrowsingCount() {
        return browsingCount;
    }

    public int getCollectFlag() {
        return collectFlag;
    }

    public void setCollectFlag(int collectFlag) {
        this.collectFlag = collectFlag;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public void setBrowsingCount(int browsingCount) {
        this.browsingCount = browsingCount;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    @Override
    public String toString() {
        return "ArticleBean{" +
                "articType=" + articType +
                ", id=" + id +
                ", adminId=" + adminId +
                ", adminName='" + adminName + '\'' +
                ", adminHeadPic='" + adminHeadPic + '\'' +
                ", newsId='" + newsId + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", coverImages='" + coverImages + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", video='" + video + '\'' +
                ", videoLength='" + videoLength + '\'' +
                ", status=" + status +
                ", type=" + type +
                ", url='" + url + '\'' +
                ", releaseTime='" + releaseTime + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", delFlag=" + delFlag +
                ", browsingCount=" + browsingCount +
                ", collectFlag=" + collectFlag +
                ", commentCount=" + commentCount +
                ", imageList=" + imageList +
                '}';
    }
}
