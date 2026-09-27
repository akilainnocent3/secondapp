package com.iab.omid.library.mmadbridge.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f53650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f53651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f53652e;

    public a(b.InterfaceC0520b interfaceC0520b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0520b);
        this.f53650c = new HashSet<>(hashSet);
        this.f53651d = jSONObject;
        this.f53652e = j10;
    }
}
