package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaProvider;
import com.sporty.android.core.model.captcha.CaptchaSiteKeys;
import com.sporty.android.core.model.captcha.SiteKeys;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kd6 implements Function1 {
    public final /* synthetic */ fe6 a;
    public final /* synthetic */ et7 b;

    public /* synthetic */ kd6(fe6 fe6Var, et7 et7Var) {
        this.a = fe6Var;
        this.b = et7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        SiteKeys thirdParties = ((CaptchaSiteKeys) n52.b(baseResponse)).getThirdParties();
        if (thirdParties == null) {
            return new qu90(Boolean.TRUE);
        }
        ArrayList arrayList = new ArrayList();
        String googleSiteKey = thirdParties.getGoogleSiteKey();
        final String cloudflareSiteKey = thirdParties.getCloudflareSiteKey();
        final fe6 fe6Var = this.a;
        for (jd6 jd6Var : fe6Var.a) {
            if (jd6Var.d() == CaptchaProvider.GoogleRecaptchaEnterprise.getId() && googleSiteKey != null) {
                arrayList.add(jd6Var.c(googleSiteKey));
            } else if (jd6Var.d() == CaptchaProvider.Cloudflare.getId() && cloudflareSiteKey != null) {
                final dq40 dq40Var = new dq40();
                final et7 et7Var = this.b;
                arrayList.add(new cu90(new au90(new bv90() { // from class: od6
                    /* JADX WARN: Type inference failed for: r5v2, types: [T, jvd0] */
                    @Override // defpackage.bv90
                    public final void a(au90.a aVar) {
                        dq40Var.a = ej5.c(et7Var, null, null, new ne6(fe6Var, cloudflareSiteKey, aVar, null), 3);
                    }
                }), new ib() { // from class: pd6
                    @Override // defpackage.ib
                    public final void run() {
                        c9p c9pVar = (c9p) dq40Var.a;
                        if (c9pVar != null) {
                            c9pVar.cancel((CancellationException) null);
                        }
                    }
                }));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList != null ? new lw90(arrayList, new ce6(new be6())) : new qu90(Boolean.TRUE);
    }
}
