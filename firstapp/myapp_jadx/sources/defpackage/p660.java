package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.rush.model.response.RushCoeffListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.data.RushRepository$getCoeffList$2", f = "RushRepository.kt", l = {77}, m = "invokeSuspend", v = 1)
public final class p660 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends RushCoeffListResponse>>>, Object> {
    public int a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new p660(1, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends RushCoeffListResponse>>> v1bVar) {
        return ((p660) create(v1bVar)).invokeSuspend(Unit.a);
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
        j660 j660VarN = on0.n();
        this.a = 1;
        Object coeffList = j660VarN.getCoeffList("20", this);
        return coeffList == y5bVar ? y5bVar : coeffList;
    }
}
