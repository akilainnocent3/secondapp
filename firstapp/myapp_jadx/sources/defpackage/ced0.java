package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.repository.SportyTvDataStoreImpl$setNotificationToggle$2", f = "SportyTvDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ced0 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ced0(boolean z, v1b<? super ced0> v1bVar) {
        super(2, v1bVar);
        this.b = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ced0 ced0Var = new ced0(this.b, v1bVar);
        ced0Var.a = obj;
        return ced0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((ced0) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jtwVar.g(tn20.a, Boolean.valueOf(this.b));
        return Unit.a;
    }
}
