package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class er0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f148819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f148820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f148821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr0 f148822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f148823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f148824f;

    public er0(e00 e00Var, long j10, h1 h1Var, dr0 dr0Var, Map map, c cVar) {
        this.f148819a = e00Var;
        this.f148820b = j10;
        this.f148821c = h1Var;
        this.f148822d = dr0Var;
        this.f148823e = map;
        this.f148824f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return this.f148819a == er0Var.f148819a && this.f148820b == er0Var.f148820b && this.f148821c == er0Var.f148821c && kotlin.jvm.internal.m0.g(this.f148822d, er0Var.f148822d) && kotlin.jvm.internal.m0.g(this.f148823e, er0Var.f148823e) && kotlin.jvm.internal.m0.g(this.f148824f, er0Var.f148824f);
    }

    public final int hashCode() {
        int iHashCode = (this.f148821c.hashCode() + ((f0.p.a(this.f148820b) + (this.f148819a.hashCode() * 31)) * 31)) * 31;
        dr0 dr0Var = this.f148822d;
        int iHashCode2 = (this.f148823e.hashCode() + ((iHashCode + (dr0Var == null ? 0 : dr0Var.hashCode())) * 31)) * 31;
        c cVar = this.f148824f;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "FalseClickData(adType=" + this.f148819a + ", startTime=" + this.f148820b + ", activityInteractionType=" + this.f148821c + ", falseClick=" + this.f148822d + ", reportData=" + this.f148823e + ", abExperiments=" + this.f148824f + gi.j.f86771d;
    }
}
