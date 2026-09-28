package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyViewModel$collectAllContentStatusSuccessFlow$1", f = "VirtualLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qli0 extends tje0 implements Function2<thi0.c, v1b<? super Unit>, Object> {
    public final /* synthetic */ hmi0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qli0(v1b v1bVar, hmi0 hmi0Var) {
        super(2, v1bVar);
        this.a = hmi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qli0(v1bVar, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(thi0.c cVar, v1b<? super Unit> v1bVar) {
        return ((qli0) create(cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.z1();
        return Unit.a;
    }
}
