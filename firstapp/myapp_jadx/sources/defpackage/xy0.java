package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.assets.AssetsInfoRepositoryImpl$getAssetsInfoLegacy$2", f = "AssetsInfoRepositoryImpl.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class xy0 extends tje0 implements Function2<v5b, v1b<? super ng50<AssetsInfo>>, Object> {
    public int a;
    public final /* synthetic */ wy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(wy0 wy0Var, v1b<? super xy0> v1bVar) {
        super(2, v1bVar);
        this.b = wy0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xy0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ng50<AssetsInfo>> v1bVar) {
        return ((xy0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                pr10 pr10Var = this.b.a;
                this.a = 1;
                obj = pr10Var.b(null, this);
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
            AssetsInfo assetsInfo = (AssetsInfo) ((BaseResponse) obj).data;
            return assetsInfo != null ? new ng50.b(assetsInfo, null) : new ng50.a("No data", 6, null);
        } catch (Exception e) {
            return new ng50.a(String.valueOf(e.getMessage()), 4, e);
        }
    }
}
