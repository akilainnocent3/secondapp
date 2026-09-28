package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class rk1 implements rqa0 {
    public final at70 a;
    public final List<sfs> b;
    public final List<gng> c;
    public final m21 d;
    public final int e;
    public final int f;
    public final yzd0 g;
    public final String h;
    public final long i;
    public final boolean j;

    public rk1(at70 at70Var, List list, List list2, m21 m21Var, int i, int i2, yzd0 yzd0Var, String str, long j, boolean z) {
        this.a = at70Var;
        if (list == null) {
            bmy.a("Null resolvedLinks");
            throw null;
        }
        this.b = list;
        if (list2 == null) {
            bmy.a("Null resolvedEvents");
            throw null;
        }
        this.c = list2;
        if (m21Var == null) {
            bmy.a("Null attributes");
            throw null;
        }
        this.d = m21Var;
        this.e = i;
        this.f = i2;
        if (yzd0Var == null) {
            bmy.a("Null status");
            throw null;
        }
        this.g = yzd0Var;
        this.h = str;
        this.i = j;
        this.j = z;
    }

    @Override // defpackage.rqa0
    public final int a() {
        return w();
    }

    @Override // defpackage.rqa0
    public final ui1 b() {
        return p().b;
    }

    @Override // defpackage.rqa0
    public final oso c() {
        return p().i;
    }

    @Override // defpackage.rqa0
    public final pg50 d() {
        return p().h;
    }

    @Override // defpackage.rqa0
    public final List e() {
        return t();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rk1)) {
            return false;
        }
        rk1 rk1Var = (rk1) obj;
        return this.a.equals(rk1Var.p()) && this.b.equals(rk1Var.u()) && this.c.equals(rk1Var.t()) && this.d.equals(rk1Var.o()) && this.e == rk1Var.w() && this.f == rk1Var.x() && rk1Var.y() == 0 && this.g.equals(rk1Var.v()) && this.h.equals(rk1Var.s()) && this.i == rk1Var.q() && this.j == rk1Var.r();
    }

    @Override // defpackage.rqa0
    public final long f() {
        return p().j;
    }

    @Override // defpackage.rqa0
    @Deprecated
    public final dj1 g() {
        oso osoVar = p().i;
        String strC = osoVar.c();
        String strE = osoVar.e();
        String strD = osoVar.d();
        int i = dj1.d;
        Objects.requireNonNull(strC, "name");
        return new dj1(strC, strE, strD);
    }

    @Override // defpackage.rqa0
    public final m21 getAttributes() {
        return o();
    }

    @Override // defpackage.rqa0
    public final wqa0 getKind() {
        return p().f;
    }

    @Override // defpackage.rqa0
    public final String getName() {
        return s();
    }

    @Override // defpackage.rqa0
    public final yzd0 getStatus() {
        return v();
    }

    @Override // defpackage.rqa0
    public final int h() {
        return y();
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * (-721379959)) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        long j = this.i;
        return (this.j ? 1231 : 1237) ^ ((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003);
    }

    @Override // defpackage.rqa0
    public final long i() {
        return q();
    }

    @Override // defpackage.rqa0
    public final List j() {
        return u();
    }

    @Override // defpackage.rqa0
    public final int l() {
        return x();
    }

    @Override // defpackage.rqa0
    public final ui1 n() {
        return p().c;
    }

    public final m21 o() {
        return this.d;
    }

    public final at70 p() {
        return this.a;
    }

    public final long q() {
        return this.i;
    }

    public final boolean r() {
        return this.j;
    }

    public final String s() {
        return this.h;
    }

    public final List<gng> t() {
        return this.c;
    }

    public final String toString() {
        return "SpanData{spanContext=" + p().b + ", parentSpanContext=" + p().c + ", resource=" + p().h + ", instrumentationScopeInfo=" + p().i + ", name=" + s() + ", kind=" + p().f + ", startEpochNanos=" + p().j + ", endEpochNanos=" + q() + ", attributes=" + o() + ", totalAttributeCount=" + w() + ", events=" + t() + ", totalRecordedEvents=" + x() + ", links=" + u() + ", totalRecordedLinks=" + y() + ", status=" + v() + ", hasEnded=" + r() + "}";
    }

    public final List<sfs> u() {
        return this.b;
    }

    public final yzd0 v() {
        return this.g;
    }

    public final int w() {
        return this.e;
    }

    public final int x() {
        return this.f;
    }

    public final int y() {
        return 0;
    }
}
