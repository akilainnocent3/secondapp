package defpackage;

import android.content.Context;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ha implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        eo20[] eo20VarArr = eo20.a;
        Set setV = ay0.V(new String[]{AnalyticsParam.EVENT_STATUS, "otp_user_id", "otpCode", "otp_token", "otpTime", "otp_reach_limit", "otp_message", "mobile", "accessToken", "refreshToken", "simpleToken", "registrationStatus"});
        setV.getClass();
        return b.k(new m390(context, "accountHelper", null, null, sex.b(new o8e(setV, 1), null, 2), 12), new m390(context, "show_balance", null, null, sex.b(null, new oex(), 1), 12), sex.a(context, "com.sportybet.android.country.CountryManager", jpu.b(new Pair("country", "country_code"))));
    }
}
