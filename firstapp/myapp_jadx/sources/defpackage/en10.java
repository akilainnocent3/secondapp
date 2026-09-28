package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class en10 {
    public static final b Companion = new b();
    public final String a;
    public final int b;

    @fae
    public static final /* synthetic */ class a implements o1k<en10> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.playtimecontrol.navigation.PlayTimeControlNavigation.EditConfirmation", aVar, 2);
            kr10Var.j("type", false);
            kr10Var.j("optionSelectedInDays", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{gae0.a, hxo.a};
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
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    iM = dmaVarC.m(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new en10(i, iM, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            en10 en10Var = (en10) obj;
            en10Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, en10Var.a);
            fmaVarC.A(1, en10Var.b, pd80Var);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<en10> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ en10(int i, int i2, String str) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en10)) {
            return false;
        }
        en10 en10Var = (en10) obj;
        return Intrinsics.g(this.a, en10Var.a) && this.b == en10Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "EditConfirmation(type=", this.a, ", optionSelectedInDays=", ")");
    }

    public en10(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }
}
