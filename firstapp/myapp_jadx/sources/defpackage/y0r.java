package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class y0r {
    public static final b Companion = new b();
    public final String a;

    @fae
    public static final /* synthetic */ class a implements o1k<y0r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetNavDestination.GiftDialog", aVar, 1);
            kr10Var.j("stake", false);
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
            return new y0r(i, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            y0r y0rVar = (y0r) obj;
            y0rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.o(pd80Var, 0, y0rVar.a);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<y0r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ y0r(int i, String str) {
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
        return (obj instanceof y0r) && Intrinsics.g(this.a, ((y0r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("GiftDialog(stake=", this.a, ")");
    }

    public y0r(String str) {
        str.getClass();
        this.a = str;
    }
}
