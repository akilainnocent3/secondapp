package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class nnh {
    public static final b Companion = new b();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    @fae
    public static final /* synthetic */ class a implements o1k<nnh> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.account.navigation.FindAccount", aVar, 4);
            kr10Var.j("allowPhoneChange", true);
            kr10Var.j("allowBack", true);
            kr10Var.j("title", true);
            kr10Var.j("description", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            php<?> phpVarA = hj5.a(gae0Var);
            php<?> phpVarA2 = hj5.a(gae0Var);
            x15 x15Var = x15.a;
            return new php[]{x15Var, x15Var, phpVarA, phpVarA2};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            boolean zE = false;
            boolean zE2 = false;
            String str = null;
            String str2 = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    zE = dmaVarC.E(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    zE2 = dmaVarC.E(pd80Var, 1);
                    i |= 2;
                } else if (iV == 2) {
                    str = (String) dmaVarC.n(pd80Var, 2, gae0.a, str);
                    i |= 4;
                } else {
                    if (iV != 3) {
                        jtf0.a(iV);
                        return null;
                    }
                    str2 = (String) dmaVarC.n(pd80Var, 3, gae0.a, str2);
                    i |= 8;
                }
            }
            dmaVarC.b(pd80Var);
            return new nnh(i, str, str2, zE, zE2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            nnh nnhVar = (nnh) obj;
            nnhVar.getClass();
            String str = nnhVar.d;
            String str2 = nnhVar.c;
            boolean z = nnhVar.b;
            boolean z2 = nnhVar.a;
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            if (fmaVarC.a(pd80Var) || !z2) {
                fmaVarC.i(pd80Var, 0, z2);
            }
            if (fmaVarC.a(pd80Var) || !z) {
                fmaVarC.i(pd80Var, 1, z);
            }
            if (fmaVarC.a(pd80Var) || str2 != null) {
                fmaVarC.D(pd80Var, 2, gae0.a, str2);
            }
            if (fmaVarC.a(pd80Var) || str != null) {
                fmaVarC.D(pd80Var, 3, gae0.a, str);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<nnh> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ nnh(int i, String str, String str2, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.a = true;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnh)) {
            return false;
        }
        nnh nnhVar = (nnh) obj;
        return this.a == nnhVar.a && this.b == nnhVar.b && Intrinsics.g(this.c, nnhVar.c) && Intrinsics.g(this.d, nnhVar.d);
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return kwi.a(cwz.a("FindAccount(allowPhoneChange=", ", allowBack=", ", title=", this.a, this.b), this.c, ", description=", this.d, ")");
    }

    public nnh(boolean z, boolean z2, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public nnh() {
        this(true, true, null, null);
    }
}
