package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.evenodd.remote.models.PlaceBetRequest;
import com.sportygames.evenodd.remote.models.PlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.repositories.EvenOddRepository$placeBet$2", f = "EvenOddRepository.kt", l = {38}, m = "invokeSuspend", v = 1)
public final class ehg extends tje0 implements Function1<v1b<? super HTTPResponse<PlaceBetResponse>>, Object> {
    public int a;
    public final /* synthetic */ PlaceBetRequest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehg(PlaceBetRequest placeBetRequest, v1b<? super ehg> v1bVar) {
        super(1, v1bVar);
        this.b = placeBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new ehg(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<PlaceBetResponse>> v1bVar) {
        return ((ehg) create(v1bVar)).invokeSuspend(Unit.a);
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
        wgg wggVarF = on0.f();
        this.a = 1;
        Object objA = wggVarF.a(this.b, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
