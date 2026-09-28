package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g7k {
    public final qde a;

    public static abstract class a {

        /* JADX INFO: renamed from: g7k$a$a, reason: collision with other inner class name */
        public static final class C0593a extends a {
            public static final C0593a a = new C0593a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0593a);
            }

            public final int hashCode() {
                return 442251278;
            }

            public final String toString() {
                return "ApiDisabled";
            }
        }

        public static final class b extends a {
            public final jde a;

            public b(jde jdeVar) {
                jdeVar.getClass();
                this.a = jdeVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.a + ")";
            }
        }
    }

    public g7k(qde qdeVar) {
        this.a = qdeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        h7k h7kVar;
        if (x1bVar instanceof h7k) {
            h7kVar = (h7k) x1bVar;
            int i = h7kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7kVar.c = i - Integer.MIN_VALUE;
            } else {
                h7kVar = new h7k(this, x1bVar);
            }
        } else {
            h7kVar = new h7k(this, x1bVar);
        }
        Object objA = h7kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = h7kVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            i7k i7kVar = new i7k(this, str, null);
            j5b j5bVar = new j5b(1);
            h7kVar.c = 1;
            objA = oni.a(500L, i7kVar, j5bVar, h7kVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        a aVar = (a) objA;
        return aVar == null ? a.C0593a.a : aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, x1b x1bVar) {
        j7k j7kVar;
        if (x1bVar instanceof j7k) {
            j7kVar = (j7k) x1bVar;
            int i = j7kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7kVar.c = i - Integer.MIN_VALUE;
            } else {
                j7kVar = new j7k(this, x1bVar);
            }
        } else {
            j7kVar = new j7k(this, x1bVar);
        }
        Object objA = j7kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = j7kVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            str.getClass();
            qde qdeVar = this.a;
            sl50 sl50Var = new sl50(bm50.b(ozh.c(new or60(new pde(qdeVar, str, null)), qdeVar.b), vch0.b));
            j7kVar.c = 1;
            objA = s0i.a(sl50Var, j7kVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        lk50 lk50Var = (lk50) objA;
        if (!(lk50Var instanceof lk50.c)) {
            return null;
        }
        jde jdeVar = (jde) ((lk50.c) lk50Var).a;
        int iOrdinal = jdeVar.b().ordinal();
        if (iOrdinal == 0) {
            return new a.b(jdeVar);
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return a.C0593a.a;
        }
        uhc.a();
        return null;
    }
}
