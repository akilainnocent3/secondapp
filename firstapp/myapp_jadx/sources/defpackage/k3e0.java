package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class k3e0 implements PointerInputEventHandler {
    public final /* synthetic */ ytw<Float> a;
    public final /* synthetic */ Function0<Unit> b;

    public k3e0(isw iswVar, Function0 function0) {
        this.a = iswVar;
        this.b = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j3e0] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        final ytw<Float> ytwVar = this.a;
        final Function0<Unit> function0 = this.b;
        return y8f.g(u020Var, new Function0() { // from class: j3e0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ytw ytwVar2 = ytwVar;
                if (((Number) ytwVar2.getValue()).floatValue() > 300.0f) {
                    function0.invoke();
                } else {
                    ytwVar2.setValue(Float.valueOf(0.0f));
                }
                return Unit.a;
            }
        }, new uqx(ytwVar, 1), v1bVar, 5);
    }
}
