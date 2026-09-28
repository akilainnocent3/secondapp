package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wkh0 {
    public final i6u a;

    public static final class a {
        public final b a;
        public final long b;

        public a(b bVar, long j) {
            this.a = bVar;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ExpiringStream(key=" + this.a + ", targetElapsedRealtimeMillis=" + this.b + ")";
        }
    }

    public static final class b {
        public final String a;
        public final String b;
        public final long c;

        public b(long j, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return nrz.a(this.c, ")", ux5.a("StreamUpdateKey(lotteryId=", this.a, ", streamId=", this.b, ", endTime="));
        }
    }

    public interface c {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 654743360;
            }

            public final String toString() {
                return "Failed";
            }
        }

        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 601601177;
            }

            public final String toString() {
                return "Handled";
            }
        }

        /* JADX INFO: renamed from: wkh0$c$c, reason: collision with other inner class name */
        public static final class C1249c implements c {
            public static final C1249c a = new C1249c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1249c);
            }

            public final int hashCode() {
                return 245448345;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public static final class d implements c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -773789964;
            }

            public final String toString() {
                return "Pending";
            }
        }
    }

    public wkh0(i6u i6uVar) {
        i6uVar.getClass();
        this.a = i6uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(b390 b390Var, x1b x1bVar) {
        xkh0 xkh0Var;
        if (x1bVar instanceof xkh0) {
            xkh0Var = (xkh0) x1bVar;
            int i = xkh0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkh0Var.c = i - Integer.MIN_VALUE;
            } else {
                xkh0Var = new xkh0(this, x1bVar);
            }
        } else {
            xkh0Var = new xkh0(this, x1bVar);
        }
        Object obj = xkh0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xkh0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            zkh0 zkh0Var = new zkh0(this, b390Var, null);
            xkh0Var.c = 1;
            if (w5b.d(zkh0Var, xkh0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
