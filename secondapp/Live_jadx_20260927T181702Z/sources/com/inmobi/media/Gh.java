package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Gh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cb f54723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Gi f54724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f54725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f54726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f54727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f54728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f54729k;

    public Gh(Context context, double d10, Ab logLevel, long j10, int i10) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(logLevel, "logLevel");
        this.f54719a = context;
        this.f54720b = j10;
        this.f54721c = i10;
        this.f54722d = false;
        this.f54723e = new Cb(logLevel);
        this.f54724f = new Gi(d10);
        this.f54725g = Collections.synchronizedList(new ArrayList());
        this.f54726h = new ConcurrentHashMap();
        this.f54727i = new AtomicBoolean(false);
        this.f54728j = "";
        this.f54729k = new AtomicInteger(0);
    }

    public final void a(Ab logLevel, String tag, String message) throws JSONException {
        kotlin.jvm.internal.m0.p(logLevel, "logLevel");
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        if (this.f54727i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Db.f54499a;
        kotlin.jvm.internal.m0.p(logLevel, "logLevel");
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ql.g0.f122417u, logLevel.name());
        jSONObject.put("timestamp", simpleDateFormat.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        jv.s0 s0Var = Sb.f55479a;
        Rb.a(new Eh(this, logLevel, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.f54727i);
        if ((this.f54722d || this.f54724f.a()) && !this.f54727i.getAndSet(true)) {
            jv.s0 s0Var = Sb.f55479a;
            Rb.a(new Dh(this, null));
        }
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f54726h) {
            try {
                for (Map.Entry entry : this.f54726h.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String string = jSONObject.toString();
        kotlin.jvm.internal.m0.o(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.f54725g;
        kotlin.jvm.internal.m0.o(logData, "logData");
        synchronized (logData) {
            try {
                List logData2 = this.f54725g;
                kotlin.jvm.internal.m0.o(logData2, "logData");
                Iterator it = logData2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.f54725g.isEmpty() || this.f54726h.isEmpty()) {
            return true;
        }
        String strC = c();
        kotlin.jvm.internal.m0.p(strC, "<this>");
        return kotlin.jvm.internal.m0.g(strC, JsonUtils.EMPTY_JSON);
    }

    public final void b(boolean z10) {
        Objects.toString(this.f54727i);
        if (this.f54727i.get()) {
            return;
        }
        this.f54722d = z10;
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.m0.p(key, "key");
        kotlin.jvm.internal.m0.p(value, "value");
        Objects.toString(this.f54727i);
        if (this.f54727i.get()) {
            return;
        }
        this.f54726h.put(key, value);
    }

    public final void a() {
        Objects.toString(this.f54727i);
        if ((this.f54722d || this.f54724f.a()) && !this.f54727i.get()) {
            jv.s0 s0Var = Sb.f55479a;
            Rb.a(new Ch(this, null));
        }
    }

    public final void a(final boolean z10) {
        Objects.toString(this.f54727i);
        jv.s0 s0Var = Sb.f55479a;
        if (dr.i1.e(Rb.a(new ds.a() { // from class: com.inmobi.media.yq
            @Override // ds.a
            public final Object invoke() {
                return Gh.a(this.f58223b, z10);
            }
        })) != null) {
            try {
                dr.i1.a aVar = dr.i1.f79460c;
                dr.i1.b(dr.w2.f79517a);
            } catch (Throwable th2) {
                dr.i1.a aVar2 = dr.i1.f79460c;
                dr.i1.b(dr.j1.a(th2));
            }
        }
    }

    public static final dr.w2 a(Gh gh2, boolean z10) throws InterruptedException {
        if (gh2.e()) {
            return dr.w2.f79517a;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (gh2.f54728j.length() == 0) {
            jv.s0 s0Var = Sb.f55479a;
            gh2.f54728j = Rb.a(gh2.f54719a, timeInMillis);
        }
        if (gh2.a(gh2.f54728j)) {
            jv.j.b(null, new Fh(gh2, timeInMillis, z10, null), 1, null);
        }
        return dr.w2.f79517a;
    }

    public final boolean a(String str) {
        return Tb.a("RemoteLogger", c(), str);
    }
}
