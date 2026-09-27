package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.ironsource.Y1;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff f41217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u8 f41218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lf f41219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v8 f41220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w8 f41221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gh f41222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t8 f41223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f41224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mg.b f41225i;

    public ve(ff ffVar, u8 u8Var, lf lfVar, v8 v8Var, w8 w8Var, gh ghVar, t8 t8Var, String str) {
        this.f41217a = ffVar;
        this.f41218b = u8Var;
        this.f41219c = lfVar;
        this.f41220d = v8Var;
        this.f41221e = w8Var;
        this.f41222f = ghVar;
        this.f41223g = t8Var;
        this.f41224h = str;
    }

    public int a() {
        return d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }

    public Integer b() {
        COPPA coppa = (COPPA) a(COPPA.COPPA_STANDARD);
        if (coppa != null) {
            return coppa.getConsent().booleanValue() ? 1 : 0;
        }
        return null;
    }

    public int c() {
        return !d().equals(Y1.f60333f) ? 1 : 0;
    }

    public String d() {
        DataUseConsent dataUseConsentA = this.f41218b.a("gdpr");
        return dataUseConsentA == null ? Y1.f60333f : (String) dataUseConsentA.getConsent();
    }

    public JSONObject e() {
        List listF = f();
        v8 v8Var = this.f41220d;
        if (v8Var == null || listF == null) {
            return null;
        }
        return v8Var.a(listF);
    }

    public List f() {
        mg.b bVar;
        w8 w8Var = this.f41221e;
        if (w8Var == null || (bVar = this.f41225i) == null) {
            return null;
        }
        return w8Var.a(bVar);
    }

    public we g() {
        return new we(Integer.valueOf(a()), f(), Integer.valueOf(c()), b(), e(), d(), this.f41222f.a(), this.f41223g.b(), this.f41223g.a());
    }

    public DataUseConsent a(String str) {
        u8 u8Var = this.f41218b;
        if (u8Var != null) {
            return u8Var.a(str);
        }
        return null;
    }

    public void a(DataUseConsent dataUseConsent) {
        ff ffVar = this.f41217a;
        if (ffVar != null) {
            ffVar.a(dataUseConsent);
        }
    }

    public void b(String str) {
        lf lfVar = this.f41219c;
        if (lfVar != null) {
            lfVar.a(str);
        }
    }

    public void a(mg.b bVar) {
        this.f41225i = bVar;
    }
}
