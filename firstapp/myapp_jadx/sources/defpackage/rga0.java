package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.domain.entity.SocialProfileState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialProfileUseCase$getSocialProfileState$1", f = "SocialProfileUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rga0 extends tje0 implements Function2<lk50<? extends AccountInfo>, v1b<? super lyh<? extends lk50<? extends SocialProfileState>>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CountryCodeName c;
    public final /* synthetic */ uga0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rga0(String str, CountryCodeName countryCodeName, uga0 uga0Var, v1b<? super rga0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = countryCodeName;
        this.d = uga0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rga0 rga0Var = new rga0(this.b, this.c, this.d, v1bVar);
        rga0Var.a = obj;
        return rga0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends AccountInfo> lk50Var, v1b<? super lyh<? extends lk50<? extends SocialProfileState>>> v1bVar) {
        return ((rga0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        CountryCodeName countryCodeName = this.c;
        uga0 uga0Var = this.d;
        String str = this.b;
        if (z) {
            return uga0.a(uga0Var, str.equalsIgnoreCase(((AccountInfo) ((lk50.c) lk50Var).a).getNickname()), str, countryCodeName);
        }
        if (lk50Var instanceof lk50.a) {
            return uga0.a(uga0Var, false, str, countryCodeName);
        }
        if (lk50Var instanceof lk50.b) {
            return new gzh(lk50Var);
        }
        uhc.a();
        return null;
    }
}
