package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.handler.InstantFootballSettlementHandlerImpl$init$5", f = "InstantFootballSettlementHandlerImpl.kt", l = {172}, m = "invokeSuspend", v = 2)
public final class xqn extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rqn c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqn(rqn rqnVar, String str, v1b<? super xqn> v1bVar) {
        super(2, v1bVar);
        this.c = rqnVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xqn xqnVar = new xqn(this.c, this.d, v1bVar);
        xqnVar.b = obj;
        return xqnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((xqn) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            if (this.c.i(this.d, str, true, this) == y5bVar) {
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
