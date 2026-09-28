package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.BonusCupRepository$getCurrentGameState$2", f = "BonusCupRepository.kt", l = {56}, m = "invokeSuspend", v = 1)
public final class eo4 extends tje0 implements Function1<v1b<? super HTTPResponse<op4>>, Object> {
    public int a;
    public final /* synthetic */ lo4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo4(lo4 lo4Var, v1b<? super eo4> v1bVar) {
        super(1, v1bVar);
        this.b = lo4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new eo4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<op4>> v1bVar) {
        return ((eo4) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objB = wh4Var.b(this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
