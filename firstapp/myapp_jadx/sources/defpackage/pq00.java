package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase$handleOnReceiveAsync$1", f = "PersonalSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class pq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function0<Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq00(Function0<Unit> function0, v1b<? super pq00> v1bVar) {
        super(2, v1bVar);
        this.b = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pq00 pq00Var = new pq00(this.b, v1bVar);
        pq00Var.a = obj;
        return pq00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Function0<Unit> function0 = this.b;
        try {
            zi50.a aVar = zi50.b;
            function0.invoke();
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.d(a320.a("handleOnReceiveAsync error ", thA), new Object[0]);
        }
        return Unit.a;
    }
}
