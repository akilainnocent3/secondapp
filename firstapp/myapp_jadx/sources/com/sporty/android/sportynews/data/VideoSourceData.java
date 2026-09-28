package com.sporty.android.sportynews.data;

import defpackage.em5;
import defpackage.f87;
import defpackage.pr0;
import defpackage.q6a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/sportynews/data/VideoSourceData;", "", "width", "", "height", "type", "", "url", "<init>", "(JJLjava/lang/String;Ljava/lang/String;)V", "getWidth", "()J", "getHeight", "getType", "()Ljava/lang/String;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VideoSourceData {
    public static final int $stable = 0;
    private final long height;
    private final String type;
    private final String url;
    private final long width;

    public VideoSourceData(long j, long j2, String str, String str2) {
        this.width = j;
        this.height = j2;
        this.type = str;
        this.url = str2;
    }

    public static /* synthetic */ VideoSourceData copy$default(VideoSourceData videoSourceData, long j, long j2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = videoSourceData.width;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = videoSourceData.height;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = videoSourceData.type;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = videoSourceData.url;
        }
        return videoSourceData.copy(j3, j4, str3, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final VideoSourceData copy(long width, long height, String type, String url) {
        return new VideoSourceData(width, height, type, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSourceData)) {
            return false;
        }
        VideoSourceData videoSourceData = (VideoSourceData) other;
        return this.width == videoSourceData.width && this.height == videoSourceData.height && Intrinsics.g(this.type, videoSourceData.type) && Intrinsics.g(this.url, videoSourceData.url);
    }

    public final long getHeight() {
        return this.height;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iA = f87.a(Long.hashCode(this.width) * 31, this.height, 31);
        String str = this.type;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        long j = this.width;
        long j2 = this.height;
        String str = this.type;
        String str2 = this.url;
        StringBuilder sbA = q6a0.a(j, "VideoSourceData(width=", ", height=");
        em5.a(j2, ", type=", str, sbA);
        return pr0.a(sbA, ", url=", str2, ")");
    }
}
