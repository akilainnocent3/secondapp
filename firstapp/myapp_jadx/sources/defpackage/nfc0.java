package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nfc0 implements nec0 {
    public final String a;
    public final qcn<qcn<a>> b;
    public final int c;

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

    public nfc0(int i, qcn qcnVar, String str) {
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfc0)) {
            return false;
        }
        nfc0 nfc0Var = (nfc0) obj;
        return this.a.equals(nfc0Var.a) && Intrinsics.g(this.b, nfc0Var.b) && this.c == nfc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shu.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsMarketOutcomeContentState(marketPoolId=");
        sb.append(this.a);
        sb.append(", maxOddsButtonsPerRow=");
        sb.append(this.b);
        sb.append(", maxEmptySlotCountInLastRow=");
        return zk1.a(this.c, ")", sb);
    }
}
