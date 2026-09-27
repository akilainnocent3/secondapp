package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4503s5 implements D7, D7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private JSONObject f63572a = new JSONObject();

    private final JSONObject k() {
        JSONObject jSONObjectOptJSONObject = this.f63572a.optJSONObject(C4520t5.f64118a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.D7.a
    public void a(@oy.m JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f63572a;
        }
        this.f63572a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC4537u5
    public long b() {
        String strOptString = k().optString(C4554v5.f64302c);
        kotlin.jvm.internal.m0.o(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long lR1 = cv.j0.r1(strOptString);
        if (lR1 != null) {
            return lR1.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean c() {
        return k().optBoolean(C4554v5.f64305f, true);
    }

    @Override // com.ironsource.D7
    @oy.l
    public JSONObject config() {
        return this.f63572a;
    }

    @Override // com.ironsource.InterfaceC4537u5
    public long d() {
        String strOptString = k().optString(C4554v5.f64303d);
        kotlin.jvm.internal.m0.o(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long lR1 = cv.j0.r1(strOptString);
        if (lR1 != null) {
            return lR1.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean e() {
        return k().optBoolean(C4554v5.f64308i, false);
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean f() {
        return k().optBoolean(C4554v5.f64309j, false);
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean g() {
        return k().optBoolean(C4554v5.f64306g, false);
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean h() {
        String strOptString = k().optString(C4554v5.f64300a);
        kotlin.jvm.internal.m0.o(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return kotlin.jvm.internal.m0.g(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC4537u5
    public int i() {
        String strOptString = k().optString(C4554v5.f64301b);
        kotlin.jvm.internal.m0.o(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer numP1 = cv.j0.p1(strOptString);
        if (numP1 != null) {
            return numP1.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean j() {
        return k().optBoolean(C4554v5.f64307h, false);
    }

    @Override // com.ironsource.InterfaceC4537u5
    public boolean a() {
        return k().optBoolean(C4554v5.f64304e, true);
    }
}
