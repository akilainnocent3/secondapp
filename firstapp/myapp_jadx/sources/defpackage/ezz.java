package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.BindNewPhoneApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl$verifyPhoneCanBeBound$2", f = "PatronRepositoryImpl.kt", l = {466}, m = "invokeSuspend", v = 2)
public final class ezz extends tje0 implements Function2<v5b, v1b<? super BindNewPhoneApiResult>, Object> {
    public int a;
    public final /* synthetic */ nyz b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezz(nyz nyzVar, String str, String str2, v1b<? super ezz> v1bVar) {
        super(2, v1bVar);
        this.b = nyzVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ezz(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BindNewPhoneApiResult> v1bVar) {
        return ((ezz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        nyz nyzVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                xxz xxzVar = nyzVar.a;
                String str = this.c;
                String str2 = this.d;
                this.a = 1;
                obj = xxzVar.G(str, str2, this);
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
            return nyz.I0(new Integer(baseResponse.bizCode), baseResponse.message);
        } catch (Throwable th) {
            itf0.a.e(th);
            return new BindNewPhoneApiResult.UnknownError(null);
        }
    }
}
