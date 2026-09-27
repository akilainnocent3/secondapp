package t6;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class c extends i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f136114h = "CHAP";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f136118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f136119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f136120g;

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f136115b = str;
        this.f136116c = i10;
        this.f136117d = i11;
        this.f136118e = j10;
        this.f136119f = j11;
        this.f136120g = iVarArr;
    }

    public i b(int i10) {
        return this.f136120g[i10];
    }

    public int c() {
        return this.f136120g.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f136116c == cVar.f136116c && this.f136117d == cVar.f136117d && this.f136118e == cVar.f136118e && this.f136119f == cVar.f136119f && Objects.equals(this.f136115b, cVar.f136115b) && Arrays.equals(this.f136120g, cVar.f136120g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f136116c) * 31) + this.f136117d) * 31) + ((int) this.f136118e)) * 31) + ((int) this.f136119f)) * 31;
        String str = this.f136115b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
