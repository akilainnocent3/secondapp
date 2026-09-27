package af;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f4907c = new e0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4909b;

    public e0(long j10, long j11) {
        this.f4908a = j10;
        this.f4909b = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e0.class == obj.getClass()) {
            e0 e0Var = (e0) obj;
            if (this.f4908a == e0Var.f4908a && this.f4909b == e0Var.f4909b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f4908a) * 31) + ((int) this.f4909b);
    }

    public String toString() {
        return "[timeUs=" + this.f4908a + ", position=" + this.f4909b + C4235d4.j.f61462e;
    }
}
