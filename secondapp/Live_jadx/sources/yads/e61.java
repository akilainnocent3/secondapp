package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co2 f148523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co2 f148524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co2 f148525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final co2 f148526d;

    public e61(co2 co2Var, co2 co2Var2, co2 co2Var3, co2 co2Var4) {
        this.f148523a = co2Var;
        this.f148524b = co2Var2;
        this.f148525c = co2Var3;
        this.f148526d = co2Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e61)) {
            return false;
        }
        e61 e61Var = (e61) obj;
        return this.f148523a == e61Var.f148523a && this.f148524b == e61Var.f148524b && this.f148525c == e61Var.f148525c && this.f148526d == e61Var.f148526d;
    }

    public final int hashCode() {
        return this.f148526d.hashCode() + ((this.f148525c.hashCode() + ((this.f148524b.hashCode() + (this.f148523a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f148523a + ", impressionTrackingStartReportType=" + this.f148524b + ", impressionTrackingFailureReportType=" + this.f148525c + ", forcedImpressionTrackingFailureReportType=" + this.f148526d + gi.j.f86771d;
    }
}
