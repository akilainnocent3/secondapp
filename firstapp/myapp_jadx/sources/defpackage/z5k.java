package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.domain.GetEmailChangeOtpModuleUseCase$invoke$2", f = "GetEmailChangeOtpModuleUseCase.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "invokeSuspend", v = 2)
public final class z5k extends tje0 implements Function2<v5b, v1b<? super OtpModule<OtpData.EmailChange>>, Object> {
    public int a;
    public final /* synthetic */ a6k b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5k(a6k a6kVar, String str, v1b<? super z5k> v1bVar) {
        super(2, v1bVar);
        this.b = a6kVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z5k(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super OtpModule<OtpData.EmailChange>> v1bVar) {
        return ((z5k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        a6k a6kVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = a6kVar.a;
            this.a = 1;
            obj = mgb0Var.getLastAccount(this);
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
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String strP = a6kVar.b.P();
        strP.getClass();
        String str3 = this.c;
        str3.getClass();
        return new OtpModule(new OtpData.EmailChange(strP, str2, j6c.ChangeVerifiedEmail, str3, OTPResult.NoResult.a), new OtpViewModelClasses(jyf.class, zyf.class, d0g.class, vyf.class, czf.class, nwf.class));
    }
}
