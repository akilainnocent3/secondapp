package g8;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f86132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86133b;

    public b(@oy.l String adId, boolean z10) {
        m0.p(adId, "adId");
        this.f86132a = adId;
        this.f86133b = z10;
    }

    @oy.l
    public final String a() {
        return this.f86132a;
    }

    public final boolean b() {
        return this.f86133b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m0.g(this.f86132a, bVar.f86132a) && this.f86133b == bVar.f86133b;
    }

    public int hashCode() {
        return (this.f86132a.hashCode() * 31) + a.a(this.f86133b);
    }

    @oy.l
    public String toString() {
        return "AdId: adId=" + this.f86132a + ", isLimitAdTrackingEnabled=" + this.f86133b;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}
