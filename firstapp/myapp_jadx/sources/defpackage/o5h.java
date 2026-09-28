package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.fruithunt.network.models.FHUserDataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.network.repositories.FHRemoteRepo$userUpdate$2", f = "FHRemoteRepo.kt", l = {51}, m = "invokeSuspend", v = 1)
public final class o5h extends tje0 implements Function1<v1b<? super HTTPResponse<FHUserDataResponse>>, Object> {
    public int a;
    public final /* synthetic */ FHUserDataResponse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5h(FHUserDataResponse fHUserDataResponse, v1b<? super o5h> v1bVar) {
        super(1, v1bVar);
        this.b = fHUserDataResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new o5h(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<FHUserDataResponse>> v1bVar) {
        return ((o5h) create(v1bVar)).invokeSuspend(Unit.a);
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
        i5h i5hVarG = on0.g();
        this.a = 1;
        Object objA = i5hVarG.a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
