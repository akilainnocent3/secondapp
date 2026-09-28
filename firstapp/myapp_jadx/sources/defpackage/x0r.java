package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class x0r {
    public static final b Companion = new b();
    public static final ttr<php<Object>>[] f = {null, null, null, hwr.a(a1s.b, new w0r()), null};
    public final String a;
    public final Integer b;
    public final String c;
    public final List<Integer> d;
    public final boolean e;

    @fae
    public static final /* synthetic */ class a implements o1k<x0r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetNavDestination.AddNumber", aVar, 5);
            kr10Var.j("lotteryId", false);
            kr10Var.j(AnalyticsParam.EVENT_PARAM_ID, false);
            kr10Var.j("name", false);
            kr10Var.j("mainNumbers", false);
            kr10Var.j("isAdd", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            ttr<php<Object>>[] ttrVarArr = x0r.f;
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, hj5.a(hxo.a), gae0Var, ttrVarArr[3].getValue(), x15.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = x0r.f;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strJ = null;
            Integer num = null;
            String strJ2 = null;
            List list = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    num = (Integer) dmaVarC.n(pd80Var, 1, hxo.a, num);
                    i |= 2;
                } else if (iV == 2) {
                    strJ2 = dmaVarC.j(pd80Var, 2);
                    i |= 4;
                } else if (iV == 3) {
                    list = (List) dmaVarC.y(pd80Var, 3, ttrVarArr[3].getValue(), list);
                    i |= 8;
                } else {
                    if (iV != 4) {
                        jtf0.a(iV);
                        return null;
                    }
                    zE = dmaVarC.E(pd80Var, 4);
                    i |= 16;
                }
            }
            dmaVarC.b(pd80Var);
            return new x0r(i, strJ, num, strJ2, list, zE);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            x0r x0rVar = (x0r) obj;
            x0rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = x0r.f;
            fmaVarC.o(pd80Var, 0, x0rVar.a);
            fmaVarC.D(pd80Var, 1, hxo.a, x0rVar.b);
            fmaVarC.o(pd80Var, 2, x0rVar.c);
            fmaVarC.q(pd80Var, 3, ttrVarArr[3].getValue(), x0rVar.d);
            fmaVarC.i(pd80Var, 4, x0rVar.e);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<x0r> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ x0r(int i, String str, Integer num, String str2, List list, boolean z) {
        if (31 != (i & 31)) {
            cgo.a(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0r)) {
            return false;
        }
        x0r x0rVar = (x0r) obj;
        return Intrinsics.g(this.a, x0rVar.a) && Intrinsics.g(this.b, x0rVar.b) && Intrinsics.g(this.c, x0rVar.c) && Intrinsics.g(this.d, x0rVar.d) && this.e == x0rVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.e) + ai50.a(gmf0.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = ew7.a(this.b, "AddNumber(lotteryId=", this.a, ", id=", ", name=");
        kya0.b(this.c, ", mainNumbers=", ", isAdd=", sbA, this.d);
        return mq0.a(sbA, this.e, ")");
    }

    public x0r(String str, Integer num, String str2, List<Integer> list, boolean z) {
        bt6.a(str, str2, list);
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = list;
        this.e = z;
    }
}
