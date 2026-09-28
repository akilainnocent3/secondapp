package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$updateBalance$1", f = "LuckyNumberViewModel.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class h8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f8u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8u(f8u f8uVar, v1b<? super h8u> v1bVar) {
        super(2, v1bVar);
        this.b = f8uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h8u(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f8u f8uVar = this.b;
            if (f8uVar.v.isLogin()) {
                yzh yzhVarA = bm50.a(f8uVar.f.a());
                this.a = 1;
                if (kzh.a(yzhVarA, this) == y5bVar) {
                    return y5bVar;
                }
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
