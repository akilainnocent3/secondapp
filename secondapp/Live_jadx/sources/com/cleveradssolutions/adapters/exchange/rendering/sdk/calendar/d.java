package com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar;

import java.text.ParseException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f42442j = "zu";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f42443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f42444b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f42445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e[] f42446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Short[] f42447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Short[] f42448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Short[] f42449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Short[] f42450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Short[] f42451i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        DAILY,
        WEEKLY,
        MONTHLY,
        YEARLY,
        UNKNOWN
    }

    public d(JSONObject jSONObject) {
        a(jSONObject.optString("frequency", null));
        e(jSONObject.optString("interval", null));
        String strOptString = jSONObject.optString("expires", null);
        if (strOptString != null && !strOptString.equals("")) {
            u(strOptString);
        }
        j(jSONObject.optJSONArray("exceptionDates"));
        b(jSONObject.optJSONArray("daysInWeek"));
        v(jSONObject.optJSONArray("daysInMonth"));
        f(jSONObject.optJSONArray("daysInYear"));
        p(jSONObject.optJSONArray("weeksInMonth"));
        m(jSONObject.optJSONArray("monthsInYear"));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    public final void a(String str) {
        a aVar;
        if (str == null || str.equals("")) {
            aVar = a.UNKNOWN;
        } else if (str.equalsIgnoreCase("daily")) {
            aVar = a.DAILY;
        } else if (str.equalsIgnoreCase("monthly")) {
            aVar = a.MONTHLY;
        } else if (str.equalsIgnoreCase("weekly")) {
            aVar = a.WEEKLY;
        } else if (str.equalsIgnoreCase("yearly")) {
            aVar = a.YEARLY;
        } else {
            aVar = a.UNKNOWN;
        }
        s(aVar);
    }

    public final void b(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                Short[] shArr = new Short[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Short shValueOf = null;
                    String strOptString = jSONArray.optString(i10, null);
                    if (strOptString != null && !strOptString.equals("")) {
                        shValueOf = Short.valueOf(strOptString);
                    }
                    shArr[i10] = shValueOf;
                }
                c(shArr);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set days in week:" + e10.getMessage());
            }
        }
    }

    public void c(Short[] shArr) {
        this.f42447e = shArr;
    }

    public Short[] d() {
        return this.f42447e;
    }

    public final void e(String str) {
        if (str == null || str.equals("")) {
            return;
        }
        try {
            t(Integer.valueOf(Integer.parseInt(str)));
        } catch (Exception e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set interval:" + e10.getMessage());
        }
    }

    public final void f(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                Short[] shArr = new Short[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Short shValueOf = null;
                    String strOptString = jSONArray.optString(i10, null);
                    if (strOptString != null && !strOptString.equals("")) {
                        shValueOf = Short.valueOf(strOptString);
                    }
                    shArr[i10] = shValueOf;
                }
                g(shArr);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set days in year:" + e10.getMessage());
            }
        }
    }

    public void g(Short[] shArr) {
        this.f42449g = shArr;
    }

    public Short[] h() {
        return this.f42449g;
    }

    public e i() {
        return this.f42445c;
    }

    public final void j(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10, null);
                }
                x(strArr);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set exception days:" + e10.getMessage());
            }
        }
    }

    public void k(Short[] shArr) {
        this.f42451i = shArr;
    }

    public a l() {
        return this.f42443a;
    }

    public final void m(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                Short[] shArr = new Short[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Short shValueOf = null;
                    String strOptString = jSONArray.optString(i10, null);
                    if (strOptString != null && !strOptString.equals("")) {
                        shValueOf = Short.valueOf(strOptString);
                    }
                    shArr[i10] = shValueOf;
                }
                k(shArr);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set months in year:" + e10.getMessage());
            }
        }
    }

    public void n(Short[] shArr) {
        this.f42450h = shArr;
    }

    public Integer o() {
        return this.f42444b;
    }

    public final void p(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                Short[] shArr = new Short[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Short shValueOf = null;
                    String strOptString = jSONArray.optString(i10, null);
                    if (strOptString != null && !strOptString.equals("")) {
                        shValueOf = Short.valueOf(strOptString);
                    }
                    shArr[i10] = shValueOf;
                }
                n(shArr);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set weeks in month:" + e10.getMessage());
            }
        }
    }

    public Short[] q() {
        return this.f42451i;
    }

    public Short[] r() {
        return this.f42450h;
    }

    public void s(a aVar) {
        this.f42443a = aVar;
    }

    public void t(Integer num) {
        this.f42444b = num;
    }

    public void u(String str) {
        try {
            this.f42445c = new e(str);
        } catch (ParseException e10) {
            com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to parse expires date:" + e10.getMessage());
        }
    }

    public final void v(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                Short[] shArr = new Short[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Short shValueOf = null;
                    String strOptString = jSONArray.optString(i10, null);
                    if (strOptString != null && !strOptString.equals("")) {
                        shValueOf = Short.valueOf(strOptString);
                    }
                    shArr[i10] = shValueOf;
                }
                w(shArr);
            } catch (Exception e10) {
                com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to set days in month:" + e10.getMessage());
            }
        }
    }

    public void w(Short[] shArr) {
        this.f42448f = shArr;
    }

    public void x(String[] strArr) {
        if (strArr != null) {
            this.f42446d = new e[strArr.length];
            int i10 = 0;
            for (String str : strArr) {
                try {
                    this.f42446d[i10] = new e(str);
                } catch (ParseException e10) {
                    this.f42446d[i10] = null;
                    com.cleveradssolutions.adapters.exchange.b.a(f42442j, "Failed to parse exception date:" + e10.getMessage());
                }
                i10++;
            }
        }
    }

    public Short[] y() {
        return this.f42448f;
    }
}
