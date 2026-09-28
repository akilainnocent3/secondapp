package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;

/* JADX INFO: loaded from: classes8.dex */
public final class ui1 {
    public static final ui1 f = new ui1("00000000000000000000000000000000", "0000000000000000", wcn.c, dx0.a, false);
    public final String a;
    public final String b;
    public final wcn c;
    public final hg1 d;
    public final boolean e;

    public ui1(String str, String str2, wcn wcnVar, hg1 hg1Var, boolean z) {
        if (str == null) {
            bmy.a("Null traceId");
            throw null;
        }
        this.a = str;
        this.b = str2;
        if (wcnVar == null) {
            bmy.a("Null traceFlags");
            throw null;
        }
        this.c = wcnVar;
        if (hg1Var == null) {
            bmy.a("Null traceState");
            throw null;
        }
        this.d = hg1Var;
        this.e = z;
    }

    public final String a() {
        return this.b;
    }

    public final wcn b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final hg1 d() {
        return this.d;
    }

    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ui1)) {
            return false;
        }
        ui1 ui1Var = (ui1) obj;
        return this.a.equals(ui1Var.c()) && this.b.equals(ui1Var.a()) && this.c.equals(ui1Var.b()) && this.d.equals(ui1Var.d()) && !ui1Var.e() && this.e == ui1Var.f();
    }

    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableSpanContext{traceId=");
        sb.append(this.a);
        sb.append(oLsIjJCWb.HJHvGqV);
        sb.append(this.b);
        sb.append(", traceFlags=");
        sb.append(this.c);
        sb.append(", traceState=");
        sb.append(this.d);
        sb.append(", remote=false, valid=");
        return mq0.a(sb, this.e, "}");
    }
}
