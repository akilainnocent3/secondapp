package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uyc0 implements nxc0 {
    public final qcn<String> a;
    public final qcn<c> b;
    public final a c;

    public static final class a {
        public final mxc0 a;
        public final qcn<c> b;

        public a(mxc0 mxc0Var, qcn<c> qcnVar) {
            qcnVar.getClass();
            this.a = mxc0Var;
            this.b = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ExpansionState(state=" + this.a + ", rows=" + this.b + ")";
        }
    }

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

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final String b;
        public final qcn<b> c;

        public c(qcn qcnVar, String str, String str2) {
            str2.getClass();
            qcnVar.getClass();
            this.a = str;
            this.b = str2;
            this.c = qcnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return ts3.a(ux5.a("Row(marketPoolId=", this.a, ", specifierText=", this.b, llGRV.PLZONgQDyssU), this.c, ")");
        }
    }

    public uyc0(qcn<String> qcnVar, qcn<c> qcnVar2, a aVar) {
        qcnVar.getClass();
        qcnVar2.getClass();
        this.a = qcnVar;
        this.b = qcnVar2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyc0)) {
            return false;
        }
        uyc0 uyc0Var = (uyc0) obj;
        return Intrinsics.g(this.a, uyc0Var.a) && Intrinsics.g(this.b, uyc0Var.b) && Intrinsics.g(this.c, uyc0Var.c);
    }

    public final int hashCode() {
        int iA = shu.a(this.b, this.a.hashCode() * 31, 31);
        a aVar = this.c;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "SportyPenaltyMarketOutcomeWithSpecifierContentState(subtitleTexts=" + this.a + ", rows=" + this.b + ", expansionState=" + this.c + ")";
    }
}
