package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.handler.topappbar.InstantWinTopAppBarUserStatusHandlerImpl$init$2", f = "InstantWinTopAppBarUserStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hqo extends tje0 implements Function2<fqo.c, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ kqo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqo(kqo kqoVar, v1b<? super hqo> v1bVar) {
        super(2, v1bVar);
        this.b = kqoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hqo hqoVar = new hqo(this.b, v1bVar);
        hqoVar.a = obj;
        return hqoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(fqo.c cVar, v1b<? super Unit> v1bVar) {
        return ((hqo) create(cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        fqo.c cVar = (fqo.c) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, cVar));
        return Unit.a;
    }
}
