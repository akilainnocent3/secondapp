package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f58515e = "euid";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f58516f = "esat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f58517g = "esfr";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f58518h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f58520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSONObject f58522d;

    public C5(D5 d10, JSONObject jSONObject) {
        this(d10.b(), jSONObject);
    }

    public String a() {
        return this.f58522d.toString();
    }

    public JSONObject b() {
        return this.f58522d;
    }

    public int c() {
        return this.f58519a;
    }

    public long d() {
        return this.f58520b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5 c10 = (C5) obj;
        return this.f58519a == c10.f58519a && this.f58520b == c10.f58520b && this.f58521c == c10.f58521c && C4576wa.a(this.f58522d, c10.f58522d);
    }

    public int hashCode() {
        return (((((this.f58519a * 31) + f0.p.a(this.f58520b)) * 31) + this.f58522d.toString().hashCode()) * 31) + this.f58521c;
    }

    @oy.l
    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", IOUtils.LINE_SEPARATOR_UNIX);
    }

    public C5(int i10, JSONObject jSONObject) {
        this(i10, new InterfaceC4519t4.a().a(), jSONObject);
    }

    public void a(int i10) {
        this.f58519a = i10;
    }

    public C5(int i10, long j10, String str) throws JSONException {
        this(i10, j10, new JSONObject(str));
    }

    public void a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f58522d.put(str, obj);
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C5(D5 d10, long j10, JSONObject jSONObject) {
        this(d10.b(), j10, jSONObject);
    }

    public C5(int i10, long j10, JSONObject jSONObject) {
        this.f58521c = 1;
        this.f58519a = i10;
        this.f58520b = j10;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f58522d = jSONObject;
        if (!jSONObject.has(f58515e)) {
            a(f58515e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f58516f)) {
            a(f58516f, Integer.valueOf(this.f58521c));
        } else {
            this.f58521c = jSONObject.optInt(f58516f, 1);
        }
    }

    public void a(String str) {
        a(f58517g, str);
        int i10 = this.f58521c + 1;
        this.f58521c = i10;
        a(f58516f, Integer.valueOf(i10));
    }
}
