package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.speedcontroller.FootballFamilySpeedControllerHandlerImpl$initFootballFamilySpeedControllerHandler$10", f = "FootballFamilySpeedControllerHandlerImpl.kt", l = {121}, m = "invokeSuspend", v = 2)
public final class ygi extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ihi b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ygi(ihi ihiVar, String str, v1b<? super ygi> v1bVar) {
        super(2, v1bVar);
        this.b = ihiVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ygi(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((ygi) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ihi ihiVar = this.b;
            wwd0 wwd0Var = ihiVar.i;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, lni0.a));
            qhi qhiVar = ihiVar.b;
            this.a = 1;
            if (qhiVar.d(this.c, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
