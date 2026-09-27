package u4;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1 f138947d = new s1(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f138948e = x4.b2.k1(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f138949f = x4.b2.k1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f138950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f138951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138952c;

    public s1(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        this(f10, 1.0f);
    }

    @x4.m1
    public static s1 a(Bundle bundle) {
        return new s1(bundle.getFloat(f138948e, 1.0f), bundle.getFloat(f138949f, 1.0f));
    }

    @x4.m1
    public long b(long j10) {
        return j10 * ((long) this.f138952c);
    }

    @x4.m1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f138948e, this.f138950a);
        bundle.putFloat(f138949f, this.f138951b);
        return bundle;
    }

    @CheckResult
    @x4.m1
    public s1 d(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        return new s1(this.f138950a, f10);
    }

    @CheckResult
    public s1 e(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        return new s1(f10, this.f138951b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            s1 s1Var = (s1) obj;
            if (this.f138950a == s1Var.f138950a && this.f138951b == s1Var.f138951b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f138950a)) * 31) + Float.floatToRawIntBits(this.f138951b);
    }

    public String toString() {
        return x4.b2.V("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f138950a), Float.valueOf(this.f138951b));
    }

    public s1(@k.w(from = 0.0d, fromInclusive = false) float f10, @k.w(from = 0.0d, fromInclusive = false) float f11) {
        zi.l0.d(f10 > 0.0f);
        zi.l0.d(f11 > 0.0f);
        this.f138950a = f10;
        this.f138951b = f11;
        this.f138952c = Math.round(f10 * 1000.0f);
    }
}
