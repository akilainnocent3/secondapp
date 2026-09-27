package yl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@uk.a
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final k f159650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final t0 f159651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final b f159652c;

    public m0(@oy.l k eventType, @oy.l t0 sessionData, @oy.l b applicationInfo) {
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        kotlin.jvm.internal.m0.p(sessionData, "sessionData");
        kotlin.jvm.internal.m0.p(applicationInfo, "applicationInfo");
        this.f159650a = eventType;
        this.f159651b = sessionData;
        this.f159652c = applicationInfo;
    }

    public static /* synthetic */ m0 e(m0 m0Var, k kVar, t0 t0Var, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = m0Var.f159650a;
        }
        if ((i10 & 2) != 0) {
            t0Var = m0Var.f159651b;
        }
        if ((i10 & 4) != 0) {
            bVar = m0Var.f159652c;
        }
        return m0Var.d(kVar, t0Var, bVar);
    }

    @oy.l
    public final k a() {
        return this.f159650a;
    }

    @oy.l
    public final t0 b() {
        return this.f159651b;
    }

    @oy.l
    public final b c() {
        return this.f159652c;
    }

    @oy.l
    public final m0 d(@oy.l k eventType, @oy.l t0 sessionData, @oy.l b applicationInfo) {
        kotlin.jvm.internal.m0.p(eventType, "eventType");
        kotlin.jvm.internal.m0.p(sessionData, "sessionData");
        kotlin.jvm.internal.m0.p(applicationInfo, "applicationInfo");
        return new m0(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f159650a == m0Var.f159650a && kotlin.jvm.internal.m0.g(this.f159651b, m0Var.f159651b) && kotlin.jvm.internal.m0.g(this.f159652c, m0Var.f159652c);
    }

    @oy.l
    public final b f() {
        return this.f159652c;
    }

    @oy.l
    public final k g() {
        return this.f159650a;
    }

    @oy.l
    public final t0 h() {
        return this.f159651b;
    }

    public int hashCode() {
        return (((this.f159650a.hashCode() * 31) + this.f159651b.hashCode()) * 31) + this.f159652c.hashCode();
    }

    @oy.l
    public String toString() {
        return "SessionEvent(eventType=" + this.f159650a + ", sessionData=" + this.f159651b + ", applicationInfo=" + this.f159652c + ')';
    }
}
