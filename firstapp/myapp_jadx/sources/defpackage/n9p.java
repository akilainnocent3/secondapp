package defpackage;

import kotlin.Unit;
import m9p.d;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n9p extends saj implements gaj<m9p, a780<?>, Object, Unit> {
    public static final n9p a = new n9p(3, m9p.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.gaj
    public final Unit invoke(m9p m9pVar, a780<?> a780Var, Object obj) {
        Object objK;
        m9p m9pVar2 = m9pVar;
        a780<?> a780Var2 = a780Var;
        int i = m9p.c;
        do {
            objK = m9pVar2.K();
            if (!(objK instanceof uen)) {
                if (!(objK instanceof dn8)) {
                    objK = p9p.a(objK);
                }
                a780Var2.c(objK);
            }
            return Unit.a;
        } while (m9pVar2.g0(objK) < 0);
        a780Var2.e(i9p.g(m9pVar2, m9pVar2.new d(a780Var2)));
        return Unit.a;
    }
}
