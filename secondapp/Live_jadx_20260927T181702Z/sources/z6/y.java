package z6;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f160812m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f160813n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f160814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f160816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f160817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f160818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f160819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.media3.common.a f160820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f160821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final long[] f160822i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final long[] f160823j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f160824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final z[] f160825l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public y(int i10, int i11, long j10, long j11, long j12, long j13, androidx.media3.common.a aVar, int i12, @Nullable z[] zVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f160814a = i10;
        this.f160815b = i11;
        this.f160816c = j10;
        this.f160817d = j11;
        this.f160818e = j12;
        this.f160819f = j13;
        this.f160820g = aVar;
        this.f160821h = i12;
        this.f160825l = zVarArr;
        this.f160824k = i13;
        this.f160822i = jArr;
        this.f160823j = jArr2;
    }

    public y a(androidx.media3.common.a aVar) {
        return new y(this.f160814a, this.f160815b, this.f160816c, this.f160817d, this.f160818e, this.f160819f, aVar, this.f160821h, this.f160825l, this.f160824k, this.f160822i, this.f160823j);
    }

    public y b() {
        return new y(this.f160814a, this.f160815b, this.f160816c, this.f160817d, this.f160818e, this.f160819f, this.f160820g, this.f160821h, this.f160825l, this.f160824k, null, null);
    }

    @Nullable
    public z c(int i10) {
        z[] zVarArr = this.f160825l;
        if (zVarArr == null) {
            return null;
        }
        return zVarArr[i10];
    }
}
