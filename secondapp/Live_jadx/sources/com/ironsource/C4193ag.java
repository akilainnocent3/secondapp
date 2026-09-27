package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ag, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4193ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NetworkSettings f61055b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f61054a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f61056c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61057d = true;

    public void a(NetworkSettings networkSettings) {
        this.f61055b = networkSettings;
    }

    public JSONObject b() {
        return this.f61056c;
    }

    @oy.m
    public NetworkSettings c() {
        return this.f61055b;
    }

    public ArrayList<String> d() {
        return this.f61054a;
    }

    public boolean e() {
        return this.f61057d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f61054a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f61056c = jSONObject;
    }

    public void a(boolean z10) {
        this.f61057d = z10;
    }

    public static C4193ag a() {
        return new C4193ag();
    }
}
