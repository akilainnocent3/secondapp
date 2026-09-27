package te;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f136518c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f136520b;

    public b0(int i10, float f10) {
        this.f136519a = i10;
        this.f136520b = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f136519a == b0Var.f136519a && Float.compare(b0Var.f136520b, this.f136520b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f136519a) * 31) + Float.floatToIntBits(this.f136520b);
    }
}
