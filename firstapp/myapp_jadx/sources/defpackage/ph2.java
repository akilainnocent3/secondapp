package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.betbuilder.handler.BetBuilderSelectionHandlerImpl$initBetBuilderSelection$2", f = "BetBuilderSelectionHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ph2 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ qh2 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(qh2 qh2Var, String str, v1b<? super ph2> v1bVar) {
        super(2, v1bVar);
        this.b = qh2Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ph2 ph2Var = new ph2(this.b, this.c, v1bVar);
        ph2Var.a = ((Boolean) obj).booleanValue();
        return ph2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((ph2) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.d.W0(this.c, z);
        return Unit.a;
    }
}
