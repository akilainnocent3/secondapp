package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5351rf implements U7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f98233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f98234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f98235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f98236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final T7 f98237e;

    public C5351rf(@Nullable String str, @NonNull JSONObject jSONObject, boolean z10, boolean z11, @NonNull T7 t10) {
        this.f98233a = str;
        this.f98234b = jSONObject;
        this.f98235c = z10;
        this.f98236d = z11;
        this.f98237e = t10;
    }

    @Override // io.appmetrica.analytics.impl.U7
    @NonNull
    public final T7 a() {
        return this.f98237e;
    }

    @Nullable
    public final JSONObject b() {
        if (!this.f98235c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f98233a);
            if (this.f98234b.length() > 0) {
                jSONObject.put("additionalParams", this.f98234b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f98233a);
            jSONObject.put("additionalParams", this.f98234b);
            jSONObject.put("wasSet", this.f98235c);
            jSONObject.put("autoTracking", this.f98236d);
            jSONObject.put("source", this.f98237e.f96506a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f98233a + "', additionalParameters=" + this.f98234b + ", wasSet=" + this.f98235c + ", autoTrackingEnabled=" + this.f98236d + ", source=" + this.f98237e + fw.b.f85383j;
    }

    @NonNull
    public static C5351rf a(@Nullable JSONObject jSONObject) {
        T7 t10;
        String strOptStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject jSONObjectOptJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i10 = 0;
        boolean zOptBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean zOptBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String strOptStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        T7[] t7ArrValues = T7.values();
        int length = t7ArrValues.length;
        while (true) {
            if (i10 >= length) {
                t10 = null;
                break;
            }
            t10 = t7ArrValues[i10];
            if (kotlin.jvm.internal.m0.g(t10.f96506a, strOptStringOrNull2)) {
                break;
            }
            i10++;
        }
        if (t10 == null) {
            t10 = T7.f96501b;
        }
        return new C5351rf(strOptStringOrNull, jSONObjectOptJsonObjectOrDefault, zOptBooleanOrDefault, zOptBooleanOrDefault2, t10);
    }
}
