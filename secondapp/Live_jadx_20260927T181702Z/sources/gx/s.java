package gx;

import fx.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final t0 f87495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String f87497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f87498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f87499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f87500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f87501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f87502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f87503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f87504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oy.m
    public final Long f87505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oy.m
    public final Long f87506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.m
    public final Long f87507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oy.m
    public final Integer f87508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oy.m
    public final Integer f87509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @oy.m
    public final Integer f87510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @oy.l
    public final List<t0> f87511q;

    public s(@oy.l t0 canonicalPath, boolean z10, @oy.l String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, @oy.m Long l10, @oy.m Long l11, @oy.m Long l12, @oy.m Integer num, @oy.m Integer num2, @oy.m Integer num3) {
        m0.p(canonicalPath, "canonicalPath");
        m0.p(comment, "comment");
        this.f87495a = canonicalPath;
        this.f87496b = z10;
        this.f87497c = comment;
        this.f87498d = j10;
        this.f87499e = j11;
        this.f87500f = j12;
        this.f87501g = i10;
        this.f87502h = j13;
        this.f87503i = i11;
        this.f87504j = i12;
        this.f87505k = l10;
        this.f87506l = l11;
        this.f87507m = l12;
        this.f87508n = num;
        this.f87509o = num2;
        this.f87510p = num3;
        this.f87511q = new ArrayList();
    }

    @oy.l
    public final s a(@oy.m Integer num, @oy.m Integer num2, @oy.m Integer num3) {
        return new s(this.f87495a, this.f87496b, this.f87497c, this.f87498d, this.f87499e, this.f87500f, this.f87501g, this.f87502h, this.f87503i, this.f87504j, this.f87505k, this.f87506l, this.f87507m, num, num2, num3);
    }

    @oy.l
    public final t0 b() {
        return this.f87495a;
    }

    @oy.l
    public final List<t0> c() {
        return this.f87511q;
    }

    @oy.l
    public final String d() {
        return this.f87497c;
    }

    public final long e() {
        return this.f87499e;
    }

    public final int f() {
        return this.f87501g;
    }

    public final long g() {
        return this.f87498d;
    }

    @oy.m
    public final Long h() {
        Long l10 = this.f87507m;
        if (l10 != null) {
            return Long.valueOf(x.g(l10.longValue()));
        }
        Integer num = this.f87510p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final int i() {
        return this.f87503i;
    }

    public final int j() {
        return this.f87504j;
    }

    @oy.m
    public final Integer k() {
        return this.f87510p;
    }

    @oy.m
    public final Integer l() {
        return this.f87509o;
    }

    @oy.m
    public final Integer m() {
        return this.f87508n;
    }

    @oy.m
    public final Long n() {
        Long l10 = this.f87506l;
        if (l10 != null) {
            return Long.valueOf(x.g(l10.longValue()));
        }
        Integer num = this.f87509o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    @oy.m
    public final Long o() {
        Long l10 = this.f87505k;
        if (l10 != null) {
            return Long.valueOf(x.g(l10.longValue()));
        }
        Integer num = this.f87508n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f87504j;
        if (i10 != -1) {
            return x.f(this.f87503i, i10);
        }
        return null;
    }

    @oy.m
    public final Long p() {
        return this.f87507m;
    }

    @oy.m
    public final Long q() {
        return this.f87506l;
    }

    @oy.m
    public final Long r() {
        return this.f87505k;
    }

    public final long s() {
        return this.f87502h;
    }

    public final long t() {
        return this.f87500f;
    }

    public final boolean u() {
        return this.f87496b;
    }

    public /* synthetic */ s(t0 t0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, kotlin.jvm.internal.x xVar) {
        this(t0Var, (i13 & 2) != 0 ? false : z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) == 0 ? j13 : -1L, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) == 0 ? i12 : -1, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, (i13 & 8192) != 0 ? null : num, (i13 & 16384) != 0 ? null : num2, (i13 & 32768) != 0 ? null : num3);
    }
}
