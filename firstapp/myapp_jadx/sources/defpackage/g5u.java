package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class g5u {
    public static final b Companion = new b();
    public static final ttr<php<Object>>[] d = {null, hwr.a(a1s.b, new f5u()), null};
    public final String a;
    public final List<String> b;
    public final String c;

    @fae
    public static final /* synthetic */ class a implements o1k<g5u> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.luncher.data.LuckyNumberConfig", aVar, 3);
            kr10Var.j("minAppVersion", false);
            kr10Var.j("blockedVersions", false);
            kr10Var.j("webViewUrl", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            ttr<php<Object>>[] ttrVarArr = g5u.d;
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, ttrVarArr[1].getValue(), hj5.a(gae0Var)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = g5u.d;
            boolean z = true;
            int i = 0;
            String strJ = null;
            List list = null;
            String str = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    list = (List) dmaVarC.y(pd80Var, 1, ttrVarArr[1].getValue(), list);
                    i |= 2;
                } else {
                    if (iV != 2) {
                        jtf0.a(iV);
                        return null;
                    }
                    str = (String) dmaVarC.n(pd80Var, 2, gae0.a, str);
                    i |= 4;
                }
            }
            dmaVarC.b(pd80Var);
            return new g5u(strJ, i, str, list);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            g5u g5uVar = (g5u) obj;
            g5uVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = g5u.d;
            fmaVarC.o(pd80Var, 0, g5uVar.a);
            fmaVarC.q(pd80Var, 1, ttrVarArr[1].getValue(), g5uVar.b);
            fmaVarC.D(pd80Var, 2, gae0.a, g5uVar.c);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<g5u> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ g5u(String str, int i, String str2, List list) {
        if (7 != (i & 7)) {
            cgo.a(i, 7, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5u)) {
            return false;
        }
        g5u g5uVar = (g5u) obj;
        return Intrinsics.g(this.a, g5uVar.a) && Intrinsics.g(this.b, g5uVar.b) && Intrinsics.g(this.c, g5uVar.c);
    }

    public final int hashCode() {
        int iA = ai50.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LuckyNumberConfig(minAppVersion=");
        sb.append(this.a);
        sb.append(", blockedVersions=");
        sb.append(this.b);
        sb.append(", webViewUrl=");
        return uf80.a(sb, this.c, ")");
    }
}
