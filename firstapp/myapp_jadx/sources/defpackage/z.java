package defpackage;

import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.commons.remote.model.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.anTesting.data.repository.ANTestingRepositoryImpl$getParticipateInfo$2", f = "ANTestingRepositoryImpl.kt", l = {16}, m = "invokeSuspend", v = 1)
public final class z extends tje0 implements Function1<v1b<? super HTTPResponse<CampaignParticipateV2>>, Object> {
    public int a;
    public final /* synthetic */ c0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, String str, v1b<? super z> v1bVar) {
        super(1, v1bVar);
        this.b = c0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new z(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<CampaignParticipateV2>> v1bVar) {
        return ((z) create(v1bVar)).invokeSuspend(Unit.a);
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
        p pVar = this.b.a;
        this.a = 1;
        Object objB = pVar.b(this.c, this);
        return objB == y5bVar ? y5bVar : objB;
    }
}
