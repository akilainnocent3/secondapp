package com.sporty.android.sportynews.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010Ê\u0001\u0002\b&Ê\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/sporty/android/sportynews/data/RelatedItem;", "", AnalyticsParam.EVENT_PARAM_ID, "", "headline", "previewImages", "", "Lcom/sporty/android/sportynews/data/PreviewImageItem;", "publishTime", "", "tags", "Lcom/sporty/android/sportynews/data/TagItem;", "articleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getHeadline", "getPreviewImages", "()Ljava/util/List;", "getPublishTime", "()J", "getTags", "getArticleType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RelatedItem {
    public static final int $stable = 0;
    private final String articleType;
    private final String headline;
    private final String id;
    private final List<PreviewImageItem> previewImages;
    private final long publishTime;
    private final List<TagItem> tags;

    public RelatedItem(String str, String str2, List<PreviewImageItem> list, long j, List<TagItem> list2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.headline = str2;
        this.previewImages = list;
        this.publishTime = j;
        this.tags = list2;
        this.articleType = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelatedItem copy$default(RelatedItem relatedItem, String str, String str2, List list, long j, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relatedItem.id;
        }
        if ((i & 2) != 0) {
            str2 = relatedItem.headline;
        }
        if ((i & 4) != 0) {
            list = relatedItem.previewImages;
        }
        if ((i & 8) != 0) {
            j = relatedItem.publishTime;
        }
        if ((i & 16) != 0) {
            list2 = relatedItem.tags;
        }
        if ((i & 32) != 0) {
            str3 = relatedItem.articleType;
        }
        long j2 = j;
        List list3 = list;
        return relatedItem.copy(str, str2, list3, j2, list2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    public final List<PreviewImageItem> component3() {
        return this.previewImages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPublishTime() {
        return this.publishTime;
    }

    public final List<TagItem> component5() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getArticleType() {
        return this.articleType;
    }

    public final RelatedItem copy(String id, String headline, List<PreviewImageItem> previewImages, long publishTime, List<TagItem> tags, String articleType) {
        id.getClass();
        headline.getClass();
        return new RelatedItem(id, headline, previewImages, publishTime, tags, articleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedItem)) {
            return false;
        }
        RelatedItem relatedItem = (RelatedItem) other;
        return Intrinsics.g(this.id, relatedItem.id) && Intrinsics.g(this.headline, relatedItem.headline) && Intrinsics.g(this.previewImages, relatedItem.previewImages) && this.publishTime == relatedItem.publishTime && Intrinsics.g(this.tags, relatedItem.tags) && Intrinsics.g(this.articleType, relatedItem.articleType);
    }

    public final String getArticleType() {
        return this.articleType;
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

    public int hashCode() {
        int iA = gmf0.a(this.id.hashCode() * 31, 31, this.headline);
        List<PreviewImageItem> list = this.previewImages;
        int iA2 = f87.a((iA + (list == null ? 0 : list.hashCode())) * 31, this.publishTime, 31);
        List<TagItem> list2 = this.tags;
        int iHashCode = (iA2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.articleType;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.headline;
        List<PreviewImageItem> list = this.previewImages;
        long j = this.publishTime;
        List<TagItem> list2 = this.tags;
        String str3 = this.articleType;
        StringBuilder sbA = ux5.a("RelatedItem(id=", str, ", headline=", str2, ", previewImages=");
        sbA.append(list);
        sbA.append(", publishTime=");
        sbA.append(j);
        sbA.append(", tags=");
        sbA.append(list2);
        sbA.append(", articleType=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
