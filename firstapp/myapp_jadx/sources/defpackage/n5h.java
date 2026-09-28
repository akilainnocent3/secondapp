package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.fruithunt.network.models.FHPlaceBetRequest;
import com.sportygames.fruithunt.network.models.FHPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.network.repositories.FHRemoteRepo$placeBet$2", f = "FHRemoteRepo.kt", l = {57}, m = "invokeSuspend", v = 1)
public final class n5h extends tje0 implements Function1<v1b<? super HTTPResponse<FHPlaceBetResponse>>, Object> {
    public int a;
    public final /* synthetic */ FHPlaceBetRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5h(FHPlaceBetRequest fHPlaceBetRequest, v1b<? super n5h> v1bVar) {
        super(1, v1bVar);
        this.b = fHPlaceBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new n5h(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<FHPlaceBetResponse>> v1bVar) {
        return ((n5h) create(v1bVar)).invokeSuspend(Unit.a);
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
        Object objB = i5hVarG.b(this.b, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
