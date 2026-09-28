package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.BonusCupRepository$claimReward$2", f = "BonusCupRepository.kt", l = {62}, m = "invokeSuspend", v = 1)
public final class co4 extends tje0 implements Function1<v1b<? super HTTPResponse<ri4>>, Object> {
    public int a;
    public final /* synthetic */ lo4 b;
    public final /* synthetic */ yo4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co4(lo4 lo4Var, yo4 yo4Var, v1b<? super co4> v1bVar) {
        super(1, v1bVar);
        this.b = lo4Var;
        this.c = yo4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new co4(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<ri4>> v1bVar) {
        return ((co4) create(v1bVar)).invokeSuspend(Unit.a);
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
        wh4 wh4Var = (wh4) this.b.f.getValue();
        this.a = 1;
        Object objD = wh4Var.d(this.c, this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
