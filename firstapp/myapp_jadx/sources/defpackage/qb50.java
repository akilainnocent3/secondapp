package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class qb50 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final boolean c;

    @fae
    public static final /* synthetic */ class a implements o1k<qb50> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.navigation.ResetPassword", aVar, 3);
            kr10Var.j("mobile", false);
            kr10Var.j("token", false);
            kr10Var.j("isForced", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, gae0Var, x15.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strJ = null;
            String strJ2 = null;
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
                    zE = dmaVarC.E(pd80Var, 2);
                    i |= 4;
                }
            }
            dmaVarC.b(pd80Var);
            return new qb50(i, strJ, strJ2, zE);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            qb50 qb50Var = (qb50) obj;
            qb50Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            String str = qb50Var.a;
            boolean z = qb50Var.c;
            fmaVarC.o(pd80Var, 0, str);
            fmaVarC.o(pd80Var, 1, qb50Var.b);
            if (fmaVarC.a(pd80Var) || z) {
                fmaVarC.i(pd80Var, 2, z);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<qb50> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ qb50(int i, String str, String str2, boolean z) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb50)) {
            return false;
        }
        qb50 qb50Var = (qb50) obj;
        return Intrinsics.g(this.a, qb50Var.a) && Intrinsics.g(this.b, qb50Var.b) && this.c == qb50Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return mq0.a(ux5.a("ResetPassword(mobile=", this.a, ", token=", this.b, ", isForced="), this.c, ")");
    }

    public qb50(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
