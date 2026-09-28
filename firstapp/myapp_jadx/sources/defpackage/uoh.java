package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uoh implements zqm {
    public static final uoh a = new uoh();
    public static f00 b;

    public static void f(Context context, String str, Bundle bundle) {
        Bundle bundle2;
        Context context2;
        str.getClass();
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, MyLog.TAG_REPORT, "log event, name: ", str, ", extra: ");
        sbA.append(bundle);
        aVar.a(sbA.toString(), new Object[0]);
        if (bundle == null) {
            try {
                bundle2 = new Bundle();
            } catch (Exception e) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_REPORT);
                aVar2.p(e, "Failed to log event", new Object[0]);
                return;
            }
        } else {
            bundle2 = bundle;
        }
        try {
            f00 f00Var = b;
            if (f00Var == null) {
                Intrinsics.n("dependenciesProvider");
                throw null;
            }
            String lastUserId = f00Var.b.getLastUserId();
            lastUserId.getClass();
            if (!TextUtils.isEmpty(lastUserId)) {
                bundle2.putString(AnalyticsParam.EVENT_PARAM_USER_ID, lastUserId);
                if (context == null) {
                    f00 f00Var2 = b;
                    if (f00Var2 == null) {
                        Intrinsics.n("dependenciesProvider");
                        throw null;
                    }
                    context2 = f00Var2.a;
                } else {
                    context2 = context;
                }
                p1l0 p1l0Var = FirebaseAnalytics.getInstance(context2).a;
                p1l0Var.getClass();
                p1l0Var.c(new wxk0(p1l0Var, lastUserId));
            }
            if (context == null) {
                f00 f00Var3 = b;
                if (f00Var3 == null) {
                    Intrinsics.n("dependenciesProvider");
                    throw null;
                }
                context = f00Var3.a;
            }
            p1l0 p1l0Var2 = FirebaseAnalytics.getInstance(context).a;
            p1l0Var2.getClass();
            p1l0Var2.c(new g0l0(p1l0Var2, null, str, bundle, false));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void g(String str, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        f(null, str, bundle);
    }

    @Override // defpackage.zqm
    public final void a(String str) {
    }

    @Override // defpackage.zqm
    public final void c(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsParam.EVENT_PARAM_VERSION_SDK, String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString(AnalyticsParam.EVENT_PARAM_BUILD_MODEL, Build.MODEL);
        f00 f00Var = b;
        if (f00Var == null) {
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
        bundle.putString("app_version", f00Var.g.b().a());
        f(context, str, bundle);
    }

    @Override // defpackage.zqm
    public final void d(String str, String str2) {
        str2.getClass();
        b(str, jpu.b(new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, str2)));
    }

    @Override // defpackage.zqm
    public final void e(f00 f00Var) {
        b = f00Var;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(f00Var.a);
        firebaseAnalytics.getClass();
        String code = f00Var.c.getCountryCode().getCode();
        p1l0 p1l0Var = firebaseAnalytics.a;
        p1l0Var.getClass();
        p1l0Var.c(new jxk0(p1l0Var, null, "country", code, false));
        p1l0Var.getClass();
        p1l0Var.c(new jxk0(p1l0Var, null, AppsFlyerProperties.CHANNEL, "sportybet", false));
        Boolean boolValueOf = Boolean.valueOf(f00Var.g.a().f());
        p1l0Var.getClass();
        p1l0Var.c(new zxk0(p1l0Var, boolValueOf));
    }

    @Override // defpackage.zqm
    public final void setUserId(String str) {
        try {
            f00 f00Var = b;
            if (f00Var == null) {
                Intrinsics.n("dependenciesProvider");
                throw null;
            }
            p1l0 p1l0Var = FirebaseAnalytics.getInstance(f00Var.a).a;
            p1l0Var.getClass();
            p1l0Var.c(new wxk0(p1l0Var, str));
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_REPORT);
            aVar.p(e, "Failed to set user Id", new Object[0]);
        }
    }

    @Override // defpackage.zqm
    public final void b(String str, Map<String, ? extends Object> map) {
        str.getClass();
        map.getClass();
        int iHashCode = str.hashCode();
        Bundle bundleA = null;
        if (iHashCode != 151229391) {
            if (iHashCode != 375209669) {
                if (iHashCode == 525102991 && str.equals(xOgHBQVl.NPumrUlYKO)) {
                    f00 f00Var = b;
                    if (f00Var != null) {
                        SharedPreferences sharedPreferences = f00Var.a.getSharedPreferences("sportybet", 0);
                        sharedPreferences.getClass();
                        if (!sharedPreferences.getBoolean("google_analytics.event.fire_by_backend", false)) {
                            g("android_reg_complete", null, 6);
                            return;
                        }
                        return;
                    }
                    Intrinsics.n("dependenciesProvider");
                    throw null;
                }
            } else if (str.equals(AnalyticsEvent.REGISTER_STARTED)) {
                if (map.isEmpty()) {
                    map = null;
                }
                if (map != null) {
                    Pair[] pairArr = (Pair[]) mpu.n(map).toArray(new Pair[0]);
                    bundleA = vj5.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                }
                g("android_reg_start", bundleA, 4);
                return;
            }
        } else if (str.equals(AnalyticsEvent.FIRST_DEPOSIT)) {
            f00 f00Var2 = b;
            if (f00Var2 != null) {
                SharedPreferences sharedPreferences2 = f00Var2.a.getSharedPreferences("sportybet", 0);
                sharedPreferences2.getClass();
                if (!sharedPreferences2.getBoolean("google_analytics.event.fire_by_backend", false)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(AnalyticsParam.EVENT_PARAM_RESULT, "first_deposit_success");
                    g("event_first_deposit", bundle, 4);
                    return;
                }
                return;
            }
            Intrinsics.n("dependenciesProvider");
            throw null;
        }
        Pair[] pairArr2 = (Pair[]) mpu.n(map).toArray(new Pair[0]);
        g(str, vj5.a((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)), 4);
    }
}
