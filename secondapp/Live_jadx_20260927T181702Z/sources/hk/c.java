package hk;

import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f88411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Map<String, String> f88413c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @cs.k
    public c(@oy.l String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        m0.p(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c e(c cVar, String str, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cVar.f88411a;
        }
        if ((i10 & 2) != 0) {
            j10 = cVar.f88412b;
        }
        if ((i10 & 4) != 0) {
            map = cVar.f88413c;
        }
        return cVar.d(str, j10, map);
    }

    @oy.l
    public final String a() {
        return this.f88411a;
    }

    public final long b() {
        return this.f88412b;
    }

    @oy.l
    public final Map<String, String> c() {
        return this.f88413c;
    }

    @oy.l
    public final c d(@oy.l String sessionId, long j10, @oy.l Map<String, String> additionalCustomKeys) {
        m0.p(sessionId, "sessionId");
        m0.p(additionalCustomKeys, "additionalCustomKeys");
        return new c(sessionId, j10, additionalCustomKeys);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m0.g(this.f88411a, cVar.f88411a) && this.f88412b == cVar.f88412b && m0.g(this.f88413c, cVar.f88413c);
    }

    @oy.l
    public final Map<String, String> f() {
        return this.f88413c;
    }

    @oy.l
    public final String g() {
        return this.f88411a;
    }

    public final long h() {
        return this.f88412b;
    }

    public int hashCode() {
        return (((this.f88411a.hashCode() * 31) + f0.p.a(this.f88412b)) * 31) + this.f88413c.hashCode();
    }

    @oy.l
    public String toString() {
        return "EventMetadata(sessionId=" + this.f88411a + ", timestamp=" + this.f88412b + ", additionalCustomKeys=" + this.f88413c + ')';
    }

    @cs.k
    public c(@oy.l String sessionId, long j10, @oy.l Map<String, String> additionalCustomKeys) {
        m0.p(sessionId, "sessionId");
        m0.p(additionalCustomKeys, "additionalCustomKeys");
        this.f88411a = sessionId;
        this.f88412b = j10;
        this.f88413c = additionalCustomKeys;
    }

    public /* synthetic */ c(String str, long j10, Map map, int i10, x xVar) {
        this(str, j10, (i10 & 4) != 0 ? n1.z() : map);
    }
}
