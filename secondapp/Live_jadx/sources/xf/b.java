package xf;

import com.google.android.exoplayer2.offline.DownloadRequest;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f144881i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f144882j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f144883k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f144884l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f144885m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f144886n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f144887o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f144888p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f144889q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f144890r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadRequest f144891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f144893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f144894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f144895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f144896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f144897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f144898h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: renamed from: xf.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1526b {
    }

    public b(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new t());
    }

    public long a() {
        return this.f144898h.f144999a;
    }

    public float b() {
        return this.f144898h.f145000b;
    }

    public boolean c() {
        int i10 = this.f144892b;
        return i10 == 3 || i10 == 4;
    }

    public b(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, t tVar) {
        eh.a.g(tVar);
        boolean z10 = false;
        eh.a.a((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            if (i10 != 2 && i10 != 0) {
                z10 = true;
            }
            eh.a.a(z10);
        }
        this.f144891a = downloadRequest;
        this.f144892b = i10;
        this.f144893c = j10;
        this.f144894d = j11;
        this.f144895e = j12;
        this.f144896f = i11;
        this.f144897g = i12;
        this.f144898h = tVar;
    }
}
