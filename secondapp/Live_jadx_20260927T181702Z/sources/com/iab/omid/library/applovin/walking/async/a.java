package com.iab.omid.library.applovin.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f52713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f52714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f52715e;

    public a(b.InterfaceC0491b interfaceC0491b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0491b);
        this.f52713c = new HashSet<>(hashSet);
        this.f52714d = jSONObject;
        this.f52715e = j10;
    }
}
