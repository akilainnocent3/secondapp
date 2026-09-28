package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class h8r implements w8r, pit {
    public static final b Companion = new b();
    public final String a;
    public final boolean b;

    @fae
    public static final /* synthetic */ class a implements o1k<h8r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.shared.presentation.state.LNScreen.HistoryDetail", aVar, 2);
            kr10Var.j("orderId", false);
            kr10Var.j("enableAnimation", true);
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
            return new h8r(i, strJ, zE);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            h8r h8rVar = (h8r) obj;
            h8rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            String str = h8rVar.a;
            boolean z = h8rVar.b;
            fmaVarC.o(pd80Var, 0, str);
            if (fmaVarC.a(pd80Var) || !z) {
                fmaVarC.i(pd80Var, 1, z);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<h8r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ h8r(int i, String str, boolean z) {
        if (1 != (i & 1)) {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    @Override // defpackage.w8r
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8r)) {
            return false;
        }
        h8r h8rVar = (h8r) obj;
        return Intrinsics.g(this.a, h8rVar.a) && this.b == h8rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("HistoryDetail(orderId=", this.a, ", enableAnimation=", ")", this.b);
    }

    public h8r(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }
}
