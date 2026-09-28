package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nk1 implements rft {
    public final pg50 a;
    public final oso b;
    public final long c;
    public final long d;
    public final ui1 e;
    public final int f;
    public final m21 g;
    public final int h;
    public final ruh0<?> i;

    public nk1(pg50 pg50Var, oso osoVar, long j, long j2, ui1 ui1Var, int i, m21 m21Var, int i2, ruh0 ruh0Var) {
        if (pg50Var == null) {
            bmy.a("Null resource");
            throw null;
        }
        this.a = pg50Var;
        if (osoVar == null) {
            bmy.a("Null instrumentationScopeInfo");
            throw null;
        }
        this.b = osoVar;
        this.c = j;
        this.d = j2;
        if (ui1Var == null) {
            bmy.a("Null spanContext");
            throw null;
        }
        this.e = ui1Var;
        if (i == 0) {
            bmy.a("Null severity");
            throw null;
        }
        this.f = i;
        if (m21Var == null) {
            bmy.a("Null attributes");
            throw null;
        }
        this.g = m21Var;
        this.h = i2;
        this.i = ruh0Var;
    }

    @Override // defpackage.rft
    public final int a() {
        return this.h;
    }

    @Override // defpackage.rft
    public final ui1 b() {
        return this.e;
    }

    @Override // defpackage.rft
    public final oso c() {
        return this.b;
    }

    @Override // defpackage.rft
    public final pg50 d() {
        return this.a;
    }

    @Override // defpackage.rft
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nk1)) {
            return false;
        }
        nk1 nk1Var = (nk1) obj;
        if (!this.a.equals(nk1Var.a) || !this.b.equals(nk1Var.b) || this.c != nk1Var.c || this.d != nk1Var.d || !this.e.equals(nk1Var.e) || !pjh.a(this.f, nk1Var.f) || !this.g.equals(nk1Var.g) || this.h != nk1Var.h) {
            return false;
        }
        ruh0<?> ruh0Var = this.i;
        if (ruh0Var == null) {
            if (nk1Var.f() != null) {
                return false;
            }
        } else if (!ruh0Var.equals(nk1Var.f())) {
            return false;
        }
        return nk1Var.getEventName() == null;
    }

    @Override // defpackage.rft
    public final ruh0<?> f() {
        return this.i;
    }

    @Override // defpackage.rft
    public final long g() {
        return this.d;
    }

    @Override // defpackage.rft
    public final m21 getAttributes() {
        return this.g;
    }

    @Override // defpackage.rft
    public final ih4 getBody() {
        ruh0<?> ruh0VarF = f();
        return ruh0VarF == null ? s1g.a : new yk1(ruh0VarF.a());
    }

    @Override // defpackage.rft
    public final String getEventName() {
        return null;
    }

    @Override // defpackage.rft
    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.d;
        int iHashCode2 = (((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ pjh.b(this.f)) * (-721379959)) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003;
        ruh0<?> ruh0Var = this.i;
        return ((ruh0Var == null ? 0 : ruh0Var.hashCode()) ^ iHashCode2) * 1000003;
    }

    @Override // defpackage.rft
    public final String i() {
        return null;
    }

    public final String toString() {
        return "SdkLogRecordData{resource=" + this.a + ", instrumentationScopeInfo=" + this.b + ", timestampEpochNanos=" + this.c + ", observedTimestampEpochNanos=" + this.d + ", spanContext=" + this.e + ", severity=" + ym80.a(this.f) + ", severityText=null, attributes=" + this.g + ", totalAttributeCount=" + this.h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
