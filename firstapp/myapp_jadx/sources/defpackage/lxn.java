package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lxn implements yyn {
    public final String a;
    public final String b;
    public final qcn<String> c;
    public final boolean d;
    public final qcn<a> e;
    public final jzn f;

    public static final class a {
        public final wyn a;
        public final String b;
        public final qcn<tt00> c;

        public a(wyn wynVar, String str, qcn<tt00> qcnVar) {
            str.getClass();
            qcnVar.getClass();
            this.a = wynVar;
            this.b = str;
            this.c = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Row(racerState=");
            sb.append(this.a);
            sb.append(", guidePrice=");
            sb.append(this.b);
            sb.append(", pickableButtonStates=");
            return ts3.a(sb, this.c, ")");
        }
    }

    public lxn(String str, String str2, qcn<String> qcnVar, boolean z, qcn<a> qcnVar2, jzn jznVar) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = str;
        this.b = str2;
        this.c = qcnVar;
        this.d = z;
        this.e = qcnVar2;
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
        if (!(obj instanceof lxn)) {
            return false;
        }
        lxn lxnVar = (lxn) obj;
        return this.a.equals(lxnVar.a) && this.b.equals(lxnVar.b) && Intrinsics.g(this.c, lxnVar.c) && this.d == lxnVar.d && Intrinsics.g(this.e, lxnVar.e) && this.f == lxnVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + shu.a(this.e, mtg0.a(shu.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("InstantRacingMarketLayoutCombinationWithOrderState(marketCategoryId=", this.a, ", guide=", this.b, ", marketBannerTitles=");
        sbA.append(this.c);
        sbA.append(", shouldShowPickGuidance=");
        sbA.append(this.d);
        sbA.append(", rows=");
        sbA.append(this.e);
        sbA.append(", marketType=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
