package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class F9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f54608a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f54609b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f54610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f54611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f54612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static JSONObject f54613f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f54609b) {
            try {
                Objects.toString(f54613f);
                Objects.toString(jSONObject);
                f54613f = jSONObject;
                f54611d = true;
                Context context = Ji.f54934a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                    Ea eaA = Da.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f54613f;
                    if (jSONObject2 == null) {
                        eaA.a("publisher_provided_unified_id");
                    } else {
                        eaA.a("publisher_provided_unified_id", String.valueOf(jSONObject2), false);
                        dr.w2 w2Var = dr.w2.f79517a;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f54608a) {
            if (f54610c) {
                return f54612e;
            }
            f54610c = true;
            Context context = Ji.f54934a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                kotlin.jvm.internal.m0.p("ufids", "key");
                String string = eaA.f54560a.getString("ufids", null);
                if (string != null) {
                    try {
                        f54612e = new JSONObject(string);
                    } catch (JSONException e10) {
                        e10.getMessage();
                    }
                    return f54612e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f54609b) {
            if (f54611d) {
                Objects.toString(f54613f);
                return f54613f;
            }
            f54611d = true;
            Context context = Ji.f54934a;
            String string = null;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                Ea eaA = Da.a(context, "unified_id_info_store");
                kotlin.jvm.internal.m0.p("publisher_provided_unified_id", "key");
                string = eaA.f54560a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f54613f = new JSONObject(string);
                } catch (JSONException e10) {
                    e10.getMessage();
                }
            } catch (NullPointerException e11) {
                e11.getMessage();
            }
            Objects.toString(f54613f);
            return f54613f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f54608a) {
            try {
                f54612e = jSONObject;
                f54610c = true;
                Context context = Ji.f54934a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                    Ea eaA = Da.a(context, "unified_id_info_store");
                    JSONObject jSONObject2 = f54612e;
                    if (jSONObject2 == null) {
                        eaA.a("ufids");
                    } else {
                        eaA.a("ufids", String.valueOf(jSONObject2), false);
                    }
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    JSONObject jSONObject3 = f54612e;
                    if (jSONObject3 == null) {
                        editorEdit.remove("InMobi_unifiedId");
                    } else {
                        editorEdit.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                    }
                    editorEdit.apply();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
