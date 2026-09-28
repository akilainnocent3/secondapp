package defpackage;

import com.appsflyer.internal.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ebk {
    public final n8k a;
    public final sr10 b;
    public final e5k c;
    public final lq1 d;

    public static final class a {
        public final List<b> a;
        public final int b;
        public final int c;

        public a(int i, int i2, List list) {
            list.getClass();
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PendingDepositsResult(pendingDeposits=");
            sb.append(this.a);
            sb.append(", maxPendingDeposits=");
            sb.append(this.b);
            sb.append(", minRemainingSeconds=");
            return zk1.a(this.c, ")", sb);
        }
    }

    public static final class b {
        public final String a;
        public final long b;
        public final String c;
        public final long d;
        public final String e;

        public b(String str, String str2, String str3, long j, long j2) {
            str.getClass();
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = j2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c.equals(bVar.c) && this.d == bVar.d && this.e.equals(bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + f87.a(gmf0.a(f87.a(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
        }

        public final String toString() {
            StringBuilder sbA = x.a(this.b, "PixPendingDeposit(tradeId=", this.a, ", amount=");
            u4.a(sbA, ", currencySymbol=", this.c, ", expirationDate=");
            em5.a(this.d, ", qrCode=", this.e, sbA);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public ebk(n8k n8kVar, sr10 sr10Var, e5k e5kVar, lq1 lq1Var) {
        sr10Var.getClass();
        lq1Var.getClass();
        this.a = n8kVar;
        this.b = sr10Var;
        this.c = e5kVar;
        this.d = lq1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar) {
        ibk ibkVar;
        if (x1bVar instanceof ibk) {
            ibkVar = (ibk) x1bVar;
            int i2 = ibkVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ibkVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ibkVar = new ibk(this, x1bVar);
            }
        } else {
            ibkVar = new ibk(this, x1bVar);
        }
        Object objD = ibkVar.a;
        y5b y5bVar = y5b.a;
        int i3 = ibkVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                jbk jbkVar = new jbk(this, i, null);
                ibkVar.c = 1;
                objD = w5b.d(jbkVar, ibkVar);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objD);
            }
            a aVar2 = (a) objD;
            zi50.a aVar3 = zi50.b;
            return aVar2;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            return new zi50.b(th);
        }
    }
}
