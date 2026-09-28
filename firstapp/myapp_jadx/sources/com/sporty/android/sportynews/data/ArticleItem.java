package com.sporty.android.sportynews.data;

import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.nrz;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0011HÆ\u0003J{\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!Ê\u0001\u0002\b3Ê\u0001\f\b4\u0012\b\b5\u0012\u0004\b\u0003\u0010\u0000¨\u00062"}, d2 = {"Lcom/sporty/android/sportynews/data/ArticleItem;", "", AnalyticsParam.EVENT_PARAM_ID, "", "headline", "teaser", "articleType", Category.CATEGORY_ID, "Lcom/sporty/android/sportynews/data/CategoryItem;", "tags", "", "Lcom/sporty/android/sportynews/data/TagItem;", "previewImages", "Lcom/sporty/android/sportynews/data/PreviewImageItem;", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_VIDEO, "Lcom/sporty/android/sportynews/data/VideoItem;", "publishTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/sportynews/data/CategoryItem;Ljava/util/List;Ljava/util/List;Lcom/sporty/android/sportynews/data/VideoItem;J)V", "getId", "()Ljava/lang/String;", "getHeadline", "getTeaser", "getArticleType", "getCategory", "()Lcom/sporty/android/sportynews/data/CategoryItem;", "getTags", "()Ljava/util/List;", "getPreviewImages", "getVideo", "()Lcom/sporty/android/sportynews/data/VideoItem;", "getPublishTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ArticleItem {
    public static final int $stable = VideoItem.$stable | CategoryItem.$stable;
    private final String articleType;
    private final CategoryItem category;
    private final String headline;
    private final String id;
    private final List<PreviewImageItem> previewImages;
    private final long publishTime;
    private final List<TagItem> tags;
    private final String teaser;
    private final VideoItem video;

    public ArticleItem(String str, String str2, String str3, String str4, CategoryItem categoryItem, List<TagItem> list, List<PreviewImageItem> list2, VideoItem videoItem, long j) {
        str.getClass();
        videoItem.getClass();
        this.id = str;
        this.headline = str2;
        this.teaser = str3;
        this.articleType = str4;
        this.category = categoryItem;
        this.tags = list;
        this.previewImages = list2;
        this.video = videoItem;
        this.publishTime = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArticleItem copy$default(ArticleItem articleItem, String str, String str2, String str3, String str4, CategoryItem categoryItem, List list, List list2, VideoItem videoItem, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleItem.id;
        }
        if ((i & 2) != 0) {
            str2 = articleItem.headline;
        }
        if ((i & 4) != 0) {
            str3 = articleItem.teaser;
        }
        if ((i & 8) != 0) {
            str4 = articleItem.articleType;
        }
        if ((i & 16) != 0) {
            categoryItem = articleItem.category;
        }
        if ((i & 32) != 0) {
            list = articleItem.tags;
        }
        if ((i & 64) != 0) {
            list2 = articleItem.previewImages;
        }
        if ((i & 128) != 0) {
            videoItem = articleItem.video;
        }
        if ((i & 256) != 0) {
            j = articleItem.publishTime;
        }
        long j2 = j;
        List list3 = list2;
        VideoItem videoItem2 = videoItem;
        CategoryItem categoryItem2 = categoryItem;
        List list4 = list;
        return articleItem.copy(str, str2, str3, str4, categoryItem2, list4, list3, videoItem2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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

    public final ArticleItem copy(String id, String headline, String teaser, String articleType, CategoryItem category, List<TagItem> tags, List<PreviewImageItem> previewImages, VideoItem video, long publishTime) {
        id.getClass();
        video.getClass();
        return new ArticleItem(id, headline, teaser, articleType, category, tags, previewImages, video, publishTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleItem)) {
            return false;
        }
        ArticleItem articleItem = (ArticleItem) other;
        return Intrinsics.g(this.id, articleItem.id) && Intrinsics.g(this.headline, articleItem.headline) && Intrinsics.g(this.teaser, articleItem.teaser) && Intrinsics.g(this.articleType, articleItem.articleType) && Intrinsics.g(this.category, articleItem.category) && Intrinsics.g(this.tags, articleItem.tags) && Intrinsics.g(this.previewImages, articleItem.previewImages) && Intrinsics.g(this.video, articleItem.video) && this.publishTime == articleItem.publishTime;
    }

    public final String getArticleType() {
        return this.articleType;
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
        return Long.hashCode(this.publishTime) + ((this.video.hashCode() + ((iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31)) * 31);
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
        StringBuilder sbA = ux5.a("ArticleItem(id=", str, ", headline=", str2, ", teaser=");
        hxa.c(sbA, str3, ", articleType=", str4, ", category=");
        sbA.append(categoryItem);
        sbA.append(", tags=");
        sbA.append(list);
        sbA.append(", previewImages=");
        sbA.append(list2);
        sbA.append(", video=");
        sbA.append(videoItem);
        sbA.append(", publishTime=");
        return nrz.a(j, ")", sbA);
    }
}
