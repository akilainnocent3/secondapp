package defpackage;

import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface dqh0 {

    public static final class a implements b {
        public final qcn<kxq.e> a;
        public final String b;
        public final n1a0 c;

        public a(qcn<kxq.e> qcnVar, String str) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = str;
            this.c = n1a0.c;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> a() {
            return this.a;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        @Override // defpackage.dqh0
        public final String getOutcomeId() {
            return this.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BonusNumber(bonusNumber=" + this.a + ", outcomeId=" + this.b + ")";
        }
    }

    public interface b extends dqh0 {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements b {
        public final qcn<kxq.e> a;
        public final String b;
        public final n1a0 c;

        public c(qcn<kxq.e> qcnVar, String str) {
            qcnVar.getClass();
            this.a = qcnVar;
            this.b = str;
            this.c = n1a0.c;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> a() {
            return this.c;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        @Override // defpackage.dqh0
        public final String getOutcomeId() {
            return this.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Number(mainNumber=" + this.a + ", outcomeId=" + this.b + LxHElgWAiSeM.dneZK;
        }

        public c(int i) {
            this(n1a0.c, null);
        }

        public c() {
            this(0);
        }
    }

    qcn<kxq.e> a();

    qcn<kxq.e> b();

    String getOutcomeId();

    public static final class d implements b {
        public final qcn<kxq.e> a;
        public final qcn<kxq.e> b;
        public final String c;

        public d(qcn<kxq.e> qcnVar, qcn<kxq.e> qcnVar2, String str) {
            qcnVar.getClass();
            qcnVar2.getClass();
            this.a = qcnVar;
            this.b = qcnVar2;
            this.c = str;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> a() {
            return this.b;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c);
        }

        @Override // defpackage.dqh0
        public final String getOutcomeId() {
            return this.c;
        }

        public final int hashCode() {
            int iA = shu.a(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NumberWithBonusState(mainNumber=");
            sb.append(this.a);
            sb.append(", bonusNumber=");
            sb.append(this.b);
            sb.append(", outcomeId=");
            return uf80.a(sb, this.c, ")");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d(int i) {
            n1a0 n1a0Var = n1a0.c;
            this(n1a0Var, n1a0Var, null);
        }

        public d() {
            this(0);
        }
    }

    public static final class e implements dqh0 {
        public final String a;
        public final String b;
        public final n1a0 c;
        public final n1a0 d;

        public e(String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = str2;
            n1a0 n1a0Var = n1a0.c;
            this.c = n1a0Var;
            this.d = n1a0Var;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> a() {
            return this.d;
        }

        @Override // defpackage.dqh0
        public final qcn<kxq.e> b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        @Override // defpackage.dqh0
        public final String getOutcomeId() {
            return this.b;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("Other(name=", this.a, ", outcomeId=", this.b, ")");
        }

        public e() {
            this(0);
        }

        public /* synthetic */ e(int i) {
            this("", null);
        }
    }
}
