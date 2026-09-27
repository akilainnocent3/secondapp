package h5;

import android.net.Uri;
import androidx.annotation.Nullable;
import cj.v6;
import java.util.Collections;
import java.util.List;
import k.h1;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public abstract class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f87722j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f87723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.a f87724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v6<h5.b> f87725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f87726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f87727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<e> f87728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e> f87729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final i f87730i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends j {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Uri f87732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f87733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public final String f87734m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final i f87735n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public final m f87736o;

        public c(long j10, androidx.media3.common.a aVar, List<h5.b> list, k.e eVar, @Nullable List<e> list2, List<e> list3, List<e> list4, @Nullable String str, long j11) {
            super(j10, aVar, list, eVar, list2, list3, list4);
            this.f87732k = Uri.parse(list.get(0).f87667a);
            i iVarC = eVar.c();
            this.f87735n = iVarC;
            this.f87734m = str;
            this.f87733l = j11;
            this.f87736o = iVarC != null ? null : new m(new i(null, 0L, j11));
        }

        public static c p(long j10, androidx.media3.common.a aVar, String str, long j11, long j12, long j13, long j14, List<e> list, @Nullable String str2, long j15) {
            return new c(j10, aVar, v6.A(new h5.b(str)), new k.e(new i(null, j11, (j12 - j11) + 1), 1L, 0L, j13, (j14 - j13) + 1), list, v6.z(), v6.z(), str2, j15);
        }

        @Override // h5.j
        @Nullable
        public String j() {
            return this.f87734m;
        }

        @Override // h5.j
        @Nullable
        public g5.h k() {
            return this.f87736o;
        }

        @Override // h5.j
        @Nullable
        public i l() {
            return this.f87735n;
        }
    }

    public static j n(long j10, androidx.media3.common.a aVar, List<h5.b> list, k kVar) {
        return o(j10, aVar, list, kVar, null, v6.z(), v6.z(), null);
    }

    public static j o(long j10, androidx.media3.common.a aVar, List<h5.b> list, k kVar, @Nullable List<e> list2, List<e> list3, List<e> list4, @Nullable String str) {
        if (kVar instanceof k.e) {
            return new c(j10, aVar, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j10, aVar, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    @Nullable
    public abstract String j();

    @Nullable
    public abstract g5.h k();

    @Nullable
    public abstract i l();

    @Nullable
    public i m() {
        return this.f87730i;
    }

    public j(long j10, androidx.media3.common.a aVar, List<h5.b> list, k kVar, @Nullable List<e> list2, List<e> list3, List<e> list4) {
        l0.d(!list.isEmpty());
        this.f87723b = j10;
        this.f87724c = aVar;
        this.f87725d = v6.u(list);
        this.f87727f = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f87728g = list3;
        this.f87729h = list4;
        this.f87730i = kVar.a(this);
        this.f87726e = kVar.b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends j implements g5.h {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @h1
        public final k.a f87731k;

        public b(long j10, androidx.media3.common.a aVar, List<h5.b> list, k.a aVar2, @Nullable List<e> list2, List<e> list3, List<e> list4) {
            super(j10, aVar, list, aVar2, list2, list3, list4);
            this.f87731k = aVar2;
        }

        @Override // g5.h
        public long a(long j10, long j11) {
            return this.f87731k.h(j10, j11);
        }

        @Override // g5.h
        public long b(long j10, long j11) {
            return this.f87731k.d(j10, j11);
        }

        @Override // g5.h
        public long c(long j10, long j11) {
            return this.f87731k.f(j10, j11);
        }

        @Override // g5.h
        public long d(long j10, long j11) {
            return this.f87731k.i(j10, j11);
        }

        @Override // g5.h
        public long e(long j10) {
            return this.f87731k.g(j10);
        }

        @Override // g5.h
        public long f() {
            return this.f87731k.e();
        }

        @Override // g5.h
        public i g(long j10) {
            return this.f87731k.k(this, j10);
        }

        @Override // g5.h
        public long getTimeUs(long j10) {
            return this.f87731k.j(j10);
        }

        @Override // g5.h
        public boolean h() {
            return this.f87731k.l();
        }

        @Override // g5.h
        public long i(long j10, long j11) {
            return this.f87731k.c(j10, j11);
        }

        @Override // h5.j
        @Nullable
        public String j() {
            return null;
        }

        @Override // h5.j
        @Nullable
        public i l() {
            return null;
        }

        @Override // h5.j
        public g5.h k() {
            return this;
        }
    }
}
