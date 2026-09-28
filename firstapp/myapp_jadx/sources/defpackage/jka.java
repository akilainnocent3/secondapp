package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class jka implements PointerInputEventHandler {
    public final /* synthetic */ lk40 a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ lk40 c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ ytw<Boolean> e;
    public final /* synthetic */ ytw<Boolean> f;

    public jka(lk40 lk40Var, Function0<Unit> function0, lk40 lk40Var2, Function0<Unit> function1, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2) {
        this.a = lk40Var;
        this.b = function0;
        this.c = lk40Var2;
        this.d = function1;
        this.e = ytwVar;
        this.f = ytwVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
        final lk40 lk40Var = this.a;
        final Function0<Unit> function0 = this.b;
        final lk40 lk40Var2 = this.c;
        final Function0<Unit> function1 = this.d;
        final ytw<Boolean> ytwVar = this.e;
        final ytw<Boolean> ytwVar2 = this.f;
        Object objD = u4f0.d(u020Var, null, new Function1() { // from class: ika
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lk40 lk40Var3;
                lk40 lk40Var4;
                gly glyVar = (gly) obj;
                ytw ytwVar3 = ytwVar;
                if (((Boolean) ytwVar3.getValue()).booleanValue() && (lk40Var4 = lk40Var) != null && lk40Var4.a(glyVar.a)) {
                    ytwVar3.setValue(Boolean.FALSE);
                    function0.invoke();
                } else {
                    ytw ytwVar4 = ytwVar2;
                    if (((Boolean) ytwVar4.getValue()).booleanValue() && (lk40Var3 = lk40Var2) != null && lk40Var3.a(glyVar.a)) {
                        ytwVar4.setValue(Boolean.FALSE);
                        function1.invoke();
                    }
                }
                return Unit.a;
            }
        }, v1bVar, 7);
        return objD == y5b.a ? objD : Unit.a;
    }
}
