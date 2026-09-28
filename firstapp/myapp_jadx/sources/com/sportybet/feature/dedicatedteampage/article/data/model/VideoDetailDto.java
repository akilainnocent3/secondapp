package com.sportybet.feature.dedicatedteampage.article.data.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.dedicatedteampage.shared.data.model.ImageDto;
import com.sportybet.feature.dedicatedteampage.shared.data.model.TagsDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.VideoDto;
import defpackage.f87;
import defpackage.gpp;
import defpackage.pr0;
import defpackage.ux5;
import defpackage.wxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0099\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00105\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00106\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017Ê\u0001\u0002\b8Ê\u0001\f\b9\u0012\b\b:\u0012\u0004\b\u0003\u0010\u0000¨\u00067"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/article/data/model/VideoDetailDto;", "", AnalyticsParam.EVENT_PARAM_ID, "", "title", "description", AnalyticsParam.KEY_BI_DURATION, "", "publishedTime", "", "format", "", "source", "videos", "Lcom/sportybet/feature/dedicatedteampage/team/data/model/VideoDto;", "thumbnails", "Lcom/sportybet/feature/dedicatedteampage/shared/data/model/ImageDto;", "tags", "Lcom/sportybet/feature/dedicatedteampage/shared/data/model/TagsDto;", "byLine", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/sportybet/feature/dedicatedteampage/shared/data/model/TagsDto;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getDuration", "()I", "getPublishedTime", "()J", "getFormat", "()Ljava/util/List;", "getSource", "getVideos", "getThumbnails", "getTags", "()Lcom/sportybet/feature/dedicatedteampage/shared/data/model/TagsDto;", "getByLine", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VideoDetailDto {
    public static final int $stable = TagsDto.$stable;
    private final String byLine;
    private final String description;
    private final int duration;
    private final List<Integer> format;
    private final String id;
    private final long publishedTime;
    private final String source;
    private final TagsDto tags;
    private final List<ImageDto> thumbnails;
    private final String title;
    private final List<VideoDto> videos;

    public VideoDetailDto(String str, String str2, String str3, int i, long j, List<Integer> list, String str4, List<VideoDto> list2, List<ImageDto> list3, TagsDto tagsDto, String str5) {
        str.getClass();
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.duration = i;
        this.publishedTime = j;
        this.format = list;
        this.source = str4;
        this.videos = list2;
        this.thumbnails = list3;
        this.tags = tagsDto;
        this.byLine = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoDetailDto copy$default(VideoDetailDto videoDetailDto, String str, String str2, String str3, int i, long j, List list, String str4, List list2, List list3, TagsDto tagsDto, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoDetailDto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = videoDetailDto.title;
        }
        if ((i2 & 4) != 0) {
            str3 = videoDetailDto.description;
        }
        if ((i2 & 8) != 0) {
            i = videoDetailDto.duration;
        }
        if ((i2 & 16) != 0) {
            j = videoDetailDto.publishedTime;
        }
        if ((i2 & 32) != 0) {
            list = videoDetailDto.format;
        }
        if ((i2 & 64) != 0) {
            str4 = videoDetailDto.source;
        }
        if ((i2 & 128) != 0) {
            list2 = videoDetailDto.videos;
        }
        if ((i2 & 256) != 0) {
            list3 = videoDetailDto.thumbnails;
        }
        if ((i2 & 512) != 0) {
            tagsDto = videoDetailDto.tags;
        }
        if ((i2 & 1024) != 0) {
            str5 = videoDetailDto.byLine;
        }
        TagsDto tagsDto2 = tagsDto;
        String str6 = str5;
        long j2 = j;
        String str7 = str3;
        int i3 = i;
        return videoDetailDto.copy(str, str2, str7, i3, j2, list, str4, list2, list3, tagsDto2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final TagsDto getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getByLine() {
        return this.byLine;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPublishedTime() {
        return this.publishedTime;
    }

    public final List<Integer> component6() {
        return this.format;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final List<VideoDto> component8() {
        return this.videos;
    }

    public final List<ImageDto> component9() {
        return this.thumbnails;
    }

    public final VideoDetailDto copy(String id, String title, String description, int duration, long publishedTime, List<Integer> format, String source, List<VideoDto> videos, List<ImageDto> thumbnails, TagsDto tags, String byLine) {
        id.getClass();
        return new VideoDetailDto(id, title, description, duration, publishedTime, format, source, videos, thumbnails, tags, byLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDetailDto)) {
            return false;
        }
        VideoDetailDto videoDetailDto = (VideoDetailDto) other;
        return Intrinsics.g(this.id, videoDetailDto.id) && Intrinsics.g(this.title, videoDetailDto.title) && Intrinsics.g(this.description, videoDetailDto.description) && this.duration == videoDetailDto.duration && this.publishedTime == videoDetailDto.publishedTime && Intrinsics.g(this.format, videoDetailDto.format) && Intrinsics.g(this.source, videoDetailDto.source) && Intrinsics.g(this.videos, videoDetailDto.videos) && Intrinsics.g(this.thumbnails, videoDetailDto.thumbnails) && Intrinsics.g(this.tags, videoDetailDto.tags) && Intrinsics.g(this.byLine, videoDetailDto.byLine);
    }

    public final String getByLine() {
        return this.byLine;
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

    public final String getId() {
        return this.id;
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

    public final List<ImageDto> getThumbnails() {
        return this.thumbnails;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<VideoDto> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iA = f87.a(gpp.a(this.duration, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), this.publishedTime, 31);
        List<Integer> list = this.format;
        int iHashCode3 = (iA + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.source;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<VideoDto> list2 = this.videos;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ImageDto> list3 = this.thumbnails;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        TagsDto tagsDto = this.tags;
        int iHashCode7 = (iHashCode6 + (tagsDto == null ? 0 : tagsDto.hashCode())) * 31;
        String str4 = this.byLine;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        int i = this.duration;
        long j = this.publishedTime;
        List<Integer> list = this.format;
        String str4 = this.source;
        List<VideoDto> list2 = this.videos;
        List<ImageDto> list3 = this.thumbnails;
        TagsDto tagsDto = this.tags;
        String str5 = this.byLine;
        StringBuilder sbA = ux5.a("VideoDetailDto(id=", str, ", title=", str2, ", description=");
        wxa.b(i, str3, ", duration=", ", publishedTime=", sbA);
        sbA.append(j);
        sbA.append(", format=");
        sbA.append(list);
        sbA.append(", source=");
        sbA.append(str4);
        sbA.append(", videos=");
        sbA.append(list2);
        sbA.append(", thumbnails=");
        sbA.append(list3);
        sbA.append(", tags=");
        sbA.append(tagsDto);
        return pr0.a(sbA, ", byLine=", str5, ")");
    }
}
