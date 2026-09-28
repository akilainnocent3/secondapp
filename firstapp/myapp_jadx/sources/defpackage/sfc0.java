package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sfc0 implements nec0 {
    public final qcn<String> a;
    public final qcn<b> b;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final qgy d;

        public a(String str, String str2, String str3, qgy qgyVar) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = qgyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("OddsButton(marketId=", this.a, ", outcomeId=", this.b, ", lookupKey=");
            sbA.append(this.c);
            sbA.append(", oddsButtonState=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final qcn<a> c;

        public b(qcn qcnVar, String str, String str2) {
            qcnVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ts3.a(ux5.a("Row(marketPoolId=", this.a, ", specifierText=", this.b, ", oddsButtons="), this.c, ")");
        }
    }

    public sfc0(qcn<String> qcnVar, qcn<b> qcnVar2) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfc0)) {
            return false;
        }
        sfc0 sfc0Var = (sfc0) obj;
        return Intrinsics.g(this.a, sfc0Var.a) && Intrinsics.g(this.b, sfc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsMarketOutcomeWithSpecifierContentState(subtitleTexts=" + this.a + ", rows=" + this.b + ")";
    }
}
