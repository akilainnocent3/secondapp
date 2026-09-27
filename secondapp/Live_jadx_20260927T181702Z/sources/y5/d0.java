package y5;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f146201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0[] f146202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f146203c;

    public d0(c0... c0VarArr) {
        this.f146202b = c0VarArr;
        this.f146201a = c0VarArr.length;
    }

    @Nullable
    public c0 a(int i10) {
        return this.f146202b[i10];
    }

    public c0[] b() {
        return (c0[]) this.f146202b.clone();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f146202b, ((d0) obj).f146202b);
    }

    public int hashCode() {
        if (this.f146203c == 0) {
            this.f146203c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f146202b);
        }
        return this.f146203c;
    }
}
