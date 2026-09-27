package u4;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f138719c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f138720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f138721b;

    public n(int i10, float f10) {
        this.f138720a = i10;
        this.f138721b = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f138720a == nVar.f138720a && Float.compare(nVar.f138721b, this.f138721b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f138720a) * 31) + Float.floatToIntBits(this.f138721b);
    }
}
