package com.sportybet.feature.dedicatedteampage.team.data.model;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.dedicatedteampage.shared.data.model.ImageDto;
import com.sportybet.feature.dedicatedteampage.shared.data.model.TagsDto;
import defpackage.f87;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.qjk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0007\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0007HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007HÆ\u0003JÁ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00072\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007HÆ\u0001J\u0014\u0010>\u001a\u00020\u000b2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020\bHÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010 Ê\u0001\u0002\bCÊ\u0001\f\bD\u0012\b\bE\u0012\u0004\b\u0003\u0010\u0000¨\u0006B"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/team/data/model/FeedDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "publishedTime", "", "format", "", "", "source", "live", "", "tags", "Lcom/sportybet/feature/dedicatedteampage/shared/data/model/TagsDto;", "headline", "language", "images", "Lcom/sportybet/feature/dedicatedteampage/shared/data/model/ImageDto;", "title", "description", AnalyticsParam.KEY_BI_DURATION, "videos", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/VideoDto;", "thumbnails", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/ThumbnailDto;", "<init>", "(Ljava/lang/String;JLjava/util/List;Ljava/lang/String;ZLcom/sportybet/feature/dedicatedteampage/shared/data/model/TagsDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getPublishedTime", "()J", "getFormat", "()Ljava/util/List;", "getSource", "getLive", "()Z", "getTags", "()Lcom/sportybet/feature/dedicatedteampage/shared/data/model/TagsDto;", "getHeadline", "getLanguage", "getImages", "getTitle", "getDescription", "getDuration", "()I", "getVideos", "getThumbnails", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeedDto {
    public static final int $stable = TagsDto.$stable;
    private final String description;
    private final int duration;
    private final List<Integer> format;
    private final String headline;
    private final String id;
    private final List<ImageDto> images;
    private final String language;
    private final boolean live;
    private final long publishedTime;
    private final String source;
    private final TagsDto tags;
    private final List<ThumbnailDto> thumbnails;
    private final String title;
    private final List<VideoDto> videos;

    public FeedDto(String str, long j, List<Integer> list, String str2, boolean z, TagsDto tagsDto, String str3, String str4, List<ImageDto> list2, String str5, String str6, int i, List<VideoDto> list3, List<ThumbnailDto> list4) {
        str.getClass();
        this.id = str;
        this.publishedTime = j;
        this.format = list;
        this.source = str2;
        this.live = z;
        this.tags = tagsDto;
        this.headline = str3;
        this.language = str4;
        this.images = list2;
        this.title = str5;
        this.description = str6;
        this.duration = i;
        this.videos = list3;
        this.thumbnails = list4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    public final List<VideoDto> component13() {
        return this.videos;
    }

    public final List<ThumbnailDto> component14() {
        return this.thumbnails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPublishedTime() {
        return this.publishedTime;
    }

    public final List<Integer> component3() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLive() {
        return this.live;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TagsDto getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final List<ImageDto> component9() {
        return this.images;
    }

    public final FeedDto copy(String id, long publishedTime, List<Integer> format, String source, boolean live, TagsDto tags, String headline, String language, List<ImageDto> images, String title, String description, int duration, List<VideoDto> videos, List<ThumbnailDto> thumbnails) {
        id.getClass();
        return new FeedDto(id, publishedTime, format, source, live, tags, headline, language, images, title, description, duration, videos, thumbnails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedDto)) {
            return false;
        }
        FeedDto feedDto = (FeedDto) other;
        return Intrinsics.g(this.id, feedDto.id) && this.publishedTime == feedDto.publishedTime && Intrinsics.g(this.format, feedDto.format) && Intrinsics.g(this.source, feedDto.source) && this.live == feedDto.live && Intrinsics.g(this.tags, feedDto.tags) && Intrinsics.g(this.headline, feedDto.headline) && Intrinsics.g(this.language, feedDto.language) && Intrinsics.g(this.images, feedDto.images) && Intrinsics.g(this.title, feedDto.title) && Intrinsics.g(this.description, feedDto.description) && this.duration == feedDto.duration && Intrinsics.g(this.videos, feedDto.videos) && Intrinsics.g(this.thumbnails, feedDto.thumbnails);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final List<Integer> getFormat() {
        return this.format;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getId() {
        return this.id;
    }

    public final List<ImageDto> getImages() {
        return this.images;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean getLive() {
        return this.live;
    }

    public final long getPublishedTime() {
        return this.publishedTime;
    }

    public final String getSource() {
        return this.source;
    }

    public final TagsDto getTags() {
        return this.tags;
    }

    public final List<ThumbnailDto> getThumbnails() {
        return this.thumbnails;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<VideoDto> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int iA = f87.a(this.id.hashCode() * 31, this.publishedTime, 31);
        List<Integer> list = this.format;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.source;
        int iA2 = mtg0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.live);
        TagsDto tagsDto = this.tags;
        int iHashCode2 = (iA2 + (tagsDto == null ? 0 : tagsDto.hashCode())) * 31;
        String str2 = this.headline;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ImageDto> list2 = this.images;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iA3 = gpp.a(this.duration, (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        List<VideoDto> list3 = this.videos;
        int iHashCode7 = (iA3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ThumbnailDto> list4 = this.thumbnails;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        long j = this.publishedTime;
        List<Integer> list = this.format;
        String str2 = this.source;
        boolean z = this.live;
        TagsDto tagsDto = this.tags;
        String str3 = this.headline;
        String str4 = this.language;
        List<ImageDto> list2 = this.images;
        String str5 = this.title;
        String str6 = this.description;
        int i = this.duration;
        List<VideoDto> list3 = this.videos;
        List<ThumbnailDto> list4 = this.thumbnails;
        StringBuilder sbA = x.a(j, "FeedDto(id=", str, ", publishedTime=");
        sbA.append(", format=");
        sbA.append(list);
        sbA.append(", source=");
        sbA.append(str2);
        sbA.append(", live=");
        sbA.append(z);
        sbA.append(", tags=");
        sbA.append(tagsDto);
        hxa.c(sbA, ", headline=", str3, ", language=", str4);
        sbA.append(", images=");
        sbA.append(list2);
        sbA.append(", title=");
        sbA.append(str5);
        sbA.append(", description=");
        sbA.append(str6);
        sbA.append(", duration=");
        sbA.append(i);
        qjk.a(", videos=", ", thumbnails=", sbA, list3, list4);
        sbA.append(")");
        return sbA.toString();
    }
}
