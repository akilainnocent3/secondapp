package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.BonusCupRepository$startRound$2", f = "BonusCupRepository.kt", l = {50}, m = "invokeSuspend", v = 1)
public final class io4 extends tje0 implements Function1<v1b<? super HTTPResponse<oo4>>, Object> {
    public int a;
    public final /* synthetic */ lo4 b;
    public final /* synthetic */ po4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io4(lo4 lo4Var, po4 po4Var, v1b<? super io4> v1bVar) {
        super(1, v1bVar);
        this.b = lo4Var;
        this.c = po4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new io4(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<oo4>> v1bVar) {
        return ((io4) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objE = wh4Var.e(this.c, this);
        return objE == y5bVar ? y5bVar : objE;
    }
}
