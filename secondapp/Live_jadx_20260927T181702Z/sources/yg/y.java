package yg;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f159516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x[] f159517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f159518c;

    public y(x... xVarArr) {
        this.f159517b = xVarArr;
        this.f159516a = xVarArr.length;
    }

    @Nullable
    public x a(int i10) {
        return this.f159517b[i10];
    }

    public x[] b() {
        return (x[]) this.f159517b.clone();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f159517b, ((y) obj).f159517b);
    }

    public int hashCode() {
        if (this.f159518c == 0) {
            this.f159518c = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f159517b);
        }
        return this.f159518c;
    }
}
