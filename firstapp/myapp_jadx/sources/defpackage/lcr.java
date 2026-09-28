package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class lcr {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;

    @fae
    public static final /* synthetic */ class a implements o1k<lcr> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffDestination", aVar, 3);
            kr10Var.j("totalWin", false);
            kr10Var.j("orderId", false);
            kr10Var.j("lotteryName", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, gae0Var, hj5.a(gae0Var)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            String strJ = null;
            String strJ2 = null;
            String str = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    strJ2 = dmaVarC.j(pd80Var, 1);
                    i |= 2;
                } else {
                    if (iV != 2) {
                        jtf0.a(iV);
                        return null;
                    }
                    str = (String) dmaVarC.n(pd80Var, 2, gae0.a, str);
                    i |= 4;
                }
            }
            dmaVarC.b(pd80Var);
            return new lcr(i, strJ, strJ2, str);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            lcr lcrVar = (lcr) obj;
            lcrVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, lcrVar.a);
            fmaVarC.o(pd80Var, 1, lcrVar.b);
            fmaVarC.D(pd80Var, 2, gae0.a, lcrVar.c);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<lcr> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ lcr(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            cgo.a(i, 7, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcr)) {
            return false;
        }
        lcr lcrVar = (lcr) obj;
        return Intrinsics.g(this.a, lcrVar.a) && Intrinsics.g(this.b, lcrVar.b) && Intrinsics.g(this.c, lcrVar.c);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return uf80.a(ux5.a("LNShowOffDestination(totalWin=", this.a, ", orderId=", this.b, ", lotteryName="), this.c, ")");
    }

    public lcr(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
