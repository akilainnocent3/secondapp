package yads;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ee2 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ee2 f148664e = new ee2(1.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f148665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f148666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f148667d;

    static {
        new wq() { // from class: yads.a04
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return ee2.a(bundle);
            }
        };
    }

    public ee2(float f10, float f11) {
        ni.a(f10 > 0.0f);
        ni.a(f11 > 0.0f);
        this.f148665b = f10;
        this.f148666c = f11;
        this.f148667d = Math.round(f10 * 1000.0f);
    }

    public static ee2 a(Bundle bundle) {
        return new ee2(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ee2.class == obj.getClass()) {
            ee2 ee2Var = (ee2) obj;
            if (this.f148665b == ee2Var.f148665b && this.f148666c == ee2Var.f148666c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f148666c) + ((Float.floatToRawIntBits(this.f148665b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f148665b), Float.valueOf(this.f148666c)};
        int i10 = ib3.f150516a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
