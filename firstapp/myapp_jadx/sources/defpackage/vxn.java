package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vxn implements yyn {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final qcn<a> e;
    public final jzn f;

    public static final class a {
        public final wyn a;
        public final String b;
        public final tt00 c;

        public a(wyn wynVar, String str, tt00 tt00Var) {
            str.getClass();
            this.a = wynVar;
            this.b = str;
            this.c = tt00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Row(racerState=" + this.a + ", guidePrice=" + this.b + ", pickableButtonState=" + this.c + ")";
        }
    }

    public vxn(String str, String str2, String str3, boolean z, qcn<a> qcnVar, jzn jznVar) {
        qcnVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = qcnVar;
        this.f = jznVar;
    }

    @Override // defpackage.yyn
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxn)) {
            return false;
        }
        vxn vxnVar = (vxn) obj;
        return this.a.equals(vxnVar.a) && this.b.equals(vxnVar.b) && this.c.equals(vxnVar.c) && this.d == vxnVar.d && Intrinsics.g(this.e, vxnVar.e) && this.f == vxnVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + shu.a(this.e, mtg0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingMarketLayoutCombinationWithoutOrderState(marketCategoryId=", this.a, ", guide=", this.b, ", marketBannerTitle=");
        uts.b(this.c, ", shouldShowPickGuidance=", ", rows=", sbA, this.d);
        sbA.append(this.e);
        sbA.append(", marketType=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
