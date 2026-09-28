package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.domain.IvGetUserCheckUseCase$invoke$2", f = "IvGetUserCheckUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i4p extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Function0<Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4p(Function0<Unit> function0, v1b<? super i4p> v1bVar) {
        super(2, v1bVar);
        this.b = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i4p i4pVar = new i4p(this.b, v1bVar);
        i4pVar.a = obj;
        return i4pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((i4p) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        Function0<Unit> function0 = this.b;
        if (z || (lk50Var instanceof lk50.a)) {
            function0.invoke();
        } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
