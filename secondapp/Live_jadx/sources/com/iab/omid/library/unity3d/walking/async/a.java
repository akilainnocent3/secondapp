package com.iab.omid.library.unity3d.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f54091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f54092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f54093e;

    public a(b.InterfaceC0534b interfaceC0534b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0534b);
        this.f54091c = new HashSet<>(hashSet);
        this.f54092d = jSONObject;
        this.f54093e = j10;
    }
}
