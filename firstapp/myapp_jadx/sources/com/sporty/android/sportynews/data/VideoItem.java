package com.sporty.android.sportynews.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0018Ê\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/sportynews/data/VideoItem;", "", AnalyticsParam.KEY_BI_DURATION, "", "sources", "", "Lcom/sporty/android/sportynews/data/VideoSourceData;", "<init>", "(JLjava/util/List;)V", "getDuration", "()J", "getSources", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VideoItem {
    public static final int $stable = 8;
    private final long duration;
    private final List<VideoSourceData> sources;

    public VideoItem(long j, List<VideoSourceData> list) {
        this.duration = j;
        this.sources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoItem copy$default(VideoItem videoItem, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = videoItem.duration;
        }
        if ((i & 2) != 0) {
            list = videoItem.sources;
        }
        return videoItem.copy(j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public final List<VideoSourceData> component2() {
        return this.sources;
    }

    public final VideoItem copy(long duration, List<VideoSourceData> sources) {
        return new VideoItem(duration, sources);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoItem)) {
            return false;
        }
        VideoItem videoItem = (VideoItem) other;
        return this.duration == videoItem.duration && Intrinsics.g(this.sources, videoItem.sources);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final List<VideoSourceData> getSources() {
        return this.sources;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.duration) * 31;
        List<VideoSourceData> list = this.sources;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "VideoItem(duration=" + this.duration + ", sources=" + this.sources + ")";
    }
}
