package ni;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f116784a;

    public n(@k.w(from = 0.0d, to = 1.0d) float f10) {
        this.f116784a = f10;
    }

    @NonNull
    @y0({y0.a.LIBRARY_GROUP})
    public static n b(@NonNull RectF rectF, @NonNull e eVar) {
        return eVar instanceof n ? (n) eVar : new n(eVar.a(rectF) / c(rectF));
    }

    private static float c(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // ni.e
    public float a(@NonNull RectF rectF) {
        return this.f116784a * c(rectF);
    }

    @k.w(from = 0.0d, to = 1.0d)
    public float d() {
        return this.f116784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f116784a == ((n) obj).f116784a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f116784a)});
    }
}
