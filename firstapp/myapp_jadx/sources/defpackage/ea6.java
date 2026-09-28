package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class ea6 implements PointerInputEventHandler {
    public final /* synthetic */ ytw<ukf0> a;
    public final /* synthetic */ nk0 b;
    public final /* synthetic */ Function1<Boolean, Unit> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ea6(ytw<ukf0> ytwVar, nk0 nk0Var, Function1<? super Boolean, Unit> function1, ytw<Boolean> ytwVar2) {
        this.a = ytwVar;
        this.b = nk0Var;
        this.c = function1;
        this.d = ytwVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        final ytw<ukf0> ytwVar = this.a;
        final nk0 nk0Var = this.b;
        final Function1<Boolean, Unit> function1 = this.c;
        final ytw<Boolean> ytwVar2 = this.d;
        Object objD = u4f0.d(u020Var, null, new Function1() { // from class: da6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gly glyVar = (gly) obj;
                ukf0 ukf0Var = (ukf0) ytwVar.getValue();
                if (ukf0Var != null) {
                    int iG = ukf0Var.b.g(glyVar.a);
                    if (((nk0.d) CollectionsKt.firstOrNull(nk0Var.b(iG, iG, "TOGGLE"))) != null) {
                        ytw ytwVar3 = ytwVar2;
                        ytwVar3.setValue(Boolean.valueOf(!((Boolean) ytwVar3.getValue()).booleanValue()));
                        Boolean bool = (Boolean) ytwVar3.getValue();
                        bool.getClass();
                        function1.invoke(bool);
                    }
                }
                return Unit.a;
            }
        }, v1bVar, 7);
        return objD == y5b.a ? objD : Unit.a;
    }
}
