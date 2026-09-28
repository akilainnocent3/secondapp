package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;

/* JADX INFO: loaded from: classes.dex */
public final class m9i {
    public static final long d = d2l.f(1);
    public static final /* synthetic */ int e = 0;
    public final long a;
    public final long b;
    public final long c;

    public m9i(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        d2l.b(j, j2);
        if (Float.compare(omf0.c(j), omf0.c(j2)) >= 0) {
            r2z.a(this, "min should be less than max, ");
            throw null;
        }
        if (omf0.c(j3) > 0.0f) {
            return;
        }
        r2z.a(this, "step should be greater than 0, ");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9i)) {
            return false;
        }
        m9i m9iVar = (m9i) obj;
        return omf0.a(this.a, m9iVar.a) && omf0.a(this.b, m9iVar.b) && omf0.a(this.c, m9iVar.c);
    }

    public final int hashCode() {
        pmf0[] pmf0VarArr = omf0.b;
        return Long.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String strF = omf0.f(this.a);
        String strF2 = omf0.f(this.b);
        return uf80.a(ux5.a("FontSizeRange(min=", strF, ", max=", strF2, ", step="), omf0.f(this.c), CaxEybC.floA);
    }
}
