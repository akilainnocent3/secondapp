package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uei0 extends aui {
    public final e8e0 c;

    public uei0(m16 m16Var, e8e0 e8e0Var) {
        super(m16Var);
        this.c = e8e0Var;
    }

    @Override // defpackage.aui, defpackage.m16
    public final qis g(final ArrayList arrayList, int i, int i2) {
        km20.a("Only support one capture config.", arrayList.size() == 1);
        final qis qisVarI = this.b.i(i);
        return new vhs(new ArrayList(Collections.singletonList(obj.g(obj.g(obj.g(dbj.a(qisVarI), new wz0() { // from class: rei0
            @Override // defpackage.wz0
            public final qis apply(Object obj) {
                return ((d06) qisVarI.get()).a();
            }
        }, nqe.a()), new wz0() { // from class: sei0
            @Override // defpackage.wz0
            public final qis apply(Object obj) {
                e8e0 e8e0Var = this.a.c;
                ArrayList arrayList2 = arrayList;
                Integer num = (Integer) ((ue6) arrayList2.get(0)).b.b(ue6.j, 100);
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Integer num2 = (Integer) ((ue6) arrayList2.get(0)).b.b(ue6.i, 0);
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                she0 she0Var = e8e0Var.a.v;
                if (she0Var == null) {
                    return new fcn.a(new Exception("Failed to take picture: pipeline is not ready."));
                }
                final jhd jhdVar = she0Var.a;
                final nv5.a aVar = new nv5.a();
                nv5.d<T> dVar = new nv5.d<>(aVar);
                aVar.b = dVar;
                aVar.a = ew5.class;
                try {
                    final zh1 zh1Var = new zh1(iIntValue, iIntValue2, aVar);
                    jhdVar.d(new Runnable() { // from class: ygd
                        @Override // java.lang.Runnable
                        public final void run() {
                            jhdVar.z.add(zh1Var);
                        }
                    }, new Runnable() { // from class: zgd
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                        }
                    });
                    aVar.a = "DefaultSurfaceProcessor#snapshot";
                } catch (Exception e) {
                    dVar.a(e);
                }
                return obj.d(dVar);
            }
        }, nqe.a()), new wz0() { // from class: tei0
            @Override // defpackage.wz0
            public final qis apply(Object obj) {
                return ((d06) qisVarI.get()).b();
            }
        }, nqe.a()))), true, nqe.a());
    }
}
