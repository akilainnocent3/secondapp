package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class We extends AbstractC5549zd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ze f96680d = new Ze("UUID_RESULT", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Ze f96681e = new Ze("DEVICE_ID_RESULT", null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Ze f96682f = new Ze("DEVICE_ID_HASH_RESULT", null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Ze f96683g = new Ze("AD_URL_GET_RESULT", null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Ze f96684h = new Ze("AD_URL_REPORT_RESULT", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Ze f96685i = new Ze("CUSTOM_HOSTS", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Ze f96686j = new Ze("SERVER_TIME_OFFSET", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ze f96687k = new Ze("RESPONSE_CLIDS_RESULT", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Ze f96688l = new Ze("CUSTOM_SDK_HOSTS", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ze f96689m = new Ze("CLIENT_CLIDS", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ze f96690n = new Ze("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ze f96691o = new Ze("API_LEVEL", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Ze f96692p = new Ze("NEXT_STARTUP_TIME", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Ze f96693q = new Ze(IronSourceConstants.TYPE_GAID, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Ze f96694r = new Ze("HOAID", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Ze f96695s = new Ze("YANDEX_ADV_ID", null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Ze f96696t = new Ze("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Ze f96697u = new Ze("SCREEN_INFO", null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Ze f96698v = new Ze("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Ze f96699w = new Ze("FEATURES", null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Ze f96700x = new Ze("APPMETRICA_CLIENT_CONFIG", null);

    public We(Ia ia2) {
        super(ia2);
    }

    public final boolean a(boolean z10) {
        return this.f96838a.getBoolean(f96696t.f96878b, z10);
    }

    public final long b(long j10) {
        return this.f96838a.getLong(f96686j.f96877a, j10);
    }

    @NonNull
    public final We c(@Nullable IdentifiersResult identifiersResult) {
        return a(f96688l.f96878b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult d() {
        return h(f96683g.f96878b);
    }

    @NonNull
    public final IdentifiersResult e() {
        return h(f96684h.f96878b);
    }

    @NonNull
    public final We f(@Nullable IdentifiersResult identifiersResult) {
        return a(f96693q.f96878b, identifiersResult);
    }

    @NonNull
    public final IdentifiersResult h() {
        return h(f96688l.f96878b);
    }

    @NonNull
    public final IdentifiersResult i() {
        return h(f96682f.f96878b);
    }

    @NonNull
    public final IdentifiersResult j() {
        return h(f96681e.f96878b);
    }

    @NonNull
    public final W9 k() {
        String string = this.f96838a.getString(f96699w.f96878b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new W9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new W9(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    public final IdentifiersResult l() {
        return h(f96693q.f96878b);
    }

    @NonNull
    public final IdentifiersResult m() {
        return h(f96694r.f96878b);
    }

    @NonNull
    public final long n() {
        return this.f96838a.getLong(f96692p.f96878b, 0L);
    }

    @NonNull
    public final IdentifiersResult o() {
        return h(f96687k.f96878b);
    }

    @Nullable
    public final ScreenInfo p() {
        return AbstractC5095hb.e(this.f96838a.getString(f96697u.f96878b, null));
    }

    @NonNull
    public final IdentifiersResult q() {
        return h(f96680d.f96878b);
    }

    @NonNull
    public final IdentifiersResult r() {
        return h(f96695s.f96878b);
    }

    public final boolean s() {
        return this.f96838a.getBoolean(f96690n.f96878b, false);
    }

    public final boolean t() {
        return this.f96838a.getBoolean(f96698v.f96878b, false);
    }

    public final We u() {
        return (We) b(f96690n.f96878b, true);
    }

    public final void v() {
        b(f96698v.f96878b, true);
    }

    public final List<String> g() {
        String string = this.f96838a.getString(f96685i.f96878b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC5095hb.b(string);
    }

    public final long a(long j10) {
        return this.f96838a.getLong(f96691o.f96878b, j10);
    }

    @NonNull
    public final We b(@Nullable IdentifiersResult identifiersResult) {
        return a(f96684h.f96878b, identifiersResult);
    }

    public final We c(long j10) {
        return (We) b(f96691o.f96878b, j10);
    }

    @NonNull
    public final We d(@Nullable IdentifiersResult identifiersResult) {
        return a(f96682f.f96878b, identifiersResult);
    }

    @NonNull
    public final We e(@Nullable IdentifiersResult identifiersResult) {
        return a(f96681e.f96878b, identifiersResult);
    }

    @Nullable
    public final AppMetricaConfig.Builder f() {
        String string = this.f96838a.getString(f96700x.f96878b, null);
        if (string == null) {
            return null;
        }
        return new H3().a(string);
    }

    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        try {
            String string = this.f96838a.getString(str, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, a6.d.f3873g), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            } else {
                identifiersResult = null;
            }
        } catch (Throwable unused) {
        }
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
    }

    @NonNull
    public final We i(@Nullable IdentifiersResult identifiersResult) {
        return a(f96680d.f96878b, identifiersResult);
    }

    @NonNull
    public final We j(@Nullable IdentifiersResult identifiersResult) {
        return a(f96695s.f96878b, identifiersResult);
    }

    @NonNull
    public final We g(@Nullable IdentifiersResult identifiersResult) {
        return a(f96694r.f96878b, identifiersResult);
    }

    @NonNull
    public final We a(@Nullable IdentifiersResult identifiersResult) {
        return a(f96683g.f96878b, identifiersResult);
    }

    public final We b(boolean z10) {
        return (We) b(f96696t.f96878b, z10);
    }

    @NonNull
    public final We d(long j10) {
        return (We) b(f96692p.f96878b, j10);
    }

    public final We e(long j10) {
        return (We) b(f96686j.f96878b, j10);
    }

    @Nullable
    public final String i(@Nullable String str) {
        return this.f96838a.getString(f96689m.f96878b, str);
    }

    public final We j(@Nullable String str) {
        return (We) b(f96689m.f96878b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5549zd
    @NonNull
    public final String f(@NonNull String str) {
        return new Ze(str, null).f96878b;
    }

    public final We a(List<String> list) {
        return (We) b(f96685i.f96878b, mo.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    public final We h(@Nullable IdentifiersResult identifiersResult) {
        return a(f96687k.f96878b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5549zd
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final We g(@NonNull String str) {
        return (We) d(new Ze(str, null).f96878b);
    }

    @NonNull
    public final We a(@NonNull W9 w10) {
        String str = f96699w.f96878b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", w10.f96671a).put("STATUS", w10.f96672b.getValue()).putOpt("ERROR_EXPLANATION", w10.f96673c);
        } catch (Throwable unused) {
        }
        return (We) b(str, jSONObject.toString());
    }

    public final void a(@Nullable ScreenInfo screenInfo) {
        b(f96697u.f96878b, AbstractC5095hb.a(screenInfo));
    }

    public final void a(@NonNull AppMetricaConfig appMetricaConfig) {
        b(f96700x.f96878b, appMetricaConfig.toJson());
    }

    public final We a(String str, IdentifiersResult identifiersResult) {
        String string;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(a6.d.f3873g, identifiersResult.f98739id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                string = jSONObject.toString();
            } catch (Throwable unused2) {
                string = null;
            }
        } else {
            string = null;
        }
        if (string != null) {
            b(str, string);
        }
        return this;
    }
}
