package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.domain.IvGetUserCheckUseCase$invoke$3", f = "IvGetUserCheckUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j4p extends tje0 implements gaj<myh<? super lk50<? extends Unit>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4p(Function0<Unit> function0, v1b<? super j4p> v1bVar) {
        super(3, v1bVar);
        this.a = function0;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends Unit>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new j4p(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.invoke();
        return Unit.a;
    }
}
