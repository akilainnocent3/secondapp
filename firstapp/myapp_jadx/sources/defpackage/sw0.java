package defpackage;

import java.util.List;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public final class sw0 extends rtu {
    public final a b;

    public static class a extends rtu {
        public final ktu[] b;

        public a(ktu[] ktuVarArr) {
            super(qtu.g(ux0.a, ktuVarArr));
            this.b = ktuVarArr;
        }

        @Override // defpackage.ktu
        public final void c(me80 me80Var) {
            me80Var.u(ux0.a, this.b);
        }
    }

    public sw0(a aVar) {
        super(qtu.f(cl0.e, aVar));
        this.b = aVar;
    }

    public static sw0 d(List list, Function function) {
        int size = list.size();
        ktu[] ktuVarArr = new ktu[size];
        for (int i = 0; i < size; i++) {
            ktuVarArr[i] = (ktu) function.apply(list.get(i));
        }
        return new sw0(new a(ktuVarArr));
    }

    @Override // defpackage.ktu
    public final void c(me80 me80Var) {
        me80Var.l(cl0.e, this.b);
    }
}
