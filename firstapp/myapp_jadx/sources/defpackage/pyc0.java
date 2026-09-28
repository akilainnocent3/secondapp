package defpackage;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
public final class pyc0 implements nxc0 {
    public final String a;
    public final qcn<qcn<b>> b;
    public final int c;
    public final a d;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a {
        public final mxc0 a;
        public final qcn<qcn<b>> b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(mxc0 mxc0Var, qcn<? extends qcn<b>> qcnVar, int i) {
            qcnVar.getClass();
            this.a = mxc0Var;
            this.b = qcnVar;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shu.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExpansionState(state=");
            sb.append(this.a);
            sb.append(", oddsButtonsPerRow=");
            sb.append(this.b);
            sb.append(", emptySlotCountInLastRow=");
            return zk1.a(this.c, ")", sb);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b {
        public final String a;
        public final qgy b;

        public b(String str, qgy qgyVar) {
            this.a = str;
            this.b = qgyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OddsButton(outcomeId=" + this.a + ", oddsButtonState=" + this.b + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pyc0(String str, qcn<? extends qcn<b>> qcnVar, int i, a aVar) {
        qcnVar.getClass();
        this.a = str;
        this.b = qcnVar;
        this.c = i;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyc0)) {
            return false;
        }
        pyc0 pyc0Var = (pyc0) obj;
        return this.a.equals(pyc0Var.a) && Intrinsics.g(this.b, pyc0Var.b) && this.c == pyc0Var.c && Intrinsics.g(this.d, pyc0Var.d);
    }

    public final int hashCode() {
        int iA = gpp.a(this.c, shu.a(this.b, this.a.hashCode() * 31, 31), 31);
        a aVar = this.d;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "SportyPenaltyMarketOutcomeContentState(marketPoolId=" + this.a + ", maxOddsButtonsPerRow=" + this.b + ", maxEmptySlotCountInLastRow=" + this.c + Chyeyik.xzzKeHycvVuhnS + this.d + ")";
    }
}
