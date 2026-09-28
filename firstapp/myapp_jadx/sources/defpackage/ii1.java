package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ii1 implements rft {
    public final pg50 a;
    public final oso b;
    public final long c;
    public final long d;
    public final ui1 e;
    public final int f;
    public final int g;
    public final b2h h;
    public final ruh0<?> i;

    public ii1(pg50 pg50Var, oso osoVar, long j, long j2, ui1 ui1Var, int i, int i2, zw0 zw0Var, ruh0 ruh0Var) {
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
        this.g = i2;
        if (zw0Var == null) {
            bmy.a("Null extendedAttributes");
            throw null;
        }
        this.h = zw0Var;
        this.i = ruh0Var;
    }

    @Override // defpackage.rft
    public final int a() {
        return this.g;
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
        if (!(obj instanceof ii1)) {
            return false;
        }
        ii1 ii1Var = (ii1) obj;
        if (!this.a.equals(ii1Var.a) || !this.b.equals(ii1Var.b) || this.c != ii1Var.c || this.d != ii1Var.d || !this.e.equals(ii1Var.e) || !pjh.a(this.f, ii1Var.f) || this.g != ii1Var.g || !this.h.equals(ii1Var.h)) {
            return false;
        }
        ruh0<?> ruh0Var = this.i;
        if (ruh0Var == null) {
            if (ii1Var.f() != null) {
                return false;
            }
        } else if (!ruh0Var.equals(ii1Var.f())) {
            return false;
        }
        return ii1Var.getEventName() == null;
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
    @Deprecated
    public m21 getAttributes() {
        return j().d();
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
        int iHashCode2 = (((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ pjh.b(this.f)) * (-721379959)) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003;
        ruh0<?> ruh0Var = this.i;
        return ((ruh0Var == null ? 0 : ruh0Var.hashCode()) ^ iHashCode2) * 1000003;
    }

    @Override // defpackage.rft
    public final String i() {
        return null;
    }

    public final b2h j() {
        return this.h;
    }

    public final String toString() {
        return "ExtendedSdkLogRecordData{resource=" + this.a + ", instrumentationScopeInfo=" + this.b + ", timestampEpochNanos=" + this.c + ", observedTimestampEpochNanos=" + this.d + ", spanContext=" + this.e + ", severity=" + ym80.a(this.f) + ", severityText=null, totalAttributeCount=" + this.g + ", extendedAttributes=" + this.h + ", bodyValue=" + this.i + ", eventName=null}";
    }
}
