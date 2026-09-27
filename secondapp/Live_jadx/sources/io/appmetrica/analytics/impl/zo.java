package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Co f98730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Co f98731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ao f98732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f98733d;

    public zo(Co co2, Co co3, Ao ao2) {
        this.f98730a = co2;
        this.f98731b = co3;
        this.f98732c = ao2;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f98733d == null) {
                JSONObject jSONObjectA = this.f98732c.a(a(this.f98730a), a(this.f98731b));
                this.f98733d = jSONObjectA;
                a(jSONObjectA);
            }
            jSONObject = this.f98733d;
            if (jSONObject == null) {
                kotlin.jvm.internal.m0.S("fileContents");
                jSONObject = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public static JSONObject a(Co co2) {
        try {
            String strA = co2.a();
            return strA != null ? new JSONObject(strA) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String string = jSONObject.toString();
        try {
            this.f98730a.a(string);
        } catch (Throwable unused) {
        }
        try {
            this.f98731b.a(string);
        } catch (Throwable unused2) {
        }
    }
}
