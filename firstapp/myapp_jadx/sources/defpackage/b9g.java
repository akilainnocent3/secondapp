package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class b9g {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    @fae
    public static final /* synthetic */ class a implements o1k<b9g> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.devicemanagement.impl.EnterPassword", aVar, 2);
            kr10Var.j("action", false);
            kr10Var.j("deviceId", false);
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
            return new b9g(i, strJ, strJ2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            b9g b9gVar = (b9g) obj;
            b9gVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, b9gVar.a);
            fmaVarC.o(pd80Var, 1, b9gVar.b);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<b9g> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ b9g(int i, String str, String str2) {
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
        if (!(obj instanceof b9g)) {
            return false;
        }
        b9g b9gVar = (b9g) obj;
        return Intrinsics.g(this.a, b9gVar.a) && Intrinsics.g(this.b, b9gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("EnterPassword(action=", this.a, ", deviceId=", this.b, ")");
    }

    public b9g(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }
}
