package com.sportybet.feature.dedicatedteampage.team.data.model;

import defpackage.b7f;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eÊ\u0001\u0002\b\u001bÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/team/data/model/VideoDto;", "", "type", "", "url", "width", "", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getType", "()Ljava/lang/String;", "getUrl", "getWidth", "()I", "getHeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VideoDto {
    public static final int $stable = 0;
    private final int height;
    private final String type;
    private final String url;
    private final int width;

    public VideoDto(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.type = str;
        this.url = str2;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ VideoDto copy$default(VideoDto videoDto, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = videoDto.type;
        }
        if ((i3 & 2) != 0) {
            str2 = videoDto.url;
        }
        if ((i3 & 4) != 0) {
            i = videoDto.width;
        }
        if ((i3 & 8) != 0) {
            i2 = videoDto.height;
        }
        return videoDto.copy(str, str2, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final VideoDto copy(String type, String url, int width, int height) {
        type.getClass();
        url.getClass();
        return new VideoDto(type, url, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDto)) {
            return false;
        }
        VideoDto videoDto = (VideoDto) other;
        return Intrinsics.g(this.type, videoDto.type) && Intrinsics.g(this.url, videoDto.url) && this.width == videoDto.width && this.height == videoDto.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + gpp.a(this.width, gmf0.a(this.type.hashCode() * 31, 31, this.url), 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.url;
        return b7f.a(ux5.a("VideoDto(type=", str, ", url=", str2, ", width="), this.width, ", height=", this.height, ")");
    }
}
