package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoGiftHandlerImpl$collectGiftState$2", f = "BuildAndGoGiftHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yd5 extends tje0 implements Function2<fe5, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ be5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd5(be5 be5Var, v1b<? super yd5> v1bVar) {
        super(2, v1bVar);
        this.b = be5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yd5 yd5Var = new yd5(this.b, v1bVar);
        yd5Var.a = obj;
        return yd5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fe5 fe5Var, v1b<? super Unit> v1bVar) {
        return ((yd5) create(fe5Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        fe5 fe5Var = (fe5) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, fe5Var));
        return Unit.a;
    }
}
