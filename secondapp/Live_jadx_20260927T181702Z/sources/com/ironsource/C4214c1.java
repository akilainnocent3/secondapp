package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4214c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkSettings f61148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f61149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IronSource.a f61150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f61152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f61154g;

    public C4214c1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.f61148a = networkSettings;
        this.f61149b = jSONObject;
        int iOptInt = jSONObject.optInt("instanceType");
        this.f61153f = iOptInt;
        this.f61151d = iOptInt == 2;
        this.f61152e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.f61154g = jSONObject.optInt("maxAdsPerSession", 99);
        this.f61150c = aVar;
    }

    public String a() {
        return this.f61148a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.f61150c;
    }

    public JSONObject c() {
        return this.f61149b;
    }

    public int d() {
        return this.f61153f;
    }

    public int e() {
        return this.f61154g;
    }

    public String f() {
        return this.f61148a.getProviderName();
    }

    public String g() {
        return this.f61148a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f61148a;
    }

    public String i() {
        return this.f61148a.getSubProviderId();
    }

    public boolean j() {
        return this.f61151d;
    }

    public boolean k() {
        return this.f61152e;
    }
}
