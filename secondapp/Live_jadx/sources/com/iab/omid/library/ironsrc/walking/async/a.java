package com.iab.omid.library.ironsrc.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f53515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f53516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f53517e;

    public a(b.InterfaceC0516b interfaceC0516b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0516b);
        this.f53515c = new HashSet<>(hashSet);
        this.f53516d = jSONObject;
        this.f53517e = j10;
    }
}
