package jf;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import re.n2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100049l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100050m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f100053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f100054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f100055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n2 f100056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f100057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final long[] f100058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final long[] f100059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f100060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final p[] f100061k;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public o(int i10, int i11, long j10, long j11, long j12, n2 n2Var, int i12, @Nullable p[] pVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f100051a = i10;
        this.f100052b = i11;
        this.f100053c = j10;
        this.f100054d = j11;
        this.f100055e = j12;
        this.f100056f = n2Var;
        this.f100057g = i12;
        this.f100061k = pVarArr;
        this.f100060j = i13;
        this.f100058h = jArr;
        this.f100059i = jArr2;
    }

    public o a(n2 n2Var) {
        return new o(this.f100051a, this.f100052b, this.f100053c, this.f100054d, this.f100055e, n2Var, this.f100057g, this.f100061k, this.f100060j, this.f100058h, this.f100059i);
    }

    @Nullable
    public p b(int i10) {
        p[] pVarArr = this.f100061k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
