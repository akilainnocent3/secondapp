package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
public final class xw20 {
    public static final b Companion = new b();
    public final int a;
    public final String b;

    @fae
    public /* synthetic */ class a implements o1k<xw20> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.google.firebase.sessions.ProcessData", aVar, 2);
            kr10Var.j("pid", false);
            kr10Var.j("uuid", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{hxo.a, gae0.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            int iM = 0;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    iM = dmaVarC.m(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    strJ = dmaVarC.j(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new xw20(i, iM, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            xw20 xw20Var = (xw20) obj;
            xw20Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.A(0, xw20Var.a, pd80Var);
            fmaVarC.o(pd80Var, 1, xw20Var.b);
            fmaVarC.b(pd80Var);
        }

        @Override // defpackage.o1k
        public final php<?>[] typeParametersSerializers() {
            return mr10.a;
        }
    }

    public static final class b {
        public final php<xw20> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ xw20(int i, int i2, String str) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw20)) {
            return false;
        }
        xw20 xw20Var = (xw20) obj;
        return this.a == xw20Var.a && Intrinsics.g(this.b, xw20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return j26.a(sb, this.b, ')');
    }

    public xw20(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
