package com.unity3d.ads.core.data.model;

import f0.p;
import java.io.File;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CachedFile {
    private final long contentLength;

    @m
    private final String extension;

    @m
    private final File file;

    @l
    private final String name;
    private final int priority;

    @l
    private final String protocol;

    @l
    private final String url;

    public CachedFile(@l String url, @l String name, @m File file, @m String str, long j10, @l String protocol, int i10) {
        m0.p(url, "url");
        m0.p(name, "name");
        m0.p(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j10;
        this.protocol = protocol;
        this.priority = i10;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cachedFile.url;
        }
        if ((i11 & 2) != 0) {
            str2 = cachedFile.name;
        }
        if ((i11 & 4) != 0) {
            file = cachedFile.file;
        }
        if ((i11 & 8) != 0) {
            str3 = cachedFile.extension;
        }
        if ((i11 & 16) != 0) {
            j10 = cachedFile.contentLength;
        }
        if ((i11 & 32) != 0) {
            str4 = cachedFile.protocol;
        }
        if ((i11 & 64) != 0) {
            i10 = cachedFile.priority;
        }
        long j11 = j10;
        File file2 = file;
        String str5 = str3;
        return cachedFile.copy(str, str2, file2, str5, j11, str4, i10);
    }

    @l
    public final String component1() {
        return this.url;
    }

    @l
    public final String component2() {
        return this.name;
    }

    @m
    public final File component3() {
        return this.file;
    }

    @m
    public final String component4() {
        return this.extension;
    }

    public final long component5() {
        return this.contentLength;
    }

    @l
    public final String component6() {
        return this.protocol;
    }

    public final int component7() {
        return this.priority;
    }

    @l
    public final CachedFile copy(@l String url, @l String name, @m File file, @m String str, long j10, @l String protocol, int i10) {
        m0.p(url, "url");
        m0.p(name, "name");
        m0.p(protocol, "protocol");
        return new CachedFile(url, name, file, str, j10, protocol, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return m0.g(this.url, cachedFile.url) && m0.g(this.name, cachedFile.name) && m0.g(this.file, cachedFile.file) && m0.g(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && m0.g(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @m
    public final String getExtension() {
        return this.extension;
    }

    @m
    public final File getFile() {
        return this.file;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    @l
    public final String getProtocol() {
        return this.protocol;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + p.a(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + this.priority;
    }

    @l
    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j10, String str4, int i10, int i11, x xVar) {
        this(str, str2, (i11 & 4) != 0 ? null : file, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? -1L : j10, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10);
    }
}
