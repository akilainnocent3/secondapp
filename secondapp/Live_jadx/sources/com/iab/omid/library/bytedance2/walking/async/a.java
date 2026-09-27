package com.iab.omid.library.bytedance2.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f52963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f52964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f52965e;

    public a(b.InterfaceC0498b interfaceC0498b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0498b);
        this.f52963c = new HashSet<>(hashSet);
        this.f52964d = jSONObject;
        this.f52965e = j10;
    }
}
