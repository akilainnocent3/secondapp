package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Xe extends AbstractC5549zd implements Co {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f96736d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96737e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96738f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96739g = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f96750r = "SESSION_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f96740h = new Ze("PERMISSIONS_CHECK_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f96741i = new Ze("PROFILE_ID", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f96742j = new Ze("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f96743k = new Ze("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f96744l = new Ze("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f96745m = new Ze("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f96746n = new Ze("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f96747o = new Ze("VITAL_DATA", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f96748p = new Ze("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f96749q = new Ze("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f96751s = new Ze("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public Xe(Ia ia2) {
        super(ia2);
    }

    public final Xe a(C5110i0 c5110i0) {
        synchronized (this) {
            b(f96742j.f96878b, c5110i0.f97545a);
            b(f96743k.f96878b, c5110i0.f97546b);
        }
        return this;
    }

    public final void b(boolean z10) {
        b(f96751s.f96878b, z10);
    }

    @Override // io.appmetrica.analytics.impl.Ye
    @NonNull
    public final Set<String> c() {
        return this.f96838a.a();
    }

    public final C5110i0 d() {
        C5110i0 c5110i0;
        synchronized (this) {
            c5110i0 = new C5110i0(this.f96838a.getString(f96742j.f96878b, JsonUtils.EMPTY_JSON), this.f96838a.getLong(f96743k.f96878b, 0L));
        }
        return c5110i0;
    }

    public final String e() {
        return this.f96838a.getString(f96745m.f96878b, "");
    }

    public final Map<String, Long> f() {
        HashMap map = new HashMap();
        try {
            String string = this.f96838a.getString(f96749q.f96878b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    @NonNull
    public final List<String> g() {
        String str = f96746n.f96878b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f96838a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f96838a.getInt(f96744l.f96878b, -1);
    }

    public final long i() {
        return this.f96838a.getLong(f96740h.f96878b, 0L);
    }

    @Nullable
    public final String j() {
        return this.f96838a.getString(f96741i.f96878b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap map = new HashMap();
        try {
            String string = this.f96838a.getString(f96748p.f96878b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f96748p.f96878b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f96838a.getString(new Ze(f96750r, str).f96878b, "");
    }

    public final Xe i(String str) {
        return (Xe) b(f96745m.f96878b, str);
    }

    public final Xe j(@Nullable String str) {
        return (Xe) b(f96741i.f96878b, str);
    }

    public final Xe e(String str, String str2) {
        return (Xe) b(new Ze(f96750r, str).f96878b, str2);
    }

    public final Xe a(long j10) {
        return (Xe) b(f96740h.f96878b, j10);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5549zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f96878b;
    }

    public final Xe a(int i10) {
        return (Xe) b(f96744l.f96878b, i10);
    }

    public final Xe a(List<String> list) {
        return (Xe) a(f96746n.f96878b, list);
    }

    public final boolean a(boolean z10) {
        return this.f96838a.getBoolean(f96751s.f96878b, z10);
    }

    @Override // io.appmetrica.analytics.impl.Co
    @Nullable
    public final String a() {
        return this.f96838a.getString(f96747o.f96878b, null);
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(@NonNull String str) {
        b(f96747o.f96878b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f96749q.f96878b, jSONObject.toString());
    }
}
