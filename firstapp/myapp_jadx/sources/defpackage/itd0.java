package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.StakeSafeViewKt$StakeSafeView$1$1", f = "StakeSafeView.kt", l = {79}, m = "invokeSuspend", v = 1)
public final class itd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zzr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itd0(int i, v1b v1bVar, zzr zzrVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new itd0(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((itd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            int i2 = this.b;
            if (i2 > 0) {
                this.a = 1;
                uv60 uv60Var = zzr.x;
                if (this.c.k(i2 - 1, 0, this) == y5bVar) {
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
