package defpackage;

import com.appsflyer.internal.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class v8r {
    public static final b Companion = new b();
    public final int a;
    public final String b;

    @fae
    public static final /* synthetic */ class a implements o1k<v8r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.shared.presentation.state.LNScreen.WebView", aVar, 2);
            kr10Var.j("titleRes", false);
            kr10Var.j("url", false);
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
            return new v8r(i, iM, strJ);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            v8r v8rVar = (v8r) obj;
            v8rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.A(0, v8rVar.a, pd80Var);
            fmaVarC.o(pd80Var, 1, v8rVar.b);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<v8r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ v8r(int i, int i2, String str) {
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
        if (!(obj instanceof v8r)) {
            return false;
        }
        v8r v8rVar = (v8r) obj;
        return this.a == v8rVar.a && Intrinsics.g(this.b, v8rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h.a(this.a, "WebView(titleRes=", ", url=", this.b, ")");
    }

    public v8r(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
