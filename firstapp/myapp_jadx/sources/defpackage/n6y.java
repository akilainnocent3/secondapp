package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class n6y {
    public static final b Companion = new b();
    public final int a;

    @fae
    public static final /* synthetic */ class a implements o1k<n6y> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositRouter.DepositScreen", aVar, 1);
            kr10Var.j("channelId", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{hxo.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            int iM = 0;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else {
                    if (iV != 0) {
                        jtf0.a(iV);
                        return null;
                    }
                    iM = dmaVarC.m(pd80Var, 0);
                    i = 1;
                }
            }
            dmaVarC.b(pd80Var);
            return new n6y(i, iM);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            n6y n6yVar = (n6y) obj;
            n6yVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.A(0, n6yVar.a, pd80Var);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<n6y> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ n6y(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6y) && this.a == ((n6y) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "DepositScreen(channelId=", ")");
    }

    public n6y(int i) {
        this.a = i;
    }
}
