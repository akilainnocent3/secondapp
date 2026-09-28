package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AppsFlyerLib;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xv0 implements zqm {
    public static final xv0 a = new xv0();
    public static f00 b;

    @c0d(c = "com.sporty.android.common_analytics.appsflyer.AppsFlyerAnalyticsSource$init$1", f = "AppsFlyerAnalyticsSource.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ f00 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f00 f00Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = f00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            zv0 zv0Var = new zv0();
            Context context = this.a.a;
            appsFlyerLib.init("DbKpikSBdkHT7RKq9SEpJA", zv0Var, context);
            AppsFlyerLib.getInstance().start(context);
            return Unit.a;
        }
    }

    public static String f() {
        f00 f00Var = b;
        if (f00Var == null) {
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
        int iOrdinal = f00Var.g.b().h().ordinal();
        if (iOrdinal == 0) {
            return "website";
        }
        if (iOrdinal == 1) {
            return "play_store";
        }
        if (iOrdinal == 2) {
            return "app_gallery";
        }
        if (iOrdinal == 3) {
            return "palm_store";
        }
        uhc.a();
        return null;
    }

    public static /* synthetic */ void h(xv0 xv0Var, String str) {
        xv0Var.g(str, new LinkedHashMap());
    }

    @Override // defpackage.zqm
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AppsFlyerLib.getInstance().setCurrencyCode(str);
    }

    @Override // defpackage.zqm
    public final void b(String str, Map<String, ? extends Object> map) {
        str.getClass();
        map.getClass();
        if (b == null) {
            return;
        }
        if (str.equals(AnalyticsEvent.REGISTER_STARTED)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (b == null) {
                Intrinsics.n("dependenciesProvider");
                throw null;
            }
            linkedHashMap.put(AFInAppEventParameterName.REGISTRATION_METHOD, "sportybet");
            g("registrationStarted", linkedHashMap);
            return;
        }
        if (str.equals(AnalyticsEvent.REGISTER_COMPLETED)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
            if (b == null) {
                Intrinsics.n("dependenciesProvider");
                throw null;
            }
            linkedHashMap2.put(AFInAppEventParameterName.REGISTRATION_METHOD, "sportybet");
            if (Boolean.parseBoolean(String.valueOf(map.get(AnalyticsParam.REGISTERED_FROM_FACEBOOK)))) {
                g("fb_mobile_complete_registration", linkedHashMap2);
            }
            g(AFInAppEventType.COMPLETE_REGISTRATION, linkedHashMap2);
            return;
        }
        if (str.equals(AnalyticsEvent.LOGIN)) {
            h(this, AFInAppEventType.LOGIN);
            return;
        }
        if (str.equals(AnalyticsEvent.BR_REGISTER_STARTED)) {
            h(this, AnalyticsEvent.BR_REGISTER_STARTED);
            return;
        }
        if (str.equals(AnalyticsEvent.FIRST_DEPOSIT)) {
            h(this, "event_first_deposit");
            return;
        }
        if (str.equals(AnalyticsEvent.DEPOSIT)) {
            h(this, "af_deposit");
            return;
        }
        ts40.m.a.getClass();
        if (str.equals("af_account_created")) {
            h(this, "af_account_created");
        }
    }

    @Override // defpackage.zqm
    public final void d(String str, String str2) {
        str2.getClass();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        b(str, o2gVar);
    }

    @Override // defpackage.zqm
    public final void e(f00 f00Var) {
        b = f00Var;
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        appsFlyerLib.setDebugLog(true);
        if (f00Var.g.a().e()) {
            appsFlyerLib.setDebugLog(true);
        }
        appsFlyerLib.setOutOfStore(f());
        setUserId(f00Var.b.getUserId());
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(null), null, null, new a(f00Var, null), 3);
    }

    public final void g(String str, LinkedHashMap linkedHashMap) {
        f00 f00Var = b;
        if (f00Var == null) {
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
        setUserId(f00Var.b.getUserId());
        linkedHashMap.put("app_download_source", f());
        if (b == null) {
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
        linkedHashMap.put(AFInAppEventParameterName.AF_CHANNEL, "sportybet");
        f00 f00Var2 = b;
        if (f00Var2 == null) {
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
        String code = f00Var2.c.getCountryCode().getCode();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase = code.toUpperCase(locale);
        upperCase.getClass();
        linkedHashMap.put(AFInAppEventParameterName.COUNTRY, upperCase);
        LinkedHashMap linkedHashMapA = omh0.a(nnn.d, b.k("utm_source", "gclid"));
        if (linkedHashMapA != null && !linkedHashMapA.isEmpty()) {
            String str2 = (String) linkedHashMapA.get("utm_source");
            if (!TextUtils.isEmpty(str2)) {
                linkedHashMap.put("utm_source", str2);
            }
            String str3 = (String) linkedHashMapA.get("gclid");
            if (!TextUtils.isEmpty(str3)) {
                linkedHashMap.put("gclid", str3);
            }
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        f00 f00Var3 = b;
        if (f00Var3 != null) {
            appsFlyerLib.logEvent(f00Var3.a, str, linkedHashMap);
        } else {
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
    }

    @Override // defpackage.zqm
    public final void setUserId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AppsFlyerLib.getInstance().setCustomerUserId(str);
    }

    @Override // defpackage.zqm
    public final void c(Context context, String str) {
    }
}
