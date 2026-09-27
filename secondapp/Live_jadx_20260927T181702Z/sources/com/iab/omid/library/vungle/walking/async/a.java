package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f54232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f54233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f54234e;

    public a(b.InterfaceC0539b interfaceC0539b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0539b);
        this.f54232c = new HashSet<>(hashSet);
        this.f54233d = jSONObject;
        this.f54234e = j10;
    }
}
