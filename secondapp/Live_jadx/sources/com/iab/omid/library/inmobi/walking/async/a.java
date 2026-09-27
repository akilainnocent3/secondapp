package com.iab.omid.library.inmobi.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f53380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f53381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f53382e;

    public a(b.InterfaceC0512b interfaceC0512b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0512b);
        this.f53380c = new HashSet<>(hashSet);
        this.f53381d = jSONObject;
        this.f53382e = j10;
    }
}
