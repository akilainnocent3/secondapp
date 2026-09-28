package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.sportyherov2.remote.models.FairnessResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportyherov2.repositories.SportyHeroRepository$fairness$2", f = "SportyHeroRepository.kt", l = {163}, m = "invokeSuspend", v = 1)
public final class d4c0 extends tje0 implements Function1<v1b<? super HTTPResponse<FairnessResponse>>, Object> {
    public int a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4c0(String str, v1b<? super d4c0> v1bVar) {
        super(1, v1bVar);
        this.b = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new d4c0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<FairnessResponse>> v1bVar) {
        return ((d4c0) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        x3c0 x3c0VarR = on0.r();
        this.a = 1;
        Object objFairness = x3c0VarR.fairness(this.b, this);
        return objFairness == y5bVar ? y5bVar : objFairness;
    }
}
