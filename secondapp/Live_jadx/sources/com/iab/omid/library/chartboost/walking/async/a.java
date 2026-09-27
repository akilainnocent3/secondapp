package com.iab.omid.library.chartboost.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f53104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f53105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f53106e;

    public a(b.InterfaceC0503b interfaceC0503b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0503b);
        this.f53104c = new HashSet<>(hashSet);
        this.f53105d = jSONObject;
        this.f53106e = j10;
    }
}
