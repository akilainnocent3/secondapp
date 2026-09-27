package dg;

import androidx.annotation.Nullable;
import zi.f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79103e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79104f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f79105g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f79108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79109d;

    public b(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f79108c == bVar.f79108c && this.f79109d == bVar.f79109d && f0.a(this.f79106a, bVar.f79106a) && f0.a(this.f79107b, bVar.f79107b);
    }

    public int hashCode() {
        return f0.b(this.f79106a, this.f79107b, Integer.valueOf(this.f79108c), Integer.valueOf(this.f79109d));
    }

    public b(String str, String str2, int i10, int i11) {
        this.f79106a = str;
        this.f79107b = str2;
        this.f79108c = i10;
        this.f79109d = i11;
    }
}
