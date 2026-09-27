package com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4235d4;
import java.text.ParseException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f42461k = "zz";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f42465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f42466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f42467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f42468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f42469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f42470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f42471j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        TRANSPARENT,
        OPAQUE,
        UNKNOWN
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        PENDING,
        TENTATIVE,
        CONFIRMED,
        CANCELLED,
        UNKNOWN
    }

    public g(JSONObject jSONObject) {
        k(jSONObject.optString("id", null));
        g(jSONObject.optString("description", null));
        m(jSONObject.optString(FirebaseAnalytics.d.f52112s, null));
        a(jSONObject.optString("summary", null));
        o(jSONObject.optString("start", null));
        i(jSONObject.optString("end", null));
        c(jSONObject.optString("status", null));
        e(jSONObject.optString("transparency", null));
        t(jSONObject.optString("recurrence", null));
        n(jSONObject.optString(NotificationCompat.CATEGORY_REMINDER, null));
    }

    public void a(String str) {
        this.f42465d = str;
    }

    public e b() {
        return this.f42467f;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    public final void c(String str) {
        b bVar;
        if (str == null || str.equals("")) {
            bVar = b.UNKNOWN;
        } else if (str.equalsIgnoreCase("pending")) {
            bVar = b.PENDING;
        } else if (str.equalsIgnoreCase("tentative")) {
            bVar = b.TENTATIVE;
        } else if (str.equalsIgnoreCase("confirmed")) {
            bVar = b.CONFIRMED;
        } else if (str.equalsIgnoreCase("cancelled")) {
            bVar = b.CANCELLED;
        } else {
            bVar = b.UNKNOWN;
        }
        s(bVar);
    }

    public String d() {
        return this.f42464c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    public final void e(String str) {
        a aVar;
        if (str == null || str.equals("")) {
            aVar = a.UNKNOWN;
        } else if (str.equalsIgnoreCase(C4235d4.i.T)) {
            aVar = a.TRANSPARENT;
        } else if (str.equalsIgnoreCase("opaque")) {
            aVar = a.OPAQUE;
        } else {
            aVar = a.UNKNOWN;
        }
        r(aVar);
    }

    public d f() {
        return this.f42470i;
    }

    public void g(String str) {
        this.f42463b = str;
    }

    public e h() {
        return this.f42471j;
    }

    public void i(String str) {
        try {
            this.f42467f = new e(str);
        } catch (ParseException e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42461k, "Failed to parse end date:" + e10.getMessage());
        }
    }

    public e j() {
        return this.f42466e;
    }

    public void k(String str) {
        this.f42462a = str;
    }

    public String l() {
        return this.f42465d;
    }

    public void m(String str) {
        this.f42464c = str;
    }

    public void n(String str) {
        try {
            this.f42471j = new e(str);
        } catch (ParseException e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42461k, "Failed to parse reminder date:" + e10.getMessage());
        }
    }

    public void o(String str) {
        try {
            this.f42466e = new e(str);
        } catch (ParseException e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42461k, "Failed to parse start date:" + e10.getMessage());
        }
    }

    public String p() {
        return this.f42463b;
    }

    public void q(d dVar) {
        this.f42470i = dVar;
    }

    public void r(a aVar) {
        this.f42469h = aVar;
    }

    public void s(b bVar) {
        this.f42468g = bVar;
    }

    public final void t(String str) {
        if (str == null || str.equals("")) {
            return;
        }
        try {
            q(new d(new JSONObject(str)));
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42461k, "Failed to set calendar recurrence:" + e10.getMessage());
        }
    }
}
