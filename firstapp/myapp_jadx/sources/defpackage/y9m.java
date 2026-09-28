package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class y9m extends vth {

    public static class a implements pb50 {
        public final double[] a;

        public a(List<Double> list) {
            e0h.b(list);
            this.a = list.stream().mapToDouble(new d0h()).toArray();
        }

        @Override // defpackage.pb50
        public final int a(ob50[] ob50VarArr, long j) {
            return e0h.a(j, this.a);
        }

        @Override // defpackage.pb50
        public final int b(ob50[] ob50VarArr, double d) {
            return e0h.a(d, this.a);
        }
    }

    public y9m(List list) {
        super(list.size() + 1, new a(list));
    }

    @Override // defpackage.vth, defpackage.ujt
    public final void a(long j, m21 m21Var, m0b m0bVar) {
        b(j, m21Var, m0bVar);
    }
}
