package com.chartboost.sdk.impl;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f41023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f41024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f41025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f41027g;

    public tj(String url, String filename, File file, File file2, long j10, String queueFilePath, long j11) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(filename, "filename");
        kotlin.jvm.internal.m0.p(queueFilePath, "queueFilePath");
        this.f41021a = url;
        this.f41022b = filename;
        this.f41023c = file;
        this.f41024d = file2;
        this.f41025e = j10;
        this.f41026f = queueFilePath;
        this.f41027g = j11;
    }

    public final long a() {
        return this.f41025e;
    }

    public final File b() {
        return this.f41024d;
    }

    public final long c() {
        return this.f41027g;
    }

    public final String d() {
        return this.f41022b;
    }

    public final File e() {
        return this.f41023c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return kotlin.jvm.internal.m0.g(this.f41021a, tjVar.f41021a) && kotlin.jvm.internal.m0.g(this.f41022b, tjVar.f41022b) && kotlin.jvm.internal.m0.g(this.f41023c, tjVar.f41023c) && kotlin.jvm.internal.m0.g(this.f41024d, tjVar.f41024d) && this.f41025e == tjVar.f41025e && kotlin.jvm.internal.m0.g(this.f41026f, tjVar.f41026f) && this.f41027g == tjVar.f41027g;
    }

    public final String f() {
        return this.f41026f;
    }

    public final String g() {
        return this.f41021a;
    }

    public int hashCode() {
        int iHashCode = ((this.f41021a.hashCode() * 31) + this.f41022b.hashCode()) * 31;
        File file = this.f41023c;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.f41024d;
        return ((((((iHashCode2 + (file2 != null ? file2.hashCode() : 0)) * 31) + f0.p.a(this.f41025e)) * 31) + this.f41026f.hashCode()) * 31) + f0.p.a(this.f41027g);
    }

    public String toString() {
        return "VideoAsset(url=" + this.f41021a + ", filename=" + this.f41022b + ", localFile=" + this.f41023c + ", directory=" + this.f41024d + ", creationDate=" + this.f41025e + ", queueFilePath=" + this.f41026f + ", expectedFileSize=" + this.f41027g + gi.j.f86771d;
    }

    public final void a(long j10) {
        this.f41027g = j10;
    }

    public /* synthetic */ tj(String str, String str2, File file, File file2, long j10, String str3, long j11, int i10, kotlin.jvm.internal.x xVar) {
        this(str, str2, file, file2, (i10 & 16) != 0 ? fh.a() : j10, (i10 & 32) != 0 ? "" : str3, (i10 & 64) != 0 ? 0L : j11);
    }
}
