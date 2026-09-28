package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class g1r {
    public static final b Companion = new b();
    public final String a;
    public final boolean b;

    @fae
    public static final /* synthetic */ class a implements o1k<g1r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetNavDestination.MyNumber", aVar, 2);
            kr10Var.j("lotteryId", false);
            kr10Var.j("needCheckWhenApply", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{gae0.a, x15.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    zE = dmaVarC.E(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new g1r(i, strJ, zE);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            g1r g1rVar = (g1r) obj;
            g1rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, g1rVar.a);
            fmaVarC.i(pd80Var, 1, g1rVar.b);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<g1r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ g1r(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1r)) {
            return false;
        }
        g1r g1rVar = (g1r) obj;
        return Intrinsics.g(this.a, g1rVar.a) && this.b == g1rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("MyNumber(lotteryId=", this.a, ", needCheckWhenApply=", ")", this.b);
    }

    public g1r(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
