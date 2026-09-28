package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class l8r {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    @fae
    public static final /* synthetic */ class a implements o1k<l8r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.shared.presentation.state.LNScreen.LotteryResult", aVar, 2);
            kr10Var.j("lotteryId", false);
            kr10Var.j("name", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, gae0Var};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            String strJ = null;
            String strJ2 = null;
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
                    strJ2 = dmaVarC.j(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new l8r(i, strJ, strJ2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            l8r l8rVar = (l8r) obj;
            l8rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, l8rVar.a);
            fmaVarC.o(pd80Var, 1, l8rVar.b);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<l8r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ l8r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8r)) {
            return false;
        }
        l8r l8rVar = (l8r) obj;
        return Intrinsics.g(this.a, l8rVar.a) && Intrinsics.g(this.b, l8rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("LotteryResult(lotteryId=", this.a, ", name=", this.b, ")");
    }

    public l8r(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
