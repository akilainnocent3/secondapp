package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4392m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSource.a f62310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NetworkSettings f62312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f62315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f62316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f62317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f62318i;

    public C4392m0(IronSource.a aVar, String str, int i10, JSONObject jSONObject, String str2, int i11, String str3, NetworkSettings networkSettings, int i12) {
        this.f62310a = aVar;
        this.f62311b = str;
        this.f62314e = i10;
        this.f62315f = jSONObject;
        this.f62316g = str2;
        this.f62317h = i11;
        this.f62318i = str3;
        this.f62312c = networkSettings;
        this.f62313d = i12;
    }

    public IronSource.a a() {
        return this.f62310a;
    }

    public String b() {
        return this.f62318i;
    }

    public String c() {
        return this.f62316g;
    }

    public int d() {
        return this.f62317h;
    }

    public JSONObject e() {
        return this.f62315f;
    }

    public int f() {
        return this.f62313d;
    }

    public NetworkSettings g() {
        return this.f62312c;
    }

    public int h() {
        return this.f62314e;
    }

    public String i() {
        return this.f62311b;
    }
}
