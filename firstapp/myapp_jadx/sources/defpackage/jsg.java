package defpackage;

import com.sportybet.plugin.event.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel$fetchLiveStreamData$1", f = "EventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jsg extends tje0 implements Function2<qus, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsg(v1b v1bVar, e eVar) {
        super(2, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jsg jsgVar = new jsg(v1bVar, this.b);
        jsgVar.a = obj;
        return jsgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qus qusVar, v1b<? super Unit> v1bVar) {
        return ((jsg) create(qusVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qus qusVar = (qus) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.g0.m(qusVar);
        return Unit.a;
    }
}
