package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class y47 {
    public static final b Companion = new b();
    public final String a;

    @fae
    public static final /* synthetic */ class a implements o1k<y47> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.verifiedemailchange.newemail.navigation.ChangeNewEmail", aVar, 1);
            kr10Var.j("token", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{gae0.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            String strJ = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else {
                    if (iV != 0) {
                        jtf0.a(iV);
                        return null;
                    }
                    strJ = dmaVarC.j(pd80Var, 0);
                    i = 1;
                }
            }
            dmaVarC.b(pd80Var);
            return new y47(i, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            y47 y47Var = (y47) obj;
            y47Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, y47Var.a);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<y47> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ y47(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y47) && Intrinsics.g(this.a, ((y47) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ChangeNewEmail(token=", this.a, ")");
    }

    public y47(String str) {
        str.getClass();
        this.a = str;
    }
}
