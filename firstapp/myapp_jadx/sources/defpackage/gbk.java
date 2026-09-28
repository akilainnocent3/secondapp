package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixPendingDepositsUseCase$getMaxPendingDepositsAsync$1", f = "GetPixPendingDepositsUseCase.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class gbk extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
    public int a;
    public final /* synthetic */ ebk b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbk(ebk ebkVar, int i, v1b<? super gbk> v1bVar) {
        super(2, v1bVar);
        this.b = ebkVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gbk(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
        return ((gbk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        n8k n8kVar = this.b.a;
        this.a = 1;
        Object objA = n8kVar.a(this.c, 5, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
