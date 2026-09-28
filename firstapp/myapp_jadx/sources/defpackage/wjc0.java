package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSessionDataHandlerImpl$showTeamSelection$2", f = "SportyLegendsSessionDataHandlerImpl.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class wjc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ akc0 b;
    public final /* synthetic */ bkc0.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjc0(akc0 akc0Var, bkc0.c cVar, v1b<? super wjc0> v1bVar) {
        super(2, v1bVar);
        this.b = akc0Var;
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wjc0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wjc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objG;
        Object value2;
        Object value3;
        akc0 akc0Var = this.b;
        wwd0 wwd0Var = akc0Var.f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, bkc0.b.a));
            mgc0 mgc0Var = akc0Var.a;
            this.a = 1;
            objG = mgc0Var.g(this);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objG = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objG instanceof zi50.b)) {
            kdc0 kdc0Var = (kdc0) objG;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new bkc0.c(pjc0.a(this.c.a, null, kdc0Var, 15), uhc0.a)));
        }
        Throwable thA = zi50.a(objG);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new bkc0.a(new qjc0.a(thA))));
        }
        return Unit.a;
    }
}
