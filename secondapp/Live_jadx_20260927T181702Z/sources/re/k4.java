package re;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k4 implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k4 f125919e = new k4(1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f125920f = eh.o1.R0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f125921g = eh.o1.R0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j.a<k4> f125922h = new j.a() { // from class: re.j4
        @Override // re.j.a
        public final j fromBundle(Bundle bundle) {
            return k4.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f125923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f125924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f125925d;

    public k4(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        this(f10, 1.0f);
    }

    public static /* synthetic */ k4 a(Bundle bundle) {
        return new k4(bundle.getFloat(f125920f, 1.0f), bundle.getFloat(f125921g, 1.0f));
    }

    public long b(long j10) {
        return j10 * ((long) this.f125925d);
    }

    @CheckResult
    public k4 c(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        return new k4(f10, this.f125924c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k4.class == obj.getClass()) {
            k4 k4Var = (k4) obj;
            if (this.f125923b == k4Var.f125923b && this.f125924c == k4Var.f125924c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f125923b)) * 31) + Float.floatToRawIntBits(this.f125924c);
    }

    @Override // re.j
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f125920f, this.f125923b);
        bundle.putFloat(f125921g, this.f125924c);
        return bundle;
    }

    public String toString() {
        return eh.o1.M("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f125923b), Float.valueOf(this.f125924c));
    }

    public k4(@k.w(from = 0.0d, fromInclusive = false) float f10, @k.w(from = 0.0d, fromInclusive = false) float f11) {
        eh.a.a(f10 > 0.0f);
        eh.a.a(f11 > 0.0f);
        this.f125923b = f10;
        this.f125924c = f11;
        this.f125925d = Math.round(f10 * 1000.0f);
    }
}
