package yads;

import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xw2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xw2 f158029c = new xw2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f158030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158031b;

    public xw2(long j10, long j11) {
        this.f158030a = j10;
        this.f158031b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xw2.class == obj.getClass()) {
            xw2 xw2Var = (xw2) obj;
            if (this.f158030a == xw2Var.f158030a && this.f158031b == xw2Var.f158031b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f158030a) * 31) + ((int) this.f158031b);
    }

    public final String toString() {
        return "[timeUs=" + this.f158030a + ", position=" + this.f158031b + C4235d4.j.f61462e;
    }
}
