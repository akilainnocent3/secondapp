package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$directionChanges$1", f = "RCPointerView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class aq30 extends tje0 implements gaj<u5<Object>, Object, v1b<? super u5<Object>>, Object> {
    public /* synthetic */ u5 a;
    public /* synthetic */ Comparable b;

    @Override // defpackage.gaj
    public final Object invoke(u5<Object> u5Var, Object obj, v1b<? super u5<Object>> v1bVar) {
        aq30 aq30Var = new aq30(3, v1bVar);
        aq30Var.a = u5Var;
        aq30Var.b = (Comparable) obj;
        return aq30Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        hqe hqeVar;
        u5 u5Var = this.a;
        Comparable comparable = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        T t = u5Var.a;
        hqe hqeVar2 = u5Var.b;
        if (t == 0) {
            hqe hqeVar3 = hqe.a;
            return new u5(comparable, 4);
        }
        if (comparable.compareTo(t) > 0) {
            hqeVar = hqe.a;
        } else {
            hqeVar = comparable.compareTo(t) < 0 ? hqe.b : hqeVar2;
        }
        return new u5(comparable, hqeVar, hqeVar != hqeVar2 && hqeVar2 != hqe.c ? new v37(hqeVar2, hqeVar, t, comparable) : null);
    }
}
