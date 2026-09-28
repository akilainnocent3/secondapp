package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.TopWinResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.sportyherocompose.repository.SportyHeroRepository$getTopWins$2", f = "SportyHeroRepository.kt", l = {40}, m = "invokeSuspend", v = 1)
public final class t4c0 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends TopWinResponse>>>, Object> {
    public int a;
    public final /* synthetic */ h5c0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4c0(h5c0 h5c0Var, String str, String str2, v1b v1bVar) {
        super(1, v1bVar);
        this.b = h5c0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new t4c0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends TopWinResponse>>> v1bVar) {
        return ((t4c0) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objA = fjlVarA.a(this.c, 0, 50, this.d, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
