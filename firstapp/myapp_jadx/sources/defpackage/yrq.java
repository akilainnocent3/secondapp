package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lotteryresult.presentation.LNLotteryResultScreenKt$LNLotteryResultScreen$1$1$1$1", f = "LNLotteryResultScreen.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class yrq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrq(zzr zzrVar, v1b<? super yrq> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yrq(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yrq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            uv60 uv60Var = zzr.x;
            if (this.b.k(0, 0, this) == y5bVar) {
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
