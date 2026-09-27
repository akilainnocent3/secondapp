package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mc3 implements nc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be3 f152405b;

    public mc3(String str, be3 be3Var) {
        this.f152404a = str;
        this.f152405b = be3Var;
    }

    @Override // yads.nc2
    public final Map a(long j10) {
        Map mapJ0 = fr.n1.j0(dr.v1.a("duration", Long.valueOf(j10)), dr.v1.a("status", this.f152404a));
        be3 be3Var = this.f152405b;
        if (be3Var != null) {
            mapJ0.put("failure_reason", be3Var.f147156a);
        }
        return mapJ0;
    }
}
