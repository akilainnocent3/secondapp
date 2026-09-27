package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class l extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f136162g = "MLLT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f136166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f136167f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f136163b = i10;
        this.f136164c = i11;
        this.f136165d = i12;
        this.f136166e = iArr;
        this.f136167f = iArr2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f136163b == lVar.f136163b && this.f136164c == lVar.f136164c && this.f136165d == lVar.f136165d && Arrays.equals(this.f136166e, lVar.f136166e) && Arrays.equals(this.f136167f, lVar.f136167f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f136163b) * 31) + this.f136164c) * 31) + this.f136165d) * 31) + Arrays.hashCode(this.f136166e)) * 31) + Arrays.hashCode(this.f136167f);
    }
}
