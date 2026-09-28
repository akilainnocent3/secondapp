package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.globalpay.data.CPFValidateRequest;
import com.sportybet.android.globalpay.data.CPFValidateResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.data.repo.INTRepoImpl$validateCpf$2", f = "INTRepoImpl.kt", l = {148}, m = "invokeSuspend", v = 2)
public final class owm extends tje0 implements Function2<v5b, v1b<? super BaseResponse<CPFValidateResult>>, Object> {
    public int a;
    public final /* synthetic */ mwm b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owm(mwm mwmVar, String str, String str2, v1b<? super owm> v1bVar) {
        super(2, v1bVar);
        this.b = mwmVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new owm(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<CPFValidateResult>> v1bVar) {
        return ((owm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        wum wumVar = this.b.a;
        CPFValidateRequest cPFValidateRequest = new CPFValidateRequest(this.d);
        this.a = 1;
        Object objF = wumVar.f(this.c, cPFValidateRequest, this);
        return objF == y5bVar ? y5bVar : objF;
    }
}
