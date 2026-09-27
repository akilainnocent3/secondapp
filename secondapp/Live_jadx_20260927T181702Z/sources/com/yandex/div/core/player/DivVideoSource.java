package com.yandex.div.core.player;

import android.net.Uri;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVideoSource {

    @m
    private final Long bitrate;

    @l
    private final String mimeType;

    @m
    private final DivVideoResolution resolution;

    @l
    private final Uri url;

    public DivVideoSource(@l Uri uri, @l String str, @m DivVideoResolution divVideoResolution, @m Long l10) {
        this.url = uri;
        this.mimeType = str;
        this.resolution = divVideoResolution;
        this.bitrate = l10;
    }

    public static /* synthetic */ DivVideoSource copy$default(DivVideoSource divVideoSource, Uri uri, String str, DivVideoResolution divVideoResolution, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = divVideoSource.url;
        }
        if ((i10 & 2) != 0) {
            str = divVideoSource.mimeType;
        }
        if ((i10 & 4) != 0) {
            divVideoResolution = divVideoSource.resolution;
        }
        if ((i10 & 8) != 0) {
            l10 = divVideoSource.bitrate;
        }
        return divVideoSource.copy(uri, str, divVideoResolution, l10);
    }

    @l
    public final Uri component1() {
        return this.url;
    }

    @l
    public final String component2() {
        return this.mimeType;
    }

    @m
    public final DivVideoResolution component3() {
        return this.resolution;
    }

    @m
    public final Long component4() {
        return this.bitrate;
    }

    @l
    public final DivVideoSource copy(@l Uri uri, @l String str, @m DivVideoResolution divVideoResolution, @m Long l10) {
        return new DivVideoSource(uri, str, divVideoResolution, l10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        return m0.g(this.url, divVideoSource.url) && m0.g(this.mimeType, divVideoSource.mimeType) && m0.g(this.resolution, divVideoSource.resolution) && m0.g(this.bitrate, divVideoSource.bitrate);
    }

    @m
    public final Long getBitrate() {
        return this.bitrate;
    }

    @l
    public final String getMimeType() {
        return this.mimeType;
    }

    @m
    public final DivVideoResolution getResolution() {
        return this.resolution;
    }

    @l
    public final Uri getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.mimeType.hashCode()) * 31;
        DivVideoResolution divVideoResolution = this.resolution;
        int iHashCode2 = (iHashCode + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l10 = this.bitrate;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    @l
    public String toString() {
        return "DivVideoSource(url=" + this.url + ", mimeType=" + this.mimeType + ", resolution=" + this.resolution + ", bitrate=" + this.bitrate + ')';
    }

    public /* synthetic */ DivVideoSource(Uri uri, String str, DivVideoResolution divVideoResolution, Long l10, int i10, x xVar) {
        this(uri, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? null : divVideoResolution, (i10 & 8) != 0 ? null : l10);
    }
}
