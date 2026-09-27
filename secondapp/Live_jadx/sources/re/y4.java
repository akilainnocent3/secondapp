package re;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y4 f127193b = new y4(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127194a;

    public y4(boolean z10) {
        this.f127194a = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && y4.class == obj.getClass() && this.f127194a == ((y4) obj).f127194a;
    }

    public int hashCode() {
        return !this.f127194a ? 1 : 0;
    }
}
