package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.common.AssetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.data.CommonChannelRepositoryImpl$getAssetData$2", f = "CommonChannelRepositoryImpl.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class db8 extends tje0 implements Function2<v5b, v1b<? super AssetData>, Object> {
    public int a;
    public final /* synthetic */ cb8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db8(cb8 cb8Var, v1b<? super db8> v1bVar) {
        super(2, v1bVar);
        this.b = cb8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new db8(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super AssetData> v1bVar) {
        return ((db8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                pr10 pr10Var = this.b.b;
                this.a = 1;
                obj = pr10Var.h0(4, 1, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse.isSuccessful()) {
                return baseResponse.data;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
