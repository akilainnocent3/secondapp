package com.chartboost.sdk.impl;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g3 f41592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f41593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f41594j;

    public xj(long j10, int i10, int i11, long j11, long j12, long j13, int i12, g3 g3Var) {
        this.f41585a = j10;
        this.f41586b = i10;
        this.f41587c = i11;
        this.f41588d = j11;
        this.f41589e = j12;
        this.f41590f = j13;
        this.f41591g = i12;
        this.f41592h = g3Var;
    }

    public final void a() {
        sb.a("addDownloadToTimeWindow() - timeWindowStartTimeStamp " + this.f41593i + ", timeWindowCachedVideosCount " + this.f41594j, (Throwable) null, 2, (Object) null);
        if (this.f41593i == 0) {
            this.f41593i = fh.a();
        }
        this.f41594j++;
    }

    public final long b() {
        return this.f41585a;
    }

    public final int c() {
        g3 g3Var = this.f41592h;
        return (g3Var == null || !g3Var.d()) ? this.f41586b : this.f41587c;
    }

    public final long d() {
        return f() - e();
    }

    public final void e(long j10) {
        this.f41589e = j10;
    }

    public final long f() {
        g3 g3Var = this.f41592h;
        return ((g3Var == null || !g3Var.d()) ? this.f41588d : this.f41589e) * ((long) 1000);
    }

    public final boolean g() {
        h();
        boolean z10 = this.f41594j >= c();
        if (z10) {
            jg.a("Video loading limit reached, will resume in timeToResetWindow: " + d());
        }
        sb.a("isMaxCountForTimeWindowReached() - " + z10, (Throwable) null, 2, (Object) null);
        return z10;
    }

    public final void h() {
        sb.a("resetWindowWhenTimeReached()", (Throwable) null, 2, (Object) null);
        if (e() > f()) {
            sb.a("resetWindowWhenTimeReached() - timer and count reset", (Throwable) null, 2, (Object) null);
            jg.a("Video loading limit reset");
            this.f41594j = 0;
            this.f41593i = 0L;
        }
    }

    public final long i() {
        return f() - (fh.a() - this.f41593i);
    }

    public final boolean b(long j10) {
        return j10 >= this.f41585a;
    }

    public final void d(long j10) {
        this.f41588d = j10;
    }

    public final long e() {
        return fh.a() - this.f41593i;
    }

    public final void f(long j10) {
        this.f41590f = j10;
    }

    public final void b(int i10) {
        this.f41586b = i10;
    }

    public final void c(long j10) {
        this.f41585a = j10;
    }

    public final void c(int i10) {
        this.f41587c = i10;
    }

    public final boolean a(File file) {
        kotlin.jvm.internal.m0.p(file, "file");
        return a(file.lastModified());
    }

    public final void a(int i10) {
        this.f41591g = i10;
    }

    public final boolean a(long j10) {
        return fh.a() - j10 > this.f41590f * ((long) 1000);
    }
}
