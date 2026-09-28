package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import eef0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class def0 implements PointerInputEventHandler {
    public final /* synthetic */ eef0 a;

    public /* synthetic */ class a extends saj implements Function1<gly, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(gly glyVar) {
            long j = glyVar.a;
            eef0 eef0Var = (eef0) this.receiver;
            eef0Var.getClass();
            oef0 oef0Var = (oef0) zma.a(eef0Var, ref0.a);
            if (oef0Var != null) {
                ej5.c(eef0Var.d2(), null, null, new fef0(eef0Var, oef0Var, eef0Var.new a(j), null), 3);
            }
            return Unit.a;
        }
    }

    public def0(eef0 eef0Var) {
        this.a = eef0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        Object objB = dqi.b(u020Var, new ht50(new a(1, this.a, eef0.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), null), v1bVar);
        y5b y5bVar = y5b.a;
        if (objB != y5bVar) {
            objB = Unit.a;
        }
        return objB == y5bVar ? objB : Unit.a;
    }
}
