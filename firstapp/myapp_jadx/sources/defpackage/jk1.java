package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;

/* JADX INFO: loaded from: classes4.dex */
public final class jk1 extends vu50 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    @Override // defpackage.vu50
    public final String a() {
        return this.c;
    }

    @Override // defpackage.vu50
    public final String b() {
        return this.d;
    }

    @Override // defpackage.vu50
    public final String c() {
        return this.b;
    }

    @Override // defpackage.vu50
    public final long d() {
        return this.f;
    }

    @Override // defpackage.vu50
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vu50)) {
            return false;
        }
        vu50 vu50Var = (vu50) obj;
        return this.b.equals(vu50Var.c()) && this.c.equals(vu50Var.a()) && this.d.equals(vu50Var.b()) && this.e.equals(vu50Var.e()) && this.f == vu50Var.d();
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return nrz.a(this.f, "}", sb);
    }

    public jk1(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = str3;
                if (str4 != null) {
                    this.e = str4;
                    this.f = j;
                    return;
                } else {
                    bmy.a("Null variantId");
                    throw null;
                }
            }
            bmy.a(LGxrN.uTwZruokcl);
            throw null;
        }
        bmy.a("Null rolloutId");
        throw null;
    }
}
