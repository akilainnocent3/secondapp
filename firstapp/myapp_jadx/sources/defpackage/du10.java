package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.SetBankAssetAsDefaultRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl$setBankAssetAsDefault$2", f = "PocketRepositoryImpl.kt", l = {533}, m = "invokeSuspend", v = 2)
public final class du10 extends tje0 implements Function1<v1b<? super BaseResponse<Object>>, Object> {
    public int a;
    public final /* synthetic */ ms10 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du10(ms10 ms10Var, int i, int i2, int i3, v1b<? super du10> v1bVar) {
        super(1, v1bVar);
        this.b = ms10Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new du10(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super BaseResponse<Object>> v1bVar) {
        return ((du10) create(v1bVar)).invokeSuspend(Unit.a);
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
        pr10 pr10Var = this.b.a;
        SetBankAssetAsDefaultRequest setBankAssetAsDefaultRequest = new SetBankAssetAsDefaultRequest(this.d, this.e);
        this.a = 1;
        Object objZ = pr10Var.Z(this.c, setBankAssetAsDefaultRequest, this);
        return objZ == y5bVar ? y5bVar : objZ;
    }
}
