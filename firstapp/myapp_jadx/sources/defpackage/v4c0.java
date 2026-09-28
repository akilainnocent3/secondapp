package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.TopWinResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.repository.SportyHeroRepository$getTopWinsDetail$2", f = "SportyHeroRepository.kt", l = {46}, m = "invokeSuspend", v = 1)
public final class v4c0 extends tje0 implements Function1<v1b<? super HTTPResponse<TopWinResponse>>, Object> {
    public int a;
    public final /* synthetic */ h5c0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4c0(h5c0 h5c0Var, String str, v1b<? super v4c0> v1bVar) {
        super(1, v1bVar);
        this.b = h5c0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new v4c0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<TopWinResponse>> v1bVar) {
        return ((v4c0) create(v1bVar)).invokeSuspend(Unit.a);
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
        fjl fjlVarA = this.b.a.a();
        this.a = 1;
        Object objD = fjlVarA.d(this.c, this);
        return objD == y5bVar ? y5bVar : objD;
    }
}
