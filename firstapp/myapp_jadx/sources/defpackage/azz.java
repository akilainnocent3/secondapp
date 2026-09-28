package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$setPhoneDefault$2", f = "PatronRepositoryImpl.kt", l = {435}, m = "invokeSuspend", v = 2)
public final class azz extends tje0 implements Function2<v5b, v1b<? super BaseResponse<Object>>, Object> {
    public int a;
    public final /* synthetic */ nyz b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azz(nyz nyzVar, String str, String str2, v1b<? super azz> v1bVar) {
        super(2, v1bVar);
        this.b = nyzVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new azz(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<Object>> v1bVar) {
        return ((azz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.d;
        nyz nyzVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            xxz xxzVar = nyzVar.a;
            this.a = 1;
            obj = xxzVar.a1(this.c, str, this);
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
            wwd0 wwd0Var = nyzVar.v;
            wwd0Var.setValue(bm50.l((lk50) wwd0Var.getValue(), new zyz(str, 0)));
        }
        return baseResponse;
    }
}
