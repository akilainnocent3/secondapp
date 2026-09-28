package defpackage;

import android.os.Build;
import com.sporty.android.core.model.MyLog;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class ld8 implements Interceptor {
    public final psm a;
    public final aoh0 b;
    public final ysm c;
    public final yi5 d;
    public final str<mgb0> e;

    public ld8(psm psmVar, aoh0 aoh0Var, ysm ysmVar, yi5 yi5Var, str<mgb0> strVar) {
        psmVar.getClass();
        ysmVar.getClass();
        yi5Var.getClass();
        strVar.getClass();
        this.a = psmVar;
        this.b = aoh0Var;
        this.c = ysmVar;
        this.d = yi5Var;
        this.e = strVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderHeader = chain.request().newBuilder().header("ClientId", "app");
        HttpUrl httpUrlUrl = chain.request().url();
        try {
            String str = Build.MODEL;
            str.getClass();
            builderHeader.header("PhoneModel", str);
        } catch (Exception unused) {
        }
        String strHeader = chain.request().header("Platform");
        if (strHeader == null || strHeader.length() == 0) {
            builderHeader.header("Platform", "android");
        }
        ysm ysmVar = this.c;
        Request.Builder builderHeader2 = builderHeader.header("DeviceId", ysmVar.a().a);
        yi5 yi5Var = this.d;
        Request.Builder builderHeader3 = builderHeader2.header("AppVersion", yi5Var.b().a()).header("Channel", "sportybet").header("ApiLevel", "13");
        psm psmVar = this.a;
        Request.Builder builderHeader4 = builderHeader3.header("OperId", psmVar.k());
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        builderHeader4.header("OSVersion", str2).header("download-source", yi5Var.b().l()).header("Device-Id", ysmVar.a().a).header("App-Version", yi5Var.b().a());
        String str3 = (String) this.b.d.getValue();
        if (str3.length() != 0) {
            builderHeader.header("User-Agent", str3);
        }
        str<mgb0> strVar = this.e;
        String userId = strVar.get().getUserId();
        if (userId != null && userId.length() != 0 && !c.k(httpUrlUrl.encodedPath(), "patron/accessToken/delete", false)) {
            builderHeader.header("userId", userId);
        }
        String strB = psmVar.b();
        if (strB.length() != 0) {
            builderHeader.header("currency", strB);
        }
        builderHeader.header("countryCode", psmVar.getCountryCode().getCode());
        String languageCode = strVar.get().getLanguageCode();
        if (languageCode.length() > 0) {
            builderHeader.header("accept-language", languageCode);
        }
        if (StringsKt.M(httpUrlUrl.encodedPath(), "/chat/match", false)) {
            builderHeader.header("countryCode", psmVar.Q());
        }
        String strEncodedPath = chain.request().url().encodedPath();
        if (c.k(strEncodedPath, "patron/email/auth/verify", false) || c.k(strEncodedPath, "patron/register/complete", false) || c.k(strEncodedPath, "patron/register/br/otp/verify", false) || c.k(strEncodedPath, "patron/accessToken", false) || c.k(strEncodedPath, "patron/account", false) || c.k(strEncodedPath, "patron/register/preRegister", false) || c.k(strEncodedPath, "patron/kyc/simple/submit", false) || c.k(strEncodedPath, "patron/email/auth/register", false) || c.k(strEncodedPath, "patron/verifyCode/sms", false) || c.k(strEncodedPath, "bankTrades/bankTrade/deposit", false) || c.k(strEncodedPath, "patron/email/auth/token", false) || c.k(strEncodedPath, "patron/register/start", false)) {
            soh.c.getClass();
            String str4 = soh.f;
            if (str4 != null) {
                builderHeader.header("AppInstanceId", str4);
            }
        }
        Response responseProceed = chain.proceed(builderHeader.build());
        String strHeader$default = Response.header$default(responseProceed, "visitor-country", null, 2, null);
        if (strHeader$default != null) {
            List list = (List) up40.a.getValue();
            String upperCase = strHeader$default.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            boolean zContains = list.contains(upperCase);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_GEO);
            aVar.g("got user GEO info, country: %s, AFCountry: %b", strHeader$default, Boolean.valueOf(zContains));
            vn20.g("com.sportybet.android.country.CountryManager", "IS_REDIRECT", zContains, false);
        }
        return responseProceed;
    }
}
