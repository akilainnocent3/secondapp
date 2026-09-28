package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qrz implements nk0.a {
    public final int a;
    public final int b;
    public final long c;
    public final pjf0 d;
    public final sj10 e;
    public final afs f;
    public final int g;
    public final int h;
    public final qlf0 i;

    public qrz(int i, int i2, long j, pjf0 pjf0Var, sj10 sj10Var, afs afsVar, int i3, int i4, qlf0 qlf0Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = pjf0Var;
        this.e = sj10Var;
        this.f = afsVar;
        this.g = i3;
        this.h = i4;
        this.i = qlf0Var;
        pmf0[] pmf0VarArr = omf0.b;
        if (omf0.a(j, omf0.c)) {
            return;
        }
        if (omf0.c(j) >= 0.0f) {
            return;
        }
        xkn.c("lineHeight can't be negative (" + omf0.c(j) + ')');
    }

    public final qrz a(qrz qrzVar) {
        return qrzVar == null ? this : rrz.a(this, qrzVar.a, qrzVar.b, qrzVar.c, qrzVar.d, qrzVar.e, qrzVar.f, qrzVar.g, qrzVar.h, qrzVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrz)) {
            return false;
        }
        qrz qrzVar = (qrz) obj;
        return this.a == qrzVar.a && this.b == qrzVar.b && omf0.a(this.c, qrzVar.c) && Intrinsics.g(this.d, qrzVar.d) && Intrinsics.g(this.e, qrzVar.e) && Intrinsics.g(this.f, qrzVar.f) && this.g == qrzVar.g && this.h == qrzVar.h && Intrinsics.g(this.i, qrzVar.i);
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
        pmf0[] pmf0VarArr = omf0.b;
        int iA2 = f87.a(iA, this.c, 31);
        pjf0 pjf0Var = this.d;
        int iHashCode = (iA2 + (pjf0Var != null ? pjf0Var.hashCode() : 0)) * 31;
        sj10 sj10Var = this.e;
        int iHashCode2 = (iHashCode + (sj10Var != null ? sj10Var.hashCode() : 0)) * 31;
        afs afsVar = this.f;
        int iA3 = gpp.a(this.h, gpp.a(this.g, (iHashCode2 + (afsVar != null ? afsVar.hashCode() : 0)) * 31, 31), 31);
        qlf0 qlf0Var = this.i;
        return iA3 + (qlf0Var != null ? qlf0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) gdf0.b(this.a)) + ", textDirection=" + ((Object) dff0.a(this.b)) + ", lineHeight=" + ((Object) omf0.f(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) yes.a(this.g)) + ", hyphens=" + ((Object) tqm.a(this.h)) + ", textMotion=" + this.i + ')';
    }

    public qrz(int i, pjf0 pjf0Var, int i2) {
        this((i2 & 1) != 0 ? Integer.MIN_VALUE : i, Integer.MIN_VALUE, omf0.c, (i2 & 8) != 0 ? null : pjf0Var, null, null, 0, Integer.MIN_VALUE, null);
    }
}
