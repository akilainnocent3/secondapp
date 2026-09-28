package defpackage;

import com.appsflyer.internal.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lak {
    public final n8k a;
    public final sr10 b;
    public final e5k c;

    public static final class a {
        public final String a;
        public final long b;
        public final String c;

        public a(long j, String str, String str2) {
            str.getClass();
            this.a = str;
            this.b = j;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31);
        }

        public final String toString() {
            return pr0.a(x.a(this.b, "PendingDeposit(tradeId=", this.a, ", amount="), ", currencySymbol=", this.c, ")");
        }
    }

    public static final class b {
        public final List<a> a;
        public final int b;

        public b(List<a> list, int i) {
            list.getClass();
            this.a = list;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PendingDepositsResult(pendingDeposits=" + this.a + ", maxPendingDeposits=" + this.b + ")";
        }
    }

    public lak(n8k n8kVar, sr10 sr10Var, e5k e5kVar) {
        sr10Var.getClass();
        this.a = n8kVar;
        this.b = sr10Var;
        this.c = e5kVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar) {
        oak oakVar;
        if (x1bVar instanceof oak) {
            oakVar = (oak) x1bVar;
            int i2 = oakVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oakVar.c = i2 - Integer.MIN_VALUE;
            } else {
                oakVar = new oak(this, x1bVar);
            }
        } else {
            oakVar = new oak(this, x1bVar);
        }
        Object objD = oakVar.a;
        y5b y5bVar = y5b.a;
        int i3 = oakVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objD);
                zi50.a aVar = zi50.b;
                pak pakVar = new pak(this, i, null);
                oakVar.c = 1;
                objD = w5b.d(pakVar, oakVar);
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
            b bVar = (b) objD;
            zi50.a aVar2 = zi50.b;
            return bVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
