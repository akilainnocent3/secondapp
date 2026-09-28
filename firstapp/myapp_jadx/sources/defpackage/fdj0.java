package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingStakeInputHandlerImpl$init$1", f = "WinningPopupDoubleOrNothingStakeInputHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fdj0 extends tje0 implements Function2<j4f, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ idj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdj0(idj0 idj0Var, v1b<? super fdj0> v1bVar) {
        super(2, v1bVar);
        this.b = idj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fdj0 fdj0Var = new fdj0(this.b, v1bVar);
        fdj0Var.a = obj;
        return fdj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(j4f j4fVar, v1b<? super Unit> v1bVar) {
        return ((fdj0) create(j4fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        String plainString;
        j4f j4fVar = (j4f) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        idj0 idj0Var = this.b;
        wwd0 wwd0Var = idj0Var.c;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.FALSE));
        wwd0 wwd0Var2 = idj0Var.d;
        do {
            value2 = wwd0Var2.getValue();
            plainString = s5y.a((BigDecimal) wl8.e(j4fVar.g, j4fVar.e)).toPlainString();
            plainString.getClass();
        } while (!wwd0Var2.g(value2, plainString));
        return Unit.a;
    }
}
