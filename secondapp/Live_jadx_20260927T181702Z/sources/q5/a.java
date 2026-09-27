package q5;

import androidx.media3.exoplayer.offline.DownloadRequest;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f121565i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f121566j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f121567k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f121568l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f121569m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f121570n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f121571o = 7;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f121572p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f121573q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f121574r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DownloadRequest f121575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f121577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f121578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f121579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f121580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f121581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f121582h;

    /* JADX INFO: renamed from: q5.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1174a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public a(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new t());
    }

    public long a() {
        return this.f121582h.f121699a;
    }

    public float b() {
        return this.f121582h.f121700b;
    }

    public boolean c() {
        int i10 = this.f121576b;
        return i10 == 3 || i10 == 4;
    }

    public a(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, t tVar) {
        l0.E(tVar);
        boolean z10 = false;
        l0.d((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            if (i10 != 2 && i10 != 0) {
                z10 = true;
            }
            l0.d(z10);
        }
        this.f121575a = downloadRequest;
        this.f121576b = i10;
        this.f121577c = j10;
        this.f121578d = j11;
        this.f121579e = j12;
        this.f121580f = i11;
        this.f121581g = i12;
        this.f121582h = tVar;
    }
}
