package com.sporty.android.sportynews.data;

import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.em5;
import defpackage.f87;
import defpackage.hxa;
import defpackage.pr0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J³\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020=HÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aÊ\u0001\u0002\b@Ê\u0001\f\bA\u0012\b\bB\u0012\u0004\b\u0003\u0010\u0000¨\u0006?"}, d2 = {"Lcom/sporty/android/sportynews/data/ArticleDetailItem;", "", AnalyticsParam.EVENT_PARAM_ID, "", "headline", "teaser", "articleType", Category.CATEGORY_ID, "Lcom/sporty/android/sportynews/data/CategoryItem;", "tags", "", "Lcom/sporty/android/sportynews/data/TagItem;", "previewImages", "Lcom/sporty/android/sportynews/data/PreviewImageItem;", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_VIDEO, "Lcom/sporty/android/sportynews/data/VideoItem;", "publishTime", "", "body", "byLine", "related", "Lcom/sporty/android/sportynews/data/RelatedItem;", "shareLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/sportynews/data/CategoryItem;Ljava/util/List;Ljava/util/List;Lcom/sporty/android/sportynews/data/VideoItem;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHeadline", "getTeaser", "getArticleType", "getCategory", "()Lcom/sporty/android/sportynews/data/CategoryItem;", "getTags", "()Ljava/util/List;", "getPreviewImages", "getVideo", "()Lcom/sporty/android/sportynews/data/VideoItem;", "getPublishTime", "()J", "getBody", "getByLine", "getRelated", "getShareLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ArticleDetailItem {
    public static final int $stable = VideoItem.$stable | CategoryItem.$stable;
    private final String articleType;
    private final String body;
    private final String byLine;
    private final CategoryItem category;
    private final String headline;
    private final String id;
    private final List<PreviewImageItem> previewImages;
    private final long publishTime;
    private final List<RelatedItem> related;
    private final String shareLink;
    private final List<TagItem> tags;
    private final String teaser;
    private final VideoItem video;

    public ArticleDetailItem(String str, String str2, String str3, String str4, CategoryItem categoryItem, List<TagItem> list, List<PreviewImageItem> list2, VideoItem videoItem, long j, String str5, String str6, List<RelatedItem> list3, String str7) {
        str.getClass();
        this.id = str;
        this.headline = str2;
        this.teaser = str3;
        this.articleType = str4;
        this.category = categoryItem;
        this.tags = list;
        this.previewImages = list2;
        this.video = videoItem;
        this.publishTime = j;
        this.body = str5;
        this.byLine = str6;
        this.related = list3;
        this.shareLink = str7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getByLine() {
        return this.byLine;
    }

    public final List<RelatedItem> component12() {
        return this.related;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getShareLink() {
        return this.shareLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTeaser() {
        return this.teaser;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getArticleType() {
        return this.articleType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CategoryItem getCategory() {
        return this.category;
    }

    public final List<TagItem> component6() {
        return this.tags;
    }

    public final List<PreviewImageItem> component7() {
        return this.previewImages;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VideoItem getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getPublishTime() {
        return this.publishTime;
    }

    public final ArticleDetailItem copy(String id, String headline, String teaser, String articleType, CategoryItem category, List<TagItem> tags, List<PreviewImageItem> previewImages, VideoItem video, long publishTime, String body, String byLine, List<RelatedItem> related, String shareLink) {
        id.getClass();
        return new ArticleDetailItem(id, headline, teaser, articleType, category, tags, previewImages, video, publishTime, body, byLine, related, shareLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleDetailItem)) {
            return false;
        }
        ArticleDetailItem articleDetailItem = (ArticleDetailItem) other;
        return Intrinsics.g(this.id, articleDetailItem.id) && Intrinsics.g(this.headline, articleDetailItem.headline) && Intrinsics.g(this.teaser, articleDetailItem.teaser) && Intrinsics.g(this.articleType, articleDetailItem.articleType) && Intrinsics.g(this.category, articleDetailItem.category) && Intrinsics.g(this.tags, articleDetailItem.tags) && Intrinsics.g(this.previewImages, articleDetailItem.previewImages) && Intrinsics.g(this.video, articleDetailItem.video) && this.publishTime == articleDetailItem.publishTime && Intrinsics.g(this.body, articleDetailItem.body) && Intrinsics.g(this.byLine, articleDetailItem.byLine) && Intrinsics.g(this.related, articleDetailItem.related) && Intrinsics.g(this.shareLink, articleDetailItem.shareLink);
    }

    public final String getArticleType() {
        return this.articleType;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getByLine() {
        return this.byLine;
    }

    public final CategoryItem getCategory() {
        return this.category;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getId() {
        return this.id;
    }

    public final List<PreviewImageItem> getPreviewImages() {
        return this.previewImages;
    }

    public final long getPublishTime() {
        return this.publishTime;
    }

    public final List<RelatedItem> getRelated() {
        return this.related;
    }

    public final String getShareLink() {
        return this.shareLink;
    }

    public final List<TagItem> getTags() {
        return this.tags;
    }

    public final String getTeaser() {
        return this.teaser;
    }

    public final VideoItem getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.headline;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.teaser;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.articleType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CategoryItem categoryItem = this.category;
        int iHashCode5 = (iHashCode4 + (categoryItem == null ? 0 : categoryItem.hashCode())) * 31;
        List<TagItem> list = this.tags;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<PreviewImageItem> list2 = this.previewImages;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        VideoItem videoItem = this.video;
        int iA = f87.a((iHashCode7 + (videoItem == null ? 0 : videoItem.hashCode())) * 31, this.publishTime, 31);
        String str4 = this.body;
        int iHashCode8 = (iA + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.byLine;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<RelatedItem> list3 = this.related;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str6 = this.shareLink;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.headline;
        String str3 = this.teaser;
        String str4 = this.articleType;
        CategoryItem categoryItem = this.category;
        List<TagItem> list = this.tags;
        List<PreviewImageItem> list2 = this.previewImages;
        VideoItem videoItem = this.video;
        long j = this.publishTime;
        String str5 = this.body;
        String str6 = this.byLine;
        List<RelatedItem> list3 = this.related;
        String str7 = this.shareLink;
        StringBuilder sbA = ux5.a("ArticleDetailItem(id=", str, ", headline=", str2, ", teaser=");
        hxa.c(sbA, str3, ", articleType=", str4, ", category=");
        sbA.append(categoryItem);
        sbA.append(", tags=");
        sbA.append(list);
        sbA.append(", previewImages=");
        sbA.append(list2);
        sbA.append(", video=");
        sbA.append(videoItem);
        sbA.append(", publishTime=");
        em5.a(j, ", body=", str5, sbA);
        sbA.append(", byLine=");
        sbA.append(str6);
        sbA.append(", related=");
        sbA.append(list3);
        return pr0.a(sbA, ", shareLink=", str7, ")");
    }
}
