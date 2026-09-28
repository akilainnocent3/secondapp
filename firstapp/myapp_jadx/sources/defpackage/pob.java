package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crashInitiated.model.request.PlaceBetPayload;
import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.repository.CrashInitiatedRepository$placeBet$2", f = "CrashInitiatedRepository.kt", l = {87}, m = "invokeSuspend", v = 1)
public final class pob extends tje0 implements Function1<v1b<? super HTTPResponse<CrashInitiatedPlaceBetResponse>>, Object> {
    public int a;
    public final /* synthetic */ sob b;
    public final /* synthetic */ PlaceBetPayload c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pob(sob sobVar, PlaceBetPayload placeBetPayload, v1b<? super pob> v1bVar) {
        super(1, v1bVar);
        this.b = sobVar;
        this.c = placeBetPayload;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new pob(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<CrashInitiatedPlaceBetResponse>> v1bVar) {
        return ((pob) create(v1bVar)).invokeSuspend(Unit.a);
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
        znb znbVarA = this.b.a.a();
        this.a = 1;
        Object objPlaceBet = znbVarA.placeBet(this.c, this);
        return objPlaceBet == y5bVar ? y5bVar : objPlaceBet;
    }
}
