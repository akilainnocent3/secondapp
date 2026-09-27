package f6;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f83662c = new x0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83664b;

    public x0(long j10, long j11) {
        this.f83663a = j10;
        this.f83664b = j11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f83663a == x0Var.f83663a && this.f83664b == x0Var.f83664b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f83663a) * 31) + ((int) this.f83664b);
    }

    public String toString() {
        return "[timeUs=" + this.f83663a + ", position=" + this.f83664b + C4235d4.j.f61462e;
    }
}
