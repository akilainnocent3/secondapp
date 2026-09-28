package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class dn10 {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final String c;

    @fae
    public static final /* synthetic */ class a implements o1k<dn10> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.playtimecontrol.navigation.PlayTimeControlNavigation.Edit", aVar, 3);
            kr10Var.j("type", false);
            kr10Var.j("selectedStartDate", true);
            kr10Var.j("selectedEndDate", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, hj5.a(gae0Var), hj5.a(gae0Var)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            String strJ = null;
            String str = null;
            String str2 = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    str = (String) dmaVarC.n(pd80Var, 1, gae0.a, str);
                    i |= 2;
                } else {
                    if (iV != 2) {
                        jtf0.a(iV);
                        return null;
                    }
                    str2 = (String) dmaVarC.n(pd80Var, 2, gae0.a, str2);
                    i |= 4;
                }
            }
            dmaVarC.b(pd80Var);
            return new dn10(i, strJ, str, str2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            dn10 dn10Var = (dn10) obj;
            dn10Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            String str = dn10Var.a;
            String str2 = dn10Var.c;
            String str3 = dn10Var.b;
            fmaVarC.o(pd80Var, 0, str);
            if (fmaVarC.a(pd80Var) || str3 != null) {
                fmaVarC.D(pd80Var, 1, gae0.a, str3);
            }
            if (fmaVarC.a(pd80Var) || str2 != null) {
                fmaVarC.D(pd80Var, 2, gae0.a, str2);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<dn10> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ dn10(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn10)) {
            return false;
        }
        dn10 dn10Var = (dn10) obj;
        return Intrinsics.g(this.a, dn10Var.a) && Intrinsics.g(this.b, dn10Var.b) && Intrinsics.g(this.c, dn10Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return uf80.a(ux5.a("Edit(type=", this.a, ", selectedStartDate=", this.b, ", selectedEndDate="), this.c, ")");
    }

    public dn10(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
