package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.antest.CampaignVariantVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.antest.repository.AnTestRepositoryImpl$fetchAssignedCampaignVariant$3", f = "AnTestRepositoryImpl.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class nz extends tje0 implements Function1<v1b<? super BaseResponse<CampaignVariantVO>>, Object> {
    public int a;
    public final /* synthetic */ tz b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(tz tzVar, String str, v1b<? super nz> v1bVar) {
        super(1, v1bVar);
        this.b = tzVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new nz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<CampaignVariantVO>> v1bVar) {
        return ((nz) create(v1bVar)).invokeSuspend(Unit.a);
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
        a86 a86Var = this.b.b;
        this.a = 1;
        Object objC = a86Var.a.c(this.c, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
