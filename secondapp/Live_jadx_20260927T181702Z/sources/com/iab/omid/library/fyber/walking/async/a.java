package com.iab.omid.library.fyber.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f53239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f53240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f53241e;

    public a(b.InterfaceC0507b interfaceC0507b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0507b);
        this.f53239c = new HashSet<>(hashSet);
        this.f53240d = jSONObject;
        this.f53241e = j10;
    }
}
