package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class d extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f136121g = "CTOC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f136124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f136125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i[] f136126f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f136122b = str;
        this.f136123c = z10;
        this.f136124d = z11;
        this.f136125e = strArr;
        this.f136126f = iVarArr;
    }

    public i b(int i10) {
        return this.f136126f[i10];
    }

    public int c() {
        return this.f136126f.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f136123c == dVar.f136123c && this.f136124d == dVar.f136124d && Objects.equals(this.f136122b, dVar.f136122b) && Arrays.equals(this.f136125e, dVar.f136125e) && Arrays.equals(this.f136126f, dVar.f136126f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f136123c ? 1 : 0)) * 31) + (this.f136124d ? 1 : 0)) * 31;
        String str = this.f136122b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
