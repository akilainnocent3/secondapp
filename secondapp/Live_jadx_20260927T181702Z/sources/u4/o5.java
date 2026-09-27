package u4;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class o5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f138735e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f138736f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f138737g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o5 f138738h = new o5(0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f138739i = x4.b2.k1(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f138740j = x4.b2.k1(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f138741k = x4.b2.k1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @k.e0(from = 0)
    public final int f138742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @k.e0(from = 0)
    public final int f138743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @k.e0(from = 0, to = 359)
    public final int f138744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @k.w(from = 0.0d, fromInclusive = false)
    public final float f138745d;

    @x4.m1
    public o5(@k.e0(from = 0) int i10, @k.e0(from = 0) int i11) {
        this(i10, i11, 1.0f);
    }

    @x4.m1
    public static o5 a(Bundle bundle) {
        return new o5(bundle.getInt(f138739i, 0), bundle.getInt(f138740j, 0), bundle.getFloat(f138741k, 1.0f));
    }

    @x4.m1
    public Bundle b() {
        Bundle bundle = new Bundle();
        int i10 = this.f138742a;
        if (i10 != 0) {
            bundle.putInt(f138739i, i10);
        }
        int i11 = this.f138743b;
        if (i11 != 0) {
            bundle.putInt(f138740j, i11);
        }
        float f10 = this.f138745d;
        if (f10 != 1.0f) {
            bundle.putFloat(f138741k, f10);
        }
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o5) {
            o5 o5Var = (o5) obj;
            if (this.f138742a == o5Var.f138742a && this.f138743b == o5Var.f138743b && this.f138745d == o5Var.f138745d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.f138742a) * 31) + this.f138743b) * 31) + Float.floatToRawIntBits(this.f138745d);
    }

    @x4.m1
    public o5(@k.e0(from = 0) int i10, @k.e0(from = 0) int i11, @k.w(from = 0.0d, fromInclusive = false) float f10) {
        this.f138742a = i10;
        this.f138743b = i11;
        this.f138744c = 0;
        this.f138745d = f10;
    }

    @x4.m1
    @Deprecated
    public o5(@k.e0(from = 0) int i10, @k.e0(from = 0) int i11, @k.e0(from = 0, to = 359) int i12, @k.w(from = 0.0d, fromInclusive = false) float f10) {
        this(i10, i11, f10);
    }
}
