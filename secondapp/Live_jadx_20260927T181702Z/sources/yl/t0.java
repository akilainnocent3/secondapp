package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f159692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f159693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f159694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f159695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final f f159696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public final String f159697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public final String f159698g;

    public t0(@oy.l String sessionId, @oy.l String firstSessionId, int i10, long j10, @oy.l f dataCollectionStatus, @oy.l String firebaseInstallationId, @oy.l String firebaseAuthenticationToken) {
        kotlin.jvm.internal.m0.p(sessionId, "sessionId");
        kotlin.jvm.internal.m0.p(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.m0.p(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.m0.p(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.m0.p(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f159692a = sessionId;
        this.f159693b = firstSessionId;
        this.f159694c = i10;
        this.f159695d = j10;
        this.f159696e = dataCollectionStatus;
        this.f159697f = firebaseInstallationId;
        this.f159698g = firebaseAuthenticationToken;
    }

    public static /* synthetic */ t0 i(t0 t0Var, String str, String str2, int i10, long j10, f fVar, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = t0Var.f159692a;
        }
        if ((i11 & 2) != 0) {
            str2 = t0Var.f159693b;
        }
        if ((i11 & 4) != 0) {
            i10 = t0Var.f159694c;
        }
        if ((i11 & 8) != 0) {
            j10 = t0Var.f159695d;
        }
        if ((i11 & 16) != 0) {
            fVar = t0Var.f159696e;
        }
        if ((i11 & 32) != 0) {
            str3 = t0Var.f159697f;
        }
        if ((i11 & 64) != 0) {
            str4 = t0Var.f159698g;
        }
        String str5 = str4;
        f fVar2 = fVar;
        long j11 = j10;
        int i12 = i10;
        return t0Var.h(str, str2, i12, j11, fVar2, str3, str5);
    }

    @oy.l
    public final String a() {
        return this.f159692a;
    }

    @oy.l
    public final String b() {
        return this.f159693b;
    }

    public final int c() {
        return this.f159694c;
    }

    public final long d() {
        return this.f159695d;
    }

    @oy.l
    public final f e() {
        return this.f159696e;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m0.g(this.f159692a, t0Var.f159692a) && kotlin.jvm.internal.m0.g(this.f159693b, t0Var.f159693b) && this.f159694c == t0Var.f159694c && this.f159695d == t0Var.f159695d && kotlin.jvm.internal.m0.g(this.f159696e, t0Var.f159696e) && kotlin.jvm.internal.m0.g(this.f159697f, t0Var.f159697f) && kotlin.jvm.internal.m0.g(this.f159698g, t0Var.f159698g);
    }

    @oy.l
    public final String f() {
        return this.f159697f;
    }

    @oy.l
    public final String g() {
        return this.f159698g;
    }

    @oy.l
    public final t0 h(@oy.l String sessionId, @oy.l String firstSessionId, int i10, long j10, @oy.l f dataCollectionStatus, @oy.l String firebaseInstallationId, @oy.l String firebaseAuthenticationToken) {
        kotlin.jvm.internal.m0.p(sessionId, "sessionId");
        kotlin.jvm.internal.m0.p(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.m0.p(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.m0.p(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.m0.p(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new t0(sessionId, firstSessionId, i10, j10, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public int hashCode() {
        return (((((((((((this.f159692a.hashCode() * 31) + this.f159693b.hashCode()) * 31) + this.f159694c) * 31) + f0.p.a(this.f159695d)) * 31) + this.f159696e.hashCode()) * 31) + this.f159697f.hashCode()) * 31) + this.f159698g.hashCode();
    }

    @oy.l
    public final f j() {
        return this.f159696e;
    }

    public final long k() {
        return this.f159695d;
    }

    @oy.l
    public final String l() {
        return this.f159698g;
    }

    @oy.l
    public final String m() {
        return this.f159697f;
    }

    @oy.l
    public final String n() {
        return this.f159693b;
    }

    @oy.l
    public final String o() {
        return this.f159692a;
    }

    public final int p() {
        return this.f159694c;
    }

    @oy.l
    public String toString() {
        return "SessionInfo(sessionId=" + this.f159692a + ", firstSessionId=" + this.f159693b + ", sessionIndex=" + this.f159694c + ", eventTimestampUs=" + this.f159695d + ", dataCollectionStatus=" + this.f159696e + ", firebaseInstallationId=" + this.f159697f + ", firebaseAuthenticationToken=" + this.f159698g + ')';
    }
}
